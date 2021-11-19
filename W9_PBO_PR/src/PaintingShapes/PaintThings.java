package PaintingShapes;
import java.text.DecimalFormat;

public class PaintThings {
    //create some shapes and a paint object
    //and prints the amount of paint needed
    //to paint each shape   
    public static void main(String[]args) {
        
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);  
        
        Rectangle deck;
        Sphere bigMall;
        Cylinder tank;
        
        double deckAmt, ballAmt, tankAmt;
        
        //instantiate the three shape to paint
        deck = new Rectangle(20,35);
        bigMall = new Sphere(15);
        tank = new Cylinder(10,30);
        
        //compute the amount of paint needed for each shape
        deckAmt=paint.amount(deck);
        ballAmt = paint.amount(bigMall);
        tankAmt = paint.amount(tank);
        
        //Print the amount of paint for each
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball "+ fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
