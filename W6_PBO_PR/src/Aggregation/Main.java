package Aggregation;

public class Main {
    
    public static void main(String[] args) {

        Dosen dosen = new Dosen(0545544,"Jonner");
        Jurusan jurusan = new Jurusan("Teknik Informatika");
        
        jurusan.setDosen(dosen);
        
        System.out.println("NIP Dosen  : "+jurusan.getDosen().getNIP());
        System.out.println("Nama Dosen : "+jurusan.getDosen().getName());
        System.out.println("Jurusan    : "+jurusan.getNamaJurusan());
    }   
    
}
