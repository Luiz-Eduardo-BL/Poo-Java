import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Agenda {
  private List<Contact> contacts = new ArrayList<Contact>();
  
  //Mostrar os contatos da agenda pela ordem alfabética.
  //Se houver dois contatos com o mesmo nome e telefone, mostre-os em ordem alfabética.

  public Agenda(){
    this.contacts = new ArrayList<Contact>();
  }

  //retorna a posição do contato com esse nome no vetor ou -1 se não existir.
  private int findPosByName(String name){
    for(int i = 0; i < contacts.size(); i++){
      if(contacts.get(i).getName().equals(name)){
        return i;
      }
    }
    return -1;
  }
  //retorna o objeto contato com esse nome ou null se não existir
  //utilize o método findPos
  //Fazer uma busca por padrão em todos os atributos do contato, nome e telefones.
  public Contact findContact(String name){
    int pos = findPosByName(name);

    if(pos == -1){
      return null;
    }
    return contacts.get(pos);

  }
  //se nenhum contato existir com esse nome, adicione
  //se ja existir, faça o merge adicionando os telefones
  //se tiver adicionado um novo contato, ordene a lista para ficar em ordem alfabética

  public void addContact(Contact contact) {

    if(findPosByName(contact.getName()) == -1){
      contacts.add(contact);
    }else{
      int pos = findPosByName(contact.getName());
      for(int i = 0; i < contact.getFones().size(); i++){
        contacts.get(pos).addFone(contact.getFones().get(i));
      }
    }

      this.contacts.sort(new Comparator<Contact>() {
        @Override
        public int compare(Contact arg0, Contact arg1) {
            return ((Contact) arg0).getName().compareTo(((Contact)arg1).getName());
        }
    });
  }

  //Remover contato pela chave.
  //Remover telefone do contato.
  //Se não existir, informe o erro.
  public void rmContact(String name){
    int pos = findPosByName(name);
    if(pos == -1){
      System.out.println("fail: invalid name");
    } else {
      contacts.remove(pos);
    }
  }
  //Monte uma lista auxiliar procurando no .toString() de cada contato
  //se ele possui a substring procurada.
  public List<Contact> search(String pattern){

    List<Contact> aux = new ArrayList<Contact>();
    for(int i = 0; i < contacts.size(); i++){
      if(contacts.get(i).toString().contains(pattern)){
        aux.add(contacts.get(i));
      }
    }
    return aux;

  }

  public List<Contact> getContacts(){
    return contacts;
  }

  // - ana [0:tim:3434] [1:cas:4567] [2:oio:8754]
  // - bia [0:viv:5454]
  // - eva [0:oio:8585] [1:cla:9999]

  public String toString(){

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < contacts.size(); i++){
      sb.append(contacts.get(i) + "\n");
    }
    return sb.toString();
  }
}