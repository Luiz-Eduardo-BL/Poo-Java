class Motorcycle {
  private Person person; //agregacao
  private int power;
  private int time;
  //Inicia o atributo power, time com zero e person com null
  public Motorcycle(int power){
    this.power = power;
    this.time = 0;
    this.person = null;
  }
  public int getPower(){
    return power;
  }
  public int getTime(){
    return time;
  }
  public Person getPerson(){
    return person;
  }
  //Comprar mais tempo
  public void buy(int time){
    this.time += time;
  }
  //Se estiver vazio, coloca a pessoa na moto e retorna true
  public boolean enter(Person person){
    if(this.person == null){
      this.person = person;
      return true;
    }else{
      System.out.println("fail: moto ocupada");
      return false;
    }

  }
  //Se houver uma person, retira e retorna
  //Se não, retorna null
  public Person leave(){
    if(this.person != null){
      Person person = this.person;
      this.person = null;
      return person;
    }else{
      System.out.println("fail: moto vazia");
      return null;
    }
  }
  
  public void drive(int time){
    if(this.person != null && this.person.getAge() <= 10 && this.time >= time){
      this.time -= time;
    }else if(this.person != null && this.person.getAge() > 10){
      System.out.println("fail: muito grande para andar de moto");
    }else if(this.time > 0){
      System.out.println("fail: andou " + this.time + " min e acabou o time");
      this.time = 0;
    }else{ 
      System.out.println("fail: time zerado");
    }
  }
  //buzinar
  public void honk(){
    String str = "";

    if(this.person != null){
      for(int i = 0; i < power; i++){
        str += "e";
      }
      System.out.println("P" + str + "m");
    }else{
      System.out.println("fail: moto vazia");
    }
  }
  public String toString(){
    return "Power: " + power + ", Minutos: " + time + ", Person: " + person;
  }
}