package Hash;

import java.util.*;

/**
 * Created by arch on 7/3/17.
 */
public class MainInHash {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap();

        int[] key = new int[10];
        int size = 10;

        for(int i = 0; i < size; i++){
            key[i] = (int) (Math.random() * 100);
            hashMap.put(key[i], "string" + key[i] + i);
        }

        System.out.println("");

        for(int i = 0; i < size; i++)
            System.out.println("key["+key[i]+"] = "+ hashMap.get(key[i]) + " ");
    }
}
