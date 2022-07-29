/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abonosalarial;

/**
 *
 * @author: Thaynan Ferreira
 */


/**
 * Class Funcionario
 */
public class Funcionario {

  //
  // Fields
  //

  /**
   * Recebe o nome do Funcionario
   */
  private String nome;
  /**
   * Recebe o salario anual  
   */
  private float salario;
  
  //
  // Constructors
  //
  public Funcionario () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nome
   * Recebe o nome do Funcionario
   * @param newVar the new value of nome
   */
  public void setNome (String newVar) {
    nome = newVar;
  }

  /**
   * Get the value of nome
   * Recebe o nome do Funcionario
   * @return the value of nome
   */
  public String getNome () {
    return nome;
  }

  /**
   * Set the value of salario
   * Recebe o salario anual
   * @param newVar the new value of salario
   */
  public void setSalario (float newVar) {
    salario = newVar;
  }

  /**
   * Get the value of salario
   * Recebe o salario anual
   * @return the value of salario
   */
  public float getSalario () {
    return salario;
  }

  //
  // Other methods
  //

  /**
   * Vai calcular o valor do abono recebido no final do ano.
   */
  public void abono()
  {
  }


}