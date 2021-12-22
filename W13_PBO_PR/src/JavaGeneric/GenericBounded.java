package JavaGeneric;

class Bound<T extends A> {
    private T objRef;
    
    public Bound(T obj) {
        this.objRef = obj;
    }
    
    public void doRunTest() {
        this.objRef.displayClass();
    }
}

class A {
    public void displayClass() {
        System.out.println("Inside super class A");
    }
}

class B extends A {
    public void dislayClass() {
        System.out.println("Inside sub class B");
    }
}

class C extends A {
    @Override
    public void displayClass() {
        System.out.println("Inside sub class C");
    }
}

public class GenericBounded{
    public static void main(String a[]) {
        //creating object of sub class c and
        //passing it to Bound as a type parameter.
        Bound<C> bec = new Bound<C>(new C());
        bec.doRunTest();
        
        //creating object of sub class B and 
        //passing it to Bound as a type parameter
        Bound<B> beb = new Bound<B>(new B());
        beb.doRunTest();
        
        //similarly passing super class A
        Bound<A> bea = new Bound<A> (new A());
        bea.doRunTest();
    }
}