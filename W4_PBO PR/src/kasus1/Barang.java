package kasus1;

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;

     public int getStok() {
         return stok;
        }
    
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
   }
     
        //untuk menambahkan stok
        public void tambahStok(int jml_stok) {
            this.stok = stok + jml_stok;
        }
}    




//Mutator : merubah data dari sebuah variabel yg bersangkutan