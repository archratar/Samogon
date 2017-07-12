package ArrayListCustom;

/**
 * Created by arch on 7/12/17.
 */
public class SingleLinkedList<T> implements SingleLinkedList_i<T> {

    Node<T> head;
    Node<T> tail;

    public SingleLinkedList(T value){
        this.add(value);
    }

    public void add(T value){

    }

    public void remove(T value ){

    }

    public static class Node<T>{

        T data;

        public Node (T value){
            this.data = value;
        }
    }
}
