import java.util.*;

public class SetExamples{
    public static void main(String[] args) {
        HashSet<String> names=new HashSet<>();
        String nick="Nick";
        String ivan="Ivan";
        String vasily="Vasily";
        names.add(nick);
        names.add(ivan);
        names.add(vasily);
        names.add("Ivan");
        soutSet(names);
        Person nickPerson=new Person("Nick");
        Person nickPerson2= new Person("Nick");
        Person ivanPerson=new Person("Ivan");
        HashSet<Person> persons=new HashSet();
        persons.add(nickPerson);
        persons.add(nickPerson2);
        persons.add(ivanPerson);
        soutSet(persons);

        LinkedHashSet<Person>linkedPersons=new LinkedHashSet<>();
        linkedPersons.add(nickPerson);
        linkedPersons.add(nickPerson2);
        linkedPersons.add(ivanPerson);
        linkedPersons.add(new Person("Vlad"));
        soutSet(linkedPersons);

        TreeSet<Person>treePerson=new TreeSet<>();
        treePerson.add(nickPerson);
        treePerson.add(nickPerson2);
        treePerson.add(ivanPerson);
        System.out.println(treePerson);

        Comparator<Person>personComparator=new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2){
                return Integer.compare(o1.getAge(),o2.getAge());

            }
        };
        TreeSet anotherTreePerson= new TreeSet<>(personComparator);
        anotherTreePerson.add(new Person("Stephan",50));
        anotherTreePerson.add(new Person("Ignat",15));
        anotherTreePerson.add(new Person("Svetlana",30));
        soutSet(anotherTreePerson);



        HashMap<Integer,String> persons1= new HashMap<>();
        persons1.put(1011,"Ivan");
        persons1.put(0110,"Stephan");
        persons1.put(0110,"Svetlana");
        String name=persons1.get(0110);
        System.out.println(name);

    }
    private static void soutSet(Set set) {
        for (Object s : set) {
            System.out.println(s);
        }
        System.out.println();
    }

}