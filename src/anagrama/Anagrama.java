/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrama;

import java.util.Scanner;

/**
 *
 * @author joseloc12
 */
public class Anagrama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos palabras");
        String palabra1 = sc.nextLine();
        String palabra2 = sc.nextLine();

        String rpta = esAnagrama(palabra1, palabra2) 
                ? "Es un anagrama" : "No es un anagrama";
        System.out.println(rpta);
    }

    public static boolean esAnagrama(String palabra1, String palabra2) {
        boolean result = false;
        int coincidencias = 0;

        if (!(palabra1.equals(palabra2)) && (palabra1.length() == palabra2.length())) {
            char[] aCaracteres1 = palabra1.toCharArray();
            char[] aCaracteres2 = palabra2.toCharArray();

            for (int i = 0; i < palabra1.length(); i++) {
                for (int j = 0; j < palabra2.length(); j++) {
                    if (aCaracteres1[i] == aCaracteres2[j]) {
                        coincidencias++;
                        break;
                    }
                }
            }

            if (coincidencias == palabra1.length()) {
                result = true;
            }
        }

        return result;
    }

}
