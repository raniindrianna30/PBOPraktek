package TheAvenged;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AvengedSimulator {
    public static void main(String[]args) {
      
        SuperHero sh1 = new ManRay(0,"Gennichiro");
        SuperHero sh2 = new FlyingDutchMan(225, "Shirai");
        SuperHero sh3 = new ManRay(553, "Gyoubu Masataka Oniwa");
        SuperHero sh4 = new DirtyBubble(666,"Arnastria");
        SuperHero sh5 = new FlyingDutchMan(36556, "Tatenari");
        
        List<SuperHero>listSH = new ArrayList<> ();
        listSH.add(sh1);
        listSH.add(sh2);
        listSH.add(sh3);
        listSH.add(sh4);
        listSH.add(sh5);
           
       Collections.sort(listSH);      
        for(SuperHero sh : listSH) {
            System.out.println("===============================");
            sh.identity();
            System.out.println("===============================");
        }
    }
    
    
}
