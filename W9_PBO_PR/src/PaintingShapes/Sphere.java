
package PaintingShapes;

public class Sphere extends Shape {
    private double radius;  //radius in feet
    
    //constructor : sets up the sphere
    public Sphere(double r) {
        super("Sphere");
       this.radius = r;
    }
    
    //returns the surfaace area of the sphere
    public double area() {
        return 4*Math.PI*radius*radius;
    }
    
    //returns the sphere as a string
    public String toString() {
        return super.toString() + " of radius " + radius;
    }
    
}
