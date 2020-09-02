package com.avijitsamanta.Collage;

class Figure {
    public void area() {
    }

    public void perimeter() {
    }
}

class Circle extends Figure {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void area() {
        super.area();
        System.out.println("Area of Circle is " + (Math.PI * Math.pow(r, 2)));
    }

    @Override
    public void perimeter() {
        super.perimeter();
        System.out.println("Perimeter of Circle is " + (Math.PI * r * 2));
    }
}

class Square extends Figure {
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public void area() {
        super.area();
        System.out.println("Area of Square " + Math.pow(a, 2));
    }

    @Override
    public void perimeter() {
        super.perimeter();
        System.out.println("Perimeter of Square " + (4 * a));
    }
}

class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        super.area();
        System.out.println("Area of Rectangle " + (width * length));
    }

    @Override
    public void perimeter() {
        super.perimeter();
        System.out.println("Perimeter of Rectangle " + (2 * (length + width)));
    }
}

class Triangle extends Figure {
    private final double a;
    private final double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void area() {
        super.area();
        System.out.println("Area of Triangle " + ((a * b) / 2));
    }

    @Override
    public void perimeter() {
        super.perimeter();
        System.out.println("Perimeter of Triangle " + (a + b + a));
    }
}

public class FigureMain {

    public static void main(String[] args) {
        Circle circle = new Circle(25);
        circle.area();
        circle.perimeter();

        Square square = new Square(25);
        square.area();
        square.perimeter();

        Rectangle rectangle = new Rectangle(50, 100);
        rectangle.area();
        rectangle.perimeter();

        Triangle triangle = new Triangle(100, 150);
        triangle.area();
        triangle.perimeter();
    }
}


