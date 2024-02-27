package OOP;

abstract class Modifier {
    public String first_name = "Yokaana";
    public int age = 24;
    public abstract void study();
}

class Student extends Modifier {
    public int grad_year = 2018;
    public void study() {
        System.out.println("Studying all day long");
    }
}
