import java.util.HashSet;

import classes.BasicLinkedList;
import classes.BasicLinkedListNode;

public class Main {

    public static void main(String[] args) {
        LinkedListWrapper linkedList = new LinkedListWrapper(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(3);
        linkedList.append(1);
        linkedList.append(1);
        linkedList.append(4);

        System.out.println(linkedList);
        linkedList.removeDupsNoBuffer();
        System.out.println(linkedList);
        linkedList.kthToLast(2);
        System.out.println(linkedList);
    }

}

class LinkedListWrapper extends BasicLinkedList<Integer> {

    public LinkedListWrapper(int value) {
        super(value);
    }

    public void reverse() {
        BasicLinkedListNode<Integer> node = this.head;
        BasicLinkedListNode<Integer> preNode = null;
        BasicLinkedListNode<Integer> prePreNode = null;

        while (node.next != null) {
            prePreNode = preNode;
            preNode = node;
            node = node.next;
            preNode.next = prePreNode;
        }

        node.next = preNode;
        this.head = node;
    }

    public void removeDupsNoBuffer() {
        BasicLinkedListNode<Integer> node = this.head;

        while (node != null) {
            BasicLinkedListNode<Integer> previous = node;
            BasicLinkedListNode<Integer> seeker = node.next;
            while (seeker != null) {
                if (seeker.value != node.value) {
                    previous.next = seeker;
                    previous = seeker;
                }
                seeker = seeker.next;
            }
            node = node.next;
        }
    }

    public void removeDups() {
        BasicLinkedListNode<Integer> node = this.head;
        BasicLinkedListNode<Integer> previous = this.head;

        HashSet<Integer> set = new HashSet<>();

        while (node != null) {
            if (set.contains(node.value)) {
                previous.next = node.next;
            } else {
                set.add(node.value);
                previous = node;
            }
            node = node.next;
        }
    }

    public void kthToLast(int k) {
        BasicLinkedListNode<Integer> node = this.head;

        while (k > 1 && node != null) {
            k--;
            node = node.next;
        }
        this.head = node;
    }

}
