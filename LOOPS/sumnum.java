import java.util.*;
public class sumnum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Value of n:  ");
        int n = sc. nextInt();
        int sum = 0;
        int counter = 5;
        while(counter<= n){
            System.out.println(counter);
            sum = sum + counter;
            //sum += counter; 
            counter ++;
        }
        System.out.print("Sum of Total Counter : "+sum);
        sc.close();
    }
}
