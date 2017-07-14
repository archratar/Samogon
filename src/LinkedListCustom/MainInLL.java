package LinkedListCustom;

/**
 * Created by arch on 7/9/17.
 */
public class MainInLL {
    public static void main(String[] args){

        LinkedList<Integer> list = new LinkedList<>(0);
        int [] array = new int[12];

        int incrementor = 1;
        for (int index : array) {
            index = (index+incrementor++);
            list.add(index);
        }

        System.out.println(list.find(1));

//        list.remove(0);
//        list.stdout();
//        System.out.println(list.size());
    }
}
