import java.util.*;
public class grade{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Grade : ");
        int grade = sc.nextInt();

        if(grade>=90 && grade <=100){
            System.out.println( "Grade = A");
        }
        else if(grade>=80 && grade <=89){
            System.out.println("Grade = B");
            
        }
        else if(grade>=70 && grade <=79){
            System.out.println("Grade = C");
        }
        else if(grade>=60 && grade <=69){
            System.out.println("Grade = D");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}