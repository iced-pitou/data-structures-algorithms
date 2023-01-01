package classes;

public class BasicStackNode<T> {

    public T value;
    public BasicStackNode<T> next;

    public BasicStackNode(T value) {
        this.value = value;
    }

}
