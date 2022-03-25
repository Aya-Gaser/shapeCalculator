package com.company;

public class Rectangle implements PerimeterAndAreaCalculable{

    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateShapePerimeter() {
        double perimeter = (this.length + this.width)*2;
        System.out.println("Rectangle Perimeter is " + perimeter);

    }

    @Override
    public void calculateShapeArea() {
        double area = this.length*this.width;
        System.out.println("Rectangle Area is " + area);
    }
}
