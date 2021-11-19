package typedatastring;

import java.util.Scanner;

public class TypeDataString {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       
        String A, B;
        
       System.out.print("Masukkan kata A : ");
        A = keyboard.nextLine();     
       System.out.print("Masukkan kata B : "); 
        B = keyboard.nextLine();
        
        int jumlah = A.length() + B.length();
        System.out.println("Jumlah Karakter A dan B : "+jumlah);
        
        if(A.compareTo(B) > 0) {
          System.out.println("Yes");
      } else if (B.compareTo(A) < 5) {
          System.out.println("No");
      }
      String hurufA = A.substring(0,1).toUpperCase()+ A.substring(1);
      String hurufB = B.substring(0,1).toUpperCase()+ B.substring(1);
      System.out.println(hurufA+" "+hurufB);
    }
    
}
