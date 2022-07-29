/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ordedmeservico;

import java.util.Scanner; //chama a biblioteca para receber entrada de dados do usuario

/**
 *
 * @author Thaynan Ferreira
 */
public class OrdemDeServico {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //VARIAVEIS PARA RECEBER AS INFORMAÇÕES DO CLIENTE
        String nome;
        String CPF;
        String telefone;
        String placa;
        String chassi;
        String modelo;
        String ano;
        String solicitacao;
        
        cliente client = new cliente(); //criação do construtor de cliente
        
        motocicleta moto = new motocicleta(); //criação do construtor da motocicleta
        
        //RECEBE O CPF DO CLIENTE
        System.out.println("Digite o CPF do Cliente: ");
        CPF = entrada.nextLine();
        client.setCPF(CPF); 
        
        //RECEBE O NOME DO CLIENTE
        System.out.println("Digite o nome do Cliente: ");
        nome = entrada.nextLine();
        client.setNome(nome);
        
        //RECEBE O TELEFONE DE CONTATO DO CLIENTE
        System.out.println("Digite o telefone do Cliente: ");
        telefone = entrada.nextLine();
        client.setTelefone(telefone);
        
        //RECEBE A PLACA DA MOTOCICLETA
        System.out.println("Digite a placa da motocicleta: ");
        placa = entrada.nextLine();
        moto.setPlaca(placa);
        
        //RECEBE O CHASSI DA MOTOCICLETA
        System.out.println("Digite o chassi da motocicleta: ");
        chassi = entrada.nextLine();
        moto.setChassi(chassi);
        
        //RECEBE O MODELO DA MOTOCICLETA
        System.out.println("Digite o modelo da motocicleta: ");
        modelo = entrada.nextLine();
        moto.setModelo(modelo);
        
        //RECEBE O ANO DA MOTOCICLETA
        System.out.println("Digite o ano da motocicleta: ");
        ano = entrada.nextLine();
        moto.setAno(ano);
        
        //ENTRADA DE QUAL SAERVIÇO DEVERAR SER FEITO NA MOTOCICLETA
        System.out.println("Digite a solicitação do cliente: ");
        solicitacao = entrada.nextLine();
        
        //CHAMADA DOS METODOS PARA QUE OS RESULTADOS SEJAM ESCRITOS NA TELA
        client.dadosCliente();
        moto.dadosMotocicleta();
       
        System.out.println("ERVIÇO SOLICITADO");
        System.out.println("---------------------------");
        System.out.println(solicitacao);
    }
    
}
