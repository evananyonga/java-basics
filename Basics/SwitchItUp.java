package Basics;

public class SwitchItUp {
    public static void main(String[] args) {
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("It\'s a Monday");
                break;
            case 2:
                System.out.println("It\'s a Tuesday");
                break;
            case 3:
                System.out.println("It\'s a Wednesday");
                break;
            case 4:
                System.out.println("It\'s a Thursday");
                break;
            case 5:
                System.out.println("It\'s a Friday");
                break;
                default:
                    System.out.println("Ladies and Gentlemen, The Weekend!");
        }
    }
}