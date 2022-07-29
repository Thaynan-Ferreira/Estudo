

/**
 * Class cliente
 */
public class cliente {

  //
  // Fields
  //

  /**
   * Atributo para receber os nomes dos clientes
   */
  public String nome;
  /**
   * Atributo Para receber o CPF do cliente 
   */
  public String CPF;
  /**
   * Atributo para receber o telefone de contado do cliente
   */
  public String telefone;
  
  //
  // Constructors
  //
  public cliente () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nome
   * Atributo para receber os nomes dos clientes
   * @param newVar the new value of nome
   */
  public void setNome (String newVar) {
    nome = newVar;
  }

  /**
   * Get the value of nome
   * Atributo para receber os nomes dos clientes
   * @return the value of nome
   */
  public String getNome () {
    return nome;
  }

  /**
   * Set the value of CPF
   * Atributo Para receber o CPF do cliente
   * @param newVar the new value of CPF
   */
  public void setCPF (String newVar) {
    CPF = newVar;
  }

  /**
   * Get the value of CPF
   * Atributo Para receber o CPF do cliente
   * @return the value of CPF
   */
  public String getCPF () {
    return CPF;
  }

  /**
   * Set the value of telefone
   * Atributo para receber o telefone de contado do cliente
   * @param newVar the new value of telefone
   */
  public void setTelefone (String newVar) {
    telefone = newVar;
  }

  /**
   * Get the value of telefone
   * Atributo para receber o telefone de contado do cliente
   * @return the value of telefone
   */
  public String getTelefone () {
    return telefone;
  }

  //
  // Other methods
  //

}



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
  public void setPlaca (String newVar) {
    placa = newVar;
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
  public void setChassi (String newVar) {
    chassi = newVar;
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
  public void setModelo (String newVar) {
    modelo = newVar;
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
  public void setAno (String newVar) {
    ano = newVar;
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
