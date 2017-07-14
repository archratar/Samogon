package ArrayListCustom;

/**
 * Created by arch on 7/12/17.
 */
public class LinkedList<T> implements LinkedListPower<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public LinkedList(T value){
        this.add(value);
        this.size++;
    }

    public void add(T value){
        if (size == 0) {
            Node<T> newNode = new Node<T>(value);
            this.head = newNode;
            this.head.next = this.tail;
            size++;
        } else {
            Node<T> newNode = new Node<T>(value);

        }
    }

    public void remove(T value){

    }


    public int size(){

        return this.size;
    }

    private Node<T> find(T value){

        return null;
    }
}
