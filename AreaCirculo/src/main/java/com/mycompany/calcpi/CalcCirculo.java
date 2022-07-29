/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calcpi;
import java.util.Scanner;

/**
 *
 * @author Thaynan
 */
public class CalcCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//inicia o Scanner
        
        double raio, area; //DECLARAÇAO DA VARIAVEL
        
        System.out.println("Digite o raio do Circulo: ");
        raio = entrada.nextDouble();
        
        area  = 3.14 * (raio * raio);
        
        System.out.println("A area d circulo com raio = " + raio + "e  = " + area);
    }
    
}
