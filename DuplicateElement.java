import java.util.*;
public class DuplicateElement {
    static int duplicate=0;
    public static  void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter Element at "+i+": ");
            int value=sc.nextInt();
            arr[i]=value;
        }

        for(int i=0; i<size; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    duplicate=arr[i];
                    System.out.println("Duplicate Element is "+duplicate);
                }
            }
        }


    }
}
