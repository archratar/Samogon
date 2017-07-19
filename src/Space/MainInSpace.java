package Space;

public class MainInSpace {
    public static void main(String[] args) {

        ConfigSource config = new ConfigReader("input.txt");

        config.greetings();
   }
}
