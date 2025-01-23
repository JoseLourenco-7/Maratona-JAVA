package academy.devdojo.maratonajava.introducao.exercicio;

public class Aula06EstruturasRepeticao04 {
    public static void main(String[] args) {
        double valotTotal = 30000;

        for (int parcela = 1; parcela <= valotTotal; parcela++){
           double valorParcela = valotTotal / parcela;
           if (valorParcela < 1000){
            break;
           }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela) ;
        }


    }
}
