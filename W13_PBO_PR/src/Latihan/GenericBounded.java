package Latihan;

public class GenericBounded<T> {
    private T t;
    
    public void add(T t) {
        this.t = t;
    }
    
    public T get() {
        return t;
    }
  
    
    public static void main(String[] args) {
        GenericBounded<Integer> number  = new GenericBounded<Integer>();
        GenericBounded<String> word = new GenericBounded<String>();
        number.add(5);
        word.add("Hello Generic");
        System.out.println("Integer value: "+number.get());
        System.out.println("String value: "+word.get());
    }
}
