package academy.devdojo.maratonajava.introducao;

public class Aula07Array02 {
    public static void main(String[] args){
        int[] idades = new int[3];
        idades[0] = 13;
        idades[1] = 18;
        idades[2] = 15;

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}
