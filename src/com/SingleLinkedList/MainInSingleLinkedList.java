package com.SingleLinkedList;

/**
 * Created by arch on 7/12/17.
 */
public class MainInSingleLinkedList {
    public static void main(String[] args){

        SingleLinkedList <Integer> intList = new SingleLinkedList<>();
        Integer integer = new Integer(23);

        SingleLinkedList <Float> floatList = new SingleLinkedList<>();
        Float fload  = new Float(23.1f);

        for(int i = 0; i < 10; i++){
            intList.add(integer+i);
            floatList.add(fload+i);
        }

        intList.stdout();
        floatList.stdout();
    }
}
