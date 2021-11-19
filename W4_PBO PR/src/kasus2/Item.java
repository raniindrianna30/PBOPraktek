package kasus2;

public class Item {
        private String name;
        private Item() {
            name = "Ipin";
        }
        
        public Item(String name) {
           this.name = "Ipin";
            //this(); //bisa di coba cara ini
            System.out.println(this.name);
        }
}
