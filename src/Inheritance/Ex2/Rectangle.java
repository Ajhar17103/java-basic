package Inheritance.Ex2;

public class Rectangle extends Shape {
    @Override
    public void setArea(double height, double width) {
        super.setArea(height, width);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}
