package OOP;

interface Animal {
    public void animalSound();
    public void sleep();
}

class Cat implements Animal {
    public void animalSound() {
        System.out.println("The cat says: Meow");
    }
    public void sleep() {
        System.out.println("Zzzzz, Zzzzz");
    }
}

class Inter {
    public static void main(String[] args) {
        Cat spikey = new Cat();
        spikey.animalSound();
        spikey.sleep();
    }
}