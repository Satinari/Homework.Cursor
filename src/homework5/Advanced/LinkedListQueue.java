package homework5.Advanced;

public class LinkedListQueue <T> {
    private Node head;
    private Node tail;
    private int size;

    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    private class Node {
        T value;
        Node next;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        T value = head.value;
        head = head.next;
        size--;
        return value;
    }

    public void enqueue(T element) {
        Node oldTail = tail;
        tail = new Node();
        tail.value = element;
        tail.next = null;
        if (isEmpty()) {
            head = tail;
        } else {
            oldTail.next = tail;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node nextNode = head;
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                stringBuilder.append(nextNode.value);
            } else {
                stringBuilder.append(nextNode.value).append(", ");
            }
            nextNode = nextNode.next;
        }
        return "In queue now: [" + stringBuilder.toString() + ']';
    }
}
