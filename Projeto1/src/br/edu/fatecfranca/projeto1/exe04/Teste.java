/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.projeto1.exe04;

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
        
        Rio obj1 = new Rio();
        obj1.nome = "Amazonas";
        obj1.nivel = 1.45;
        obj1.poluido = false;
        obj1.chover(0.3);
        obj1.sujar();
        obj1.mostra();
        
        Rio obj2 = new Rio("Parana", 1.21, false);
        obj2.ensolarar(0.19);
        obj2.limpar();
        obj2.mostra();
        
        Rio obj3 = new Rio ("Tietê", 0.78, true);
        obj3.chover(0.21);
        obj3.limpar();   
        obj3.mostra();
    } 
}
