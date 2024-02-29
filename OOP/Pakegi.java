package OOP;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;;

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
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------- ");
        System.out.println("Formatting mode: " + myFormatObject);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

        String formattedDate = myDtObject.format(myFormatObject);
        System.out.println("After formatting: " + formattedDate);
    }

}
