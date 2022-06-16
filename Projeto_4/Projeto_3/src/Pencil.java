import java.util.ArrayList;

class Pencil {
  private float thickness;
  private Lead tip; //lead da ponta
  private ArrayList<Lead> barrel; //grafites no cano

  public Pencil(float thickness){
    this.thickness = thickness;
    barrel = new ArrayList<Lead>();
  }

  //insere um lead no barril
  public boolean insert(Lead lead){
    if(lead.getThickness() != thickness){
      System.out.println("fail: calibre incompatível");
      return false;
    }else{
      barrel.add(lead);
      return true;
    }
  }

  //remove e retorna o lead da ponta
  public Lead remove(){
    this.tip = null;
    return tip;
  }

  // se a ponta estiver vazia, puxa o próximo lead do barril
  public boolean pull(){
    if(tip == null){
      tip = barrel.get(0);
      barrel.remove(0);
      return true;
    }else{
      System.out.println("fail: ja existe grafite no bico");
      return false;
    }
  }
  //se tiver grafite suficiente no bico, gaste e retorne true
  //lembre que os últimos 10mm não podem ser utilizados
  public void writePage(){

    if(tip == null){
      System.out.println("fail: nao existe grafite no bico");
      return;
    }

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

  @Override
  public String toString(){
    String str = "Calibre: " + thickness +  ", Bico: []" +  ", Tambor: {}";

    if(barrel.isEmpty()){
      str = "Calibre: " + thickness + ", Bico: " + tip + " Tambor: {}";
    }
    if(tip == null){
      str = "Calibre: " + thickness +  ", Bico: []" +  ", Tambor: {}";
    }
    if(barrel.isEmpty() == false){
        str = "Calibre: " + thickness + ", Bico: " + tip + ", Tambor: {" + barrel.toString() + "}";
    }

        // for(Lead e : barrel){
        //   if(barrel.isEmpty() == true && tip != null){
        //     str = "Calibre: " + thickness + ", Bico: " + tip + " Tambor: {}";
        //   }
        //   else if(barrel.isEmpty() == false && tip != null){
        //     str = "Calibre: " + thickness + ", Bico: " + tip + ", Tambor: {" + barrel.toString() + "}";
        //   }
        //   else if(barrel.isEmpty() == false && tip == null){
        //     str = "Calibre: " + thickness + ", Bico: []" + " Tambor: {" + barrel.toString() + "}";
        //   }
        // }
    
    return str;
  }
}