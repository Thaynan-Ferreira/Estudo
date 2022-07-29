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
 * Class motocicleta
 */
public class motocicleta {

  //
  // Fields
  //

  private String chassi;
  private String ano;
  
  //
  // Constructors
  //
  public motocicleta () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  
  public void setChassi (String chassi) {
    this.chassi = chassi;
  }

  /**
   * Get the value of chassi
   * @return the value of chassi
   */
  public String getChassi () {
    return chassi;
  }

  
  public void setAno (String ano) {
    this.ano = ano;
  }

  /**
   * Get the value of ano
   * @return the value of ano
   */
  public String getAno () {
    return ano;
  }
}
