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
public class Rectangulo implements Poligono{
    private double largo;
    private double ancho;
    
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public Double calcularArea() {
        return largo * ancho;
    }
}
