/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estoque_motos;

/**
 *
 * @author Thaynan Ferreira
 */


/**
 * Class city
 */
public class city extends motocicleta{

  //
  // Fields
  //

  private String modelo;
  private String cor;
  private String preco;
  
  //
  // Constructors
  //
  public city () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  
  public void setModelo (String modelo) {
    this.modelo = modelo;
  }

  /**
   * Get the value of modelo
   * @return the value of modelo
   */
  public String getModelo () {
    return modelo;
  }

  
  public void setCor (String cor) {
    this.cor = cor;
  }

  /**
   * Get the value of cor
   * @return the value of cor
   */
  public String getCor () {
    return cor;
  }

  
  public void setPreco (String preco) {
    this.preco = preco;
  }

  /**
   * Get the value of preco
   * @return the value of preco
   */
  public String getPreco () {
    return preco;
  }

  //
  // Other methods
  //

    
}
