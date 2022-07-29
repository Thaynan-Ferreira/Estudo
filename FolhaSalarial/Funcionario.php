<?php
class Funcionario{
    
    //declaração dos atributos que todo funcionario terá
    protected $nome;
    protected $idade;
    protected $totalVendas;

    
    function getNome(){
        return $this -> nome;
    }

    function setNome(){
        $this -> nome = $nome;
    }

    function getIdade(){
        return $this -> idade;
    }

    function setIdade(){
        $this -> idade = $idade;
    }

    function getTotalVendas(){
        return $this -> totalVendas;
    }

    function setTotalVendas(){
        $this -> totalVendas = $totalVendas;
    }

}