import java.util.Stack;

public class avl<T> {
    node root;

    public int height(node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    //вычисление balance
    public int balance_factor(node N) {
        return height(N.right) - height(N.left);
    }

    //Восстановление height
    public void fixheight(node N) {
        int hl = height(N.left);
        int hr = height(N.right);
        N.height = (Math.max(hl, hr)) + 1;
    }

    //поворот вправо
    public node right_rotate(node Y) {
        node X = Y.left;
        node T = X.right;

        X.right = Y;
        Y.left = T;

        fixheight(Y);
        fixheight(X);

        return X;
    }

    //Поворот влево
    public node left_rotate(node X) {
        node Y = X.right;
        node T = Y.left;

        Y.left = X;
        X.right = T;

        fixheight(X);
        fixheight(Y);

        return Y;
    }

    public node balance(node N) {
        fixheight(N);
        if (balance_factor(N) == 2) {
            if (balance_factor(N.right) < 0)
                N.right = right_rotate(N.right);
            return left_rotate(N);
        }
        if (balance_factor(N) == -2) {
            if (balance_factor(N.left) > 0)
                N.left = left_rotate(N.left);
            return right_rotate(N);
        }
        return N;
    }

    //Вставка
    public node insert(node N, int key, T data) {
        if (N == null)
            return (new node(data, key));
        if (key < N.key)
            N.left = insert(N.left, key, data);
        else
            N.right = insert(N.right, key, data);
        return balance(N);
    }

    // поиск  минимального ключа
    public node findmin(node N) // поиск узла с минимальным ключом в дереве p
    {
        return !(N.left == null) ? findmin(N.left) : N;
    }

    // удаление с минимальным ключом
    public node removemin(node N) {
        if (N.left == null)
            return N.right;
        N.left = removemin(N.left);
        return balance(N);
    }

    //Удаление по ключу
    public node remove(node N, int k) {
        if (N == null) return null;
        if (k < N.key)
            N.left = remove(N.left, k);
        else if (k > N.key)
            N.right = remove(N.right, k);
        else {
            node T = N.left;
            node F = N.right;
            N = null;
            if (F == null) return T;
            node min = findmin(F); //
            min.right = removemin(F);
            min.left = T;
            return balance(min);
        }
        return balance(N);
    }

    private void print(node node, int level) {
        if (node != null) {
            print(node.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println(node.key);
            print(node.left, level + 1);
        }
    }

    //вывод дерева
    public void print() {
        print(root, 0);
    }

    //Поиск элемента по ключу с выводом элемента
    public T search(node N, int k) {
        itr a = new itr(N);
        T value = null;
        node B = N;
        while (a.hasNext()) {
            B = a.next();
            if (k == B.key) {
                value = (T) B.data;
                return value;
            }
            if (k == N.key) {
                value = (T) N.data;
                return value;
            }
        }
        return value;
    }

    //Проверка на пустоту
    public boolean check(node N) {
        boolean value = true;
        if (N == null)
            value = false;
        return value;
    }

    //Удаление всех элементов
    public void delete_all() {
        if (root == null)
            System.out.println("0");
        root = null;
    }

    // Копирование дерева
    public avl copyTree(node N) {
        avl b = new avl();
        b.root = preorderCopy(N);
        return b;
    }

    private node preorderCopy(node N) {
        if (N == null) {
            return null;
        }
        node copy = new node(N.data, N.key);
        copy.left = preorderCopy(N.left);
        copy.right = preorderCopy(N.right);
        return copy;
    }

    //Поиск по ключу
    public boolean search_key(node N, int k) {
        boolean e = false;
        itr a = new itr(N);
        node B = N;
        while (a.hasNext()) {
            B = a.next();
            if (k == B.key) {
                e = true;
                return e;
            }
            if (k == N.key) {
                e = true;
                return e;
            } else
                e = false;
        }
        return e;
    }

    //Проерка баланса
    boolean Balanced(node root, Height height) {
        if (root == null) {
            height.height = 0;
            return true;
        }
        Height lheight = new Height(), rheight = new Height();
        boolean l = Balanced(root.left, lheight);
        boolean r = Balanced(root.right, rheight);
        int lh = lheight.height, rh = rheight.height;
        height.height = (Math.max(lh, rh)) + 1;
        if ((lh - rh >= 2) || (rh - lh >= 2))
            return false;
        else
            return r;
    }
}
