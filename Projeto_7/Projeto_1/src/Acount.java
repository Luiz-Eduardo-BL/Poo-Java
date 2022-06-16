class Account {
  //O número da conta
  private int id;
  private BalanceManager balanceManager;
  // inicializa id, balanceManager e inicia a account com a operação de "abertura".
  public Account(int id){
    this.id = id;
    this.balanceManager = new BalanceManager();
    this.balanceManager.addOperation(Label.opening, 0);
  }
  //só realiza a operação se houver dinheiro suficiente na conta, diminui do balance
  //No caso do withdraw, verifique se há saldo suficiente efetuar a operação, se nao retorne fail: insuficient balance
  public boolean withdraw(int value){
    if(balanceManager.getBalance() - value >= 0) {
      balanceManager.addOperation(Label.withdraw, -value);
      return true;
    }
    else {
      System.out.println("fail: insuficient balance");
          return false;
    }
  }
  //retira o dinheiro, mesmo que o balance fique negativo
//   Verifique se o valor é válido.
// No caso da tarifa, o valor final de saldo poderá ser negativo.
  public boolean fee(int value){
    if(value > 0){
      this.balanceManager.addOperation(Label.fee, -value);
      return true;
    }else{
      System.out.println("fail: invalid value");
      return false;
    }
  }
  //se o índice for válido e representar uma operação de fee
  //adicione o mesmo valor tarifado, mas com label de reverse
  public boolean reverse(int index){
    if(index >= 0 && index < this.balanceManager.getExtract().size()){
      Operation operation = this.balanceManager.getExtract().get(index);
      if(operation.getLabel() == Label.fee){
        this.balanceManager.addOperation(Label.reverse, operation.getValue());
        return true;
      }
    }else{
      System.out.println("fail: index " + index + " invalid");
      return false;
    }
    return false;
  }
  //adiciona valor à conta se nao for negativo, 
  public boolean deposit(Label label, int value){
    if(label == Label.deposit && value > 0){
      this.balanceManager.addOperation(label, value);
      return true;
    }else{
      System.out.println("fail: invalid value");
    }
    return false;
  }
  
  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("Account " + this.id + ": ");
    sb.append(this.balanceManager.toString());
    return sb.toString();
  }
  BalanceManager getBalanceManager(){
    return this.balanceManager;
  }
}

