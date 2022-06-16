import java.util.ArrayList;

public class Sala{
  private ArrayList<Client> cadeiras;

  public ArrayList<Client> getCadeiras(){
    return cadeiras;
  }
  public Sala(int capacidade){
    cadeiras = new ArrayList<Client>(capacidade);
    for (int i = 0; i < capacidade; i++) {
			cadeiras.add(null);
		}
  }
  public boolean reservar(String id, String fone, int ind){
    Client c = new Client(id, fone);

    if(ind < 0 || ind >= cadeiras.size()){
      System.out.println("fail: indice invalido!!");
    }

    for (int i = 0; i < cadeiras.size(); i++){
      if(cadeiras.get(i) == null){
        break;
      }
      if(c.getId().equals(cadeiras.get(i).getId())){
        System.out.println("fail: cliente ja esta no cinema");
				return false;
      }
    }

    if(cadeiras.get(ind) == null){
      cadeiras.set(ind, c);
      return true;
    }else{
      System.out.println("fail: cadeira ja esta ocupada");
      return false;
    }
  }

  public void cancelar(String id){
    for(int i = 0; i < cadeiras.size(); i++) {
      if(cadeiras.get(i) == null){
        break;
      }
      if(id.equals(cadeiras.get(i).getId())){
        cadeiras.set(i, null);
        return;
      }
    }
    System.out.println("fail: cliente nao esta no cinema");
  }
  public String toString(){
    System.out.println("__________________________\n");
    String aux = "[ ";

    	for (Client c : cadeiras) {
    		if(c != null)
    			aux += c.toString() + " ";
    		else
    			aux += "- ";
		}	
    	return aux + "]";
    }
  }