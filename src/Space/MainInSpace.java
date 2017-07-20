package Space;

public class MainInSpace {
    public static void main(String[] args) {

        ConfigSource config = new ConfigFileReader("input.txt");

        System.out.println(config.getGreetings() + " " + config.getLength());

//        Singletone.test();
   }
}
