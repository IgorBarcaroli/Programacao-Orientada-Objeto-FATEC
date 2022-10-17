/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto5.exe1;

/**
 *
 * @author 1090482111027
 */
public class Pessoa extends Animal implements iCidadao, iContribuinte, iProfessor {

    @Override
    public void vota() {
        System.out.println("Pessoa votando...");
    }

    @Override
    public void obterRG() {
        System.out.println("Pessoa tirando RG...");
    }

    @Override
    public void pagarImpostoDeRenda() {
        System.out.println("Pessoa pagando Imposto de Renda...");
    }

    @Override
    public void obterCPF() {
        System.out.println("Pessoa obtendo CPF...");
    }

    @Override
    public void ensina() {
        System.out.println("Pessoa ensinando...");
    }

    @Override
    public void trabalha() {
        System.out.println("Pessoa trabalhando...");
    }
}
