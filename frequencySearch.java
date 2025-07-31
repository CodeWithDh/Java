import java.util.*;
public class frequencySearch {
    static int[] freq=new int[100005];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i=0; i<arr.length; i++) {
            System.out.print("Enter the Array Elements: ");
            arr[i]=sc.nextInt();
        }
        for (int i=0; i<arr.length; i++) {
            freq[arr[i]]++;
        }
        System.out.print("Enter the number of quries: ");
        int q=sc.nextInt();
        for (int i=q; i>0; i--) {

            System.out.print("Enter the Element to Search: ");
            int search =sc.nextInt();
            if(freq[search]!=0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }


    }
}
