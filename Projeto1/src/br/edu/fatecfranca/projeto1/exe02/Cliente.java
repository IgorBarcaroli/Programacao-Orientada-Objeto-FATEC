/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.projeto1.exe02;

/**
 *
 * @author 1090482111027
 */
public class Cliente {
    public int nroConta, nroAgencia;
    public String nome;
    public double saldo;
    
    public Cliente() {
        
    }
    public Cliente(int nroConta, int nroAgencia, String nome, double saldo) {
        this.nroConta = nroConta;
        this.nroAgencia = nroAgencia;
        this.nome = nome;
        this.saldo = saldo;
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
