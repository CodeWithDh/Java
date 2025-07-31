package Experiments;

class Animal {
    // Method in the parent class
    void sound() {
        System.out.println("This animal makes a sound");
    }
}

// Child class (also called subclass or derived class)
class Dog extends Animal {
    // Overriding the sound() method of the parent class
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}

public class inheritance {
    public static void main(String[] args) {
        // Create an object of the child class
        Dog myDog = new Dog();


        // Call the method on the child class object
        myDog.sound();  // Output: The dog barks
    }
}

