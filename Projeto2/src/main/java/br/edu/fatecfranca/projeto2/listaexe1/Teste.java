/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.projeto2.listaexe1;

/**
 *
 * @author 1090482111027
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente obj1 = new Cliente();
        obj1.setNome("José Oliveira");
        obj1.setNroConta("144057-8");
        obj1.setNroAgencia("1447-5");
        obj1.setSaldo(500);
        obj1.mostrar();
        
        obj1.realizarDeposito(300);
        obj1.realizarSaque(100);
        obj1.mostrar();
    }
    
}
