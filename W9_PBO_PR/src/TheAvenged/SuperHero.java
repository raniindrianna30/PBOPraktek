package TheAvenged;

import java.util.ArrayList;
import java.util.List;
import java.lang.Comparable;

public abstract class SuperHero implements Comparable<SuperHero> {
   private int powerLevel;
   private String name;
   private List<Power> powerList;
   
   public SuperHero(int powerLevel, String name){
      this.powerLevel=powerLevel;
      this.name=name;
      this.powerList=new ArrayList<Power>();
       
   }
   
   public int getpowerLevel() {
      return powerLevel;
   }
   
   public String getname() {
       return name;
   }
   
   //penambahan power
   public void addPower(Power power) {
       powerList.add(power);
   } 

    public void identity() { 
    }
   
   public void showPowers() {
       System.out.println("..... HEED ME.....");
       System.out.println("FOR MY NAAAAAAAME IS "+this.getname().toUpperCase());
       System.out.println("TIME TO SHOW MY POWERS");
        for (Power power : powerList){
            power.doPower(); //method ada di power
        }
   }
   @Override
       public int compareTo(SuperHero superhero) {
           if(this.powerLevel > superhero.getpowerLevel()) {
               return 1;
           }else if(this.powerLevel < superhero.powerLevel) {
               return -1;
           }
           return 0;
       }
       
   }
