package AddressManager;

/**
 * Created by arch on 7/4/17.
 */
public class EmailAddress extends Address implements AddressI{

    EmailAddress(String address){
        super("@");
    }
}
