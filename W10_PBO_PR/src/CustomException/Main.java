package CustomException;
import java.util.*;

public class Main {
    public static int parseHexInt(String hex) {
        try{
            return Integer.parseInt(hex,16);
        }
        catch(NumberFormatException ex) {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan inputan: ");
        String HexaDec = input.next();
        int result = parseHexInt(HexaDec);
        
        if(result != 0) {
            System.out.println("result: "+result);
        } else {
            System.out.println("bukan bilangan hexadesimal");
        }
        
    }
    
    
    
}
