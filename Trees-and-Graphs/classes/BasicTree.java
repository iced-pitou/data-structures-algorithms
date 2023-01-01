package classes;

public class BasicTree<T> {

    private BasicTreeNode<T> root;

    public BasicTree(T value) {
        this.root = new BasicTreeNode<T>(value);
    }

    public T rootValue() {
        if (this.root == null)
            return null;
        return this.root.value;
    }

}

class BasicTreeNode<T> {
    public T value;
    public BasicTreeNode<T> left;
    public BasicTreeNode<T> right;

    public BasicTreeNode(T value) {
        this.value = value;
    }
}
