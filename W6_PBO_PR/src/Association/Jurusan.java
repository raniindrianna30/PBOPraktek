package Association;

    public class Jurusan {
     String NamaJurusan;
     private Mahasiswa mahasiswa;
    
    
    public Jurusan(String namaJurusan) {
        this.NamaJurusan = namaJurusan;
        mahasiswa=null;
    }
     
    public String getNamaJurusan() {
        return NamaJurusan;
    }
    
    public void setNamaJurusan(String namaJurusan) {
        this.NamaJurusan = namaJurusan;
    }
    
    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa=mahasiswa;
    }
    
    public Mahasiswa getmahasiswa(){
        return mahasiswa;
    }
}



