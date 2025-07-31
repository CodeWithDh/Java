import java.util.*;
import Experiments.example;

public class Experiment3 {
    public static void main(String []args){
        example obj1=new example();
        example obj2=new example(50);

        obj1.display();
        obj2.display("Hey it's me Shivam");
    }
}
