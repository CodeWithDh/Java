import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Patterns.OddRowPattern();
//        Patterns.newPattern();
//        Patterns.trianglePattern();
//        Patterns.numberPattern();
//        Patterns.oddEvenNumberPattern();

//        long[] memo=new long[15+1];
//        Patterns.fibonacci(15,memo);
//        Patterns.printArr(memo);
//        System.out.println(Patterns.factorial(5));
//        int n=81;
//        System.out.println("Is "+n+" is a Prime number: "+Patterns.checkPrime(n));
////        O(n)
//        System.out.println(DSA_Problems.recusiveFactorial(3));
//        int arr[]={-5,2,10,4,6};
//        System.out.println(DSA_Problems.LinearSearch(arr,5,6));
//        int[] arr={-5,2,4,6,10};
//        System.out.println(DSA_Problems.BinarySearch(arr,5,2));
//        recursive binary Search
//        int[] arr={-5,2,4,6,10};
//        System.out.println(DSA_Problems.BinarySearch(arr,5,6));
//        Bubble Sort Completed
        int[]arr={10,5,4,6,2,84,-1};
//        arr=DSA_Problems.bubbleSort(arr);
//        int i=0;
//        while(i<arr.length){
//            System.out.print(arr[i]+" ");
//            i++;
//        }
//        int[]arr={-6,20,8,-2,4};
//        arr=DSA_Problems.insertionSort(arr);
//        arr=DSA_Problems.newBubbleSort(arr);
        arr=DSA_Problems.newInsertionSort(arr);
        int i=0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
    }

    public static int[] quickSort(int[]arr){
        if(arr.length<2){
            return arr;
        }
        int pivot=arr[arr.length-1];
        int[]left={};
        int[]right={};
        for(int i=0;i<arr.length-1){
            if(arr[i]<pivot){
                left.// push command is not available in Java so i did this prgram in nodeJs
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



            }
        }
    }
}