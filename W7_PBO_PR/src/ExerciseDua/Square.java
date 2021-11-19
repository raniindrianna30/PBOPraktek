package ExerciseDua;

public class Square extends Rectangle {
    
    public Square() {
        super();
    }
    
    public Square(double side) {
        super(side,side);   //call superclass rectangle (double, double)
    }
    
    public Square(double side, String c, boolean f) {
        super(side,side, c,f);
    }
    
    public double getSide() {
        return super.getLength();
    }
    
    public void setside(double side) {
        setWidth(side);
        setLength(side);
    }

    public String toString() {
        return "Square[" + super.toString()+ "]";
    }
}
