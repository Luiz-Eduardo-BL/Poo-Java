import java.util.List;
import java.util.stream.Collectors;

class AgendaStar extends Agenda {
  //SE o contato existir e for do tipo ContatoStar altere o atributo star dele
  public void star(String name, boolean value){
    if(this.findContact(name) != null && this.findContact(name) instanceof ContactStar){
      ((ContactStar)this.findContact(name)).setStar(value);
    }else{
      System.out.println("fail: contato " + name + " nao existe");
    }
  }
  //filtre em uma nova lista apenas os contatos que forem do tipo ContatoStar e que estão favoritados
  public List<Contact> getStarred(){
    return this.getContacts().stream().filter(c -> c instanceof ContactStar && ((ContactStar)c).getStar()).collect(Collectors.toList());
  }
}