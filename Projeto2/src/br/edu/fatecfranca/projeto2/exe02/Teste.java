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
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente obj1 = new Cliente(234,12,"José", 3000);
        //System.out.println('Nro. Conta: \n'+obj1.nroConta+'Nro. Agencia: \n'+obj1.nroAgencia+'Nome: \n'+obj1.nome+'Saldo: \n'+obj1.saldo);
        obj1.depositar(2000);
        obj1.sacar(5000);
        obj1.extrato();
    }
    
}
