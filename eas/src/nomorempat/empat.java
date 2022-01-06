/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomorempat;

/**
 *
 * @author Asus
 */
public class empat {
    abstract class Summary { 
        abstract void getTitleSummaryName();
    } 

    class Book extends Summary { 
        @Override 
        void getTitleSummaryName() { 
            System.out.println("Sum Data Transaksi Bulanan"); 
        } 
    }   
}
