// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
abstract  class Shape{
    abstract double  area();
}
class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    @Override
    public double area(){
        return length*width;
    }
    
}
class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    @Override
    public double area(){
        return 0.5*base*height;
    }
    
}
lass ShapeAreaCalculator{
    public static void printArea(Shape news){
        System.out.printf("area of the shape is: %.2f%n",news.area());
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the radius");
        double r=scan.nextDouble();
        System.out.println("enter the length");
        double l=scan.nextDouble();
        System.out.println("enter the breadth");
        double b=scan.nextDouble();
        System.out.println("enter the base");
        double base=scan.nextDouble();
        System.out.println("enter the height");
        double h=scan.nextDouble();
        Shape C=new Circle(r);
        Shape R=new Rectangle(l,b);
        Shape T=new Triangle(base,h);
        printArea(C);
        printArea(R);
        printArea(T);       
}
}

----compiler output----
enter the radius
6
enter the length
4
enter the breadth
2
enter the base
5
enter the height
6
area of the shape is: 113.10
area of the shape is: 8.00
area of the shape is: 15.00
============================================
    
    
