/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouredev.fibonacci;

/**
 *
 * @author joseloc12
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fibonacci(50);
    }

    public static void fibonacci(int total) {
        int contador = 0;
        int numAnterior = 0;
        int numActual = 1;
        int temp;

        while (contador < total) {
            if (contador == 0 || contador == 1) {
                System.out.printf("F%s -> %s\n",contador, contador);
                contador++;
            } else {
                //numAnterior = numActual;
                temp = numAnterior;
                numAnterior = numActual;
                numActual += temp;
                System.out.printf("F%s -> %s\n",contador, numActual);
                //System.out.println(numActual);
                contador++;
            }
        }
    }
}
