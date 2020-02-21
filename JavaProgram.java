import java.util.Scanner;
public class JavaProgram
{
    public static void main(String args[])
    {
      float a, b, res;
        char choice  ;
		Scanner scan = new Scanner(System.in);
		
        do
        {
            System.out.print(" + -----> Addition\n");
            System.out.print(" - -----> Subtraction\n");
            System.out.print(" * -----> Multiplication\n");
            System.out.print(" / -----> Division\n");
            System.out.print(" % -----> remainder\n");
            System.out.print (" x -----> exit\n");
            System.out.print("Enter Your Choice : ");
            choice = scan.next().charAt(0);
            if (choice=='+')
            {
            	System.out.print("Enter the first Number : ");
            	 a = scan.nextFloat();
                 System.out.print(" Enter the second number:");
                 b = scan.nextFloat();
                 res = a + b;
                 System.out.print("Result = " + res);
                
            }
            else if (choice=='-')
            {
            	System.out.print("Enter the first Number : ");
            	 a = scan.nextFloat();
                 System.out.print(" Enter the second number:");
                 b = scan.nextFloat();
                 res = a - b;
                 System.out.print("Result = " + res);
                
            }
            else if(choice=='*')
            {
            	System.out.print("Enter the first Number : ");
            a = scan.nextFloat();
            System.out.print(" Enter the second number:");
            b = scan.nextFloat();
            res = a * b;
            System.out.print("Result = " + res);
            
            }
            else if(choice=='/')
            {
            	System.out.print("Enter the first Number : ");
            	 a = scan.nextFloat();
            	 System.out.print(" Enter the second number :");
                 b = scan.nextFloat();
                 res = a / b;
                 System.out.print("Result = " + res);
                 
            }
            else if(choice=='%')
            {
            	System.out.print("Enter the first Number : ");
            	 a = scan.nextFloat();
                 System.out.print(" Enter the second number :");
                 b = scan.nextFloat();
                 res = a % b;
                 System.out.print("Result = " + res);
            }
            else if(choice=='x')
            {
            	System.exit(0);
                
            }
            else
            {
            	 System.out.print("invalid operation");
            }
            
            System.out.print("\n enter any letter to start again!\n");
            scan.next().charAt(0);
            System.out.print("\n---------------------------------------\n");
        }while(choice != 'x');       
    }
}