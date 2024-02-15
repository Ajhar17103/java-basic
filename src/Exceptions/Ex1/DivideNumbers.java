package Exceptions.Ex1;

public class DivideNumbers {
    public static double divideNumber(double divideEnd, double divisor){
        if(divisor==0){
            throw new ArithmeticException("Cannot divide the given number by zero!");
        }else{
            return  divideEnd/divisor;
        }

    }
}
