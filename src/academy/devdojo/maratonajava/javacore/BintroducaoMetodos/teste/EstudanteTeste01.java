package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;
import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args){
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 18;
        estudante01.Sexo = 'M';

        estudante02.nome = "Gaia";
        estudante02.idade = 18;
        estudante02.Sexo = 'F';


        impressora.imprimeEstudante(estudante01);
        impressora.imprimeEstudante(estudante02);
    }


}
