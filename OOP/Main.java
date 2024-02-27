package OOP;

public class Main {
        String greeting = "Hello";
    public static void main(String[] args) {
        // Accessing and modifying class attributes
        Main food = new Main();
        food.greeting = "Hello Eva";

        System.out.println(food.greeting);

        // Importing attributes from other classes
        Oops myImport = new Oops();
        System.out.println(myImport.x);

        // Importing multiple class methods
        Oops myCar = new Oops();
        myCar.fullThrottle();
        myCar.speed(200);

        // Using access/non-access modifiers
        Student stud = new Student();

        System.out.println("Name: " + stud.first_name);
        System.out.println("Age: " + stud.age);
        System.out.println("Name: " + stud.grad_year);

        // Encapsulation
        Encapsulation lad = new Encapsulation();
        // lad.name = "Yokaana"; throws an error
        // System.out.println(lad.name); also throws an error

        // Proper way to use encapsulated class attributes
        lad.setName("Yokie");
        System.out.println(lad.getName()); 
    }
}
