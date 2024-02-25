package Basics;

public class StringMethods {
    public static void main(String[] args) {
        String txt = "Hello World";
        String greet = "Hello ";
        String name = "Eva";
        String backslash = "I need to see the backslash \\";
        String quoteString = "Put some quotes on \"His\" name!";
        String crazy = "Just try this o\but";
        String enter = "Just try \rthis o\but";

        System.out.println(txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        System.out.println(greet + " " + name);
        System.out.println(greet.concat(name));
        System.out.println(backslash);
        System.out.println(quoteString);
        System.out.println(crazy);
        System.out.println(enter);
    }
}
