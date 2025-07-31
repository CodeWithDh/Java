import java.util.*;

public class shivam {
    static Scanner sc=new Scanner(System.in);
    public static int[][] enterArr(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("Enter Element at "+i+" "+j+": ");
                arr[i][j]=sc.nextInt();

            }
            System.out.println();
        }
        System.out.println("Array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        return arr;
    }
//    --------------------
    public static int[][]  addMatrices(int[][] arr1,int[][] arr2,int[][] sum){
        if(arr1.length!=arr2.length){
            System.out.println("Array Dimensions are not equal.");
            return null;
        }else{
            int n=arr1.length;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    sum[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<sum[i].length;j++){
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println();
            }

            return sum;
        }
    }
    public static int[][] MultiplyArr(int[][] arr1,int[][] arr2,int[][] multiplied){
        if(arr1.length!=arr2.length){
            System.out.println("Array Dimensions are not equal.");
            return null;
        }else{
            int n=arr1.length;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    multiplied[i][j]=arr1[i][j]*arr2[i][j];
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<multiplied[i].length;j++){
                    System.out.print(multiplied[i][j]+" ");
                }
                System.out.println();
            }

            return multiplied;
        }
    }
    public static void main(String[] args){

        int[][] arr=new int[3][3];
        arr=enterArr(arr);
        int[][] arr2=new int[3][3];
        arr2=enterArr(arr2);
        int[][] sumArr=new int[3][3];
        System.out.println("Here is the sum of the arrays:");

        sumArr=addMatrices(arr,arr2,sumArr);

        System.out.println("Here is the Multiplication of the arrays:");
int[][] multiplied=new int[3][3];
        multiplied=MultiplyArr(arr,arr2,multiplied);

    }

}
