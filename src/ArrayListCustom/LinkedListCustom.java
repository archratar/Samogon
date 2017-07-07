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
    }
    LinkedListCustom(Collection<? extends T> t){
        this();
        this.add();
    }

    @Override
    public void add(T t){
        if(this.size == 0){
            this.current = new LinkedListCustom.Node<T>(t);
            this.last = this.first = this.current;
            this.current.data = t;
        }else{
            this.last.next = new Node<T>(t);
            this.last.
        }
    }
    @Overload
    public void add(Collection<? extends T> t){
        ;
    }

    @Override
    public void remove(T t){
        ;
    }
    @Overload
    public boolean remove(String lastOrFirst){

        boolean isFirst = lastOrFirst.equals("first");
        boolean isLast = lastOrFirst.equals("last");

        if (isFirst || isLast){
            ;
        }else{
            return false;
        }
    }



    @Override
    public void stdout(int i){
        System.out.println();
    }

    private static class Node<T>{
        private static int iterator;
        T data;
        LinkedListCustom.Node<T> next;
        LinkedListCustom.Node<T> prev;

        Node(T data){
            this.data = data;
        }
        Node(T data, LinkedListCustom.Node<T> next, LinkedListCustom.Node<T> prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
