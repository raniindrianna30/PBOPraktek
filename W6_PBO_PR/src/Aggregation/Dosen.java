package Aggregation;
 
public class Dosen {
    private int NIP;
    private String name;
   
    public Dosen(int nip,String nama){
        this.NIP = nip;
        this.name = nama;
    }
    
    public String getName() {
        return name;
    }
    
    public int getNIP() {
        return NIP;
    }
}