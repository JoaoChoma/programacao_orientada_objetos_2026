package com.choma;

public class ContaCorrente extends ContaBancaria{

    private double limiteConta;
    public ContaCorrente(int id, int numeroConta, String titular, double limiteConta) {
        super(id, numeroConta, titular);
        this.limiteConta = limiteConta;
    }

    
    @Override
    public void exibirTitular(){
        System.out.println("oi");
    }


    @Override
    public void exibirTipoConta(){
        System.out.println("Conta corrente");
    }


    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub
        if(getSaldo()+limiteConta >= valor){
            setSaldo(getSaldo()-valor);
            System.out.println("Saque com sucesso.");
        }else{
            System.out.println("Saldo insuficiente.");
        }
        
    }
}

