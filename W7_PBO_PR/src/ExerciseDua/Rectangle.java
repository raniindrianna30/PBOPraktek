package ExerciseDua;

public class Rectangle extends Shape {
    private double width;
    private double length;
    
    public Rectangle() {
        super();
        this.length=1.0;
        this.width=1.0;
    }
    
    public Rectangle(double width, double length) {
        super();
        this.width=width;
        this.length=length;
    }
    
    public Rectangle(double width, double length, String c, boolean f) {
        this.length=length;
        this.width=width;
        super.setColor(c);
        super.setFilled(f);
    }
    
    //getter and settter
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double w) {
        this.width=w;
    }
   
    public double getLength() {
        return length;
    }
    
    public void setLength(double l) {
        this.length=l;
    }
    
    public double getArea() {
        return width*length;
    }
    
    public double getPerimeter() {
        return 2*(width+length);
    }
    
    public String toString() {
        return "Square[Rectangle["+super.toString()+", width= "+width+", length= "+ length+"]";
    }  
}



