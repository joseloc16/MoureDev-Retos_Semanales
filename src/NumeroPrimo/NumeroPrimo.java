/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumeroPrimo;

/**
 *
 * @author joseloc12
 */
public class NumeroPrimo {

    public static void main(String[] args) {
        int cant = 1;
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.printf("P%s: %s\n", cant, i);
                cant++;
            }
        }

    }

    public static boolean esPrimo(int numero) {
        boolean rpta = true;
        if (numero == 1) {
            rpta = false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                rpta = false;
            }
        }
        return rpta;
    }
}
