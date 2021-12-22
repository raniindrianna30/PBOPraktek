package Kasus;

public class Bound <T extends Animal> {
    private T objRef;
    
    public Bound(T obj) {
        this.objRef=obj;
    }
    
    public void Run() {
        this.objRef.display();
    }
}

class Animal {
    public void display() {
        System.out.println("Pemanggilan semua class generic menggunakan generic bound: ");
    }
}
