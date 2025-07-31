import java.util.*;
class TwoPointers{
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void evenToOdd(int[] arr){
        int i=0,n=arr.length,j=n-1;
        while(i<j) {
            if (arr[i]%2!=0 && arr[j]%2==0) {
                swap(arr, i, j);
                j--;
                i++;
            }
            if (arr[i]%2==0) {
                i++;
            }
            if (arr[j]%2!= 0) {
                j--;
            }
        }
    }
    public static void arraysort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j, j+1);
                }
            }
            }
    }
    public  static void arraySq(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }
    public static void prefixsum(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        System.out.print("Prefix Sum array: ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(prefix[i] + " ");
        }
    }
    public static void main(String[] args){
//        int[] arr={1,2,3,4,5,6,7};
//        System.out.print("Array : ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        evenToOdd(arr);
//        System.out.print("Array : ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        int[] arr={-10,-3,-2,1,4,5};
//        arraySq(arr);
//        arraysort(arr);
//        for (int i = 0; i<arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i=0; i<arr.length; i++) {
            System.out.print("Enter Element "+i+": ");
            arr[i]=sc.nextInt();
        }
        prefixsum(arr);
    }
}


