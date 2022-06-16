public class Solver{
    public static void main(String[] args) {
        Time time = new Time(23, 59, 59);
        System.out.println(time); //23:59:59
        time.nextSecond();
        System.out.println(time); //00:00:00
        time.nextSecond();
        System.out.println(time); //00:00:01


        time = new Time(40, 20, 59);
        System.out.println(time); // imprime: 00:20:59
        time.nextSecond();
        System.out.println(time); // imprime: 00:21:00

        time = new Time(60, -5, 70);
        System.out.println(time); // imprime: 00:00:00
    }
}