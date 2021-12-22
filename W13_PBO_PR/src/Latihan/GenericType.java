package Latihan;

class GenericType<T> {
    private T Type;
    private T Type2;
    
    public T getType() {
        return Type;
    }
    
    public void setType(T type){ 
        this.Type = type;
    }
    
    public T getType2() {
        return Type2;
    }
    
    public void setType2(T type){ 
        this.Type2 = type;
    }
    public static void main(String args[]) {
        GenericType<String>type = new GenericType<>();
        type.setType("Java: ");
        type.setType2("Implementasi Generic");
        System.out.println(type.getType()+type.getType2());
        
        GenericType <Integer> number = new GenericType<>();
        number.setType(30);
        number.setType2(5);
        System.out.println(number.getType()+number.getType2());
    }
}
        
