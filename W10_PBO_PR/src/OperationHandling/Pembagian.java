package OperationHandling;
import java.util.Scanner;

public class Pembagian {
    public static void main(String[] args) {
            int x;
            int y;
            Scanner input = new Scanner(System.in);
		//Meminta user untuk memasukkan dua angka integer
		System.out.print("angka pembilang: ");
                x = input.nextInt();
                System.out.print("angka penyebut: ");
		 y = input.nextInt();
                
                // kode yang dijalankan pada keadaan normal.
		try{
                    int result = x/y;
                    System.out.println("Hasil dari " + x + " dibagi " + y
                    + " adalah " + result);
		}
                 //blok catch bertujuan untuk menangani exception.
		catch (ArithmeticException ex){
                    System.out.println("Angka penyebut tidak boleh 0! ");
		}
    }
}
     

//tanpa try-catch
   /* public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
         System.out.println("Masukkan dua buah integer: ");
         int a = keyboard.nextInt();
         int b = keyboard.nextInt();
         
         System.out.println("Hasil dari " + a + " dibagi " + b
                    + " adalah " + a/b);
    }
}*/

   //}
//}

    
   