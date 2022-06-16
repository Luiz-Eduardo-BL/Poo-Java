import java.util.Locale;

public class Manual {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        // cria três objetos da classe ComplexNumber p1, p2 e p3
        ComplexNumber p1 = new ComplexNumber(1, 2);
        ComplexNumber p2 = new ComplexNumber(3, 4);
        ComplexNumber p3 = new ComplexNumber(5.3, 7.8);

        // cria uma referência para apontar os resultados das operações
        ComplexNumber resultado;
        
        // imprime: (1.00 + 2.00i) + (3.00 + 4.00i) = (4.00 + 6.00i)
        resultado = p1.sum(p2);
        System.out.printf("%s + %s = %s%n", p1, p2, resultado);

        // imprime: (5.30 + 7.80i) - (5.30 + 7.80i) = (0.00 + 0.00i)
        resultado = p3.subtract(p3);
        System.out.printf("%s - %s = %s%n", p3, p3, resultado);

        // imprime: (5.30 + 7.80i) - (1.00 + 2.00i) = (4.30 + 5.80i)
        resultado = p3.subtract(p1);
        System.out.printf("%s - %s = %s%n", p3, p1, resultado);

        // imprime: (1.00 + 2.00i) * (5.30 + 7.80i) = (-10.30 + 18.40i)
        resultado = p1.multiply(p3);
        System.out.printf("%s * %s = %s%n", p1, p3, resultado);

        // imprime: (3.00 + 4.00i) / (5.30 + 7.80i) = (0.53 + -0.02i)
        resultado = p2.divide(p3);
        System.out.printf("%s / %s = %s%n", p2, p3, resultado);

        // imprime: (1.00 + 2.00i) != (5.30 + 7.80i)
        if(p1.equals(p3)) System.out.printf("%s == %s%n", p1, p3);
        else System.out.printf("%s != %s%n", p1, p3);

        // imprime: (3.00 + 4.00i) == (3.00 + 4.00i)
        ComplexNumber p4 = p2;
        if(p2.equals(p4)) System.out.printf("%s == %s%n", p2, p4);
        else System.out.printf("%s != %s%n", p2, p4);

        ComplexNumber p5 = new ComplexNumber(p3.getReal(), p3.getImaginary());

        // imprime: p3 e p5 referenciam objetos diferentes
        if(p3 == p5) System.out.println("p3 e p5 referenciam o mesmo objeto");
        else System.out.println("p3 e p5 referenciam objetos diferentes");

        // imprime: (5.30 + 7.80i) == (5.30 + 7.80i)
        if(p3.equals(p5)) System.out.printf("%s == %s%n", p3, p5);
        else System.out.printf("%s != %s%n", p3, p5);
    }
}