package com.company;
import java.util.*;
// main branch
public class Main {
    public static void main(String[] args) {

        String option = "-1";
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Welcome To Shape Calculator");
            System.out.println("Select Shape \n 1.Square \n 2.Rectangle \n 3.Circle \n 4.Triangle \n 0.Exit");
            option = sc.nextLine();
            switch (option) {
                case "1":
                    System.out.println("Enter Square Side Length");
                    double squareLength = validateInputDouble();
                    int squareInvalidTimes = 0;
                    while(squareLength == 0){
                        if (squareInvalidTimes == 2){
                            System.out.println("Too many invalid Input.");
                            System.exit(0);
                        }
                        squareInvalidTimes++;
                        squareLength = validateInputDouble();
                    }

                    calculatePerimeterAndAreaForSquare(squareLength);
                    break;

                case "2":

                    double[] rectangleSides = new double[2];
                    double rectangleLength ;
                    int rectangleInvalidTimes ;
                    for (int i=0;i<2;i++){
                        rectangleInvalidTimes = 0;
                        System.out.println("Enter Rectangle Side"+(i+1)+" Length");
                        rectangleLength = validateInputDouble();
                        while(rectangleLength == 0) {
                            if (rectangleInvalidTimes == 2) {
                                System.out.println("Too many invalid Input.");
                                System.exit(0);
                            }
                            rectangleInvalidTimes++;
                            rectangleLength = validateInputDouble();
                        }
                        rectangleSides[i] = rectangleLength;

                        }


                    calculatePerimeterAndAreaForRectangle(rectangleSides[0], rectangleSides[1]);

                    break;

                case "3":
                    System.out.println("Enter Circle Radius");
                    double radius = validateInputDouble();
                    int circleInvalidTimes = 0;
                    while(radius == 0) {
                        if (circleInvalidTimes == 2) {
                            System.out.println("Too many invalid Input.");
                            System.exit(0);
                        }
                        circleInvalidTimes++;
                        radius = validateInputDouble();
                    }
                    calculatePerimeterAndAreaForCircle(radius);
                    break;

                case "4":

                    double[] triangleSides = new double[3];
                    double triangleLength ;
                    int triangleInvalidTimes ;

                    for (int i=0;i<3;i++){
                        triangleInvalidTimes = 0;
                        System.out.println("Enter Triangle Side"+(i+1)+" Length");
                        triangleLength = validateInputDouble();
                        while(triangleLength == 0) {
                            if (triangleInvalidTimes == 2) {
                                System.out.println("Too many invalid Input.");
                                System.exit(0);
                            }
                            triangleInvalidTimes++;
                            triangleLength = validateInputDouble();
                        }
                        triangleSides[i] = triangleLength;


                    }
                    calculatePerimeterAndAreaForTriangle(triangleSides[0], triangleSides[1], triangleSides[2]);
                    break;

                case "0":
                    System.out.println("Bye Bye");
                    break;
                default:
                    System.out.println("Invalid Option. Please Select Valid option");
                    break;


            }
        } while (!option.equals("0"));


    }

    public static void calculatePerimeterAndAreaForSquare(double length){
        Square mySquare = new Square(length);
        mySquare.calculateShapePerimeter();
        mySquare.calculateShapeArea();
    }
    public static void calculatePerimeterAndAreaForRectangle(double length, double width){
        Rectangle myRectangle = new Rectangle(length,width);
        myRectangle.calculateShapePerimeter();
        myRectangle.calculateShapeArea();
    }
    public static void calculatePerimeterAndAreaForCircle(double radius){
        Circle myCircle = new Circle(radius);
        myCircle.calculateShapePerimeter();
        myCircle.calculateShapeArea();
    }
    public static void calculatePerimeterAndAreaForTriangle(double side1, double side2,double side3){
        Triangle myTriangle = new Triangle(side1, side2 ,side3);
        myTriangle.calculateShapePerimeter();
        myTriangle.calculateShapeArea();
    }

    public static double validateInputDouble(){
        double input = 0;
        Scanner sc2 = new Scanner(System.in);
        try{
            input = sc2.nextDouble();
        }catch(InputMismatchException exception ){
                System.out.println("Invalid Input. Please Enter Valid Input");

        }

        return input;

    }

}
