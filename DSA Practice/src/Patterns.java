import java.util.*;

public class Patterns {
    static Scanner sc =new Scanner(System.in);
//    odd row Pattern
       public static void OddRowPattern(){

           System.out.print("Enter Number of rows : ");
           int row=sc.nextInt();
           for(int i=1;i<=row;i++){
               for(int j=1;j<=i;j++){
                   if(i%2!=0) {
                       System.out.print("*"); //only show odd rows
                   }
               }
               System.out.print("\n");
           }
       }
// print this pattern :
//             ****
//             ***
//             **
//             *

        public static void newPattern(){
            System.out.print("Enter number of rows : ");
           int row=sc.nextInt();
            for (int i = row; i >= 1; i--) {
                for(int j=1 ; j<=i ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void trianglePattern(){
            System.out.print("Enter number of rows : ");
            int row=sc.nextInt();
           for (int i=1;i<=row;i++){
               for(int k=1;k<=(row-i);k++){
                   System.out.print(" ");
               }
               for(int j=1;j<=(2*i-1);j++){
                   System.out.print("*");
               }
               System.out.println();
           }
        }

        public static void numberPattern() {
            System.out.print("Enter number of rows : ");
            int row = sc.nextInt();
            for (int i = 1; i <= row; i++) {
                int count=i;
                for (int j = 1; j <= row; j++) {
                    if(count>row){
                        count=1;
                        System.out.print(count++);
                    }else{
                        System.out.print(count++);
                    }

                }
                System.out.println();
            }
        }

    public static void oddEvenNumberPattern() {
        System.out.print("Enter number of rows : ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(2);
                }

            }
            System.out.println();
        }
    }

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

}
