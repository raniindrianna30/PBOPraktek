
package soal1;

import java.util.Scanner;

public class DataTypes {
    
    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
       
       int T;
       System.out.println("Masukkan angka : ");
        T = keyboard.nextInt();
        
        for(int i=0; i<T; i++) {
            try{
                long N ;
                N = keyboard.nextLong();
                
                System.out.println(N+" can be fitted in: " );
                
                if (N>=Byte.MIN_VALUE && N<=Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                
                if(N>=Short.MIN_VALUE  && N<=Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if (N>=Integer.MIN_VALUE && N<=Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if (N>=Long.MIN_VALUE && N<=Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            }
                   catch(Exception e) {
                        System.out.print(keyboard.next()+" can't be fitted anywhere");
            }
        }
    }
}
