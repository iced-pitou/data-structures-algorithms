package classes;

public class BasicLinkedList<T> {

    public BasicLinkedListNode<T> head;

    public BasicLinkedList(T headValue) {
        this.head = new BasicLinkedListNode<T>(headValue);
    }

    public void append(T value) {
        BasicLinkedListNode<T> node = head;

        while (node.next != null)
            node = node.next;

        node.next = new BasicLinkedListNode<T>(value);
    }

    public String toString() {
        BasicLinkedListNode<T> node = head;
        StringBuilder text = new StringBuilder().append(String.valueOf(node.value) + " -> ");

        while (node.next != null) {
            node = node.next;
            text.append(String.valueOf(node.value) + " -> ");
        }

        return text.append("null").toString();
    }

}
