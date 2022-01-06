/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomortiga;

/**
 *
 * @author Asus
 */
public class tiga {
    public static void main(String[] args) {
        String[] s = {"abc", "123", "xyz", "456"};
        try{
            for (int i = 0; i < s.length; i++){
             int intValue = Integer.parseInt(s[i]);
           }
        }catch(NumberFormatException ex){
              System.out.println(ex + " Incorrect Format");
        }
    } 
}
