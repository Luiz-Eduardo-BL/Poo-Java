import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Retangulo desenhoRetangulo = new Retangulo();
        Linha linhaNova = new Linha();

        linhaNova.inicializaLinha(x1, y1, x2, y2);
        desenhoRetangulo.novoPonto.inicializaPontos(x1, y1, x2,y2);

        linhaNova.tamanho();
        desenhoRetangulo.mostraRetangulo();
    }
}
