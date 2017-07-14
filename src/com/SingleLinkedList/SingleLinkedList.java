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
                    Node<T> nextNode = new Node<T>(value);
                    pointer.next = nextNode;
                    this.size++;
                    break;
                } else {
                    pointer = pointer.next;
                }
            }
        }
    }

    public void stdout(){
        Node<T> pointer = this.head;

        for(int i = 0; i < this.size; i++){
            if(pointer != null){
                System.out.print("[" + i + "]" + "(" + pointer.value + ")" + " ");
                pointer = pointer.next == null ? null: pointer.next;
            }
        }
        System.out.println("");
    }

    public void remove(T value) {
    }

    public int size() {
        return this.size;
    }
}
