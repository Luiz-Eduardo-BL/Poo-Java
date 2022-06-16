class Pass {
  private String name;
  private int age;
  public Pass(String name, int age){
    this.name = name;
    this.age = age;
  }
  //return true if pass.age >= 65
  public boolean isPriority(){
    if(age >= 65){
      return true;
    }else{
      return false;
    }
  }
  //GETS e SETS
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int getAge(){
    return age;
  }
  public void setAge(int age){
    this.age = age;
  }
  public String toString(){
    return name + ":" + age;
  }
}