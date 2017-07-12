package ArrayListCustom;

import com.sun.jndi.toolkit.url.Uri;

import java.net.MalformedURLException;

/**
 * Created by arch on 7/9/17.
 */
public class MainInLL {
    public static void main(String[] args){

//        LinkedListCustom <Integer> list = new LinkedListCustom<>();
//        list.add(10);
//        list.stdout();

        try {
            Uri obj = new Uri("string");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        LinkedList<Integer> list = new LinkedList<>(1);
        list.add(1);
    }
}
