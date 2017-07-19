package MultiThreading;

public class Thread0 extends Thread {

    public void run() {

        for(int i = 0; i < 20; i++) {
            System.out.println("Thread 0 " + i);
        }
    }
}
