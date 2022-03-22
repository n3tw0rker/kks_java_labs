public class node<T> {
    int key;
    node right;
    node left;
    int height;
    T data;
    public node(T data, int key){
        this.data = data;
        this.left = null;
        this.right = null;
        this.key = key;
        this.height = 1;
    }
}
