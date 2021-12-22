package JavaGeneric;

public class GenericType<T> { 
    private T t;
    
    public T get(){
        return this.t;
    }
    
    public void set(T t1){ 
        this.t=t1;
    }
    
    public static void main(String args[]){ 
        
        GenericType<String> type = new GenericType<>(); 
        type.set("Java");      
        System.out.println("Type String: "+type.get());

    }
}