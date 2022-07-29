

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
  private String nome;
  /**
   * Atributo Para receber o CPF do cliente 
   */
  private String CPF;
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

   public void dadosCliente(){
      System.out.println("ORDEM DE SERVIÇO\n-------------------");
      System.out.println("Nome do cliente: " + nome);
      System.out.println("CPF: " + CPF);
      System.out.println("Telefone de contato: " + telefone);
  }

}

