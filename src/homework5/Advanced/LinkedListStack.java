package homework5.Advanced;

import java.util.Arrays;
import java.util.Objects;

public class LinkedListStack<E> {
    private int size;
    private E[] elements;

    public LinkedListStack(int initialCapacity) {
        this.elements = (E[]) new Object[initialCapacity];
    }

    public LinkedListStack() {
        this(10);
    }

    public E pop() {
        if (size == 0) throw new EmptyListException();
        if (size == 0) return null;
        E element = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return element;
    }


    public E push(E element) {
        if (size == elements.length - 1) {
            elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
        }
        elements[size] = element;
        size++;
        return element;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LinkedListStack{ ");
        if (size == 0) return sb.toString() + " }";
        Arrays.stream(elements)
                .filter(Objects::nonNull)
                .forEach(el -> sb.append(el).append(", "));
        return sb.substring(0, sb.length() - 2) + " }";
    }
}

