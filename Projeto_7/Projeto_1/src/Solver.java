import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Solver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account conta = new Account(0);
        while(true){
            String line = scanner.nextLine();
            System.out.println("$" + line);
            List<String> ui = Arrays.asList(line.split(" "));
            if(line.equals("end")) {
                break;
            } else if(ui.get(0).equals("show")) {
                System.out.println(conta);
            } else if(ui.get(0).equals("init")) {
                conta = new Account(Integer.parseInt(ui.get(1)));
            } else if(ui.get(0).equals("withdraw")) {
                conta.withdraw(Integer.parseInt(ui.get(1)));
            } else if(ui.get(0).equals("fee")) {
                conta.fee(Integer.parseInt(ui.get(1)));
            } else if(ui.get(0).equals("deposit")) {
                conta.deposit(Label.deposit, Integer.parseInt(ui.get(1)));
            } else if(ui.get(0).equals("reverse")) {
                final Account aux = conta;
                ui.stream().skip(1).forEach(index -> aux.reverse(Integer.parseInt(index)));
            } else if(ui.get(0).equals("extract")) {
                conta.getBalanceManager().getExtract().forEach(System.out::println);
            } else if(ui.get(0).equals("extractN")) {
                conta.getBalanceManager().getExtract(Integer.parseInt(ui.get(1))).forEach(System.out::println);
            } else {
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}