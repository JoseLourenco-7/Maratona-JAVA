package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
       byte dia = 1;
       String diaSemana;
       switch (dia){
           case 1, 7:
               System.out.println("Final de Semana");
               break;
           case 2, 3, 4, 5, 6:
               System.out.println("Dia últil.");
               break;
           default:
               System.out.println("Dia inválido");
       }

    }
}
