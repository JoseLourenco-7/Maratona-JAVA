package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();

        int num1 = 1;
        int num2 = 2;
        Integer num3 = 3;

        calculadora.alteraDoisNumeros(num1, num2, num3);

        System.out.println("\n Dentro do CalculadoraTeste04");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        System.out.println("Num3: " + num3);
    }
}
