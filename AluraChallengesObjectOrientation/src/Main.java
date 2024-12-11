import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Challenge 1
        Person person = new Person();
        person.helloWorld();

        // Challenge 2
        Calculator calculator = new Calculator();
        long number = calculator.doubleToNumber(50);
        System.out.println(number);

        // Challenge 3
        Music music = new Music();
        music.setTitle("Smells Like Teen Spirit");
        music.setArtist("Nirvana");
        music.setLaunchYear(1991);

        int rate = 0;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            rate = random.nextInt(10);
            music.rate(rate);
        }

        music.details();
        System.out.println("Rating: " + music.getMediaRating());

        // Challenge 4
        Car compass = new Car();
        compass.setBrand("Jeep");
        compass.setModel("Compass");
        compass.setLaunchYear(2017);
        compass.setColor("White");

        compass.details();
        System.out.println("Car Age: " + compass.getAge());

        // Challenge 5
        Student student = new Student();
        student.setAge(31);
        student.setName("Jean Dias");

        student.details();

        // Challenge 6
        BankAccount bankAccount = new BankAccount();

        // Challenge 7
        person.setName("Jean Dias");
        person.setAge(31);

        System.out.println("Is adult? " + person.isAdult());

        // Challenge 8
        Product rogStrix = new Product();
        rogStrix.setName("Asus Rog Strix G16");
        rogStrix.setPrice(11600);
        System.out.println("Price with discount: R$ %.2f".formatted(rogStrix.priceWithDiscount(10)));

        //Challenge 9
        student.setScore1(6);
        student.setScore2(8);
        student.setScore3(4);
        student.setScore4(7);
        System.out.println("The average to %s is %.2f".formatted(student.getName(), student.getAverege()));

        // Challenge 10
        Book book = new Book();
        book.setAuthor("Alex Coelho");
        book.setName("Java com Orientação a Objeto");
        book.details();

        // Challenge 11
        CarModel renegade = new CarModel();
        renegade.setBrand("Jeep");
        renegade.setModel("Renegade");
        renegade.setLaunchYear(2016);
        renegade.setColor("Gray");
        renegade.setYear(2017);
        renegade.setPrice(75000);
        renegade.details();

        // Challenge 12
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.doNoise();
        cat.doNoise();
        dog.waggingTail();
        cat.scratchForniture();

        //Challenge 13
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.owner = "Jean";
        currentAccount.depoist(100);
        System.out.println("Before tax: %.2f".formatted(currentAccount.getAmount()));
        currentAccount.chargeMonthlyTax();
        System.out.println("After tax: %.2f".formatted(currentAccount.getAmount()));
    }
}
