package classes;

public class BasicStack<T> {

    private BasicStackNode<T> top;
    private BasicStack<T> min;

    public BasicStack() {
    }

    public BasicStack(T value) {
        this.top = new BasicStackNode<T>(value);
    }

    public void push(T value) {
        BasicStackNode<T> node = new BasicStackNode<T>(value);
        node.next = top;
        this.top = node;

        if (this.min == null)
            this.min = new BasicStack<T>(node.value);
        if ((int) node.value < (int) this.min.top.value)
            this.min.push(node.value);
    }

    public void pop() {
        if ((int) this.top.value == (int) this.min.top.value)
            this.min.top = this.min.top.next;
        this.top = this.top.next;
    }

    public T top() {
        if (this.top == null)
            return null;
        return this.top.value;
    }

    public T min() {
        if (this.min == null)
            return null;
        return this.min.top.value;
    }

    public String toString() {
        if (this.top == null)
            return "null";

        BasicStackNode<T> node = this.top;
        StringBuilder text = new StringBuilder().append(String.valueOf(node.value) + " -> ");

        while (node.next != null) {
            node = node.next;
            text.append(String.valueOf(node.value) + " -> ");
        }

        return text.append("null").toString();
    }

}
