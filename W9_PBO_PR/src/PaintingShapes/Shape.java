package PaintingShapes;

public abstract class Shape {
    String shapeName;
    
    public Shape(String ShapeName) {
        this.shapeName = ShapeName;
    }
    public abstract double area();
    public String toString(){
        return "Name Shape: "+shapeName;
    }
}


