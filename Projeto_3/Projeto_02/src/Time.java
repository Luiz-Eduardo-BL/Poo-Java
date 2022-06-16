public class Time {
  private int hour = 0;
  private int minute = 0;
  private int second = 0;
  //utilize os métodos set para atribuir valores aos atributos
  //para garantir que o valor dos atributos sejam válidos
  public Time(int hour, int minute, int second){
    setHour(hour);
    setMinute(minute);
    setSecond(second);
  }
  public boolean isValid(int hour, int minute, int second){
    if(hour >= 0 && hour <= 24 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59){
      return true;
    }
    return false;
  }
  //se for um valor válido, ou seja, de 0 até 23,
  //atribui o valor ao atributo hour, se não, atribua 0
  public void setHour(int hour){
    if(isValid(hour, minute, second) == true){
      this.hour = hour;
    }else{
      this.hour = 0;
    }
  }
  //se for um valor válido, ou seja, de 0 até 59,
  //atribui o valor ao atributo minute, se não, atribua 0 
  public void setMinute(int minute){
    if(isValid(hour, minute, second) == true){
      this.minute = minute;
    }else{
      this.minute = 0;
    }
  }
  //se for um valor válido, ou seja, de 0 até 59,
  //atribui o valor ao atributo second, se não, atribua 0
  public void setSecond(int second){
    if(isValid(hour, minute, second) == true){
      this.second = second;
    }else{
      this.second = 0;
    }
  }

  public int getHour() {
    return hour;
  }
  public int getMinute() {
    return minute;
  }
  public int getSecond() {
    return second;
  }
  
  //avança o tempo em um segundo
  public void nextSecond(){
    if(getSecond() < 59){
      setSecond(getSecond() + 1);
    }else if(getMinute() < 59){
      setMinute(getMinute() + 1);
      setSecond(0);
    }else if(getHour() < 23){
      setHour(getHour() + 1);
      setMinute(0);
      setSecond(0);
    }else{
      setHour(0);
      setMinute(0);
      setSecond(0);
    }
  }
  
  //você pode imprimir um inteiro forçando zeros a esquerda com o seguinte
  //comando em java String.format("%02d", valor)
  @Override
  public String toString(){
    return String.format("%02d:%02d:%02d", hour, minute, second); 
  }
}