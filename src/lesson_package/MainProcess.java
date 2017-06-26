package lesson_package;

import java.util.TreeSet;

/**
 * Created by arch on 6/22/17.
 */
public class MainProcess {
    public static void main(String[] args) {

        TreeSet<Person> treePerson = new TreeSet<>(new PersonComparator());

        Person Sasha  = new Person();
        Person Andriy = new Person();
        Person Vasia  = new Person();
        Sasha.setAge(32);
        Andriy.setAge(37);
        Vasia.setAge(23);

        treePerson.add(Vasia);
        treePerson.add(Sasha);
        treePerson.add(Andriy);

    }
}
