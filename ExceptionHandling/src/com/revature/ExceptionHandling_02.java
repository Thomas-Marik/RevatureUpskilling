package com.revature;

import java.util.Scanner;

public class ExceptionHandling_02 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int a = sc.nextInt();
        System.out.println("Enter a second number: ");
        int b = sc.nextInt();
        int c = calc(a,b);
        System.out.println("Result :"+c);
    }
    public static int calc(int a, int b){
        int res;
        try{
            res= a/b;
        System.out.println("End of calcualtion");
        return res;
    }catch(ArithmeticException ae){
            ae.printStackTrace();

        }
        return 0;
}

}
