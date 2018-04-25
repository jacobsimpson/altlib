package altlib.collections;

import java.util.function.Function;

import static java.lang.String.format;

public class LinkedList<T> implements List<T>, ReadableList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    @SafeVarargs
    public final LinkedList<T> add(T... items) {
        for (T item : items) {
            if (head == null) {
                tail = head = new Node<>(item);
            } else {
                tail = tail.next = new Node<>(item, tail);
            }
            size++;
        }
        return this;
    }

    public T at(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException(format("Requested index %d is outside the range of the list", index));

        Node<T> result = head;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public <R> List<R> map(Function<T, R> function) {
        LinkedList<R> result = new LinkedList<>();
        Node<T> next = head;
        while (next != null) {
            result.add(function.apply(next.value));
            next = next.next;
        }
        return result;
    }

    private static class Node<T> {
        Node<T> next;
        Node<T> prev;
        T value;

        Node(T value) {
            this.value = value;
        }

        Node(T value, Node<T> prev) {
            this.prev = prev;
            this.value = value;
        }
    }
}

