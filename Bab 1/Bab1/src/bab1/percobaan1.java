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
public class percobaan1 {
     public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println(3 / 0);
            System.out.println("cetak.");
        } catch (ArithmeticException exc) {
            System.out.println(exc);
        }
        System.out.println("setelah exception.");
    }
}
