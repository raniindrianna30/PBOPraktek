package no3;

import java.util.Scanner;

public class berhitung {
     public static void main(String[] args) {
         
         Scanner keyboard;
         int angka1; 
         int angka2;
         int hasil;
         char operator;
         
         keyboard = new Scanner(System.in);
      
         System.out.printf("");
         angka1 = keyboard.nextInt();
         System.out.printf("");
         operator = keyboard.next().charAt(0);
         System.out.printf("");
         angka2 = keyboard.nextInt();
         
         //System.out.println("keyboard: "+ 0 + " " + operator + " " + angka2);
         
         //operator tersedia + - * /
         
         if(operator == '+') {
             hasil = angka1 + angka2; 
             System.out.println(" "+hasil);   
     }else if (operator == '-') {
         hasil = angka1 - angka2;
         System.out.println('-'+hasil);
     }else if (operator == '*'){
         hasil = angka1 * angka2;
         System.out.println(" "+hasil);
     }else if(operator == '/') {
         if (angka2 == 0) {
         System.out.println("pembagi 0 menghasilkan tak hingga");
     }else {
             hasil = angka1 / angka2;
             System.out.println(" "+hasil);
             }
     }
     else if (operator == '%') {
         hasil = angka1 % angka2;
         System.out.println(" "+hasil);
     } else {
         System.out.println("operator tidak di temukan");
        }
    }
}
