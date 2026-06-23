import  java.util.Scanner;

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    double length,width;
    
    public Rectangle(double length,double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    double radius;
    
    public Cirlce(double radius) {
        this.radius = radius;
    }
    
    
    @Override
    public double calculateArea() {
        return Math.PI * radius *radius;
    }
}

class Truangle implements Shape {
    double base,height;
    
    public Triangle(double base,double height) {
        this.base = base;
        this.height = height;
        
    }
    
    @Override 
    public calculateArea() {
        reuturn 0.5* base * height;
    }
}
