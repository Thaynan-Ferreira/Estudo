/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.automovel;



/**
 * Class automovel
 */
public class Automovel {

  //
  // Fields
  //

  public String cor;
  protected String marca;
  public String modelo;
  
  //
  // Constructors
  //
  public Automovel () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of cor
   * @param newVar the new value of cor
   */
  public void setCor (String newVar) {
    cor = newVar;
  }

  /**
   * Get the value of cor
   * @return the value of cor
   */
  public String getCor () {
    return cor;
  }

  /**
   * Set the value of marca
   * @param newVar the new value of marca
   */
  public void setMarca (String newVar) {
    marca = newVar;
  }

  /**
   * Get the value of marca
   * @return the value of marca
   */
  public String getMarca () {
    return marca;
  }

  /**
   * Set the value of modelo
   * @param newVar the new value of modelo
   */
  public void setModelo (String newVar) {
    modelo = newVar;
  }

  /**
   * Get the value of modelo
   * @return the value of modelo
   */
  public String getModelo () {
    return modelo;
  }

  //
  // Other methods
  //

  /**
   */
  protected void ligar()
  {
      System.out.println("O carro ligou!");
  }


  /**
   */
  protected void andar()
  {
      System.out.println("O carro esta andando");
  }


  /**
   */
  protected void parar()
  {
      System.out.println("O carro parou");
  }


}