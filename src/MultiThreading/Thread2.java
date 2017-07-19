package MultiThreading;

public class Thread2 extends Thread {

    public void run() {

        for(int i = 0; i < 5; i++) {
            Thread2 thread = new Thread2();
            thread.start();
        }
        for(int i = 0; i < 20; i++) {
            System.out.println("Thread 2 " + i);
        }
    }
}
