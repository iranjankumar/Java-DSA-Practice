import java.util.*;
public class for3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Entre the Number to Reverse: ");
        int n = sc.nextInt();
        while(n>0){
       // for(int n = num;n > 0;n++){

            int lastdigit = n%10;
            System.out.print(lastdigit);
            n = n/10;
        }
       // }
        System.out.println();
        sc.close();
    }
}
