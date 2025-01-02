package academy.devdojo.maratonajava.introducao.exercicio;

import java.util.Scanner;

public class Aula02Exercicio {
    public static void main(String[] args){
        // Scanner scanner = new Scanner(System.in);
        String nome = "Samurai";
        String dataRecebimento = "02/01/2025";
        String endereco = "Rua faustino morata, Nº 23 ";
        double salario = 123669.67;
        String relatorio = "Eu " + nome + ", morando no endereço "
                + endereco + " confirmo que recebi o sálario de " + salario + ", na dataRecebimento " + dataRecebimento;

        System.out.println(relatorio);
    }
}
