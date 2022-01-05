package RevatureUpskilling;

import java.util.Scanner;

public class Rectangle {

    
    public static void main(String[] args) {

    int width;
    int length;
    double perm;
    double area;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of teh rectangle: ");
        length= sc.nextInt();
        System.out.println("Enter teh width of teh rectangle");
        width = sc.nextInt();
        perm = getPerimeter(length, width);
        System.out.println("The perimeter of the rectangle is: "+ perm);
        area = getArea(length, width);
        System.out.println("The area of teh rectangle is : "+area);
        
    }
    
    public static double getPerimeter(int x, int y){
        return ((2*x)+(2*y));

    }
    public static double getArea(int x, int y){
        return (x*y);
    }
    
}
