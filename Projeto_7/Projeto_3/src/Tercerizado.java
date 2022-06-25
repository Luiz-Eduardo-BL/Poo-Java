class Tercerizado extends Funcionario {
  protected int horas;
  protected boolean isSalubre = false;
  //addTer helder 40 sim
  public Tercerizado(String nome, int horas, String isSalubre){
    super(nome);
    this.horas = horas;
    this.isSalubre = isSalubre.equals("sim");
  }
  public int getHoras(){
    return horas;
  }
  public String getIsSalubre(){
    //se for true return "Sim" se for false return "Nao"
    return isSalubre ? "Sim" : "Não";
  }
  // O salário do Ter(Terceirizado) é obtido do produto das horas trabalhadas e 4 e é acrescentado 500 se for insalubre
  // salario = 4 * horas (+ 500 se insalubre)
  public int getSalario(){
    return 4 * horas + (isSalubre ? 500 : 0);
  }

  public void addDiaria(){
    throw new MsgException("fail: terc nao pode receber diaria");
  }
  //ter:helder:40:sim:660
  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("Tercerizado: ").append(nome).append(":").append(horas).append(":").append(getIsSalubre()).append(":").append(getSalario());
    return sb.toString();
  }
}