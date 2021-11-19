package ExerciseSatu;

public class Cylinder extends Circle {  //Save as "Cylinder.java"
    private double height; //private variable
    
    //Constructor with default color, radius and height
    public Cylinder() {
        super();    //call superclass no-arg constructor circle ()
        height=1.0; 
    }
    
    //constructir with default radius, color but given height 
    public Cylinder(double height) {
        super();    //call superclass no-arg constructor circle()
        this.height=height;
    }
    
    //constructor with default color, but given radius, height 
    public Cylinder(double radius, double height) {
        super(radius);  //call superclass constructor circle (r)
        this.height=height;
    }
    
    public Cylinder(double radius, double height, String color) {
        super(radius,color);
        this.height=height;
    }
    
    //A public method for retrieving the height
    //GETTER AND SETTER
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height=height;
    }
    
    //A public method for computing the volume of cylunder
    //use superclass method getArea() to get the base area
    public double getVolume() {
        return super.getArea()*height;     //Use circle's get area
    }
    
    @Override
        public double getArea() {
            return 2*Math.PI*getRadius()*getHeight()+2*super.getArea();
        }
        
    @Override
        public String toString() {      //in Cylinder class
            return "Cylinder: subclass of " + super.toString()  //use circle's toString()
                        + " height=" + height;
        }
    }
        
   

    
    

