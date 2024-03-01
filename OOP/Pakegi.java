package OOP;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

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
        cars.add("Toyota");
        System.out.println(cars);
        System.out.println(cars.get(0)); // Accessing an element at the zero index 
        cars.set(0, "VW"); // Changing an element at the zero index 
        System.out.println(cars); 
        cars.remove(2); // Removing an element at the 2nd index 
        System.out.println(cars); 
        // cars.clear(); 

        // Looping an ArrayList with the Iterator class
        Iterator<String> it = cars.iterator(); // Creating an iterator object

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(cars.size()); 
        // System.out.println(it.next()); // printing the first item in an ArrayList with an Iterator

        // LinkedLists
        /* Works exactly like the ArrayList but used for different purposes. However, it has other useful methods like
         * addFirst();
         * addLast();
         * removeFirst();
         * removeLast();
         * getFirst();
         * getLast();
         */

        //  HashMaps
        HashMap <String, String> capitalCities = new HashMap<String, String>(); // Creating a HashMap object
        // Adding keys and values to the HashMap object
        capitalCities.put("Kenya", "Nairobi");
        capitalCities.put("Uganda", "Kampala");
        capitalCities.put("Angola", "Luanda");
        capitalCities.put("Zimbabwe", "Harare");
        capitalCities.put("Cote D'Ivore", "Abidjan");

        System.out.println(capitalCities);
        System.out.println(capitalCities.get("Uganda"));
        capitalCities.remove("Angola");
        System.out.println(capitalCities.size());
        System.out.println(capitalCities);
        // capitalCities.clear();

        /* Looping through a HashMap */
        // Using the foreach loop
        for (String i : capitalCities.keySet()) {
            System.out.println(i + " " + capitalCities.get(i));
        };

        // Creating a HashMap object called people that will store String keys and Integer values:
        HashMap <String, Integer> people = new HashMap<String, Integer>();

        // Adding keys of Names and values of Age
        people.put("Naki", 21);
        people.put("Affie", 25);
        people.put("Kasakya", 28);
        System.out.println(people);

        /* HashSets operate like HashNaps */
    }

}
