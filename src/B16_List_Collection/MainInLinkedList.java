package B16_List_Collection;

/**
 * Created by arch on 7/4/17.
 */
public class MainInLinkedList {

    public static void main(String[] args){

        LinkedList<Integer> list = new LinkedList<>(5);
        Integer someint = new Integer(10);
        System.out.println(list.size());

        list.add(someint);
        System.out.println(list.get(0));
//        System.out.println(list);
    }
}
