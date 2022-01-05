package calculator;

import calculator.beans.Calculator;

public class Main {
    public static void main(String[] args) {
       
            Calculator calc =  new Calculator();
            calc.setNum1(5);
            calc.setNum2(10);
    
            Calculator.brand = "Canon";
    
            Calculator cal2 = new Calculator();
            cal2.setNum1(6);
            cal2.setNum2(30);
    
    
            System.out.println("Sum given by calculator1 with "+calc.getNum1()+" and "+ calc.getNum2()+": " +calc.add() + " and the brand is " + Calculator.brand);
            System.out.println("Sum given by calculator2 with "+cal2.getNum1()+" and "+ cal2.getNum2()+": " +cal2.add() + " and the brand is " + Calculator.brand);
        }
    
    

    }
    

