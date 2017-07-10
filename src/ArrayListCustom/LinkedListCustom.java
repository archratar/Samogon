package ArrayListCustom;

import java.util.Collection;

/**
 * Created by arch on 7/7/17.
 */
public class LinkedListCustom<T> implements LinkedListCustomInterface<T> {

    private static int size;
    LinkedListCustom.Node<T> current;
    LinkedListCustom.Node<T> first;
    LinkedListCustom.Node<T> last;

    LinkedListCustom(){
        LinkedListCustom.size = 0;
        this.current = new Node<T>();
        this.first = this.last = this.current;
    }
    LinkedListCustom(Collection<? extends T> t){
        this();
        this.add((T) t);
    }

    private Node<T> nodeIterator(){
        this.current = this.first;

        for(int i = 0; i < this.size && this.current != null; i++){
            this.current = this.current.next;
        }
        return this.current;
    }

    @Override
    public void add(T t){
        this.current = nodeIterator();
        System.out.println(this.current.data);
        this.current.next = new Node<T>(t);
        this.current.next.prev = this.current;
        this.size++;
    }

    @Override
    public boolean remove(T t){
        return false;
    }

    public boolean remove(String lastOrFirst){

        boolean isFirst = lastOrFirst.equals("first");
        boolean isLast = lastOrFirst.equals("last");

        if (isFirst || isLast){
            ;
        }else{
            ;
        }

        return false;
    }

    @Override
    public void stdout(){

        this.current = this.first;
        for(int i = 0; this.current != null; i++){
            System.out.println(this.current.data);
            this.current = this.current.next;
        }
    }

    private static class Node<T>{
        private static int iterator;
        T data;
        LinkedListCustom.Node<T> prev;
        LinkedListCustom.Node<T> next;

        Node(){

        }
        Node(T data){
            this.data = data;
        }
        Node(T data, LinkedListCustom.Node<T> next, LinkedListCustom.Node<T> prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

//    /*
//     * telecanal Private
//     */
//    private void init(T t){
//        this.current = new Node<T>(t);
//        this.current.data = t;
//        this.current.next = this.current.prev = null;
//        this.last = this.first = this.current;
//    }
}
