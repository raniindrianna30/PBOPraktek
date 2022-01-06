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
public class Mobil {
    private Engine e;
    private Transmission t;
    
    public Engine setEngine() {
        return e;
    }
 
    public Transmission getTransmission() {
        return t;
    }
    
    public void setEngine(Engine e) {
        this.e = e;
    }
    
    public void setTransmission(Transmission t ) {
        this.t = t;
    }
}
