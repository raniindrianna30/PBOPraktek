package Exception;

public class Main {
    public static void main (String[] args) {
        try {
            Thread t = new Thread(new AsyncRun());
            t.start();
            System.out.println("main of thread " //2
            + Thread.currentThread().getId());
            throw new NullPointerException();
        }
        catch(Exception ex) {
            System.out.println(ex.getClass().getName() + " handled");  //4
        }
    }
}
