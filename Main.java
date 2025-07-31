import com.sun.jdi.IntegerValue;

import java.util.*;
public class Main{
    public static Scanner  sc = new Scanner(System.in);

    public static void arrSearch(int[] arr,int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                System.out.println("Found at index: "+i);
                return;
            }
        }
        System.out.println("Not Found");
    }

    public static void change_array(int [] arr) {
        for (int i=0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
    public static void enterElements(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element at index "+i+": ");
            arr[i]=sc.nextInt();
        }
    }
    public static void lastIndex(int[] arr,int value) {
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==value){
                System.out.println("last found at: "+i);
                break;
            }
        }
    }
    public static void isSorted(int[] arr){

        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){

                System.out.println("Array is not sorted at index "+i);
                return;
            }
        }

            System.out.println("Array is sorted");


    }
    static void findKthSmallestAndKthLasrgest(int[] arr,int k){
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.println(k+" th smallest element in array is "+arr[k-1]);
        System.out.println(k+" th Largest element in array is "+arr[arr.length-k]);


    }
static void TargetSum(int[] arr,int target){
       for(int i=0;i<arr.length;i++){
       for(int j=i+1;j<arr.length;j++){
              for(int k=j+1;k<arr.length;k++){
                  if(arr[i]+arr[j]+arr[k]==target){
                      System.out.println("Found pair of " + arr[i] + " and " + arr[j] +
                              " and " +arr[k]);
                  }
              }
           }

       }
}
static void firstRepeatative(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("First repeated element is: "+arr[i]+" at index " +
                            i+" and "+j);
                    return;
                }
            }
        }
    System.out.println("Repeatative vlue not found in whole Array.");
}
static void unique(int[] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=Integer.MIN_VALUE;
                    arr[j]=Integer.MIN_VALUE;
                }
            }

        }
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]!=Integer.MIN_VALUE){
            System.out.println("The unique value in this array is "+arr[i]);
        }
    }
}

    public static void main(String[] args){
//        System.out.print("Enter size of array: ");
//        int size=sc.nextInt();
//          int[] arr=new int[size];
//          enterElements(arr);
//        _______________

//        System.out.print("Enter the number you want to last index: ");
//        int value=sc.nextInt();
//        lastIndex(arr,value);
//        isSorted(arr);
//        System.out.println("Enter the kth :");
//        int k=sc.nextInt();
//        findKthSmallestAndKthLasrgest(arr,k);
//        System.out.print("Enter the Target Sum value: ");
//        int target=sc.nextInt();
//        TargetSum(arr,target);
//        firstRepeatative(arr);
//        unique(arr);
       ArrayList<Integer> list=new ArrayList<Integer>();
       list.add(0);
       list.add(2);
       list.add(3);
       list.add(1,45);
        System.out.println(list);
        System.out.println(list.size());
        ArrayList<Object> list2=new ArrayList<Object>();
        list2.add(1);
        list2.add('+');
        list2.add(2);
        list2.add('-');
        list2.add(3);
        System.out.println(list2);
        String inp=sc.next();
        while(true){
            if(inp.isEmpty()){
                break;
            }else{

            }

        }



    }
}