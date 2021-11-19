package kasus2;

public class Makanan {
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    
    public Makanan(String namaMakanan, double hargaMakanan, int Stok) {
        this.nama_makanan = namaMakanan;
        this.harga_makanan = hargaMakanan;
        this.stok = Stok;
    }
    
    //penggunaan setter dan getter
    public String getNamaMakanan() {
        return nama_makanan;
    }
   
    public double getHargaMakanan() {
        return harga_makanan;
    }
    
    public int getStok() {
        return stok;
    }
    
    public void kurangStok(int terjual) {
        stok -= terjual;
    }
}

