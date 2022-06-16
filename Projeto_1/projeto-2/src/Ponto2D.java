public class Ponto2D {
  double x1, y1, x2, y2;
  double p1, p2, distancia;

  void inicializaPontos(double pontoX1, double pontoY1, double pontoX2, double pontoY2) {
    x1 = pontoX1;
    x2 = pontoX2;
    y1 = pontoY1;
    y2 = pontoY2;
  }

  double distanciEntrePontos(){
    p1 = Math.pow(x2 - x1, 2);
    p2 = Math.pow(y1 - y1, 2);

    distancia = Math.sqrt(p1 + p2);
    System.out.println("\nAs cordenadas do primeiro ponto sao X¹: " + x1 + " Y¹: " + y1 );
    System.out.println("\nAs cordenadas do primeiro ponto sao X²: " + x2 + " Y²: " + y2 );
    System.out.println("\nA distancia entre os pontos é de " + distancia);
    
    return distancia;
  }
}
