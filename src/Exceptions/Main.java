package Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your dividend");
        int dividOne = scanner.nextInt();

        System.out.println("Enter Your divisor");
        int dividTwo= scanner.nextInt();

        try {
            float result= dividOne/dividTwo;
            System.out.println("Result: "+result);
        }catch (Exception e){
            //System.out.println("Throw an error");
            e.printStackTrace();
        }
    }
}
