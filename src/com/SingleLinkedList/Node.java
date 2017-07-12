package com.SingleLinkedList;

/**
 * Created by arch on 7/12/17.
 */
public class Node<T> {
    T value;
    Node<T> next;

    Node(T value){
        this.value = value;
        this.next = null;
    }
}
