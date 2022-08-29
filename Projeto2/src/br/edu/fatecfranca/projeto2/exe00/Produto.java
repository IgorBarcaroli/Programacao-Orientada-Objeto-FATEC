/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.projeto2.exe00;

/**
 *
 * @author 1090482111027
 */
public final class Produto {
    private int qtde;
    private double preco;
    private String nome;
    
    public Produto() {
    
    }
    
    public Produto(String nome, int qtde, double preco) {
        this.setNome(nome);
        this.setQtde(qtde);
        this.setPreco(preco); 
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setQtde(int qtde) {
        if (this.qtde >=0) {
            this.qtde = qtde;
        }
        else {
            System.out.println("Qtde não pode ser negativa.");
        }
    }
    
    public void setPreco(double preco) {
        if (this.preco >= 0) {
            this.preco = preco;
        }
        else {
            System.out.println("Preco não pode ser negativo.");
        }
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getQtde() {
        return this.qtde;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void comprar (int x) {
        this.qtde += x;
    }
    
    public void vender (int x) {
        if( x <= this.qtde) {
            this.qtde -= x;
        }
    }
    
    public void subir (int x) {
        this.preco += x;
    }
    // desce o preço de um produto em x unidades
    public void descer(double x){
        if (x <= this.preco){
            this.preco -= x;
        }
    }
    public void mostrar(){
        System.out.println("Dados \nNome: " + this.nome +
               "\nQtde " + this.qtde + "\nPreço\n" + this.preco);
    }
}