import java.util.ArrayList;
import java.util.List;

class Topic {
  private List<Pass> prioritySeats;
  private List<Pass> normalSeats;

//   Iniciar a topic solicitando a lotação máxima e a quantidade de cadeiras preferenciais.
// Mostrar o estado do trem

  public Topic(int capacity, int qtdPriority){
    prioritySeats = new ArrayList<Pass>();
    normalSeats = new ArrayList<Pass>();
    
    for(int i = 0; i < qtdPriority; i++){
      prioritySeats.add(null);
    }
    for(int i = 0; i < capacity - qtdPriority; i++){
      normalSeats.add(null);
    }

  }
  //return the first free pos or -1
  private int findFirstFreePos(List<Pass> list){
    for(int i = 0; i < list.size(); i++){
      if(list.get(i) == null){
        return i;
      }
    }
    return -1;
  }
  //search in list using name and return position or return -1
  private int findByName(String name, List<Pass> list){
    for(int i = 0; i < list.size(); i++){
      if(list.get(i) != null && list.get(i).getName().equals(name)){
        return i;
      }
    }
    return -1;
  }
  //use the findFirstFreePos to search a free position
  //if exists, insert the pass and return true
  //else return false
  private boolean insertOnList(Pass pass, List<Pass> list){
    int pos = findFirstFreePos(list);
    if(pos != -1){
      list.set(pos, pass);
      return true;
    }
    return false;
  }
  //use the findByName method to locate pos in list, if found, remore the person
  //setting the pos location to null
  private boolean removeFromList(String name, List<Pass> list){
    int pos = findByName(name, list);
    if(pos != -1){
      list.set(pos, null);
      return true;
    }else{
      return false;
    }
  }
  //use findByName to test if the pass is already in the topic
  //use the insertOnList method to insert in the right list based in
  //the pass.isPriority result
  public boolean insert(Pass pass){

    if(findByName(pass.getName(), prioritySeats) != -1){
      System.out.println("fail: pass ja esta na topic");
      return false;
    }
    if(findByName(pass.getName(), normalSeats) != -1){
      System.out.println("fail: pass ja esta na topic");
      return false;
    }else if(pass.isPriority() && insertOnList(pass, prioritySeats)){
      return true;
    }else if(pass.isPriority() && insertOnList(pass, normalSeats)){
      return true;
    }else if(insertOnList(pass, normalSeats)){
      return true;
    }else if(insertOnList(pass, prioritySeats)){
      return true;
    }else{
      System.out.println("fail: topic lotada");
      return false;
    }
    
  }
  //use the removeFromList method to try to remove from both lists
  public boolean remove(String name){
    if(removeFromList(name, prioritySeats) || removeFromList(name, normalSeats)){
      return true;
    }else{
      System.out.println("fail: pass nao esta na topic");
      return false;
    }
  }

  /** Nota de Estudo (Apagar antes de submeter)
   * metodo Append() é um metodo da classe StringBuilder[Serve justamente para concatenar dados de uma forma rapida.]
   * pesquisar mais na documentação sobre a classe StringBuilder
   */

  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for(Pass pass : prioritySeats){
      if(pass != null){
        sb.append("@" + pass.toString() + " ");
      }else{
        sb.append("@ ");
      }
    }
    for(Pass pass : normalSeats){
      if(pass != null){
        sb.append("=" + pass.toString() + " ");
      }else{
        sb.append("= ");
      }
    }
    sb.append("]");
    return sb.toString();
  }
}