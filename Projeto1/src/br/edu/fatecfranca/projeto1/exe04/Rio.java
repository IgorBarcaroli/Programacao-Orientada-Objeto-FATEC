/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto1.exe04;

/**
 *
 * @author 1090482111027
 */
public class Rio {
    public String nome;
    public double nivel;
    public boolean poluido;
    
    public Rio() {
        
    }
    
    public Rio(String nome, double nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    public void chover(double x) {
        this.nivel += x;
    }
    public void ensolarar(double x) {
        if (x <= this.nivel) {
            this.nivel -= x;
        }
        else {
            System.out.println("Não pode ser negativo.");
        }
    }
    public void limpar() {
        if (this.poluido) {
            this.poluido = false;
        }
        else {
            System.out.println("O rio já está limpo.");
        }
    }
    public void sujar() {
        if (this.poluido) {
            System.out.println("O rio já está poluído");
        }
        else {
            this.poluido = true;
        }
    }
    public void mostra() {
        System.out.println("Nome: " + this.nome + "\nNível: " + this.nivel + "\nPoluído: " + (this.poluido ? "Sim\n":"Não\n"));
    }
}
