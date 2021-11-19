
package TheAvenged;

public class ManRay extends SuperHero {
    
    public ManRay(int powerLevel, String name) {
        super(powerLevel, name);
        Power laser = new LaserEye();
        Power strength = new Strength();
        super.addPower(laser);
        super.addPower(strength);
        
    }
    
    @Override
    public void identity() {
        System.out.println("It's " + getname() + ", the ManRay!"
                + " It has the power level of "+getpowerLevel());
        super.showPowers();
    }
}
