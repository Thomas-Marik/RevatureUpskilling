package RevatureUpskilling;
import java.util.Scanner;
public class ForExercise {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count to:");
        num = sc.nextInt();

        for (int x=0;x<num;x++){
            if (x%2==0){
                System.out.println(x+" is an even number");
            }else{
                System.out.println(x+" is an odd number");
            }

        }
    }
    
}
