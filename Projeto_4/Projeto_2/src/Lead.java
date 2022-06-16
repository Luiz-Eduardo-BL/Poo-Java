class Lead {
  private float thickness; //calibre
  private String hardness; //dureza
  private int size; //tamanho em mm

  public Lead(float thickness, String hardness, int size){
    this.thickness = thickness;
    this.hardness = hardness;
    this.size = size;
  }

  public String getHardness(){
    return hardness;
  }
  public float getThickness() {
    return thickness;
  }
  public void setSize(int size){
    this.size = size;
  }
  public int getSize() {
    return size;
  }
  public int usagePerSheet(){
    return size;
  }

  @Override
  public String toString(){
    return "[" + getThickness() + ":" + getHardness() + ":" + getSize() + "]";
  }
}