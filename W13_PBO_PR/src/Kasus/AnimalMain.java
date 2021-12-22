package Kasus;
import java.util.Scanner;

public class AnimalMain {
   public static void main(String[] args) { 
        int choice;
        for(;;) {
            System.out.println("Generic Menu");
            System.out.println("1. Generic Class");
            System.out.println("2. Generic Method");
            System.out.println("3. Generic Interface");
            System.out.println("4. Generic Bounded");
            System.out.println("5. Generic WildCard");
            
            System.out.println("Menu: ");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            
            switch(choice) {
            case 1:
                //generic class
                System.out.println("Generic Class");
                Bound<GenericClass>A = new Bound<>(new GenericClass());
                A.Run();
                break;
            case 2:
                //generic method
                System.out.println("Generic Method");
                Bound<MethodGeneric>B = new Bound<>(new MethodGeneric());
                B.Run();
                break;
            case 3:
                //generic interface
                System.out.println("Generic Interface");
                Bound<InterfaceGeneric>C = new Bound<>(new InterfaceGeneric());
                C.Run();
                break;
             case 4:
                System.out.println("Generic Bounded");
                Bound<Animal>D = new Bound<>(new Animal());
                D.Run();
                break;
             case 5:
                System.out.println("Generic WildCard");
                Bound<WildCardGeneric> E = new Bound<>(new WildCardGeneric());
                E.Run();
                break;
             default: System.out.println("Pilihan tidak ditemukan");
             break;
        }
            System.out.println("\n");        
        }
    }
    
}
