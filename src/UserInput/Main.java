package UserInput;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner myScanObj= new Scanner(System.in);
        System.out.println("Enter Your Input");

        String userName = myScanObj.nextLine();
        int age = myScanObj.nextInt();
        double salary = myScanObj.nextDouble();


        System.out.println("Name: " + userName);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);


    }
}
