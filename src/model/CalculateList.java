
package model;

import Valation.Valation;


public class CalculateList {
    public Valation v = new Valation();
     public Triangle inputTriangle() {
        while (true) {
            System.out.print("Please input side A of Triangle: ");
            double a = v.checkInputDouble();
            System.out.print("Please input side B of Triangle: ");
            double b = v.checkInputDouble();
            System.out.print("Please input side C of Triangle: ");
            double c = v.checkInputDouble();
            if (a + b > c && b + c > a && a + c > b) {
                return new Triangle(a, b, c);
            } else {
                System.out.println("Re-input");
            }
        }

    }

    public Rectangle inputRectangle() {
        System.out.print("Please input side width of Rectangle: ");
        double width = v.checkInputDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = v.checkInputDouble();
        return new Rectangle(width, length);
    }

    public Circle inputCircle() {
        System.out.print("Please input radius of Circle: ");
        double radius = v.checkInputDouble();
        return new Circle(radius);
    }

    public void display(Triangle triangle, Rectangle rectangle, Circle circle) {
        System.out.println("------Rectangle------");
        rectangle.printResult();
        System.out.println("------Circle-------");
        circle.printResult();
        System.out.println("-------Triangle------");
        triangle.printResult();
    }
}
