import java.util.Scanner;

// Complete o código da classe Car a fim de que ela
// realize o que foi pedido acima.


// Não mexa na classe abaixo.
// Ela já está finalizada e pronta para compilar.
class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();

        while (true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            System.out.println("$" + line);
            if (ui[0].equals("end")) {
                break;
            } else if (ui[0].equals("enter")) {
                car.enter();
            } else if (ui[0].equals("leave")) {
                car.leave();
            } else if (ui[0].equals("show")) {
                System.out.println(car.toString());
            } else if (ui[0].equals("drive")) {// km
                car.drive(Integer.parseInt(ui[1]));
            } else if (ui[0].equals("fuel")) {// gas
                car.fuel(Integer.parseInt(ui[1]));
            } else {
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}

// Não mexa na classe abaixo.
// Ela já está finalizada e pronta para compilar.
