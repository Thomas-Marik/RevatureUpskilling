package RevatureUpskilling;

import java.util.Scanner;

public class MeasureConversion {

    public static void main(String[] args) {
        
        int in,cm;
        double inConvert, cmConvert;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many inches you want to convert to centimeters: ");
        in = sc.nextInt();
        inConvert = convertInches(in);
        System.out.println(in + " inches converts to "+inConvert+" centimeters");
      
        System.out.println("Enter how many centimeters you want to convert to inches: ");
        cm = sc.nextInt();
        cmConvert = convertCentimeters(cm);
        System.out.println(cm + " centimeters converts to "+cmConvert+" inches");


    }

    public static double convertCentimeters(int x) {
        return (x*0.39);
    }
    public static double convertInches(int x) {
      
        return (x*2.54);
    
    }
    
}
