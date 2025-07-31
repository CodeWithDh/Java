import java.util.*;
public class ArrOperations {
    static Scanner sc=new Scanner(System.in);
    public String[] insertElements(String [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Element at "+i+" : ");
            arr[i]=sc.nextLine();
        }
        return arr;
    }
    public void getElements(String [] arr){
        System.out.println("Array holds these elements below : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
