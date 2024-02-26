package OOP;

public class ClassMethods {

    public static void main(String[] args) {
        ClassMethods myClassMethod = new ClassMethods();
        myClassMethod.myPubMethod();
        myStaticMethod();
    }
    public void myPubMethod() {
        System.out.println("Hello Pub Method");
    }

    static void myStaticMethod() {
        System.out.println("Hello Static Methead");
    }
}
