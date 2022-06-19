import java.util.ArrayList;
import java.util.List;

class Client {
  private String clientId;
  private List<Account> accounts;

  public Client(String clientId){
    this.clientId = clientId;
    accounts = new ArrayList<Account>();
  }
  public void addAccount(Account account){
    accounts.add(account);
  }

  public java.lang.String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append(clientId + " [");
    for(int i = 0; i < accounts.size(); i++){
      sb.append(accounts.get(i).getId());
      if(i < accounts.size() - 1){
        sb.append(", ");
      }
    }
    sb.append("]");
    return sb.toString();
  }
  //GETS and SETS
  String getClientId(){
    return clientId;
  }
  void setClientId(String clientId){
    this.clientId = clientId;
  }
  List<Account> getAccounts(){
    return accounts;
  }
  void setAccounts(List<Account> accounts){
    this.accounts = accounts;
  }
};