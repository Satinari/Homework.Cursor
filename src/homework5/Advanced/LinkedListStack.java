package homework5.Advanced;

public class LinkedListStack {
    private Node head;

    private class Node {
        int value;
        Node next;
    }

    public LinkedListStack() {
        head = null;
    }

    public int pop() {
        int value = head.value;
        head = head.next;
        return value;
    }

    public void push(int value) {
        Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = oldHead;
    }

    @Override
    public String toString() {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        return "";
    }
}

