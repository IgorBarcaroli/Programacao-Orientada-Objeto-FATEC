/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.projeto1.exe01;

/**
 *
 * @author 1090482111027
 */
public class Teste {

    public static void main(String[] args) {
        Aluno obj1 = new Aluno(456, "João", 23, 7, 5);
        System.out.println(obj1.notaFinal());
        System.out.println(obj1.dadosAluno());
        obj1.passou();
        
    }
}
