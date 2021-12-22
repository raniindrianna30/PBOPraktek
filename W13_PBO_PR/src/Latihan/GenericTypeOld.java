package Latihan;

class Animal{
    private Object Hewan;
    
    public Object getAnimal() {
        return Hewan;
    }
    
    public void setAnimal(Object animal) {
        this.Hewan = animal;
    }
}

public class GenericTypeOld {
    public static void main(String[] args) {
        Animal cow = new Animal();
        cow.setAnimal("cow");
        System.out.println("hewan mamalia: "+cow.getAnimal());
    }
}
