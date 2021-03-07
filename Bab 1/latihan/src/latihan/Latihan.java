/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        boolean cek = false;
        do {
            try {
                System.out.print("Masukkan Bilangan Heksa: ");
                String hexain = input.nextLine();
                System.out.println("Heksadecimal " + hexain + " = "
                        + hexKeDecimal(hexain) + " di decimal.");
                cek = true;
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
        } while (!cek);
    }

    public static int hexKeDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexdecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexdecimal(char ch) throws NumberFormatException {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } /*
        ** cekk bilangan;
         */ else if (ch >= '0' && ch <= '9') {
            return ch - '0';
        } else {
            throw new NumberFormatException("Input Bukan Bilangan Hex, Masukkan kembali bilangan Hex");
        }
    }
}

