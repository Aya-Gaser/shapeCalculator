package com.company;

public class Circle implements PerimeterAndAreaCalculable{

    public double radius;
    public final double pi = 3.14159265359;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void calculateShapePerimeter() {
        double perimeter = 2*pi*this.radius;
        System.out.println("Circle Perimeter is "+ perimeter);
    }

    @Override
    public void calculateShapeArea() {
        double area = pi*this.radius*this.radius;
        System.out.println("Circle Area is "+ area);
    }


}
