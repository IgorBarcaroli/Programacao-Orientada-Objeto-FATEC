/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.projeto5.exe1;

/**
 *
 * @author 1090482111027
 */
public class TestaPessoaCidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cidade franca = new Cidade();
        Pessoa rodrigo = new Pessoa();
        franca.contrata(rodrigo);
        // conversão
        franca.contrata((iEmpregado)rodrigo);
        franca.cobraDe(rodrigo);
        franca.registra(rodrigo);
        franca.alimenta(rodrigo);
    }
}
