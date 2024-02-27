package OOP;

public class Main {
        String greeting = "Hello";
    public static void main(String[] args) {
        Main food = new Main();
        food.greeting = "Hello Eva";

        Oops myImport = new Oops();
        System.out.println(myImport.x);
        System.out.println(food.greeting);

        Oops myCar = new Oops();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
