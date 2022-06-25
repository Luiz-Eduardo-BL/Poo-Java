abstract class Funcionario {
  protected String nome;
  protected int bonus;
  protected int diarias;
  protected int maxDiarias;
  
  public Funcionario(String nome){
    this.nome = nome;
    this.bonus = 0;
    this.diarias = 0;
    this.maxDiarias = 2;
  }
  public String getNome(){
    return nome;
  }

  public void setBonus(int bonus){
    this.bonus = bonus;
  }
  //se não atingiu o máximo, adicione mais uma diária
  //se atingiu o máximo, lance uma MsgException
  public void addDiaria(){
    if(diarias < maxDiarias){
      diarias++;
    } else {
      throw new MsgException("Máximo de diárias atingido");
    }
  }

  public int getSalario(){
    return bonus + diarias * 100;
  }
}