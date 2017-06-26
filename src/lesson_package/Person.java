package lesson_package;

/**
 * Created by arch on 6/22/17.
 */
public class Person implements Comparable<Person>{

    private int age;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        return age == ((Person)o).getAge();
    }

    @Override
    public int compareTo(Person person) {
        return this.getAge() - person.getAge();
    }


    public String toString(){
        return this.name + Integer.toString(age);
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
