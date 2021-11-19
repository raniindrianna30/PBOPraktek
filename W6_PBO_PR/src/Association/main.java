package Association;

public class main {
     public static void main(String args []){
         Mahasiswa mahasiswa = new Mahasiswa("Rani Indrianna", 201511025);
         Jurusan jurusan = new Jurusan("Teknik Informatika");
         jurusan.setMahasiswa(mahasiswa);
         mahasiswa.setJurusan();
         System.out.println("Nama : "+mahasiswa.getNama()+"\n"+"NIM : "+mahasiswa.getNIM()
         +"\n"+"Jurusan : "+jurusan.getNamaJurusan());
         
     }
}
