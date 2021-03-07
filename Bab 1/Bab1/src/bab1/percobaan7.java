/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab1;

/**
 *
 * @author Ali
 */
class ThrowingClass { 
     static void myMethod() throws ClassNotFoundException { 
     throw new ClassNotFoundException ("just a demo"); 
     } 
} 


public class percobaan7 {

    public static void main(String[] args) {
        try { 
        ThrowingClass.myMethod(); 
        } catch (ClassNotFoundException e) { 
        System.out.println(e); 
        } 
      }

}
