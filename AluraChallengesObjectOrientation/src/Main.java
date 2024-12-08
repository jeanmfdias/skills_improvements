public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.helloWorld();

        Calculator calculator = new Calculator();
        long number = calculator.doubleToNumber(50);
        System.out.println(number);
    }
}
