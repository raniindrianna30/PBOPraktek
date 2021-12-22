package JavaGeneric;

public class GenericMethods {
    //Java Generic Method
    public static <T> boolean isEqual(GenericType<T> g1, GenericType<T> g2){ 
        return g1.get().equals(g2.get());
    }
    
    public static void main(String[] args){ 
        GenericType<String> g1 = new GenericType<>(); 
        g1.set("Java");
        
        GenericType<String> g2 = new GenericType<>(); 
        g2.set("Java");
        
        boolean isEqual = GenericMethods.<String>isEqual(g1, g2);
        //above statement can be written simply as 
        isEqual = GenericMethods.isEqual(g1, g2);
        System.out.println(isEqual);

        /*This feature, known as type inference, allows you to invoke
          a generic method as an ordinary method, without specifying a 
          type between angle brackets */
        
         //Compiler will infer the type that is needed
    }
}