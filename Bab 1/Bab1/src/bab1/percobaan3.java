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
public class percobaan3 {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int a = Integer.parseInt(args[0]);
            try {
                int b = Integer.parseInt(args[1]);
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("Divide by zero error!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2 parameters are required!");
        }

    }
}
