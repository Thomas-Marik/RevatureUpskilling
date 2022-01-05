import java.util.Scanner;

public class SwitchDemo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        String str = sc.next();
        char ch = str.charAt(0);
        
        switch (ch){
             case 'r':
                System.out.println("RED");
                break;
        
            case 'g':
                System.out.println("Green");
                break;
            default:
                System.out.println("Invalid");
            
            }
    }
}
