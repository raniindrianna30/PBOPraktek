package Kasus;

interface sort <T extends Comparable<T>> {
    void sorting(T[] List);
}

public class ClassInterface<T extends Comparable<T>> implements sort<T> {
    T[]vals;
    ClassInterface(T[] o) {
        vals = o;
    }
    
    public void sorting(T[]List) {
        for(int x = 1; x<vals.length; x++) {
            T key = vals[x];
            int position = x - 1;
            while(position >= 0 && key.compareTo(vals[position])>0) {
                vals[position + 1] = vals[position];
                position--;
            }
            vals[position + 1] = key;
        }
    }
}
    
    
