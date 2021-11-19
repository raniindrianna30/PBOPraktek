package ExerciseDua;

public class Main {

    public static void main(String args[]) {

        System.out.println("---SHAPE---");
        Shape s1 = new Shape();
        Shape s2 = new Shape("blue", false);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        
        System.out.println("---CIRCLE---");
        Circle c1 = new Circle();
        Circle c2 = new Circle(10.0, "white", false);
        System.out.println(c1.toString());
        System.out.println("Luas = " + c1.getArea());
        System.out.println(c2.toString());
        
        System.out.println("---RECTANGLE---");
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(12.0, 6.0, "black", true);
        System.out.println(r1.toString());       
        System.out.println(r2.toString());
        System.out.println("Luas = "+ r2.getArea()+ " Keliling = " + r2.getPerimeter());
        
        System.out.println("---SQUARE---");
        Square sq1 = new Square();
        Square sq2 = new Square(4.5,"yellow", false);
        System.out.println(sq1.toString());
        System.out.println(sq2.toString());
        System.out.println("Luas = " + sq1.getArea()+" Keliling = "+sq1.getPerimeter());

    }
}





