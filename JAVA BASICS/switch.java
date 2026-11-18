import java.util.*;
public class switch{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter Operator: ");
        char operator = sc.next().charAt(0);
        switch(operator) {
            case '+':System.out.println("Result = "+(num1+num2));
            break;
            case '-':System.out.println("Result = "+(num1-num2));
            break;
            case '*':System.out.println("Result = "+(num1*num2));
            break;
            case '/':System.out.println("Result = "+(num1/num2));
            break;
            case '%':System.out.println("Result = "+(num1%num2));
            default:System.out.println("Invalid");
        }
        sc.close();


    }
}