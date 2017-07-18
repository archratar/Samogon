package InputOutputStreams;

import java.io.*;

/**
 * Created by arch on 7/19/17.
 */
public class CopyFile {

    private FileInputStream in = null;
    private FileOutputStream out = null;

    public CopyFile(String input, String output) {

        try {
            in = new FileInputStream(input);
            out = new FileOutputStream(output);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
