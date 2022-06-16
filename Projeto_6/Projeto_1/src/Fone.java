class Fone {
  private String id;
  private String number;

  public Fone(String id, String number){
    this.id = id;
    this.number = number;
  }
  //verifica se o número é um número de telefone válido
  public static boolean validate(String number){

    for (int i = 0; i < number.length(); i++) {
      if (Character.isAlphabetic(number.charAt(i))) {
          return false;
      }
    }
    return true;
  }
  //utiliza o static validate para retornar se essa instancia do fone é valida
  public boolean isValid(){
    if(Fone.validate(this.number)){
      return true;
    } else {
      return false;
    }
  }
  //O resultado deve ficar assim
  //oi:1234
  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append(this.id + ":" + this.number);
    return sb.toString();
  }
  //GETS e SETS
  public String getId(){
    return this.id;
  }
  public void setId(String id){
    this.id = id;
  }
  public String getNumber(){
    return this.number;
  }
  public void setNumber(String number){
    this.number = number;
  }
}