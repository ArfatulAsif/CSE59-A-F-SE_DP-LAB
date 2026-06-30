interface Shape
{
    double calculateArea();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return length * width;
    }
}

class Circle implements Shape{
    private double radious;
    public Circle(double radious){
        this.radious = radious;
    }

    @Override
    public double calculateArea() {
        
        return  Math.PI * (radious * radious);
    }
}

class AreaCalculator {

    public double calculateTotalArea(Shape[] shapes){
        double totalArea = 0;
        for(Shape shape : shapes){
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}
class Triangle implements Shape{
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base =- base;
        this.height = height;
    }

    public double calculateArea(){
        return 0.5 * base * height;
    }
} 

public class Main{
public static void main(String[] args){
    Shape[] shapes = new Shape[]{
        new Rectangle(5, 4),
        new Circle(3),
        new Triangle(6, 4)
    };

    AreaCalculator calculator = new AreaCalculator();
    double totalArea = calculator.calculateTotalArea(shapes);

    System.out.println("Total Area: " + totalArea);
}
}
