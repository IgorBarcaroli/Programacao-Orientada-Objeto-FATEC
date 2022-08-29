/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.projeto2.exe02;

/**
 *
 * @author 1090482111027
 */
public final class Cliente {
    private int nroConta, nroAgencia;
    private String nome;
    private double saldo;
    
    public Cliente() {
        
    }
    public Cliente(int nroConta, int nroAgencia, String nome, double saldo) {
        this.setNroConta(nroConta);
        this.setNroAgencia(nroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    
    public void setNroConta(int nroConta) {
        this.nroConta = nroConta;
    }
    
    public void setNroAgencia(int nroAgencia) {
        this.nroAgencia = nroAgencia;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }
    
    public int getNroConta() {
        return this.nroConta;
    }
    
    public int getNroAgencia() {
        return this.nroAgencia;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void depositar(double x) {
        this.saldo += x;
        System.out.println("Valor depositado: "+ x);
    }
    public void sacar(double x) {
        if (x <= this.saldo) {
            this.saldo -= x;
            System.out.println("Valor sacado: "+ x);
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void extrato() {
        System.out.println("Saldo atual: "+saldo);
    }
}
