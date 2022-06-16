//Operação guarda os dados de uma única operação.
class Operation {
  private int index;    
  private Label label;
  //O valor em negativo se for débito
  private int value;
  //O saldo residual
  private int balance;
  public Operation(int index, Label label, int value, int balance) {
    this.index = index;
    this.label = label;
    this.value = value;
    this.balance = balance;
  }
  //faz o preenchimento da string com espaços em branco até completar o length
  public static String pad(String string, int length) {
    StringBuilder sb = new StringBuilder();
    sb.append(string);
    while(sb.length() < length){
      sb.append(" ");
    }
    return sb.toString();
  }
  public String toString() {
    return pad("" + index, 2) + ":" + pad("" + label, 9) + ":" + pad("" + value, 5) + ":" + pad("" + balance, 5);
  }
  int getIndex() {
    return this.index;
  }
  Label getLabel() {
    return this.label;
  }
  int getValue() {
    return this.value;
  }
  int getBalance() {
    return this.balance;
  }
}