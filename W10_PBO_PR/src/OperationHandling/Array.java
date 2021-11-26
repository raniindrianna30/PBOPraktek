package OperationHandling;

public class Array {
    public static void main (String[]args) {
        
         int myarr[] = new int[5];
        try{
            //mengisi elemen array
            for (int i=0; i<=5; i++) {
                myarr[i] = i * 2;
                System.out.println("elemen ke-" + i + " = "+myarr[i]);
            }   
        }
        catch(ArrayIndexOutOfBoundsException ex) {
             System.out.println("mengakses elemen tidak boleh melewati kapasitas array"); 
        }  
    }
}   

   
    /*
     public static void main (String[]args) {
        int myarr[]=new int[5];
        
        for(int x=0; x<=5; x++){
            myarr[x]= x*2;
            System.out.println("elemen ke "+x+" = "+myarr[x]);
        }
    }
}
*/
    
    
    
    
    
    
    
    
    
    
    
    
   