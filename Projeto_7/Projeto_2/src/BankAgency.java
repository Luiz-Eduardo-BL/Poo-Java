import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class BankAgency {

  private Map<String, Client> clients;
  private Map<Integer, Account> accounts;
  private int nextAccountId = 0;

  //obtém conta ou lança excessão
  private Account getAccount(int id){
    if(accounts.containsKey(id)){
      return accounts.get(id);
    }
    throw new AccountException("fail: conta nao encontrada");
  }
  public BankAgency(){
    clients = new TreeMap<String, Client>();
    accounts = new HashMap<Integer, Account>();
  }

  //se o cliente não existir
  //cria o cliente
  //cria uma conta poupança e uma conta corrent para o cliente
  //adiciona essas contas no vetor de contas e no vetor do cliente
  //adiciona o cliente no mapa de clientes
  public void addClient(String clientId) throws Exception{
    if(clients.containsKey(clientId)){
      throw new Exception("fail: cliente ja existe");
    }else{
      Client client = new Client(clientId);
      Account account1 = new CheckingAccount(nextAccountId, clientId);
      Account account2 = new SavingsAccount(nextAccountId + 1, clientId);
      client.addAccount(account1);
      client.addAccount(account2);
      accounts.put(nextAccountId, account1);
      accounts.put(nextAccountId + 1, account2);
      clients.put(clientId, client);
      nextAccountId += 2;
    }
  }
  //obtem o cliente e invoca as ações
  public void withdraw(int idConta, float value){
    Account account = getAccount(idConta);
    account.withdraw(value);
  }
  public void deposit(int idConta, float value){
    Account account = getAccount(idConta);
    account.deposit(value);
  }
  public void transfer(int contaDe, int contaPara, float value){
    Account accountDe = getAccount(contaDe);
    Account accountPara = getAccount(contaPara);
    accountDe.transfer(accountPara, value);
  }
  public void monthlyUpdate(){
    Collection<Account> values = accounts.values();
    for(Account account : values){
      account.monthlyUpdate();
    }
  }

  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("___________________________" + "\nClients:");
    for(Client client : clients.values()){
      sb.append("\n- " + client.toString());
    }
    
    sb.append( "\n___________________________" + "\nAccounts:");
    for(Account account : accounts.values()){
      sb.append("\n" + account.toString());
    }
    return sb.toString();
  }
};