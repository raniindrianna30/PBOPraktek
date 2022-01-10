/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author Asus
 */
public class AntrianParkir extends Thread {
    private int urutan;
    private Thread thread;
    private String PenjagaParkir;
    
    public AntrianParkir(int x, String PenjagaParkir) {
        this.urutan = x;
        this.PenjagaParkir = PenjagaParkir;
        
        for(int i = 1; i <=x ; i++) {
            System.out.println("Pengendara mengambil karcis dari penjaga parkir ke-"+i);
            try{
                Thread.sleep(1000); //menunggu 1 detik               
            }catch(InterruptedException ex) {
                System.out.println("pengambilan karcis terinterupsi");      
               
            }
        }
    }
    
    public void run() {
        for(int x=1; x<=urutan; x++) {
            System.out.println("\npenjaga parkir memberikan karcis ke-" + x + " pada pengendara");
            try {
                System.out.println("Urutan pengendara ke-"+x+" sedang di print penjaga parkir");                
                Thread.sleep(1000);
                 
            }catch(InterruptedException ex) {
                System.out.println("pesanan di interupsi");
            }
        }
        
        for (int x=1; x<=urutan; x++) {
            System.out.println("\npenjaga parkir selesai print karcis pengendara ke-"+x);
            try {
                System.out.println("penjaga memberikan karcis pengendara ke-"+x);
              
                Thread.sleep(1000);
                
            }catch(InterruptedException ex) {
                System.out.println("Pesanan diinterupsi");
            }
        }
    }
    
    public void start() {
        if(thread==null) {
            thread = new Thread(this, PenjagaParkir);
            thread.start();
        }
    }
    
    public void start(int priority) {
        if(thread == null) {
            thread = new Thread(this, PenjagaParkir);
            thread.setPriority(priority);
            thread.start();
        }
    }
    
    public static void main(String[]args) {
        System.out.println("******Urutan Ambil Karcis******");
        AntrianParkir ap = new AntrianParkir(5,"Urutan");
        ap.start();
    }
    
}

