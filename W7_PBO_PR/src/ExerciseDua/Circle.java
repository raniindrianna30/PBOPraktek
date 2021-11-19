package ExerciseDua;

public class Circle extends Shape {
    private double radius;
    
    public Circle() {
        super();
        radius = 1.0;
    }
    
    public Circle(double r) {
        super();
        this.radius=r;
    }
    
    public Circle(double r, String c, boolean f) {
        this.radius=r;
        super.setColor(c);
        super.setFilled(f);
    }
    
    //Getter and Setter 
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double r) {
        this.radius=r;
    }
    
    public double getArea() {
        return Math.PI*radius*radius;
    }
    
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
 
    public String toString() {
        return "A circle [" + super.toString()+"], radius= "+radius + "]";
    }
}

