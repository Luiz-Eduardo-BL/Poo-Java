# Números Complexos

Os números complexos são números compostos por uma **parte real** e **uma parte imaginária**. Eles representam o conjunto de todos os pares ordenados (x, y), cujos elementos pertencem ao conjunto dos números reais (`ℝ`).

A forma mais usual de representar números complexos é utilizando a forma algébrica. A forma algébrica, de um número complexo `z` é:

`z = a + bi`

onde:

- x é um número real indicado por: `x = Re(z)`, sendo a parte real de z.
- y é um número real indicado por: `y = Im(z)`, sendo a parte imaginária de z.

**Sua tarefa nesta atividade é:** Escrever em Java a classe *ComplexNumber* que represente um número complexo. Seu sistema deve ter pelo menos duas classes, a classe *ComplexNumber* e a classe *Manual*

***

## Requisitos
A classe deverá ter os seguintes métodos:

- **construtor**: que recebe dois valores de ponto flutuante como argumentos para inicializar os campos da classe (parte real e imaginária)

- **toString**: que deve retornar uma String contendo o número complexo encapsulado usando a notação `(a + bi)` onde `a` é a parte real e `b` a imaginária.

- **equals**: que recebe outra instância da classe **ComplexNumber** e retorna *true* se os valores dos campos encapsulados forem iguais aos da instância passada como argumento.

- **sum**: que recebe outra instância da classe **ComplexNumber** e soma este número complexo com o encapsulado usando a fórmula:
    - `(a + bi) + (c + di) = (a + c) + (b + d)i`

- **subtract**: que recebe outra instância da classe **ComplexNumber** e subtrai o argumento do número complexo encapsulado usando a fórmula:
    - `(a + bi) − (c + di) = (a − c) + (b − d)i`

- **multiply**: que recebe outra instância da classe **ComplexNumber** e multiplica este número complexo com o encapsulado usando a fórmula:
    - `(a + bi) ∗ (c + di) = (ac − bd) + (ad + bc)i`

- **divide**: que recebe outra instância da classe **ComplexNumber** e divide o número encapsulado pelo passado como argumento usando a fórmula:

    - ![function1](https://latex.codecogs.com/svg.image?\frac{a&plus;bi}{c&plus;di}=\frac{ac&plus;bd}{c^{2}&plus;d^{2}}&plus;\frac{bc-ad}{c^2&plus;d^2}i)

<!-- \frac{a+bi}{c+di}=\frac{ac+bd}{c^{2}+d^{2}}+\frac{bc-ad}{c^2+d^2}i -->

***

## Diagrama

![](diagrama.png)

***
## Esqueleto

<!--FILTER Solver.java java-->
```java
public class ComplexNumber {
    // programar
}

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
```
<!--FILTER_END-->
