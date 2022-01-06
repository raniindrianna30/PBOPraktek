package nomorsatu;
import java.util.Arrays;

public class satu {
    public static final <X> void swap (X[] a, int q, int p) {
        X x = a[q];
        a[q] = a[p];
        a[p] = x;
    }
    private static void test() {
        Integer [] a = {5, 7};
        swap(a, 0, 1);
        System.out.println("A:"+Arrays.toString(a));
        
        swap(a, 1, 0);
        System.out.println("R:"+Arrays.toString(a));
    }
    public static void main(String...args)
    {
    test();
    }

}