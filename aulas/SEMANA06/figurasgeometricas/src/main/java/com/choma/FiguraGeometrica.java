package com.choma;

public abstract class FiguraGeometrica {
    private String nome;
    private int quatidadeLados;

    public FiguraGeometrica(String nome, int quatidade){
        this.nome = nome;
        this.quatidadeLados = quatidade;
    }

    public int getQuatidadeLados() {
        return quatidadeLados;
    }
    public void setQuatidadeLados(int quatidadeLados) {
        this.quatidadeLados = quatidadeLados;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();
}
