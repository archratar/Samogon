package com.SingleLinkedList;

/**
 * Created by arch on 7/12/17.
 */
public class SingleLinkedList<T> implements SingleLinkedListPower<T> {

    private Node<T> head;
    private int size = 0;

    SingleLinkedList() {

    }

    SingleLinkedList(T value) {
        this.add(value);
    }

    public void add(T value) {
        if (size == 0) {
            this.head = new Node<T>(value);
            this.size++;
        } else {
            Node<T> pointer = this.head;

            for (; ; ) {
                if (pointer.next == null) {
                    pointer.next = new Node<T>(value);
                    pointer.next.value = value;
                    this.size++;
                    break;
                } else {
                    pointer = pointer.next;
                }
            }
        }
    }

    public void remove(T value) {

    }

    public int size() {
        return this.size;
    }
}
