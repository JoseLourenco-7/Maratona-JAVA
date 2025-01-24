package academy.devdojo.maratonajava.introducao.exercicio;

public class Aula06EstruturasRepeticao05 {
    public static void main(String[] args) {
        double valotTotal = 30000;

        for (int parcela = (int) valotTotal; parcela >=1 ; parcela--){
            double valorParcela = valotTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }


    }
}
