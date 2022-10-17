/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto5.exe1;

/**
 *
 * @author 1090482111027
 */
public class Cidade {
    
    public void contrata(iProfessor p){
        p.ensina();
        p.trabalha();
    }

    public void contrata(iEmpregado e){
        e.trabalha();
    }

    public void cobraDe(iContribuinte c) {
        c.pagarImpostoDeRenda();
    }

    public void registra(iCidadao c) {
        c.obterRG();
    }

    public void alimenta(Animal a ){
        a.come();
    }
    
}
