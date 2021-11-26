package OperationHandling;

public class VariableReference {
    public static void main(String[] args) {   
      String name;
       try{
           name = new String();
           System.out.println("name: "+name);
       }
       catch(Exception ex) {
           System.out.println("name tidak ditemukan"+ex);
       }
    
        /*
        String name;
        System.out.println("nilai dari name: "+name);
        */ 
    }
}

 