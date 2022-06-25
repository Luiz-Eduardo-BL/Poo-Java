class STA extends Funcionario {
  protected int nivel;
  public STA(String nome, int nivel){
    super(nome);
    this.nivel = nivel;
  }
  public int getNivel(){
    return nivel;
  }

  public int getSalario(){
    return super.getSalario() + 3000 + 300 * nivel;
  }

  public void addDiaria(){
    if(diarias >= 1)
      throw new MsgException("fail: limite de diarias atingido");
    diarias++;
  }

  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("STA: ").append(nome).append(":").append(nivel).append(":").append(getSalario());
    return sb.toString();
  }
}