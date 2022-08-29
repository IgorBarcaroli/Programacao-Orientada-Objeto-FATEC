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
public final class Aluno {
    private int nroAluno;
    private int idade;
    private String nome;
    private double n1, n2;
    // Método Construtor
    
    public Aluno (){ // Sem parâmetros
        
    }
    
    public Aluno(int nroAluno, String nome, int idade, double n1, double n2) { // Com parâmetros
        this.setNroAluno(nroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setN1(n1);
        this.setN2(n2);
    }
    
    public void setNroAluno(int nroAluno) {
        this.nroAluno = nroAluno;
    }    
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setN1(double n1) {
        this.n1 = n1;
    }
    
    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    public int getNroAluno() {
        return this.nroAluno;
    }
    
    public String getNome() {
        return this.nome;
    }
 
    public int getIdade() {
        return this.idade;
    }
    
    public double getN1() {
        return this.n1;
    }
    
    public double getN2() {
        return this.n2;
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
