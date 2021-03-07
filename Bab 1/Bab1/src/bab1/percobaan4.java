/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab1;

import static bab1.NestedTryDemo2.nestedTry;

/**
 *
 * @author Ali
 */
class NestedTryDemo2 { 
   static void nestedTry(String args[]) {
     try { 
     int a = Integer.parseInt(args[0]); 
            int b = Integer.parseInt(args[1]);
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error!");
        }
    }
}

public class percobaan4 {

    public static void main(String args[]) {
        try {
            nestedTry(args);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2 parameters are required!");
        }
    }
} 

