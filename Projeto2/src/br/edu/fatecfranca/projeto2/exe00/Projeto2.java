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
public class Projeto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto prod1 = new Produto();
        prod1.setNome("microfone");
        prod1.setQtde(3);
        prod1.setPreco(94.21);
        prod1.mostrar();
        System.out.println("Nome: " + prod1.getNome());
        System.out.println("Qtde: " + prod1.getQtde());
        System.out.println("Preco: " + prod1.getPreco());
        prod1.mostrar();
    }
    
}
