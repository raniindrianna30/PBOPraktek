package no5;

import java.util.Scanner;

public class BukaTutupJalan {
    
     public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
         int platA,platB,platC,platD;
         String numberPlat,Gabung;
         
         long gabung;
         
         platA = keyboard.nextInt();
         platB = keyboard.nextInt();
         platC = keyboard.nextInt();
         platD = keyboard.nextInt();
         Gabung = String.valueOf(platA) + String.valueOf(platB) + String.valueOf(platC) + String.valueOf(platD); 
           
           gabung = Long.parseLong(Gabung);
           
          
           
           if ((gabung%5)==0) {
               System.out.println("Berhenti");
           }else {
               System.out.println("Jalan");
           }
         
     }
}
