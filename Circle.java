package RevatureUpskilling;

import java.util.Scanner;
import java.lang.Math.*;

public class Circle {
    public static void main(String[] args) {

        int radius;
        double perm, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        radius = sc.nextInt();
      
        perm = getPerimeter(radius);
        System.out.println("The perimeter of the circle is : "+ perm);
        area= getArea(radius);
        System.out.println("The area of the circle is: "+ area);
        
    }
    
    public static double getPerimeter(int x){
        return (double)(2*(Math.PI*x));

    }
    public static double getArea(int x){
        return (Math.PI*(x*x));
    }
    
}
