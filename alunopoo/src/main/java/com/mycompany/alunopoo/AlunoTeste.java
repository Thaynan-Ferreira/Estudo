/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alunopoo;

/**
 *
 * @author univicosa
 */
public class AlunoTeste {
    public static void main(String[] args) {
        
        //instanciando o objeto
        AlunoPoo aluno1 = new AlunoPoo();
        
        //declarando valores aos atributos
        aluno1.nome = "Thaynan Ferreira";
        aluno1.idade = 24;
        aluno1.curso = "Engenharia de Computaçao";
        
        //chamando os metodos
        aluno1.assistirAula(aluno1.nome);
        //aluno1.fazerProva();
        //aluno1.calcularNota();
    }
    
}
