import java.util.*;

public class RotateStr {
    public static void rotateStr(String str){
        StringBuilder sb=new StringBuilder(str);

    }
    public static void main(String[] args){
        System.out.print("Enter a String value: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print("You have entered: "+str);
System.out.println();
        rotateStr(str);
        System.out.println();
    }
}
