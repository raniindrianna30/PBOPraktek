package Kasus;

public class InterfaceGeneric extends Animal {
    public void display() {
        Integer inums[] = {3, 6, 3, 8, 6};
        Character chs[] = {'b', 'r', 'p', 'w'};
        ClassInterface <Integer> number = new ClassInterface<Integer>(inums);
        ClassInterface<Character>character = new ClassInterface<Character>(chs);
        
        System.out.println("Angka");
        for(Integer x : inums) {
            System.out.println(x);
        }
        
        System.out.println("Huruf");
        for(Character c : chs) {
            System.out.println(c);
        }
        
       number.sorting(inums);
       character.sorting(chs);
    }
    
    
}
