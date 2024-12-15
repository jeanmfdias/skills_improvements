import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Challenge 1
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

        // Challenge 2
        ArrayList<Product> products = new ArrayList<>();

        Product rogStrix = new Product("Rog Strix G16");
        rogStrix.setQuantity(1);
        rogStrix.setPrice(11600);

        Product monitorSamsung = new Product("Monitor 27\" T350");
        monitorSamsung.setPrice(900);
        monitorSamsung.setQuantity(1);

        products.add(rogStrix);
        products.add(monitorSamsung);

        System.out.println("Products size: " + products.size());
        System.out.println("Product index 1: " + products.get(1));

        for (Product product : products) {
            System.out.println(product);
        }

        PerishableProduct lettuce = new PerishableProduct("Lettuce");
        lettuce.setQuantity(100);
        lettuce.setPrice(5);
        System.out.println(lettuce);
    }
}
