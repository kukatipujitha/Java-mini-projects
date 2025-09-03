// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class ShapeAreaCalculator{
    public static void printArea(Shape name){
        System.out.printf("Area of the %s is: %.2f%n",name.toString(),name.area());
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        boolean useagain=true;
        while(useagain){
        System.out.println("what shape do you want to find area");
        String response=scan.next().toLowerCase();
        if(response.equals("circle")){
        System.out.println("enter the radius");
        double r=scan.nextDouble();
            Shape C=new Circle(r);
            printArea(C);
        }
        else if(response.equals("rectangle")){
        System.out.println("enter the length");
        double l=scan.nextDouble();
        System.out.println("enter the breadth");
        double b=scan.nextDouble();
             Shape R=new Rectangle(l,b);
             printArea(R);
        }
        else if(response.equals("triangle")){
            
        System.out.println("enter the base");
        double base=scan.nextDouble();
        System.out.println("enter the height");
        double h=scan.nextDouble();
            Shape T=new Triangle(base,h);
            printArea(T);  
        }
        else{
            System.out.println("enter valid shape");
        }
        System.out.println("wanna find again if yes ----type 'yes'");
        String opinion =scan.next().toLowerCase();
        if(opinion.equals("yes")){
            useagain=true;
        }
        else{
            useagain=false;
            System.out.println("thanks for using");
        }
}
}
}

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
    @Override
    public String toString() {
        return "Circle";
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
    @Override
    public String toString() {
        return "Rectangle";
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
    @Override
    public String toString() {
        return "Triangle";
    }
    
}
----compiler output----
what shape do you want to find area
circle
enter the radius
5
Area of the Circle is: 78.54
wanna find again if yes ----type 'yes'
yes
what shape do you want to find area
rectangle
enter the length
5
enter the breadth
3
Area of the Rectangle is: 15.00
wanna find again if yes ----type 'yes'
no
thanks for using
====================================
    
