package kasus2;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        
        System.out.println("********** MENU MAKANAN **********");
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();
        System.out.println("**********************************");
        
        //Untuk menampilkan pesanan
        menu.Pemesanan(("Molen"),5);
        System.out.println("\n========Stok Makanan Tersisa========");
        
        menu.tampilMenuMakanan();
    }
}