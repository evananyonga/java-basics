package Basics;

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // The foreach loop
        String[] cars = {"Volvo", "BMW", "Mercedes"};
        for (String i: cars) {
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
