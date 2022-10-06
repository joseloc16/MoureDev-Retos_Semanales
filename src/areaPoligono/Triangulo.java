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
public class Triangulo implements Poligono{
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }
    
    @Override
    public Double calcularArea() {
        return (base * altura) / 2;
    }
}
