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
public class Projeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!");
        
        // Criaremos um objeto da classe Produto --> INSTÂNCIA DE CLASSE
        Produto obj1 = new Produto();
        obj1.nome = "Liquidificador";
        obj1.qtde = 3;
        obj1.preco = 348;
        System.out.println("Nome: " + obj1.nome + " Qtde: " + obj1.qtde + " Preço: " + obj1.preco);
        
        // Instanciar mais um objeto como exercício
        Produto teste = new Produto();
        teste.nome = "Lucas";
        teste.qtde = 1;
        teste.preco = 20;
        System.out.println("Nome: " + teste.nome + " Qtde: " + teste.qtde + " Preço: " + teste.preco);
    }
    
}