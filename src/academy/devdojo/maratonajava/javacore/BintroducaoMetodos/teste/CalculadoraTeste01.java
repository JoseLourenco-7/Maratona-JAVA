package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();

        System.out.println("Somando dois numeros");
        calculadora.somaDoisNumeros();

        System.out.println("=======================");

        System.out.println("Subtraindo dois numeros");
        calculadora.subtraiDoisNumeros(9, 5);

        System.out.println("Finalizando Calculadora Teste");


    }
}
