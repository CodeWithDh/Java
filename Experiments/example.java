package Experiments;

public class example {


    public example() {
        System.out.println("Default Constructor");
    }

    public example(int x) {
        System.out.println("Parameterized Constructor with one argument: " + x);
    }

    // Method Overloading
    public void display() {
        System.out.println("No arguments");
    }

    public void display(String str) {
        System.out.println("String argument: " + str);
    }


}