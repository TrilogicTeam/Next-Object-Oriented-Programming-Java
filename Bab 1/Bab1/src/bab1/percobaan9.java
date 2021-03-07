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
class HateStringException extends RuntimeException {
    /* Tidak perlu memasukkan member ataupun construktor */ 
}

public class percobaan9 {

    public static void main(String args[]) {
        String input = "invalid input";
        try {
            if (input.equals("invalid input")) {
                throw new HateStringException();
            }
            System.out.println("String accepted.");
        } catch (HateStringException e) {
            System.out.println("I hate this string: " + input + ".");
        }
    }

}
