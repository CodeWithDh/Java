import java.util.*;
import students.*;

public class practice {

    // Swapping Numbers
//    public static int[] swapNumbers(int a, int b) {
//        return new int[]{b, a};  // Swaps and returns new values
//    }
//
//    // Checking Even or Odd
//    public static void checkEvenOdd(int num) {
//        if (num % 2 == 0)
//            System.out.println(num + " is Even");
//        else
//            System.out.println(num + " is Odd");
//    }
//
//    // Finding the Largest Among Three Numbers
//    public static int findLargest(int a, int b, int c) {
//        return Math.max(a, Math.max(b, c));
//    }
//
//    public static void main(String[] args) {
//        // Creating student objects
//        students obj1 = new students("Shivam Dhingra", 11015);
//        obj1.display();
//
//        students obj2 = new students("Yuvraj", 10151, 78);
//        obj2.display();
//
//        // Swapping numbers
//        int a = 50, b = 70;
//        int[] swappedValues = swapNumbers(a, b);
//        System.out.println("After Swapping: A = " + swappedValues[0] + ", B = " + swappedValues[1]);
//
//        // Checking even or odd
//        checkEvenOdd(27);
//        checkEvenOdd(44);
//
//        // Finding the largest number
//        int largest = findLargest(25, 65, 40);
//        System.out.println("Largest Number: " + largest);
//    }

//    Exception Handling
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter Numerator");
            int numerator = sc.nextInt();
            System.out.println("Enter denominator");
            int denominator=sc.nextInt();

            int result=numerator/denominator;
            System.out.println("Result: "+result);
        }catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed");
        }catch(java.util.InputMismatchException m){
            System.out.println("Error : Invalid Input, Please enter integers only.");
        }finally {
            System.out.println("Program is executed Successfully");
            sc.close();
        }
    }
}

