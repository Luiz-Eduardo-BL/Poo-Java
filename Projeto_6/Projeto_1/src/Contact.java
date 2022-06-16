import java.util.ArrayList;
import java.util.List;

class Contact {
  private String name;
  private List<Fone> fones = new ArrayList<Fone>();
  protected String prefix = "- "; //utilizado no toString
  //Crie um ArrayList para o ATRIBUTO fones
  //Se a variável fones não for null, adicione todos os fones usando o método addFone
  public Contact(String name, List<Fone> fones){

    this.name = name;
    this.fones = fones != null ? fones : new ArrayList<Fone>();

  }
  //Se fone for válido, insira no atributo fones
  //Se não, informe o erro
  public void addFone(Fone fone){
    if(fone.isValid()){
      this.fones.add(fone);
    } else {
      System.out.println("fail: invalid fone");
    }
  }
  //Se o índice existir no ArrayList, remova o telefone com esse índice
  public void rmFone(int index){
    if(index < this.fones.size()){
      this.fones.remove(index);
    } else {
      System.out.println("fail: invalid index");
    }
  }
  //Use um contador para mostrar o índice do telefone
  //Use o toString do fone para adicioná-lo à saída
  //O resultado dever ficar assim:
  //- david [0:oi:123] [1:tim:9081] [2:claro:5431]
  @Override
  public String toString(){

    int count = 0;

    StringBuilder sb = new StringBuilder();
    sb.append(this.prefix + this.name + " ");
    for(int i = 0; i < this.fones.size(); i++){
      sb.append("[" + i + ":" + this.fones.get(i).toString() + "] ");
      count++;
    }
    return sb.toString();

  }
  //GETS e SETS
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }
  public List<Fone> getFones(){
    return this.fones;
  }
  //limpe a lista de fones
  //utilize o addFone para adicionar apenas os fones válidos
  public void setFones(List<Fone> fones){
    this.fones.clear();
    for(Fone fone : fones){
      this.addFone(fone);
    }
  }
}