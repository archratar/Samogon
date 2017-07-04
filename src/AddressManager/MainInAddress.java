package AddressManager;
import java.lang.String;

/**
 * Created by arch on 7/4/17.
 */
public class MainInAddress {

    public static void main (String[] args){

        Address address = new Address("@");

        System.out.println(address.getClass());
        System.out.println(address.address);
    }
}
