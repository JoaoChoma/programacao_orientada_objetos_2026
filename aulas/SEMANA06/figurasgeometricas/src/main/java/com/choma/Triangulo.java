package com.choma;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super("Triangulo", 3);
        //TODO Auto-generated constructor stub
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return base*altura;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
