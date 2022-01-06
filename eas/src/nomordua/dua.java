/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomordua;

/**
 *
 * @author Asus
 */
public class dua {
    class Bentuk { }
class Lingkaran extends Bentuk { }
class Persegi extends Bentuk { }
 
    class Node<T> {
       Node<Lingkaran> nLinkaran = new Node<>();
       Node<Lingkaran> nBentuk = nLinkaran;
    
   }
}
