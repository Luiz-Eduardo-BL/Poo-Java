//Essa enumeração guarda possíveis labels para as operações.
enum Label {
  withdraw("withdraw"), //saque
  deposit("deposit"),   //deposito
  fee("fee"),           //tarifa
  reverse("reverse"),   //extorno de tarifa
  opening("opening");   //abertura da conta
  
  private String name;
  //nas enums o Construtor tem que ser privado
  private Label(String name) {
    this.name = name;
  }
  String getName() {
    return this.name;
  }
  public String toString() {
    return this.name;
  }
}