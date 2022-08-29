/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.projeto1.exe00;

/**
 *
 * @author 1090482111027
 */
public class Produto {
    public int qtde;
    public double preco;
    public String nome;
    
    public Produto() {
    
    }
    
    public Produto(String nome, int qtde, double preco) {
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco; 
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
               " Qtde " + this.qtde + " Preço " + this.preco);
    }
}