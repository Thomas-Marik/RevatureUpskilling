package RevatureUpskilling;

import java.util.Scanner;

public class TempConversion {

    public static void main(String[] args) {
        
        double farh, cel,farhConverted, celConverted;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Farhenheit you want to convert to Celsius: ");
        farh = sc.nextInt();
        farhConverted = convertFarh(farh);
        System.out.println(farh + " converted to Celsius is : "+ farhConverted);
        System.out.println("Enter the temperature in Celsius you want to convert to Farhenheit: ");
        cel = sc.nextInt();
        celConverted = convertCel(cel);
        System.out.println(cel + " converted to Farhenheit is : "+ celConverted);
    }

   public static double convertCel(double x) {
        return ((9/5 * x) + 32);
    }

    public static double convertFarh(double x) {
        return ( (x - 32) * .5556);
    }
}
    

