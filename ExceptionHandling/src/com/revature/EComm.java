package com.revature;

import exception.InsuffcientFundsException;

import java.util.Scanner;

public class EComm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance in your account: ");
        int bal= sc.nextInt();
        System.out.println("Enter cost of item: ");
        int cost = sc.nextInt();
        try {
            bal = placeOrder(bal, cost);
            System.out.println("Updated balance after purchase: " + bal);
        }
        catch(InsuffcientFundsException insuffcientFundsException){
            System.out.println(insuffcientFundsException.getMessage());
        }
        System.out.println("Thank you!!");


    }
    public static int placeOrder(int balance, int cost)throws InsuffcientFundsException{
        int updateBal;
        if (balance<cost){
            InsuffcientFundsException insuffcientFundsException = new InsuffcientFundsException("Insuffceint FUnds");
            throw insuffcientFundsException;
        }
        updateBal= balance-cost;
        return updateBal;
    }
}
