public class Car {
  private int pass; // Passageiros
  private int passMax; // limite de Passageiros
  private int gas; // tanque
  private int gasMax; // limite do tanque
  private int km; // quantidade de quilometragem

  public void setGas(int gas) {
      this.gas = gas;
  }

  public int getGas() {
      return gas;
  }

  public int getGasMax() {
      return gasMax;
  }

  public void setGasMax(int gasMax) {
      this.gasMax = gasMax;
  }

  public void setKm(int km) {
      this.km = km;
  }

  public int getKm() {
      return km;
  }
  
  public int getPass() {
      return pass;
  }

  public void setPass(int pass) {
      this.pass = pass;
  }

  public int getPassMax() {
      return passMax;
  }

  public void setPassMax(int passMax) {
      this.passMax = passMax;
  }

  Car() {
      pass = 0;
      passMax = 2;
      gas = 0;
      gasMax = 100;
  }

  // Adiciona um passageiro
  public void enter() { 
      if (pass != passMax) {
          pass++;
      } else {
          System.out.println("fail: limite de pessoas atingido");
      }
  }

  // Tira um passageiro
  public void leave() { 
      if (pass >= 1) {
          pass--;
      }else{
          System.out.println("fail: nao ha ninguem no carro");
      }
  }

  // Adiciona Gasolina
  public void fuel(int gas) { 
      if (this.gas < gasMax) {
          this.gas = gas + this.gas;
      }
  }

  // Dirigir
  public void drive(int km) { 
      if (pass > 0 && gas >= 1) {
          if(gas - km > 0){
              setGas(gas - km);
              setKm(this.km = getKm() + km);
          }else {
              this.km += gas;
              System.out.println("Fail: tanque vazio apos andar " + this.km + "km.");
              gas = 0;
          }
      } else if (pass <= 0){
          System.out.println("fail: nao ha ninguem no carro");
      } else{
          System.out.println("Nao tem gasolina!!");
      }
  }

  @Override
  public String toString() {
      return String.format("pass: %d gas: %d km: %d", pass, gas, km);
  }

}