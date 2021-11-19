package Composition;
import java.util.*;


public class main {
   public static void main(String[]args) {
       
       AlatTulis a1 = new AlatTulis("Pensil", 5);
       AlatTulis a2 = new AlatTulis("Buku", 10);
       
       List<AlatTulis>ATK = new ArrayList<AlatTulis>();
       ATK.add(a1);
       ATK.add(a2);
       
       HargaAlatTulis HargaATK = new HargaAlatTulis(ATK);
       List<AlatTulis> atk = HargaATK.getAlatTulis(); 
       atk.forEach(AtK -> {
           System.out.println("" +AtK.NamaAlatTulis + " dengan jumlah"+" "+AtK.Jumlah);
       });
   }
    
}





