package ShadowFox;

import java.util.Scanner;
public class Calculator {
    int arith()
    {
       

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("CALCUALTOR APP\n");
        String s,f,sec;
        int num,fn,sn;
        while(true)
        {
        System.out.print("PRESS:\n1.ARITHMETIC OPERATION\n2.SCIENTIFIC OPERATION\n3.UNIT CONVERSION\nOPTION: ");
        s=sc.nextLine();
        try{
        if(!s.matches("\\d+")){
        throw new NumberFormatException();
        }
        num=Integer.parseInt(s);
        }
        catch(NumberFormatException e){
            System.out.println("Wrong input");
            break;
        }
        switch(num)
        {
            case 1:
            System.out.print("Enter first number: ");
            f=sc.nextLine();
            System.out.print("\nEnter first number: ");
            sec=sc.nextLine();
            if(f.matches("\\d+") && sec.matches("\\d+"))
            {
                fn=Integer.parseInt(f);
                sn=Integer.parseInt(sec);
            }
            else
            res=arith();
            break;
            case 2:
            break;
            case 3:
            break;
            case 4:
            break;

        }

    }
    sc.close();
    }
}