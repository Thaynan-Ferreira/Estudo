<?php
require_once 'Funcionario.php';
class Estagiario extends Funcionario{

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
        $this -> salario = $salario; //SLARIO DO ESTAGIARIO Q É MEIO SALARIO
        $this -> vendas = $vendas; //QUANTO O ESTAGIARIO VENDEU NO MES
        $this -> totalVendas = $totalVendas; //QUANTO A LOJA VENDEU AO TODO NO MES
    }

    public function valorSalario(){
        return $this -> salario/2;
    }

    //FUNÇÃO QUE RETORNA O CARGO QUE O FUNCIONARIO EXERCE
    public function cargo(){
        return "Estagiario";
    }

}

