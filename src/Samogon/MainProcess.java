package Samogon;

/**
 * Created by arch on 6/5/17.
 */
public class MainProcess {
    public static void main(String [] args) {

        Apparat apparat = new Apparat(new ShShlang(), new CoCooler(), new HeHeater(), new DeDeflegmator());
        System.out.println(apparat.brewBuhlo(new Grape(), "sugar", "water"));

    }
}