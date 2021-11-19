package no6;

import java.util.Scanner;
import java.math.*;

public class BigNumber {
      public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           
        String numOne = sc.nextLine();
        BigInteger bigNumOne = new BigInteger(numOne);
        String numTwo = sc.nextLine();
        BigInteger bigNumTwo = new BigInteger(numTwo);
       
        System.out.println(bigNumOne.add(bigNumTwo));
        System.out.println(bigNumOne.multiply(bigNumTwo));
      }
}
