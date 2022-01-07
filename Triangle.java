

import java.util.Scanner;

public class Triangle{
 
  
    public static void main(String[] args) {
        
        int first;
        int second;
        int third;
        int perm;
        int height,base;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter length of first side:");
        first = sc.nextInt();
        System.out.println("Please Enter length of second side:");
        second = sc.nextInt();
        System.out.println("Please Enter length of third side:");
        third = sc.nextInt();
        perm = getPerimeter(first,second,third);
        System.out.println("The Perimeter of your triangle is :" + perm);
        System.out.println("");
        System.out.println("Enter height from base of yout triangle:");
        height = sc.nextInt();
        System.out.println("Enter the length of the base of the triangle:");
        base= sc.nextInt();
        area= getArea(base, height);
        System.out.println("The area of your triagnle is : "+area);


        

    }

    public static int getPerimeter(int x, int y, int z){
        return (x+y+z);

    }
    public static double getArea(int b, int hB){
        return ((hB*b)/2);
    }
}