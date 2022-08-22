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
public class Aluno {
    public int nroAluno;
    public int idade;
    public String nome;
    public double n1, n2;
    // Método Construtor
    
    public Aluno (){ // Sem parâmetros
        
    }
    
    public Aluno(int nroAluno, String nome, int idade, double n1, double n2) { // Com parâmetros
        this.nroAluno = nroAluno;
        this.nome = nome;
        this.idade = idade;
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public double notaFinal() {
        return (this.n1 + this.n2)/2;  
        
    }
    public String dadosAluno() {
        return "Número do Aluno: "+this.nroAluno+"Nome: "+this.nome+"Idade: "+this.idade+"Nota final: "+this.notaFinal();
    }
    
    public void passou() {
        if (this.notaFinal() >= 6.0) {
            System.out.println("Aluno foi aprovado.");
        }
        else {
            System.out.println("Aluno não foi aprovado.");        
        }
    }
}    
