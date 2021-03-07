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
public class percobaan8 {

    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e);
        } 
        System.out.println("After try-catch-catch.");
    }

}
