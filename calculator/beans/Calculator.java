package calculator.beans;

public class Calculator {

    int num1;
    int num2;
    public static String brand;


    public void setNum1(int num1){
        if(num1 < 5){
            this.num1 =5;
            return;
        }
        if(num1 > 20){
            this.num1 = 20;
            return;
        }
        this.num1 = num1;
    }
    public void setNum2(int num2){
        if(num2 < 5){
            this.num2 =5;
            return;
        }
        if(num2 > 20){
            this.num2 = 20;
            return;
        }
        this.num2 = num2;
    }
    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }

    public int add(){
        return (num1 + num2);
    }
    public int subtract(){
        return (num1-num2);
    }
    public int multiply(){
        return (num1*num2);
    }
    public double divide(){
        return ((double)num1/num2);
    }
}
