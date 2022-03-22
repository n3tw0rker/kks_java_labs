import java.util.*;

public class itr<T> {
    private Stack<node> stack = new Stack<>();

    public T next_element() {
        node node = stack.pop();
        T result = (T) node.data;
        if (node.right != null) {
            node = node.right;
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }
        return result;
    }

    public itr(node root) {
        push(root);
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public node next() {
        if (!hasNext()) throw new NoSuchElementException();
        node nod = stack.pop();
        push(nod.right);
        return nod;
    }

    private void push(node N) {
        while (N != null) {
            stack.push(N);
            N = N.left;
        }
    }
}
