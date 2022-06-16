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
  // Deve ser possível extornar, pagando de volta, tarifas passando uma lista de índices.
  // Apenas efetue a operação de extorno dos índices válidos que forem tarifas.

  public List<Operation> getExtract(int qtdOp){
    // Retornar todas as movimentações da conta desde a abertura
    if(qtdOp == 0){
      return this.extract;
    }else{
      // Retornar as últimas qtdOp movimentações da conta
      List<Operation> extract = new ArrayList<Operation>(qtdOp);
      int i = 0;
      while(i < qtdOp){
        extract.add(this.extract.get(this.extract.size() - i - 1));
        i++;
      }
      return extract;
    }
  }
    // A descrição pode ser "opening", "withdraw", "deposit", "fee", "reverse".
    // Os saques devem ter valor negativo e os depósitos positivos.

  //retorna o valor do balance
  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("Balance: " + this.balance);
    return sb.toString();
  }
}
