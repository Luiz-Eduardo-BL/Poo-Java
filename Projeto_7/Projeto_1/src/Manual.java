class Manual {
    public static void main(String[] args) {
        /* case iniciar */
        Account conta = new Account(100);
        System.out.println(conta);
        // print: account:100 balance:0

        System.out.println();

        /* case depositar */
        conta.deposit(Label.deposit, 100);
        conta.deposit(Label.deposit,-10);
        // print: fail: invalid value
        System.out.println(conta);
        // print: account:100 balance:100

        System.out.println();

        /* case debito */
        conta.withdraw(20);
        conta.fee(10);
        System.out.println(conta);
        // print: account:100 balance:70
        conta.withdraw(150);
        // print: fail: insuficient balance
        conta.withdraw(30);
        conta.fee(5);
        conta.deposit(Label.deposit, 5);
        conta.fee(1);
        System.out.println(conta);
        // print: account:100 balance:39

        System.out.println();

        /* case extrato */
        /* extrato mostra todas as operações desde a abertura da account */
        for(Operation op : conta.getBalanceManager().getExtract()){
            System.out.println(op);
        }
        /*  print:
            0:  opening:    0:    0
            1:  deposit:  100:  100
            2: withdraw:  -20:   80
            3:      fee:  -10:   70
            4: withdraw:  -30:   40
            5:      fee:   -5:   35
            6:  deposit:    5:   40
            7:      fee:   -1:   39
         */

        System.out.println();
        
        /* case extrato n */
        /* mostra as ultimas duas operacoes */
        for(Operation op : conta.getBalanceManager().getExtract(2)) {
            System.out.println(op);
        }
        /*  print:
            6:  deposit:    5:   40
            7:      fee:   -1:   39
         */

        System.out.println();
        
        /* case extornar */
        conta.reverse(1);
        // print: fail: index 1 is not a fee
        conta.reverse(5);
        conta.reverse(7);
        conta.reverse(50);
        // print: fail: index 50 invalid

        System.out.println();

        /* case novo extrato */
        conta.getBalanceManager().getExtract().forEach(System.out::println);
        /*  print:
            0:  opening:    0:    0
            1:  deposit:  100:  100
            2: withdraw:  -20:   80
            3:      fee:  -10:   70
            4: withdraw:  -30:   40
            5:      fee:   -5:   35
            6:  deposit:    5:   40
            7:      fee:   -1:   39
            8:  reverse:    5:   44
            9:  reverse:    1:   45
         */
        
        System.out.println();

        /* case extrato tarifa */
        conta.fee(50);
        conta.getBalanceManager().getExtract(2).forEach(System.out::println);
        /*  print:
            9:  reverse:    1:   45
           10:      fee:  -50:   -5
         */

    }
}