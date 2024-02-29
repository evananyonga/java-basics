package OOP;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Pakegi {
    // Using built-in Java packages
    public static void main(String[] args) {
        // The date object
        LocalDate myDateObject = LocalDate.now();
        System.out.println(myDateObject);

        // The time object
        LocalTime myTimeObject = LocalTime.now();
        System.out.println(myTimeObject);

        // Formatting Date and Time
        LocalDateTime myDtObject = LocalDateTime.now();
        System.out.println("Before formatting: " + myDtObject);
        DateTimeFormatter myFormatObject = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        
        System.out.println("++-------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("Formatting mode: " + myFormatObject);
        System.out.println("++-------------------------------------------------------------------------------------------------------------------------------+");

        String formattedDate = myDtObject.format(myFormatObject);
        System.out.println("After formatting: " + formattedDate);

        // Java ArrayList class from util package
        ArrayList<String> cars = new ArrayList<String>(); // Creating an ArrayList object
        cars.add("Volvo"); // Adding elements to an ArrayList
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0)); // Accessing an element at the zero index 
        cars.set(0, "VW"); // Changing an element at the zero index 
        System.out.println(cars); 
        cars.remove(2); // Removing an element at the 2nd index 
        System.out.println(cars); 
        cars.clear(); 

        System.out.println(cars.size()); 

        // LinkedLists
        /* Works exactly like the ArrayList but used for different purposes. However, it has other useful methods like
         * addFirst();
         * addLast();
         * removeFirst();
         * removeLast();
         * getFirst();
         * getLast();
         */
    }

}
