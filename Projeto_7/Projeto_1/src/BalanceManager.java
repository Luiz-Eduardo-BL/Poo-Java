import java.util.ArrayList;
import java.util.List;

//Nessa classe são efetivadas e registradas as alterações no saldo
class BalanceManager {
  //O id da próxima operação dessa conta
  private int nextId;
  //A lista de operações realizadas
  private List<Operation> extract;
  private int balance;
  
  public BalanceManager(){
    this.nextId = 0;
    this.extract = new ArrayList<Operation>();
    this.balance = 0;
  }
  //Adiciona value ao balance
  //Crie operação e adiciona ao vetor de operações
  //Incrementa o nextId
  public void addOperation(Label label, int value){
    //atualizar valor de balance
    this.balance += value;
    //criar nova operação
    Operation op = new Operation(this.nextId, label, value, this.balance);
    //adicionar ao vetor de operações
    this.extract.add(op);
    //incrementar nextId
    this.nextId++;
  }
  int getBalance(){
    return this.balance;
  }
  List<Operation> getExtract(){
    return this.extract;
  }
  //metodo sobrescrito para retornar apenas as últimas qtdOp operações
  public List<Operation> getExtract(int qtdOp){
    List<Operation> extract = new ArrayList<Operation>(qtdOp);
    // Retornar todas as movimentações da conta desde a abertura
    if(qtdOp == 0){
      return this.extract;
    }else{
      // Retornar as últimas qtdOp movimentações da conta do maior para o menor índice
    for(int i = this.extract.size() - 1; i >= 0 && extract.size() < qtdOp; i--){
      extract.add(this.extract.get(i));
    }
    return extract;
    }
  }

  //retorna o valor do balance
  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("Balance: " + this.balance);
    return sb.toString();
  }
}
