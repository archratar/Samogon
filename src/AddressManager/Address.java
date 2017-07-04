package AddressManager;

/**
 * Created by arch on 7/4/17.
 */
public class Address implements AddressI {

    public String address;

    Address (String yourAddress){

        if (yourAddress == "@"){
            this.address = "email" + yourAddress;
        }else
            this.address = "real" + yourAddress;

    }

    public String getAddress(){

        return "address";
    }
}
