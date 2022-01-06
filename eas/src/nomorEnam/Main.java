/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomorEnam;

/**
 *
 * @author Asus
 */
public class Main {
    
    public static void main(String args[]) {
    
    Engine e1 = new Engine();
        e1.setName("engine1");
        e1.setHorsepower(12);
        Transmission tr = new Transmission();
        tr.setType("tr1");
        Mobil mbl1 = new SportCar("ducati", "body1", 12000, e1, tr);
        System.out.println(e1.Horsepower);
        System.out.println(tr.getType());
        System.out.println(SportCar.taxRate);
       
    }
}