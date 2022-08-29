/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.projeto2.exe01;

/**
 *
 * @author 1090482111027
 */
public class Teste {

    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        obj1.setNroAluno(456);
        obj1.setNome("João");
        obj1.setIdade(23);
        obj1.setN1(7);
        obj1.setN2(5);
        System.out.println(obj1.notaFinal());
        System.out.println(obj1.dadosAluno());
        obj1.passou();
        
    }
}
