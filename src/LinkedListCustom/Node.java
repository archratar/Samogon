package LinkedListCustom;

/**
 * Created by arch on 7/12/17.
 */
public class Node <T> {

    public T data;
    public Node<T> next;
    public Node<T> prev;

    public Node(T value){

        this.data = value;
    }
}
