import java.util.Objects;
import java.util.Set;

public class Person implements Comparable <Person> {

    private String name;
    private int age;

    public Person(String name){
        this.name=name;
    }
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Person o){
        return name.compareTo(o.name);
    }



}

