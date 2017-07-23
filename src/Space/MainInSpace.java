package Space;

public class MainInSpace {
    public static void main(String[] args) {

        ConfigSingleton config = ConfigSingleton.getInstance();

        int length = config.getLength();
        boolean isSpain = config.getIfSpain();
        String stringExclamation = config.exclamation();

        System.out.println("System config:\nlength is " + length + " is Spane = " + isSpain);

        for(int i = 0; i < 10; i++) {
            config = config.getInstance();
            System.out.println("len " + config.getLength() + ", spain = " + config.getIfSpain() + ", instance " + config);
        }
   }
}
