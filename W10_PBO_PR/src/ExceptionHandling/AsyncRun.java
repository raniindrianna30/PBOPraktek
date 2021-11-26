package Exception;

public class AsyncRun implements Runnable{
    
    @Override
    public void run() {
        //ToDo auto-generated  method stub
        try {
            System.out.println("AsyncRun.run on thread " + 
                Thread.currentThread().getId());   //1
        throw new ArithmeticException();
        }
        
        catch(Exception ex) {
            System.out.println(ex.getClass().getName() + " handled"); //3
            
        }
        
    }
}


    

