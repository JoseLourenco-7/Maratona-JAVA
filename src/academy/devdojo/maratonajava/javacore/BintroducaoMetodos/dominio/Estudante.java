package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char Sexo;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.Sexo);
    }
}
