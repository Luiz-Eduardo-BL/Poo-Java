public class Linha {
  Ponto2D linha = new Ponto2D();
  
  void inicializaLinha(double x1, double y1, double x2, double y2) {
    linha.x1 = x1;
    linha.y1 = y1;
    linha.x2 = x2;
    linha.y2 = y2;
  }

  double tamanho(){
    return linha.distanciEntrePontos();
  }
}
