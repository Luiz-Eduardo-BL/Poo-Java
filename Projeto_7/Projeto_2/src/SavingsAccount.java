class SavingsAccount extends Account {
  public SavingsAccount(int id, String idClient){
    super(id, idClient);
    this.type = "CP";
  }
  //aumenta saldo em 1%
  public void monthlyUpdate(){
    this.balance += this.balance * 0.01;
  }
}