package MultiThreading;

/**
 * Created by arch on 7/18/17.
 */
public class OurThread extends Thread {

    public void run () {

        for (int i = 0; i < 100; i++) {
            System.out.println("Hello from OurThread");

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
