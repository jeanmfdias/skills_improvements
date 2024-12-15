import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person me = new Person();
        me.setName("Jean");
        me.setAge(31);

        Person myWife = new Person();
        myWife.setName("Vanessa");
        myWife.setAge(28);

        Person myDaugher = new Person();
        myDaugher.setName("Vitoria");
        myDaugher.setAge(1);

        people.add(me);
        people.add(myWife);
        people.add(myDaugher);

        System.out.println("List size: " + people.size());
        System.out.println("First person: " + people.getFirst());
        System.out.println(people);
    }
}
