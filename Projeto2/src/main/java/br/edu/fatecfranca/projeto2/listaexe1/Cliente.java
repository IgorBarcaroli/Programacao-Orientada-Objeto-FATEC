/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto2.listaexe1;

/**
 *
 * @author 1090482111027
 */
public final class Cliente {
    private String nroConta;
    private String nroAgencia;
    private String nome;
    private double saldo;
    
    public Cliente(){

    }
    public Cliente(String nroConta, String nroAgencia,String nome,double saldo){
        this.setNroConta(nroConta);
        this.setNroAgencia(nroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    
    public void setNroConta(String nroConta) {
        if (nroConta.length() != 8){
            System.out.println("Tamanho inválido");
        }
        else {
            if (nroConta.charAt(6) == '-') {
                this.nroConta = nroConta;
            }
        }
    }
    public void setNroAgencia(String nroAgencia) {
        if (nroAgencia.length() != 6){
            System.out.println("Tamanho inválido");
        }
        else {
            if (nroAgencia.charAt(4) == '-') {
                this.nroAgencia = nroAgencia;
            }
        }
    }
    public void setNome(String nome) {
        if (nome.length() > 30){
            System.out.println("Tamanho inválido");
        }
        else {
            this.nome = nome;
        }
    }
    public void setSaldo(double saldo) {
        if (this.saldo >=0) {
            this.saldo = saldo;
        }
        else {
            System.out.println("Saldo não pode ficar negativo.");
        }
    }
    public String getNroConta() {
        return nroConta;
    }
    public String getNroAgencia() {
        return nroAgencia;
    }
    public String getNome() {
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }
    
    public void realizarDeposito(double x) {
        this.setSaldo(this.saldo + x);
    }
    
    public void realizarSaque(double x) {
        this.setSaldo(this.saldo - x);
    }
    
    public void mostrar() {
        System.out.println("Dados da conta:\n Nome:" + nome + "\nConta: " + nroConta + "\nAgencia: " + nroAgencia + "\nSaldo: " + saldo+"\n");
    }
}