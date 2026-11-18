import java.util.*;
public class largest{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Second Number : ");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println(  (num1)+ "  is Larger");
        }
        else if(num1==num2){
            System.out.println("Both Numbers are Equal");
        }
        else{
            System.out.println((num2)+"  is Larger");
        }
        sc.close();
    }
}