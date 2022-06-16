public class Lead {
  private float thickness;
  private String hardness;
  private int size;

  public Lead(float thickness, String hardness, int size){
    this.thickness = thickness;
    this.hardness = hardness;
    this.size = size;
  }

  public int usagePerSheet(){
    return size;
  }
  public float getThickness(){
    return thickness;
  }
  public String getHardness(){
    return hardness;
  }
  public int getSize(){
    return size;
  }
  public void setSize(int size){
    this.size = size;
  }

  @Override
  public String toString(){
      return "[" + getThickness() + ":" + getHardness() + ":" + getSize() + "]";
  }

}