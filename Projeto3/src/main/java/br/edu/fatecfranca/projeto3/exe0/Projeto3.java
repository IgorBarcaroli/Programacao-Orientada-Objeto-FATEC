/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.projeto3.exe0;
import java.util.Date;

public class Projeto3 {

    public static void main(String[] args) {
        Aluno objAluno = new Aluno(123456 , "João" );
        Disciplina objDisciplina = new Disciplina(12,"POO");
        Cursa obj = new Cursa(100, new Date(), objAluno, objDisciplina);
        System.out.println(obj.toString());
    }
}
