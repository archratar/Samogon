package com.SingleLinkedList;

/**
 * Created by arch on 7/12/17.
 */
public class MainInSingleLinkedList {
    public static void main(String[] args){

        SingleLinkedList <Integer> list = new SingleLinkedList<>();
        Integer integer = new Integer(23);
        list.add(integer);
        list.add(integer++);
    }
}
