class Client {
  private String id;
  private String fone;

  public Client(String id, String fone){
    this.id = id;
    this.fone = fone;
  }
  public void setId(String id){
    this.id = id;
  }
  public String getId() {
    return this.id;
  }
  public String getFone(){
    return this.fone;
  }
  public void setFone(String fone){
    this.fone = fone;
  }
  public String toString(){
    return String.format("%s:%s", getId(), getFone());
    
  }
}
