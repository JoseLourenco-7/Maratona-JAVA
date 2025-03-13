package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTeste02 {
    public static void main(String[] args){
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 18;
        estudante01.Sexo = 'M';


        estudante02.nome = "Gaia";
        estudante02.idade = 18;
        estudante02.Sexo = 'F';

        estudante01.imprime();


        System.out.println("=============================");
        estudante02.imprime();

    }


}
