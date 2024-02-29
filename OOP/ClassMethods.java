package OOP;
import java.util.Scanner;

public class ClassMethods {

    public static void main(String[] args) {
        // creating an object of a class
        ClassMethods myClassMethod = new ClassMethods();

        // using the pubic method on the class instance
        myClassMethod.myPubMethod();
        
        // Cannot create an object for static method. It can smiply be called
        myStaticMethod();

        // Using the Scanner class in Java
        Scanner newObj = new Scanner(System.in); // Creating an object of the scanner class
        System.out.println("Enter name:");

        String name = newObj.nextLine(); // Declaring the next line method of the scanner object
        
        System.out.println("Enter age:");
        int age = newObj.nextInt();

        System.out.println("Enter salary:");
        double salary = newObj.nextDouble();

        System.out.println("Your name is: " + name);
        System.out.println("You are: " + age + " years old");
        System.out.println("You earn: " + salary + " every month");

        newObj.close();

    }
    public void myPubMethod() {
        System.out.println("Hello Pub Method");
    }

    static void myStaticMethod() {
        System.out.println("Hello Static Methead");
    }
}
