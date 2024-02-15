package Exceptions.Ex1;

public class Main {
    public static void main( String [] args){
        DivideNumbers divideObj= new DivideNumbers();
      try {
          double results=divideObj.divideNumber(96,0);
          System.out.println("Results:"+ results);
      }catch (ArithmeticException e){
          System.out.println(e.getMessage());
      }
    }
}
