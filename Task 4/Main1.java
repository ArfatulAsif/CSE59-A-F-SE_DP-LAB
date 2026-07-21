interface Shape{
    double calculateArea();
}

class Rectangel implements Shape {
    public double length ;
    public double width ;
    
    @Override 
    public double calculateArea (){
        return length * width ;
    }
}

class Circle implements Shape {
    public double radius;
    
    @Override 
    public double calculateArea (){
        return Math.PI * (radius * radius );
    }
}

public class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes ){
        double area = 0;
        for ( Shape shape : shapes ){
            area += shape . calculateArea ();
        }
        return area ; 
    }
    
    public static void main ( String [] args ){
        AreaCalculator calculator = new AreaCalculator ();
        
        Rectangel rect = new Rectangel();
        
        rect . length = 5 ;
        rect . width = 4 ;
        
        Circle circle = new Circle  ();
        circle . radius = 3 ; 
        

        Shape[] shapes = { rect,circle } ;
        double totalArea = calculator. calculateTotalArea ( shapes );
        System.out.println( "Total Area :" + totalArea);
    }
}
