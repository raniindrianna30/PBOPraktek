
package PaintingShapes;

public class Cylinder extends Shape{ 
    private double radius;
    private double height;
    
    //constructor : sets up the cylinder
    public Cylinder(double r, double h) {
        super("Cylinder");
        this.radius=r;
        this.height=h;
    }
    
    //returns the surface area of cylinder
    public double area() {
        return Math.PI*radius*radius*height;
    }
    
    //returns the cylinder as a string
    public String toString() {
        return super.toString() +" of radius : " + radius + " and height: " + height;
    }
    
}
