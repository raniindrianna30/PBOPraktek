package Depedency;
import java.util.Scanner;

public class main {
    public static void main(String[]args) {
        Scanner keyboard = new Scanner(System.in);
        Restorant restorant = new Restorant();
        int pilih;
        
        System.out.println("**** MENU MINUMAN ****");
        System.out.println("1. Coffee       Rp10.000,-");
        System.out.println("2. Teh Manis    Rp5.000,-");
        System.out.println("3. Air Mineral  Rp.5.000,-");
        System.out.println("4. Es Jeruk     Rp.4.000,-");
        System.out.printf("Pilih menu : ");
       pilih = keyboard.nextInt();
        
        switch (pilih) {
            case 1:
            {
                System.out.println("Pesanan anda: Coffee");
                restorant.setMinuman("Coffee");
                restorant.setHargaMinuman(10000.0);
                break;
            }
            
            case 2:
            {
                 System.out.println("Pesanan anda: Teh Manis.");
                restorant.setMinuman("Teh Manis");
                restorant.setHargaMinuman(5000.0);
                break;
            }
            
            case 3:
            {
                 System.out.println("Pesanan anda: Air Mineral.");
                restorant.setMinuman("Air Mineral");
                restorant.setHargaMinuman(5000.0);
                break;
            }
            
            case 4:
            {
                System.out.println("Pesanan anda: Es Jeruk.");
                restorant.setMinuman("Es Jeruk");
                restorant.setHargaMinuman(4000.0);
                break;
            }
        } 
    }
}
