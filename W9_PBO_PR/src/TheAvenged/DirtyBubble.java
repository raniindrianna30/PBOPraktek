package TheAvenged;

public class DirtyBubble extends SuperHero {
   
    public DirtyBubble (int powerLevel, String name) {
        super(powerLevel, name);
        Power strength = new Strength();
        Power fly = new Flying();
        super.addPower(strength);
        super.addPower(fly);
    }
    
    @Override
    public void identity() {
        System.out.println("It's "+this.getname() + ", the DirtyBubble! "
        + "It has the power level of " + this.getpowerLevel());
         super.showPowers();
    }
}
