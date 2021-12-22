package JavaGeneric;

public class GenericTypeOld {
    private Object t;
    
    public Object getT() {
        return t;
    }
    
    public void setT(Object t) {
        this.t = t;
    }
    
    public static void main(String args[]) {
        GenericTypeOld type = new GenericTypeOld();
        type.setT("Latihan Generic");
        String str = (String) type.getT();
        System.out.println((String)type.getT());
        
        //type casting, error prone and can cause ClassCastWxception
    }
    
}
