public class Retangulo {
  Ponto2D novoPonto = new Ponto2D();

  double x1, y1, x2, y2;

  void inicalizaRetangulo() {
    novoPonto.inicializaPontos(x1,  y1,  x2,  y2);
  }

  void mostraRetangulo() {
    System.out.println("\n");
    System.out.println(novoPonto.x1 + "------------------" + novoPonto.y1);
    System.out.println(" |                    |");
    System.out.println(" |                    |");
    System.out.println(novoPonto.x2 + "------------------" + novoPonto.y2);
  }
}
