package Space;

public class MainInSpace {
    public static void main(String[] args) {

        ConfigSingleton config = ConfigSingleton.getInstance();

        int length = config.getLength();
        boolean isSpain = config.getIfSpain();
        String stringExclamation = config.exclamation();

        System.out.println("length is " + length + " is Spane = " + isSpain);
   }
}
