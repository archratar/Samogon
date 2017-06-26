package SomePackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;
// clonable
// serializable - narezka na paketi
/**
 * Created by arch on 6/26/17.
 */
public class Main {

    public static void main(String[] args) {

        Vector vector = new Vector();
        ArrayList<String> arrayList = new ArrayList<>(5);
        ArrayList<String> subList   = new ArrayList<>(5);
        LinkedList<String> linkedlist = new LinkedList<>();
        arrayList.size();
//        System.out.println(arrayList.size());

        for (int i = 0; i < 10; i++){
            arrayList.add("H"+i);
            subList.add("N"+i+1);
            System.out.println(arrayList.get(i));
        }

        System.out.println(arrayList.contains("H1"));
        System.out.println(arrayList.contains("H25"));

        arrayList.remove("H1");
        System.out.println(arrayList.contains("H1"));

        arrayList.addAll(subList);

        for (String test : arrayList) {
            System.out.println(test);
        }

        // Linkedlist 180degrees
        // Linkedlist 5 from End Element
        // interface List - your class
    }
}
