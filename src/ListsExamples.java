import java.util.*;

public class ListsExamples {


    private static void soutListOfStrings(List<String> list){
        for(String s: list){
            System.out.println(s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        String nick="Nick";
        String ivan="Ivan";
        String vasily="Vasily";
        names.add(nick);
        names.add(ivan);
        names.add(vasily);
        soutListOfStrings(names);
        names.add("Stephan");
        if(names.contains("Ivan")){
            System.out.println("Hello, Ivan");
        }
        System.out.println(names.size());
        System.out.println(names.get(3));
        System.out.println(names.remove(2));
        System.out.println(names.remove("Dmitry"));
        //System.out.println(names.get(123));
        /** names.add("Kirill");
        for(String name:names){
            if("Ivan".equals(name)){
                names.remove(name);
            }
            System.out.println(name);               // names.set(1,"Peter")
        } **/

        Iterator<String>namesIterator= names.iterator();
        while(namesIterator.hasNext()){
            String name=namesIterator.next();
            if("Ivan".equals(name)){
                namesIterator.remove();
            }
        }

        LinkedList<String> linkedNames=new LinkedList<>();
        linkedNames.add(nick);
        linkedNames.add(ivan);
        linkedNames.add(vasily);
        linkedNames.addFirst("Olga");
        linkedNames.offerFirst("Helga");
        soutListOfStrings(linkedNames);
        linkedNames.removeFirst();
        soutListOfStrings(linkedNames);


    }



    /**
    ArrayList<String> strings=new ArrayList<>();
    strings.add("one");
    strings.add("two");
    strings.add("three");

    LinkedList<String>linkedStrings=new LinkedList<>();
    linkedStrings.add("one");
    linkedStrings.add("two");
    linkedStrings.add("three");
     **/
}
