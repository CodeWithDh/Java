import java.util.*;
public class equalPartition {
    static Scanner sc=new Scanner(System.in);
public static int[] enterElements(int[] arr){
    for(int i=0; i<arr.length; i++){
        System.out.print("Enter element at index "+i+": ");
        arr[i]=sc.nextInt();
    }
    return arr;
}
public static boolean equalPartition(int[] arr){
    int [] Prefixarr = new int[arr.length];
    int suffixSum=0;
    int totalSum=0;
    for(int i=0; i< arr.length; i++){
        totalSum+=arr[i];
    }

    for(int i=0; i<arr.length; i++){
        if(i==0)
            Prefixarr[i]=arr[i];
        else
            Prefixarr[i]=Prefixarr[i-1]+arr[i];
        suffixSum=totalSum-Prefixarr[i];
        if(Prefixarr[i]==suffixSum){
            return true;

        }
    }

    return false;  // return false if not found a pair of equal sum subsets in the array.

}
    public static void main(String[] args){
        System.out.print("Enter the size of an Array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];

        enterElements(arr);

        System.out.println(equalPartition(arr));

    }
}
//You will be given two positive integers, a and
//separated by newline. For each integer n in the inclusive
//- if then print the English representation of it in
//lowercase. That is "one' forl, "twot' for 2 and so on.
//        -Else if n>9 and it is an even number, then print "even"
//        -Else if n>9 and it is an odd number, then rint "odd"
