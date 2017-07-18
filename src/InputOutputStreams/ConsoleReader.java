package InputOutputStreams;

import java.io.*;

/**
 * Created by arch on 7/19/17.
 */
public class ConsoleReader {

    public ConsoleReader () {
        InputStreamReader cin = null;

        try {
            cin = new InputStreamReader(System.in);
            System.out.println("type q to quit");

            char c;
            do {
                c = (char) cin.read();
                System.out.print(c);
            } while (c != 'q');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
