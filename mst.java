import java.util.*;

class sum{
    public sum(int a,int b){
        System.out.println("I am first class.\nResult = "+(a+b));
    }public sum(int a,int b,int c){
        System.out.println("I am first class.\nResult = "+(a+b+c));
    }public sum(int a,int b,int c,int d){
        System.out.println("I am first class.\nResult = "+(a+b+c+d));
    }
}


public class mst {
    public int method(int a,int b){
        return a+b;
    }
    public int method(int a,int b,int c){
        return a+b+c;
    }
    public int method(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public int method(int a,int b,int c,int d,int e){
        return a+b+c+d+e;
    }

        public static void main(String[] args) {
        //        method overloading
        mst obj = new mst();
        System.out.println("Method got with 2 args:"+obj.method(10,20));
        System.out.println("Method got with 3 args:"+obj.method(10,20,30));
        System.out.println("Method got with 4 args:"+obj.method(10,20,30,40));
        System.out.println("Method got with 5 args:"+obj.method(10,20,30,40,50));

//        constructor overloading
            System.out.println("Constructor overloading:-");
            sum obj1 = new sum(10,20);
            sum obj2 = new sum(10,20,30);
            sum obj3 = new sum(10,20,30,40);


        }
    }


