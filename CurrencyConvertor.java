import java.util.*;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select your currency: \n" +
                "1. Indian(Ruppee)\n" +
                "2. USA(Dollors)\n" +
                "3. Canada(Dollors)\n" +
                "4. Spain(Euro)\n"
                );
        int convertFrom=sc.nextInt();
//        System.out.print("Enter the amount: ");
        double amount=0;

       switch(convertFrom) {
           case 1:
               System.out.print("Enter the amount in Ruppee: ");
               amount=sc.nextDouble();
               System.out.println("Converted Amount: \n" +
                       "1. USA(Dollors): "+amount*0.012+"\n" +
                       "2. Canada(Dollors): "+amount*0.016+"\n" +
                       "3. Spain(Yuro): "+amount*0.011+"\n"
               );
               break;
               

           case 2:
               System.out.print("Enter the amount in USA Dollars: ");
               amount=sc.nextDouble();
               double convertedAmount = amount * 1.18;
               System.out.println("Converted amount: "+convertedAmount+" Indian Rupees");
               break;
           case 3:
               System.out.print("Enter the amount in Canada Dollars: ");
               amount=sc.nextDouble();
               convertedAmount=amount*0.78;
               System.out.println("Converted amount: "+convertedAmount+" Indian Rupees");
               break;
           case 4:
               System.out.print("Enter the amount in Euro: ");
               amount=sc.nextDouble();
               convertedAmount=amount*92;
               System.out.println("Converted amount: "+convertedAmount+" Indian Rupees");
               break;

       }

    }
}
