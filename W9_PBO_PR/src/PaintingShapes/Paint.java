package PaintingShapes;

public class Paint {
    private double coverage;  //number of square feet per gallon
    
    //constructor : sets up the paint object
    public Paint(double c) {
        coverage = c;
    }
    
    //returns the amount of paint (number of gallons)
    //needed to paint the shape given as the parameter
    public double amount (Shape s) {
        System.out.println("Computing amount for "+ s);
        return s.area()/coverage;
        
        //return 0; //before
    }
}



