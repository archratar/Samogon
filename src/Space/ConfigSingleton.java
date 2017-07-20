package Space;

public class ConfigSingleton {

    private static ConfigSingleton instance;
    private static boolean init = false;

    private static ConfigFileReader config;
    private static String file = "input.txt";

    private static String exclamation;
    private static boolean isSpain = false;

    private static int length;

    private ConfigSingleton(String excl, int len) {
        exclamation = new String(excl);
        length = len;
    }

    public static ConfigSingleton getInstance() {

        if (instance != null) {
            return instance;
        } else {
            config = new ConfigFileReader(file);
            initConfig(config);

            instance = new ConfigSingleton(exclamation, length);

            return instance;
        }
    }

    private static void initConfig(ConfigFileReader config) {
        isSpain = config.isSpain();
        exclamation = isSpain ? "!" : "";
        length = config.getLength();
        init = true;
    }

    // return '!' or ''
    public String stringSpain() {
        return exclamation;
    }
    // return true or false
    public boolean isSpain() {
        return isSpain;
    }
    // return length
    public int getLength() {
        return length;
    }
}
