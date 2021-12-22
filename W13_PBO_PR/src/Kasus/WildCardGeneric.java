package Kasus;
import java.util.ArrayList;
import java.util.Collection; 
import java.util.HashSet; 
import java.util.LinkedList;

public class WildCardGeneric extends Animal {
    public static void printCollection(Collection<?> c) { 
        for (Object e : c) {
            System.out.println(e);
        }
    }
    
    public void display() {
        Collection<String> mamalia = new ArrayList<>(); 
        mamalia.add("Kucing");
        mamalia.add("Pinguin");
        mamalia.add("Sapi");
        System.out.println("Group by name animal : ArrayList Collection");
        printCollection(mamalia);
        Collection<Integer> jml_kaki = new LinkedList<>(); 
        jml_kaki.add(4);
        jml_kaki.add(2);
        jml_kaki.add(4);
        System.out.println("Group by jumlah kaki : LinkedList Collection");
        printCollection(jml_kaki);
        Collection<Character> hurufDepan = new HashSet<>();
        hurufDepan.add('K');
        hurufDepan.add('P');
        hurufDepan.add('S');
        System.out.println("Group by Character : HashSet Collection");
        printCollection(hurufDepan);
    }
    
    
}
