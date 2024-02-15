package Polymorphism.ex1;

public class Main {
    public static void main(String [] args){
        Car carObj = new Car();
        Bike bikeObj = new Bike();
        Bus busObj = new Bus();

        carObj.drive();
        bikeObj.drive();
        busObj.drive();
    }
}
