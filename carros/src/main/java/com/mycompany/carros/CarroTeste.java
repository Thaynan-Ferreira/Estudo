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
public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        
        //atributo
        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.vel = 60;
        
        //metodos
        c1.acelerar(10);
        System.out.println(c1.vel);
    }
}
