import java.util.*;
public class divisbile{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        if(num%5==0 && num%11==0){
            System.out.println("Divisble by both 5 and 11");
        }
        else{
            System.out.println("Not divisible by both");
        }
        sc.close();
    }
}