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
class FinallyDemo {

    static void myMethod(int n) throws Exception {
        try {
            switch (n) {
                case 1:
                    System.out.println("case pertama");
                    return;
                case 3:
                    System.out.println("case ketiga");
                    throw new RuntimeException("demo case ketiga");
                case 4:
                    System.out.println("case keempat");
                    throw new Exception("demo case keempat");
                case 2:
                    System.out.println("case Kedua");
            }
        } catch (RuntimeException e) {
            System.out.print("RuntimeException terjadi: ");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("try-block entered.");
        }
    }
}

public class percobaan5 {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            try {
                FinallyDemo.myMethod(i);
            } catch (Exception e) {
                System.out.print("Exception terjadi: ");
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }

}
