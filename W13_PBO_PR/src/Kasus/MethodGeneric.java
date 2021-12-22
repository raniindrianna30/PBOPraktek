package Kasus;

public class MethodGeneric extends Animal {
    public static<T> void print(T kaki) {
        System.out.println(kaki);
    }
    
    public void display() {
        System.out.println("Jumlah kaki:");
        
    print("dua"); //string
    print(2); //int
    print("false"); //boolean
    print('r');  //char
    }
}
