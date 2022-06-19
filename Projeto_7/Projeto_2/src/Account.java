import java.util.Locale;

abstract class Account {
  protected int id;
  protected float balance;
  protected String clientId;
  protected String type; //CC or CP

  public Account(int id, String clientId){
    Locale.setDefault(Locale.US);
    this.id = id;
    this.clientId = clientId;
  }
  //abstract method
  public abstract void monthlyUpdate();
  
  //saque
  public void withdraw(float value){
    if(this.balance < 0){
      throw new AccountException("fail: Invalid value");
    }else if(this.balance - value < 0){
      throw new AccountException("fail: saldo insuficiente");
    }else{
      this.balance -= value;
    }
  }
  //deposito
  public void deposit(float value){
    if(value < 0){
      throw new AccountException("fail: Invalid value");
    }else{
      this.balance += value;
    }
  }
  //transferencia para outra conta
  public void transfer(Account other, float value){
    if(value < 0){
      throw new AccountException("fail: Invalid value");
    }if(this.balance - value < 0){
      throw new AccountException("fail: saldo insuficiente");
    }else{
      this.balance -= value;
      other.balance += value;
    }
  }
  //0:Almir:0.00:CC
  public String toString(){
    // StringBuilder sb = new StringBuilder();
    // sb.append(id + ":" + clientId + ":" + balance + ":" + type);
    // return sb.toString();
    return String.format("%d:%s:%.2f:%s", id, clientId, balance, type);
  }
  //GETS and SETS
  int getId(){
    return this.id;
  }
  float getBalance(){
    return this.balance;
  }
  String getClientId(){
    return this.clientId;
  }
  String getType(){
    return this.type;
  }
}
