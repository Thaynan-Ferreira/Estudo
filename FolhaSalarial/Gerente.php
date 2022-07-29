<?php
require_once 'Funcionario.php';
class Gerente extends Funcionario{

    protected $salario;
    protected $vendas;

    function getSalario(){
        return $this -> salario;
    }

    function setSalario(){
        $this -> salario = $salario;
    }

    function getVendas(){
        return $this -> vendas;
    }

    function setVendas(){
        $this -> vendas = $vendas;
    }

    //CONSTRUCT QUE IMPLEMENTA OS ATRIBUTOS DO OBJETO
    public function __construct($nome, $idade, $salario, $vendas, $totalVendas){
        $this -> nome = $nome; //NOME DO FUNCIONARIO
        $this -> idade = $idade; //IDADE DO FUNCIONARIO
        $this -> salario = $salario; //SALARIO DO GERENTE QUE É SEU SALARIO MAIS 1.5% DE TUDO QUE A LOJA VENDE NO MES
        $this -> vendas = $vendas; //TOTAL DE VENDAS DO GERENTE
        $this -> totalVendas = $totalVendas; //QUANTO A LOJA VENDEU AO TODO NO MES
    }

    public function valorSalario(){
        return $this -> salario + ($this -> totalVendas * 0.015);

    }

    //FUNÇÃO QUE RETORNA O CARGO QUE O FUNCIONARIO EXERCE
    public function cargo(){
        return "Gerente";
    }

}