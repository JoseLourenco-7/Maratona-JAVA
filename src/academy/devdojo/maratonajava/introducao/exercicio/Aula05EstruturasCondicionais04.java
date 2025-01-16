package academy.devdojo.maratonajava.introducao.exercicio;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args){
        double salarioAnual = 25000;
        double primeiraFaixa = 9.70 /100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if(salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual > 34712 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        }else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println("Valor do imposto:  " + valorImposto);
        System.out.println("Saldo do sálario: " + (salarioAnual - valorImposto));

    }

    public static class Aula05EstruturasCondicionais06 {
        public static void main(String[] args) {
           byte dia = 5;
           String diaSemana;
           switch (dia){
               case 1:
                   System.out.println("Dia da semana é: Domingo");

                   break;
               case 2:
                   System.out.println("Dia da semana é: Segunda");
                   break;
               case 3:
                   System.out.println("Dia da semana é: Terça");
                   break;
               case 4:
                   System.out.println("Dia da semana é: Quarta");
                   break;
               case 5:
                   System.out.println("Dia da semana é: Quinta");
                   break;
               case 6:
                   System.out.println("Dia da semana é: Sexta");
                   break;
               case 7:
                   System.out.println("Dia da semana é: Sabádo");
                   break;
               default:
                   System.out.println("Dia inválido");
           }

        }
    }
}
