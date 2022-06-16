public class Pig{

  private String itens = "";
  private double value = 0;
  private int volume = 0;
  private int volumeMax;
  private boolean broken = false;

  //inicializa o volumeMax
  public Pig(int volumeMax){
    this.volumeMax = volumeMax;
  }

  //se nao estiver quebrado e couber, adicione o value e o volume
  public boolean addCoin(Coin moeda){
    if(!isBroken() && moeda.getVolume() + volume <= volumeMax){
      this.value += moeda.getValue();
      this.volume += moeda.getVolume();

      return true;
    }else{
      return false;
    }
  }
  //se não estiver quebrado e couber, adicione no volume e na descrição
  public boolean addItem(Item item){
    if(!isBroken() && item.getVolume() + volume <= volumeMax){
      this.volume += item.getVolume();
      if(itens.equals("")){
        itens = item.getDescription();
      }else{
        itens += ", " + item.getDescription();
      }

      return true;
    }else{
      System.out.println("------------------------------------");
      System.out.println("Nao cabe no porco");
      System.out.println("------------------------------------");
      return false;
    }
  }
  //quebre o pig
  public boolean breakPig(){
    if(!isBroken()){
      this.broken = true;
      return true;
    }else{
      System.out.println("------------------------------------");
      System.out.println("Fail: porco ja esta quebrado");
      System.out.println("------------------------------------");
      return false;
    }
  }
  //se estiver quebrado, pegue e retorne o value
  public double getCoins(){
    if(isBroken() == true){
      return value;
    }else{
      System.out.println("------------------------------------");
      System.out.println("Voce deve quebrar o cofre primeiro");
      System.out.println("------------------------------------");
      return value;
    }
  }
  //se estiver quebrado, pegue e retorno os itens
  public String getItens(){
    if(isBroken() == true){
      return itens;
    }else{
      System.out.println("------------------------------------");
      System.out.println("Voce deve quebrar o cofre primeiro");
      System.out.println("------------------------------------");
      return "";
    }
  }
  public int getVolume(){
    return volume;
  }
  public int getVolumeMax(){
    return volumeMax;
  }
  public boolean isBroken(){
    return broken;
  }

  @Override
  //mostre o conteúdo do pig
  public String toString(){
    if(isBroken() == true){
      return "I:()" + " M:0.00" + " V:0" + "/" + getVolumeMax() + " EQ:true";
    }else{
      return String.format("I:(%s)" + " M:%.2f" + " V:%d/%d" + " EQ:%b", itens, value, volume, volumeMax, isBroken());
    }
  }
}