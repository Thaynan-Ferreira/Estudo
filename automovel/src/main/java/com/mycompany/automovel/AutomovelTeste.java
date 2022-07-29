/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.automovel;

/**
 *
 * @author Thaynan Ferreira
 */
public class AutomovelTeste {
    public static void main(String[] args) {
        
        //iniciando o objeto
        Automovel a1 = new Automovel();
        
        //passando parametros para o objeto
        a1.cor = "Preto";
        a1.marca = "Honda";
        a1.modelo = "Civic";
        
        //chamando os metodos
        System.out.println("Modelo: " + a1.modelo);
        System.out.println("Marca: " + a1.marca);
        System.out.println("Cor: " + a1.cor);
        System.out.println("--------------------");
        
        a1.ligar();
        a1.andar();
        a1.parar();
        
        
    }
    
}
