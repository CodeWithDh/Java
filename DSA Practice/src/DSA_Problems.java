import java.util.Arrays;

public class DSA_Problems {
    public static long fibonacci(int n, long[] memo){
        if(n<=1){
//               System.out.print(memo[n]+" ");
            memo[n]=n;
            return n;
        } else if (memo[n]!=0) {
            return memo[n];
        }
        memo[n]=fibonacci(n-1,memo)+fibonacci(n-2,memo);
        return memo[n];
    }
    public static void printArr(long[]memo){
        for (int i = 0; i <memo.length ; i++) {
            System.out.print(memo[i]+" ");
        }
    }
//    fibonacci in NodeJS
//    function fibonacci(n) {
//        let fib = [0, 1];
//        for (let i = 2; i < n; i++) {
//            fib[i] = fib[i - 1] + fib[i - 2];
//        }
//        return fib;
//    }
//
//console.log(fibonacci(7));
//console.log(fibonacci(5));

    public static int factorial(int n){
        int fac=1;
        if(n>1){
            for (int i = 2; i <=n ; i++) {
                fac *= i;
            }
        }
        return fac;
    }

    public static boolean checkPrime(int n){
        boolean status;
        if(n>1){
            for (int i = 2; i <Math.sqrt(n) ; i++) {
                if(n%i==0){
                    status=false;
                    return status;
                }
            }
        }else{
            status= false;
        }
        status=true;
        return status;
    }
    public static int recusiveFactorial(int n){
        if(n>1){
            return (n*recusiveFactorial(n-1));
        }else{
            return 1;
        }
    }
    public static int LinearSearch(int arr[] , int n , int t){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==t){
                return i;
            }
        }
        return -1;
    }
    public static int BinarySearch(int[]arr,int n,int t){
//        Only sorted array should be entered;
        int leftIndex=0;
        int rightIndex=n-1;

        while(leftIndex<=rightIndex){

            int midIndex= (leftIndex+rightIndex)/2;

            if(t==arr[midIndex]){
                return midIndex;
            }
            else if(t>arr[midIndex]){
                leftIndex=midIndex+1;
            }
            else if(t<arr[midIndex]){
                rightIndex=midIndex-1;
            }

        }
        return -1;
    }
    public static int recursiveBinarySearch(int[]arr,int t,int leftIndex,int rightIndex){
        if(leftIndex>rightIndex){
            return -1;
        }else{
            int midIndex=leftIndex+rightIndex/2;

            if(t==arr[midIndex]){
                return midIndex;
            }
            else if(t>arr[midIndex]){
                leftIndex=midIndex+1;
                return recursiveBinarySearch(arr,t,leftIndex,rightIndex);
            }else if(t<arr[midIndex]){
                rightIndex=midIndex+1;
                return recursiveBinarySearch(arr,t,leftIndex,rightIndex);
            }
        }
        return -1;
    }
    public static int[] bubbleSort(int[]arr){
        boolean swapped;
        do{
            swapped=false;
            for (int i = 0; i <arr.length-1 ; i++) {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    swapped=true;
                }
            }
        }while(swapped);
        return arr;
    }
    public static int[] insertionSort(int[]arr){
        for (int i = 1; i <arr.length; i++) {
            int nti= arr[i];
            int se=i-1;
            while(se>=0 && arr[se]>nti){
                arr[se+1]=arr[se];
                se--;
            }
            arr[se+1]=nti;
        }
        return arr;
    }

    public static int[] newBubbleSort(int[]arr){

        boolean swapped;
        do{
            swapped=false;
            for (int i = 0; i <arr.length-1 ; i++) {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    swapped=true;
                }
            }
        }while(swapped);
        return arr;
    }
    public static int[] newInsertionSort(int[]arr){

        for (int i = 1; i <arr.length ; i++) {
            int nti=arr[i];
            int se=i-1;
            while(se>=0 && arr[se]>nti){
                arr[se+1]=arr[se];
                se--;
            }
            arr[se+1]=nti;
        }

        return arr;
    }

    // push command is not available in Java so i did this prgram in nodeJs
//Nodejs code :-
//                        function quickSort(arr) {
//                    if (arr.length < 2) {
//                        return arr;
//                    }
//                    let pivot = arr[arr.length - 1];
//                    let left = [];
//                    let right = [];
//
//                    for (let i = 0; i < arr.length - 1; i++) {
//                        if (arr[i] < pivot) {
//                            left.push(arr[i]);
//                        } else {
//                            right.push(arr[i]);
//                        }
//                    }
//
//                    return [...quickSort(left), pivot, ...quickSort(right)];
//                }
//
//                let arr = [3, 1, 4, 1, 5, 9, 2, -6, 5, -3, 5];
//                console.log(quickSort(arr));

//                NodeJS Cartesian Product Theory =done it by my own without watching solution
//                function cartesianProduct(a, b) {
//                    let result = [];
//                    for (let i = 0; i < a.length; i++) {
//                        let temp = [];
//                        for (let j = 0; j < b.length; j++) {
//                            temp.push([a[i], b[j]]);
//                        }
//                        result.push(...temp);
//                    }
//                    return result;
//                }
//
//                let a = [1, 2];
//                let b = [3, 4, 5];
//                console.log(cartesianProduct(a, b));

//}
//        }
}
