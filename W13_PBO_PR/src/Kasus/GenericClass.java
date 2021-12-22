package Kasus;

public class GenericClass extends Animal{
    public void display() {
        
        //mendefinisikan tipe data String
        GenericType<String> name = new GenericType<>();
        name.setAnimal("Elephant");
        System.out.println("Animal name: "+name.getAnimal());
        
        //mendefinisikan tipe data integer
        GenericType<Integer>kaki=new GenericType<>();
        kaki.setAnimal(4);
        System.out.println("Mempunyai kaki: "+kaki.getAnimal());
        
        //mendefinisikan tipe data boolean
        GenericType<Boolean> keadaan = new GenericType<>();
        keadaan.setAnimal(true);
        System.out.println("Kesehatan gajah dalam keadaan baik: "+keadaan.getAnimal());
    }
}
