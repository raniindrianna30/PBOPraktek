package no4;

import java.util.Scanner;

public class GajiAgent {
    
    public static final int gaji_pokok = 500000;
    public static final int Item = 50000;
    
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
        int gaji, item;
        int hargaItem;
        
        item = keyboard.nextInt();
        gaji = hitungGaji(item);
        System.out.println(gaji);
    }
    
    public static int hitungGaji(int item) {
        double gaji;
        
        if(item > 80) {
            gaji = ((item*item)*0.35)+gaji_pokok;
        }else if(item >= 40) {
            gaji = ((item*Item)*0.25)+gaji_pokok;
        }else if(item < 15) {
            gaji = gaji_pokok - (((15-item)*Item)*0.15);
        }else {
            gaji = ((item*Item)*0.10)+gaji_pokok;
        }
        return(int)gaji;
    }
}
