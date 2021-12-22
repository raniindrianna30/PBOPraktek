package Latihan;

interface MaxMin<T extends Comparable<T>> {
    T min(); // w w w .java2 s. co m 
}
 
class MyClass<T extends Comparable<T>> implements MaxMin<T> {
    T[] vals;
    MyClass(T[] o) {
        vals = o;
    }
    
    public T min() {
        T v = vals[0];
        for (int x = 1; x<vals.length; x++) {
            if(vals[x].compareTo(v)>0) {
                v = vals[x];
            }
        }
        return v;
    }
}

public class GenericInterface {
    public static void main(String args[]) {
        Integer inums[] = {2, 4, 6, 8, 10};
        Character chs[] = {'r', 'a', 'n', 'i'};
        MyClass<Integer>a = new MyClass<Integer>(inums);
        MyClass<Character>b = new MyClass<Character>(chs);
        System.out.println(a.min());
        System.out.println(b.min());
    }
}










/*
import java.util.Arrays;

class person implements Comparable<person> {
    private String fName;
    private String lName;
    
    public person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }
    
    public String toString() {
        return fName + " " + lName;
    }
    
    public int compareTo(person Person) {
        int result = lName.compareTo(Person.lName);        
       return result == 0 ? fName.compareTo(((person) Person).fName) : result;
    }
}
    
    public class GenericInterface{
       public static void main(String[] args) {  
           person[] members = {
               new person ("R", "I"),
               new person ("D", "E"),
               new person ("A", "S")          
           } ;
           
           Arrays.sort(members);
          
           
           System.out.println("\nOrder after sorting into ascending sequence");
           for(person member : members) {
               System.out.println(member);
           }
           
           person[] authors = {
               new person("A", "S"),
               new person("D", "E"),
               new person("R", "I")
           };
           
           int index = 0;
           System.out.println("\nIn search of members");
           
           for(person Person :  members) {
               index = Arrays.binarySearch(members, Person);
               if (index >= 0) {
                   System.out.println(Person + " was found at index position"+index);               
               } else {
                   System.out.println(Person + "was not found. Return value is "+index);
               }
           }
           
           
        }
    }
*/