package Inheritance.Ex2;

public class Shape {
    private double height;
    private double width;

    public void setArea(double height, double width){
        this.height=height;
        this.width=width;
    }
    public double getArea(){
        double area=this.height*this.width;
        return area;
    }
}
