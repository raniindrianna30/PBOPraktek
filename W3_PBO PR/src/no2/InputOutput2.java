package no2;

import java.util.Scanner;

public class InputOutput2 {
     public static void main(String[] args) {
         
     Scanner keyboard = new Scanner(System.in);
            Scanner input = new Scanner(System.in);
                Scanner sc = new Scanner(System.in);
                
                
          for(int i=0;i<3;i++) {
            String x = keyboard.next();
            int a = keyboard.nextInt();
            String y = input.next();
            String z = sc.next();
     
            
            int b = input.nextInt();
            int c = sc.nextInt();
 
        System.out.println("================================");
        
        
            
            System.out.printf("%-15s%03d%n", x,a);
            System.out.printf("%-15s%03d%n", y,b);
            System.out.printf("%-15s%03d%n", z,c);  
            System.out.println("================================");
        }
    }
}

