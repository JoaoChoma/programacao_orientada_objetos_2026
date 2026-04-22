package com.choma;

public class Quadrado extends FiguraGeometrica{
    private double lado;

    public Quadrado(double lado) {
        super("Quadrado", 4);
        //TODO Auto-generated constructor stub
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return lado*lado;
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
