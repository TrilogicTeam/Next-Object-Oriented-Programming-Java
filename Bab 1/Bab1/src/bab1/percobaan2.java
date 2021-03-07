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
public class percobaan2 {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int den = Integer.parseInt(args[0]); //baris 4 
            System.out.println(3 / den); //baris 5 
        } catch (ArithmeticException exc) {
            System.out.println("Nilai Pembagi 0.");
        } catch (ArrayIndexOutOfBoundsException exc2) {
            System.out.println("Missing argument.");
        }
        System.out.println("After exception.");
    }
}
