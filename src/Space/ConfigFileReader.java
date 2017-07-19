package Space;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public final class ConfigFileReader implements ConfigSource {

    private static boolean wasInit = false;
    private static boolean initInfo = false;

    ConfigFileReader() {

    }

    public boolean read(String file) {

        if (wasInit){
            return initInfo;
        }

        String result = null;
        int ch = 0;

        try {
            FileInputStream input = new FileInputStream(file);
            char [] tmp = new char[input.available()];

            int i = 0;

            while ((ch = input.read()) != -1) {
                tmp[i] = (char)ch;
                i++;
            }

            initInfo = isTrue(tmp);
        } catch (Exception e) {
            e.printStackTrace();
        }


        if (initInfo) {
            wasInit = true;
        }

        return initInfo;
    }

    private boolean isTrue(char[] string) {

        char [] wordTrue = {'t', 'r', 'u', 'e', '\n'};
        int isTrue = 0;

        if (string.length > wordTrue.length)
            return false;

        for(int i = 0; i < string.length; i++) {
            if (wordTrue[i] == string[i]){
                isTrue++;
            }
        }

        return isTrue == wordTrue.length;
    }
}
