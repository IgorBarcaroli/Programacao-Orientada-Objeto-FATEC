/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.projeto3.exe1;

import java.util.Date;

/**
 *
 * @author 1090482111027
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Passageiro objPassageiro = new Passageiro(152,"João","Franca-SP",866);
        Voo objVoo = new Voo(266,"Franca-SP", "Curitiba-PR");
        Reserva obj1 = new Reserva(866,new Date(),objPassageiro, objVoo);
        
        System.out.println(obj1.toString());
    }
    
}
