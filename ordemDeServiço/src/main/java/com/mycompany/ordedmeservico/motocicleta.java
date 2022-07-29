/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ordedmeservico;


/**
 * Class motocicleta
 */
public class motocicleta {

  //
  // Fields
  //

  /**
   * Atributo para receber a placa da motocicleta
   */
  public String placa;
  /**
   * Atributo para receber o chassi da motocicleta
   */
  public String chassi;
  /**
   * Atributo para receber o modelo da motocicleta
   */
  public String modelo;
  /**
   * Atributo para receber o ano da motocicleta
   */
  public String ano;
  
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

  /**
   * Set the value of placa
   * Atributo para receber a placa da motocicleta
   * @param newVar the new value of placa
   */
  public void setPlaca (String placa) {
    this.placa = placa;
  }

  /**
   * Get the value of placa
   * Atributo para receber a placa da motocicleta
   * @return the value of placa
   */
  public String getPlaca () {
    return placa;
  }

  /**
   * Set the value of chassi
   * Atributo para receber o chassi da motocicleta
   * @param newVar the new value of chassi
   */
  public void setChassi (String chassi) {
    this.chassi = chassi;
  }

  /**
   * Get the value of chassi
   * Atributo para receber o chassi da motocicleta
   * @return the value of chassi
   */
  public String getChassi () {
    return chassi;
  }

  /**
   * Set the value of modelo
   * Atributo para receber o modelo da motocicleta
   * @param newVar the new value of modelo
   */
  public void setModelo (String modelo) {
    this.modelo = modelo;
  }

  /**
   * Get the value of modelo
   * Atributo para receber o modelo da motocicleta
   * @return the value of modelo
   */
  public String getModelo () {
    return modelo;
  }

  /**
   * Set the value of ano
   * Atributo para receber o ano da motocicleta
   * @param newVar the new value of ano
   */
  public void setAno (String ano) {
    this.ano = ano;
  }

  /**
   * Get the value of ano
   * Atributo para receber o ano da motocicleta
   * @return the value of ano
   */
  public String getAno () {
    return ano;
  }

  public void dadosMotocicleta(){
      System.out.println("Modelo da motocicleta: " + modelo);
      System.out.println("Ano de fabricação: " + ano);
      System.out.println("Chassi: " + chassi);
      System.out.println("Placa: " + placa);
  }

}
