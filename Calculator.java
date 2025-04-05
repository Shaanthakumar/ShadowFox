package ShadowFox;
import java.util.Scanner;
public class Calculator {
    //arithmetic operations
    static double arith(double n1,double n2,char ch)
    {
        double ans;
        switch(ch)
        {
            case '+':
            return n1+n2;
            case '-':
            return n1-n2;
            case '*':
            return n1*n2;
            case '/':
            //try{
                ans=n1/n2;
           // }
            /*catch(ArithmeticException e)
            {
                System.out.println("Error in dividing a number by Zero");
                break;
            }*/
            return ans;
            case '%':
            return n1%n2;

        }
        return 0;
    }

    //scientific operations
    static double science()
    {

    }

    //unit conversion
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("CALCUALTOR APP\n");
        String s,f,sec;
        int num;
        double res,fn=0,sn=0;
        char op;
        while(true)
        {
        System.out.print("PRESS:\n1.ARITHMETIC OPERATION\n2.SCIENTIFIC OPERATION\n3.UNIT CONVERSION\n4.EXIT\nOPTION: ");
        s=sc.nextLine();
        try{
        if(!s.matches("\\d+")){
        throw new NumberFormatException();
        }
        num=Integer.parseInt(s);
        }
        catch(NumberFormatException e){
            System.out.println("Wrong input\n\n");
            break;
        }
        switch(num)
        {
            //Arithmetic operation
            case 1:
            System.out.println("\nARITHMETIC OPERATIONS");
            System.out.print("Enter first number: ");
            f=sc.nextLine();
            System.out.print("Enter second number: ");
            sec=sc.nextLine();
            if(f.matches("-?\\d+") && sec.matches("-?\\d+"))
            {
                fn=Double.parseDouble(f);
                sn=Double.parseDouble(sec);
            }
            else{
            System.out.println("\n\nWrong inputs, Enter only NUMBERS next time!!!\n\n");
            break;
            }
            System.out.print("\nPRESS:\n'+' for ADDITION\n'-' FOR  SUBTRACTION\n'*' FOR MULTIPLICATION\n'/' FOR QUOTIENT\n'%' FOR REMAINDER\nOPTION: ");
            op=sc.next().charAt(0);
            sc.nextLine();
            if(op=='+' ||op=='-'||op=='*'||op=='/'||op=='%')
            {
            res=arith(fn,sn,op);
            System.out.println("\nOutput: "+fn+" "+op+" "+sn+" = "+res);
            }
            else
            System.out.println("\n\nEnter valid operator\n\n");
            break;
            
            //Scientific operation
            case 2:
            System.out.println("\nSCIENTIFIC OPERATIONS\n\n");
            System.out.print("PRESS:\n1.POWERS\n2.ROOTS\n3.TANGENT\n4.LOGARITHM\n5.EXPONENTIAL\nOPTION: ");
            break;
            case 3:
            break;
            case 4:
            System.exit(0);
            break;
            default:
            System.out.println("\n\nEnter a valid choice\n\n");
        }

    }
    sc.close();
    }
}