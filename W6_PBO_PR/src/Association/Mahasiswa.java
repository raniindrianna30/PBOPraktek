package Association;

public class Mahasiswa {
    private String nama;
    private int NIM;
    private Jurusan jurusan;
  
    public Mahasiswa(String nama, int NIM) {
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan= null;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama() {
        this.nama = nama;
    }
    
    public int getNIM () {
        return NIM;
    }
    
    public void setNIM() {
        this.NIM = NIM;
    }
    
    public Jurusan getJurusan() {
        return jurusan;
    }
    
    public void setJurusan() {
        this.jurusan = jurusan;
    }
}
   
