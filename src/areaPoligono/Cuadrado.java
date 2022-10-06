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
public class Cuadrado implements Poligono{
    private double lado;
    
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public Double calcularArea() {
        return lado * lado;
    }
}
