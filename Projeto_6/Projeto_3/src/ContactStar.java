import java.util.List;

class ContactStar extends Contact {
  private boolean star;
  //contrutor default
  public ContactStar(String name, List<Fone> fones, boolean star){
    super(name, fones);
    this.star = star;
  }
  //muda o prefixo e o valor de star
  void setStar(boolean value){
    this.star = value;
  }
  boolean getStar(){
    return this.star;
  }

  @Override
  public String toString() {
    if(this.star){
      return super.toString().replace("-", "@");
    } else {
      return super.toString();
    }
  }
}