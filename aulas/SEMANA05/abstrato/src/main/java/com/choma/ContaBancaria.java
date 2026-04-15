package com.choma;

public abstract class ContaBancaria {
    
    private int id;
    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int p1, int p2, String titular){
        this.id = p1;
        this.numeroConta = p2;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getId() {
        return id;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirTitular(){
        System.out.println("O titular = "+titular);;
    }

    public void setSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }

    public abstract void sacar(double valor);

    public abstract void exibirTipoConta();
}
