package RevatureUpskilling;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class IfExercise {
    public static void main(String[] args) {
        int first,second,third;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        first = sc.nextInt();
        System.out.println("Enter Second number: ");
        second = sc.nextInt();
        System.out.println("Enter Third number: ");
        third = sc.nextInt();

        if (first > second && first > third){
            System.out.println(first+ " is the bigger number");
        }
        if (second > third && second >first){
            System.out.println(second + " is the bigger number");

        }
        if (third > first && third > second){
            System.out.println(third +" is the bigger number");
        }else{
            System.out.println("There is no biggest number");
        }
    }
    
}
