package ShadowFox;
import java.util.Scanner;

public class Calculator {

    // Arithmetic operations
    static double arith(double n1, double n2, char ch) {
        double ans;
        switch (ch) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1 * n2;
            case '/':
                ans = n1 / n2;
                return ans;
            case '%':
                return n1 % n2;
        }
        return 0;
    }

    // Scientific operations
    static void science(double fn, double sn, double choice) {
        double res;
        switch ((int) choice) {
            case 1:
                res = Math.pow(fn, sn);
                break;
            case 2:
                res = Math.sqrt(fn);
                break;
            case 3:
                res = Math.log(fn) / Math.log(sn);
                break;
            case 4:
                res = Math.exp(fn);
                break;
            default:
                System.out.println("\n\nEnter a valid choice\n\n");
                return;
        }
        System.out.println("\nOutput: " + res+"\n\n");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULATOR APP\n");

        String s, f, sec;
        int num;
        double res, fn = 0, sn = 0;
        char op;

        while (true) {
            System.out.print("MAIN MENU\nPRESS:\n1.ARITHMETIC OPERATION\n2.SCIENTIFIC OPERATION\n3.UNIT CONVERSION\n4.EXIT\nOPTION: ");
            s = sc.nextLine();

            try {
                if (!s.matches("\\d+")) {
                    throw new NumberFormatException();
                }
                num = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Wrong input\n\n");
                break;
            }

            switch (num) {
                // Arithmetic operation
                case 1:
                    System.out.println("\nARITHMETIC OPERATIONS");
                    System.out.print("Enter first number: ");
                    f = sc.nextLine();
                    System.out.print("Enter second number: ");
                    sec = sc.nextLine();
                    if (f.matches("-?\\d+(\\.\\d+)?") && sec.matches("-?\\d+(\\.\\d+)?")) {
                        fn = Double.parseDouble(f);
                        sn = Double.parseDouble(sec);
                    } else {
                        System.out.println("\n\nWrong inputs, Enter only NUMBERS next time!!!\n\n");
                        break;
                    }
                    System.out.print("\nPRESS:\n'+' for ADDITION\n'-' FOR SUBTRACTION\n'*' FOR MULTIPLICATION\n'/' FOR QUOTIENT\n'%' FOR REMAINDER\nOPTION: ");
                    op = sc.next().charAt(0);
                    sc.nextLine();
                    if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                        res = arith(fn, sn, op);
                        System.out.println("\nOutput: " + fn + " " + op + " " + sn + " = " + res);
                    } else {
                        System.out.println("\n\nEnter valid operator\n\n");
                    }
                    break;

                // Scientific operation
                case 2:
                    System.out.println("\nSCIENTIFIC OPERATIONS\n");
                    System.out.print("PRESS:\n1.POWERS\n2.ROOTS\n3.LOGARITHM\n4.EXPONENTIAL\nOPTION: ");
                    s = sc.nextLine();
                    try {
                        if (!s.matches("\\d+")) {
                            throw new NumberFormatException();
                        }
                        num = Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong input\n\n");
                        break;
                    }
                    System.out.print("Enter first number: ");
                    f = sc.nextLine();
                    System.out.print("Enter power (or) root (or) base (or) exponential value: ");
                    sec = sc.nextLine();
                    if (f.matches("-?\\d+(\\.\\d+)?") && sec.matches("-?\\d+(\\.\\d+)?")) {
                        fn = Double.parseDouble(f);
                        sn = Double.parseDouble(sec);
                        science(fn, sn, num);
                    } else {
                        System.out.println("\n\nWrong inputs, Enter only NUMBERS next time!!!\n\n");
                    }
                    break;

                // Unit conversion (not implemented)
                case 3:
                    System.out.println("\nUnit Conversion coming soon!\n");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("\n\nEnter a valid choice\n\n");
            }
        }
    }
}
