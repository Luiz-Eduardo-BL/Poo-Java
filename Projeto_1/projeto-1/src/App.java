import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DataHora datahora = new DataHora();
        System.out.println("----------------- Data -----------------------");
        //.objeto do DataHora.InicializaData que vai ler os valores e enviar para a classe datahora e fazer o msm com hora
        datahora.novaData.inicializaData(sc.nextByte(), sc.nextByte(), sc.nextShort());

        System.out.println("----------------- Hora -----------------------");
        datahora.hora.inicializaHora(sc.nextByte(), sc.nextByte(), sc.nextByte());

        System.out.println("-------------- Data & Hora -------------------");
        datahora.mostraDataHora();
    }
}