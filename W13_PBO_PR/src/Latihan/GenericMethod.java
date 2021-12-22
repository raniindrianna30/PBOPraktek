package Latihan;



public class GenericMethod {
    public static<T> boolean isEqual(GenericType<T>X, GenericType<T>Y) {
        return X.getType().equals(Y.getType());
    }
    
    public static void main(String[]args) {
       GenericType<String>X = new GenericType<>();
       X.setType("Generic");
       
       GenericType<String>Y = new GenericType<>();
       Y.setType("Method");
       
       boolean isEqual = GenericMethod.<String>isEqual(X, Y);
        //above statement can be written simply as 
        isEqual = GenericMethod.isEqual(X,Y);
        System.out.println(isEqual);
    }
}
