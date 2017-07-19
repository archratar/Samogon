package Space;

public class MainInSpace {
    public static void main(String[] args) {

        ConfigSource config = new ConfigFileReader();

        boolean isEspano = config.read("input.txt");
        System.out.println(isEspano ? "Como estas?" : "How do you do?");

        String hello = new String();
        hello = isEspano ? "!Hello World!" : "Hello World!";

        System.out.println(hello);
    }
}
