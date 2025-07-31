// Student Record Modifications
 import java.util.*;

class Student{
    static Scanner sc=new Scanner(System.in);
public Student(String [] arr){
ArrOperations ops=new ArrOperations();
ops.insertElements(arr);
ops.getElements(arr);
}
}

public class StudentTest {
    public static void main(String[] args){
        String[] arr=new String[5];
        Student obj1=new Student(arr);
    }
}

//----------------------------------------------------------------
//Constructor class book with default constructor with intializing values

//import java.util.*;
//class Book{
//    private String title;
//    private String author;
//    private double price;
//    public <Sting> Book(Sting title, String author, double price){
//
//    }
//    public void displayInfo(){
//        System.out.println("Title: "+title);
//        System.out.println("Author: "+author);
//        System.out.println("Price: "+price);
//    }
//}
//class StudentTest{
//    public static void main(String[] args){
//        Book defaultBook=new Book("Book Title","Shivam",28.3);
//        defaultBook.displayInfo();
//    }
//}
//Using Constructor with parameters
//import java.util.*;
//class Book{
//    private String title;
//    private String author;
//    private double price;
//    public  Book(String title, String author, double price){
//this.title=title;
//this.author=author;
//this.price=price;
//    }
//    public void displayInfo(){
//        System.out.println("Title: "+title);
//        System.out.println("Author: "+author);
//        System.out.println("Price: "+price);
//    }
//}
//class StudentTest{
//    public static void main(String[] args){
//        Book defaultBook=new Book("Book Title","Shivam",28.3);
//        defaultBook.displayInfo();
//    }
//}