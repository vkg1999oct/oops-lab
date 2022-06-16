
import arithmetic.Sum;
import arithmetic.Div;
import arithmetic.Mul;
import arithmetic.Sub;
import java.util.*;
public class arithmetic_operation {
    public static void main(String []args)
    {
         Scanner sc = new Scanner(System.in);
        
        
      
         int n;
        while (true) {
             System.out.println("1:ADDITION");
              System.out.println("2:DIVITION");
            System.out.println("3:SUBSTRACTION");
            System.out.println("4:MULTIPLICATION");
            System.out.println("5:EXIT");
            System.out.println("Enter Your choice ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                Sum sm = new Sum();
                    sm.operation();
                    break;
                case 2:
                Div d = new Div();
                    d.operation();
                    break;
                case 3:
                 
        Sub sb = new Sub();
                    sb.operation();
                    break;
                case 4:
               Mul m = new Mul();
                    m.operation();
                    break;
                case 5:
                    System.out.println("Exiting the Program");
                    System.exit(0);
                default:
                    System.out.println("invalid! choice");

            }
        }

    }




    }
