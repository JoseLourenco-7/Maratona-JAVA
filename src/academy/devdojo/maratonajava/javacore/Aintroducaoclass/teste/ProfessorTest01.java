package academy.devdojo.maratonajava.javacore.Aintroducaoclass.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclass.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args ){
        Professor professor = new Professor();
        professor.nome = "Kenshin";
        professor.idade = 28;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + "\nIdade: " + professor.idade + "\nSexo: " + professor.sexo);
    }
}
