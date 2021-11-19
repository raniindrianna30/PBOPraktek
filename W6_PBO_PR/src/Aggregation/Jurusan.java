package Aggregation;

public class Jurusan {
    private String namaJurusan;
    private Dosen dosen;
    
    public Jurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
        this.dosen = dosen;
    }
    
    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }
    
    public Dosen getDosen() {
        return dosen;
    }
    
    public void setNamaJurusan(Jurusan jurusan) {
       this.namaJurusan = namaJurusan;
    }
    
    public String getNamaJurusan() {
        return namaJurusan;
    }   
}

    
