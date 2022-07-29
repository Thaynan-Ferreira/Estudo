/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estoque_motos;

import java.util.Scanner; //chama a biblioteca para receber entrada de dados do usuario

/**
 *
 * @author Thaynan Ferreira
 */
public class cadastroDeMotocicleta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //VARIAVEIS PARA RECEBER AS INFORMAÇOES PARA CADASTRO DA MOTOCICLETA
        String chassi;
        String ano;
        String modelo;
        String cor;
        String preco;
        
        int categoria; //INICIA A VARIAVEL PARA RECEBER A CATEGORIA DESEJADA
        
        //INSTACIA OS OBJETOS CHAMANDO SUAS RESPECTIVAS CLASSES
        city moto1 = new city();
        trail moto2 = new trail();
        custom moto3 = new custom();
        
        //CABEÇALHO INICIAL DANDO AS OPÇÕES DE CATEGORIAS
        System.out.println("Escolha a categoria da motocicleta:\n ");
        System.out.println("--------------------------------------");
        System.out.println("(1) CITY \n (2) TRAIL \n (3) CUSTOM");
        System.out.println("Escolha uma das opções: ");
        categoria = entrada.nextInt();
        
        //SWITCH CASE QUE SEPARA O QUE É FEITO EM CADA UMA DAS OPÇÕES DISPONIVEIS
        switch (categoria){
            //CITY
            case 1 :
                
                System.out.println("Digite o chassi da motocicleta: ");
                chassi = entrada.next();
                moto1.setChassi(chassi);
                
                System.out.println("Digite o Ano da motocicleta: ");
                ano = entrada.next();
                moto1.setAno(ano);
                
                entrada.nextLine(); //ESVAZIA O BUFFER PARA RECEBER UM TIPO DIFERENTE DE ENTRADA
                System.out.println("Digite o modelo da motocicleta: ");
                modelo = entrada.nextLine();
                moto1.setModelo(modelo);
                
                System.out.println("Digite o cor da motocicleta: ");
                cor = entrada.next();
                moto1.setCor(cor);
                
                System.out.println("Digite o preco da motocicleta: ");
                preco = entrada.next();
                moto1.setPreco(preco);
                
                //impressao dos dados
                System.out.println("-----------------------------------");
                System.out.println("CATEGORIA City:");
                System.out.println("Motocicleta: " + moto1.getModelo());
                System.out.println("Cor: " + moto1.getCor());
                System.out.println("Valor: R$" + moto1.getPreco() + ",00");
                System.out.println("EM ESTOQUE");
                break;
        
            //TRAIL
            case 2 :
                
                System.out.println("Digite o chassi da motocicleta: ");
                chassi = entrada.next();
                moto2.setChassi(chassi);
                
                System.out.println("Digite o Ano da motocicleta: ");
                ano = entrada.next();
                moto2.setAno(ano);
                
                entrada.nextLine(); //ESVAZIA O BUFFER PARA RECEBER UM TIPO DIFERENTE DE ENTRADA
                System.out.println("Digite o modelo da motocicleta: ");
                modelo = entrada.nextLine();
                moto2.setModelo(modelo);
                
                System.out.println("Digite o cor da motocicleta: ");
                cor = entrada.next();
                moto2.setCor(cor);
                
                System.out.println("Digite o preco da motocicleta: ");
                preco = entrada.next();
                moto2.setPreco(preco);
                
                //impressao dos dados
                System.out.println("-----------------------------------");
                System.out.println("CATEGORIA Trail:");
                System.out.println("Motocicleta: " + moto2.getModelo());
                System.out.println("Cor: " + moto2.getCor());
                System.out.println("Valor: R$" + moto2.getPreco() + ",00");
                System.out.println("EM ESTOQUE");
                break;
                
                //CUSTOM
                case 3 :
                
                System.out.println("Digite o chassi da motocicleta: ");
                chassi = entrada.next();
                moto3.setChassi(chassi);
                
                System.out.println("Digite o Ano da motocicleta: ");
                ano = entrada.next();
                moto3.setAno(ano);
                
                entrada.nextLine(); //ESVAZIA O BUFFER PARA RECEBER UM TIPO DIFERENTE DE ENTRADA
                System.out.println("Digite o modelo da motocicleta: ");
                modelo = entrada.nextLine();
                moto3.setModelo(modelo);
                
                System.out.println("Digite o cor da motocicleta: ");
                cor = entrada.next();
                moto3.setCor(cor);
                
                System.out.println("Digite o preco da motocicleta: ");
                preco = entrada.next();
                moto3.setPreco(preco);
                
                //impressao dos dados
                System.out.println("-----------------------------------");
                System.out.println("CATEGORIA Custom:");
                System.out.println("Motocicleta: " + moto3.getModelo());
                System.out.println("Cor: " + moto3.getCor());
                System.out.println("Valor: R$" + moto3.getPreco() + ",00");
                System.out.println("EM ESTOQUE");
                break;
                
                default:
                    System.out.println("O valor digitado não corresponde com nenhuma opção");
        }
        
        
    }
    
}
