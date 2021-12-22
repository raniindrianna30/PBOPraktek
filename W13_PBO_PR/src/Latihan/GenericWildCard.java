package Latihan;


import java.util.ArrayList;
import java.util.List;

public class GenericWildCard {
    public static void printList(List<?> list) {
        for(Object element : list) {
            System.out.println(element);
        }
    }
    
    public static void main(String[]args) {
        List<String> list = new ArrayList<String>();
        list.add("Hai");
        list.add("Generic");
        printList(list);
        
        List<Character>huruf = new ArrayList<Character>();
        huruf.add('R');
        huruf.add('A');
        huruf.add('N');
        huruf.add('I');
        printList(huruf);
        
        List<Integer>number = new ArrayList<Integer>();
        number.add(5);
        number.add(10);
        printList(number);
    }
}
