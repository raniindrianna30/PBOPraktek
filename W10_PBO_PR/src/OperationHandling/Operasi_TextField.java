package OperationHandling;
import java.util.*;

public class Operasi_TextField {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan inputan: ");
       try{
           int angka = input.nextInt();
           System.out.println("Nilai input: "+angka);
       }
       catch(InputMismatchException ex) {
           System.out.println("Inputan hanya untuk integer");
           System.out.println("Terjadi error: "+ex);
       }
       
       /*
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan inputan: ");
       int angka = input.nextInt();
       */
     }
}
