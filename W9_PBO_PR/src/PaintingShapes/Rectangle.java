
package PaintingShapes;

public class Rectangle extends Shape{
    private double length;
    private double width;
    
    //constructor
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length=length;
        this.width=width;
    }
    
    //bentuk dari implementasi dynamic polymorphism
    //returns the surfaace area of the rectangle
    public double area() {
        return length*width;
    }
    
    //returns the rectangle as a string
    public String toString() {
        return super.toString() + " of length: "+length + " and width: "+width;
    }
    
    
}
