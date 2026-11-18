import java.util.*;
public class for4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Entre the Number to Reverse: ");
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
       // for(int n = num;n > 0;n++){

            int lastdigit = n%10;
            rev = (rev*10) + lastdigit;
            n = n/10;

        }
       // }
        System.out.println(rev);
        sc.close();
    }
}

