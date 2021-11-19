package ExerciseDua;

public class Shape {
    private String color;
    private boolean filled;
    
    public Shape() {
    color = "green";
    filled = true;
}
    
    public Shape(String c, boolean f) {
        this.color=c;
        this.filled=f;
    }
    
    // return the color
    public String getColor() {
        return color;
    }
    
    public void setColor(String c) {
        this.color=c;
    }
   
    // return the filled
    public boolean isFilled() {
        return filled;
    }
    
    public void setFilled(boolean f) {
        this.filled=f;
    }
 
    public String toString() {
        if(isFilled()) {
            return "A shape with color of " + color + " is Filled";
        }else{
            return "A shape with color of " + color + " isn't Filled";
        }
    }
}
