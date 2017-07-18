package MultiThreading;

import static java.lang.Thread.sleep;

/**
 * Created by arch on 7/18/17.
 */
public class MainInMultriThreading {
    public static void main(String[] args) {
        OurThread thread = new OurThread();

        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Hello from Main");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
