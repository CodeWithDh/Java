import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Patterns.OddRowPattern();
//        Patterns.newPattern();
//        Patterns.trianglePattern();
//        Patterns.numberPattern();
//        Patterns.oddEvenNumberPattern();

        long[] memo=new long[6+1];
        System.out.println(Patterns.fibonacci(6,memo));

    }
}