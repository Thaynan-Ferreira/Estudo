/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carros;

/**
 *
 * @author univicosa
 */
public class Carro {
    //atributos
    String nome;
    String marca;
    int ano;
    int vel; //velocidade atual do carro
    
    //metodos
    void acelerar (int aceleracao){
        vel += aceleracao;
    }
    
    void businar(){
        System.out.println("BiBiBi");
    }
}
