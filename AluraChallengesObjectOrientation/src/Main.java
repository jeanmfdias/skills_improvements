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
        System.out.println("Age: " + compass.getAge());
    }
}
