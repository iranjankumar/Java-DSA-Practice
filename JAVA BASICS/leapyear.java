import java.util.*;
public class leapyear{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Year : ");
        int num = sc.nextInt();

        if(num%400 == 0 ){
            System.out.println("Leap Year");
        }
        else if (num%100 == 0){
            System.out.println("Not Leap Year");
        }
        else if (num%4 == 0){
            System.out.println(" Leap Year");
        }
        else{
            System.out.println("Not Leap Year");

        }
        sc.close();
    }
}