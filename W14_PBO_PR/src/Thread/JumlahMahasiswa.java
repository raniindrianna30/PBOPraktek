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
public class JumlahMahasiswa {
    public static void main (String [] args) {
        Mahasiswa mhs1 = new Mahasiswa("Mahasiswa-1");
        Mahasiswa mhs2 = new Mahasiswa("Mahasiswa-2 ");
        Mahasiswa mhs3 = new Mahasiswa("Mahasiswa-3");
        mhs1.start();
        mhs2.start();
        mhs3.start();
    }
}
    
class Mahasiswa extends Thread {
    public Mahasiswa(String mahasiswa) {
        super (mahasiswa);
    }
    
    @Override
    public void run() {
        String name = getName();
        for(int i=1; i<7; i++) {
            try{
                sleep(1000); //menunggu 1 detik
            }
            catch(InterruptedException e) {
                System.out.println("diinterupsi");
            }
            
            System.out.println("Thread "+name+":Posisi "+i);
        }
    }
} 

 

