package com.company;

public class Square implements PerimeterAndAreaCalculable{

    public double length;

    public  Square(double length){

        this.length = length;
    }

    @Override
    public void calculateShapePerimeter(){
        double perimeter = this.length * 4;
        System.out.println("Square Perimeter is "+ perimeter);
    }

    @Override
    public void calculateShapeArea(){
        double area = this.length * this.length;
        System.out.println("Square Area is "+ area);
    }
}
