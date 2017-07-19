package Space;

import java.io.FileInputStream;

public class ConfigReader implements ConfigSource {

    private static String fileName = null;
    private static boolean initialized = false;
    private static boolean isSpain = false;
    private static String greetings = null;
    private static int length = 0;

    public ConfigReader (String file) {

        if (! this.initialized) {
            this.fileName = file;
            this.init();
        }
    }

    public void greetings() {
        System.out.println(hello());
    }

    public String hello() {
        if(this.initialized) {
            return this.greetings;
        } else {
            this.init();
            return this.greetings;
        }
    }

    private void init() {

        this.isSpain = parserCountry(this.read());
        this.greetings = this.isSpain ? "!Hello World!": "Hello World!";
        this.initialized = true;
    }

    private char[][] read() {
        try {
            FileInputStream input = new FileInputStream(this.fileName);
            char[][] data = new char [2][input.available()];

            int ch = 0;

            int i, j;
            for(i = 0; i < 2; i++) {
                for(j = 0; true; j++) {

                    if ((ch = input.read()) != -1) {
                        data[i][j] = (char)ch;
                        if (ch == '\n')
                            break;
                    }
                }
            }

            return data;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private boolean parserCountry(char[][] data) {

        int i;
        boolean firstLine = true;
        char[] truth = {'t', 'r', 'u', 'e', '\n'};
        int isTruth = 1;
        char[] length = new char[4];

        for(i = 0; truth[i] != '\n'; i++) {
            if (data[0][i] == truth[i]) {
                isTruth++;
            }
        }

        return this.isSpain = isTruth == truth.length;
    }
}
