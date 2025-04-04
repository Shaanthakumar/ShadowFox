package ShadowFox;

import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("CALCUALTOR APP\n");
        String s;
        int num;
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
        System.out.println("The correct inout is: "+num);

    }
    sc.close();
    }
}