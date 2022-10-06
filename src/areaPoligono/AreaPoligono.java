/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaPoligono;

/**
 *
 * @author joseloc12
 */
public class AreaPoligono {

    public static void main(String[] args) {
        /*
         * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz 
           de calcular y retornar el área de un polígono.
         * - La función recibirá por parámetro sólo UN polígono a la vez.
         * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
         * - Imprime el cálculo del área de un polígono de cada tipo.
         */
        
        Triangulo triangulo = new Triangulo(10, 60);
        Cuadrado cuadrado = new Cuadrado(20);
        Rectangulo rectangulo = new Rectangulo(25, 20);
        
        Double areaT = areaPoligono(triangulo);
        Double areaC = areaPoligono(cuadrado);
        Double areaR = areaPoligono(rectangulo);
        
        System.out.printf("Area del triangulo -> %s\n", areaT);
        System.out.printf("Area del cuadrado -> %s\n", areaC);
        System.out.printf("Area del rectangulo -> %s\n", areaR);
    }
    
    public static Double areaPoligono(Poligono poligono) {
        return poligono.calcularArea();
    }
}
