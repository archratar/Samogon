package LinkedListCustom;

/**
 * Created by arch on 7/12/17.
 */
public class LinkedList<T> implements LinkedListPower<T>{

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public LinkedList(T value){
        this.add(value);
    }

    public void add(T value){
        Node<T> newNode = new Node<T>(value);

        if (this.head == null) {
            this.head = newNode;
        } else if (this.size == 1) {
            this.head.next = newNode;
            this.tail = newNode;
            this.tail.prev = this.head;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
        this.size++;
    }

    public void remove(T value){
        Node<T> pointer = this.head;

        for (int i = 0; i < this.size; i++) {
            if (pointer.data == value) {
                if (pointer == this.head || pointer == this.tail) {
                    if (pointer == this.head) {
                        this.head = pointer.next;
                        this.head.prev = null;
                        this.size--;
                        break;
                    } else {
                        this.tail = pointer.prev;
                        this.tail.next = null;
                        this.size--;
                        break;
                    }
                } else {
                    Node<T> prev = pointer.prev;
                    Node<T> next = pointer.next;
                    prev.next = next;
                    next.prev = prev;
                    this.size--;
                    break;
                }
            } else {
                pointer = pointer.next;
            }
        }
    }


    public int size(){
        return this.size;
    }

    // !_
    public void addAll (T[] array) {
        for (int i = 0; i < array.length; i++) {
            this.add(array[i]);
        }
    }

    public void stdout() {
        Node<T> pointer = this.head;

        for (int i = 0; i < this.size; i++) {
            if (pointer != null) {
//                System.out.println(i + " = " + "[" + pointer.data + "]");
                System.out.format("[%2d] = [%2d] %n", i, pointer.data);
                pointer = pointer.next;
            } else {
                break;
            }
        }
    }

    private Node<T> find(T value){

        return null;
    }
}
