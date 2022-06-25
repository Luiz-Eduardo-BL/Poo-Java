class Professor extends Funcionario {
  protected String classe;
  //inicializa classe e muda maxDiarias para 2
  public Professor(String nome, String classe){
    super(nome);
    this.classe = classe;
    maxDiarias = 2;
  }
  public String getClasse(){
    return classe;
  }

  public int getSalario(){
    switch(classe){
      case "A":
        return super.getSalario() + 3000;
      case "B":
        return super.getSalario() + 5000;
      case "C":
        return super.getSalario() + 7000;
      case "D":
        return super.getSalario() + 9000;
      case "E":
        return super.getSalario() + 11000;
      default:
        return super.getSalario();
    }
  }
  public void addDiaria(){
    if(diarias >= 2)
      throw new MsgException("fail: limite de diarias atingido");
    diarias++;
  }
  public String toString(){
  //prof:david:C:7000
    StringBuilder sb = new StringBuilder();
    sb.append("Prof: ").append(nome).append(":").append(classe).append(":").append(getSalario());
    return sb.toString();
  }
}