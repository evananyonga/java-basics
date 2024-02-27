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

        Student stud = new Student();

        System.out.println("Name: " + stud.first_name);
        System.out.println("Age: " + stud.age);
        System.out.println("Name: " + stud.grad_year);
    }
}
