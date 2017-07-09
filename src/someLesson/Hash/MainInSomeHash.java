package someLesson.Hash;

import java.util.LinkedList;

/**
 * Created by arch on 7/7/17.
 */
public class MainInSomeHash {
    public static void main(String[] args){

        LinkedList list = new LinkedList<>();

        putEl(list);
        getEl(list);
    }

    public static void putEl(LinkedList<? super Number> list){
        list.add(new Integer(1234));
        list.add(new Double(1234.12d));
        list.add(new Long(123));
    }

    public static void getEl(LinkedList<? extends Number> list){
        for(Number num: list)
            System.out.println(num.getClass());
    }
}
