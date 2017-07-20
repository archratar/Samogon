package Space;



public class ConfigSingleton {

    private static ConfigSingleton instance;
    private static boolean init = false;

    private static String exclamation;
    private static boolean isSpain = false;

    private static int length;

    private ConfigSingleton(String file) {
        ConfigFileReader config = new ConfigFileReader(file);
        initConfig(config);
    }

    public String stringSpain() {
        return exclamation;
    }

    public boolean isSpain() {
        return isSpain;
    }

    public int getLength() {
        return length;
    }

    private void initConfig(ConfigFileReader config) {
        isSpain = config.isSpain();
        exclamation = isSpain ? "!" : "";
        length = config.getLength();
        init = true;
    }
}
