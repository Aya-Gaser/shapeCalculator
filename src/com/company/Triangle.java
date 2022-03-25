package com.company;
import java.lang.Math;

public class Triangle implements PerimeterAndAreaCalculable{
    public double side1;
    public double side2;
    public double side3;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void calculateShapePerimeter() {
        double perimeter = this.side1 + this.side2 + this.side3;
        System.out.println("Triangle Perimeter is " + perimeter);
    }

    @Override
    public void calculateShapeArea() {
        double semiPerimeter = (this.side1 + this.side2 + this.side3)/2;
        double areaSquared = semiPerimeter*(semiPerimeter-this.side1)*(semiPerimeter-this.side2)*(semiPerimeter-this.side3);
        System.out.println("Triangle Area is " + Math.sqrt(areaSquared));
    }
}
