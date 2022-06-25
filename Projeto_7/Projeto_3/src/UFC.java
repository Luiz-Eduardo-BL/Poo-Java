import java.util.Map;
import java.util.TreeMap;

class UFC {
  private Map<String, Funcionario> funcionarios = new TreeMap<>();
  
  public String toString(){ 
    StringBuilder sb = new StringBuilder();
    for(Funcionario f : funcionarios.values()){
      sb.append(f.toString()).append("\n");
    }
    return sb.toString();
  }
  public Funcionario getFuncionario(String nome){
    return funcionarios.get(nome);
  }
  public void addFuncionario(Funcionario funcionario){
    funcionarios.put(funcionario.getNome(), funcionario);
  }
  public void rmFuncionario(String nome){
    funcionarios.remove(nome);
  }
  //reparte o bonus para todos os funcionarios
  public void setBonus(int bonus){
    int divisaoBonus = bonus / funcionarios.size();
    for (Funcionario funcionario : funcionarios.values()) {
      funcionario.setBonus(divisaoBonus);
    }
  }
}