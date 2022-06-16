import java.text.DecimalFormat;
import java.util.Locale;

class Calculator {
  private int batteryMax;
  private int battery;
  private float display;
  
  public int getBattery() {
      return battery;
  }
  public void setBattery(int battery) {
      this.battery = battery;
  }
  public float getDisplay() {
      return display;
  }
  public void setDisplay(float display) {
      this.display = display;
  }

  //Inicia os atributos, battery e display começam com o zero.
  Calculator(int batteryMax){
      this.batteryMax = batteryMax;
      display = 0;
  }
  //Aumenta a bateria, porém não além do máximo.
  public void chargeBattery(int value){
      if(battery + value >= batteryMax){
        battery = batteryMax;
      }else{
        battery += value;
      }
  }
  //Tenta gastar uma unidade da bateria e emite um erro se não conseguir.
  public boolean useBattery(){
      if(battery >= 1){
          battery--;
          return true;
      }else {
        System.out.println("fail: bateria insuficiente");
      }
      return false;
  }
  //Se conseguir gastar bateria, armazene a soma no atributo display.
  public void sum(int a, int b){
      if(useBattery() == true){
          display = a + b;
      }
  }
  //Se conseguir gastar bateria e não for divisão por 0.
  void division(int num, int den){
      if(useBattery() == true && den != 0){
          display = (float) num/ (float) den;
      }else if(den == 0) {
        System.out.println("fail: divisao por zero");
      }
  }
  //Retorna o conteúdo do display com duas casas decimais.
  @Override
  public String toString(){
      Locale.setDefault(Locale.US);
      DecimalFormat form = new DecimalFormat("0.00");
      return String.format("Display: " + form.format(display) + ", Batery: " + battery);
  }
}