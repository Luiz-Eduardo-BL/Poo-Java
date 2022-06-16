public enum Coin {
  M10(0.10, 1),
  M25(0.25, 2),
  M50(0.50, 3),
  M100(1.00, 4);

  double value;
  int volume;
  
  private Coin(double value, int volume) {
      this.value = value;
      this.volume = volume;
  }
  public int getVolume(){
    return volume;
  }
  public double getValue(){
    return value;
  }
  public String getDescription() {
      return "Coin: " + value;
  }
  public String toString() {
      return "Coin: " + value + " Volume: " + value;
  }
}