public class Pencil {
  private float thickness; 
  private Lead tip;

  public Pencil(float thickness){
    this.thickness = thickness;
  }

  public float getThickness(){
    return thickness;
  }
  public boolean hasGrafite(){
    if(tip != null){
      return true;
    }else {
      return false;
    }
  }

  public boolean insert(Lead grafite){

    if(grafite.getThickness() != thickness){
      System.out.println("fail: calibre incompatível");
      return false;
    }
    if(hasGrafite() == true){
      System.out.println("fail: ja existe grafite");
      return false;
    }else{
      tip = grafite;
      return true;
    }
  }

  public Lead remove(){
    this.tip = null;
    return tip;
  }
  public void writePage(){

    if(tip.getSize() <= 10){
      System.out.println("warning: grafite com tamanho insuficiente para escrever");
      return;
    }

    if(tip.getHardness().equals("HB")){
      if(tip.getSize() - 10 < 1){
        System.out.println("fail: folha incompleta");
        tip.setSize(10);
      }else{
        tip.setSize(tip.getSize() - 1);
      }
    }
    if(tip.getHardness().equals("2B")){
      if(tip.getSize() - 10 < 2){
        System.out.println("fail: folha incompleta");
        tip.setSize(10);
      }else{
        tip.setSize(tip.getSize() - 2);
      }
    }
    if(tip.getHardness().equals("4B")){
      if(tip.getSize() - 10 < 4){
        System.out.println("fail: folha incompleta");
        tip.setSize(10);
      }else{
        tip.setSize(tip.getSize() - 4);
      }
    }
    if(tip.getHardness().equals("6B")){
      if(tip.getSize() - 10 < 6){
        System.out.println("fail: folha incompleta");
        tip.setSize(10);
      }else{
        tip.setSize(tip.getSize() - 6);
      }
    }
  }

  public String toString(){
    if(hasGrafite() == true)
      return String.format("Calibre: %.1f, Grafite: %s", thickness, tip.toString());
    else 
      return String.format("Calibre: %.1f, Grafite: Null", thickness);
  }
}