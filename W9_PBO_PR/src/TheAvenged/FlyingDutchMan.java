
package TheAvenged;

public class FlyingDutchMan extends SuperHero{
    
    public FlyingDutchMan (int powerLevel, String name) {
        super(powerLevel, name);
        Power fly= new Flying();
        Power laser = new LaserEye();
        super.addPower(fly);
        super.addPower(laser);
       
    }
    
    @Override
    public void identity() {
       // System.out.println("===============================");
        System.out.println("It's "+this.getname()+", the FlyingDutchMan!"
                + " It has the power level of "+ this.getpowerLevel());
         super.showPowers();
    }
} 
    
    
