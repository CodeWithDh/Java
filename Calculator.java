import java.util.*;

public class Calculator {
    static ArrayList<Integer> numbers=new ArrayList<Integer>();
    static ArrayList<Character> operation=new ArrayList<Character>();
static int solve=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Calculate: ");
        String line = sc.nextLine();
        System.out.println("The line is: "+line);
        for(int i=0;i<line.length();i++){
            if(i%2==0||i==0){//even or 0
                numbers.add(Character.getNumericValue(line.charAt(i)));

            }else{
                operation.add(line.charAt(i));
            }
        }
solve=numbers.get(0);
        for(int i=0;i<operation.size();i++){
            char op=operation.get(i);
            switch (op){
                case '+':
                    solve+=numbers.get(i+1);
                    break;
                case '-':
                    solve-=numbers.get(i+1);
                    break;
                case '/':
                    solve/=numbers.get(i+1);
                    break;
                case '*':
                    solve*=numbers.get(i+1);
                    break;
                default:
                    System.out.println("Invalid operation "+op);

            }

        }
        System.out.println("Result is "+solve);

    }
}