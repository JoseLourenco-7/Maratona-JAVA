package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();


       double resultadoDivisao = calculadora.divideDoisNumeos(100, 8);
       System.out.println(resultadoDivisao);

    }
}
