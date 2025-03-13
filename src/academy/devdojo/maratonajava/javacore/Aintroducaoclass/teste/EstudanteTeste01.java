package academy.devdojo.maratonajava.javacore.Aintroducaoclass.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclass.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Samurai";
        estudante.idade = 25;
        estudante.Sexo = 'M';

        System.out.println("Estudade: " + estudante.nome + "\nIdade: " + estudante.idade + "\nSexo: " + estudante.Sexo);

    }
}
