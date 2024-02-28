package OOP;

class Inheritence {
    // illustrating inheritence
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Pee beee");
    }
}

class Car extends Inheritence {
     // illustrating inheritence
     private String modelName = "Mustang";
     public static void main(String[] args) {
         Car myCar = new Car();
         myCar.honk();
 
         System.out.println(myCar.brand + " " + myCar.modelName);
     }
}
