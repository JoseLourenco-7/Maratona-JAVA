package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){

        int inteiro = (int)100000000000L;
        long numeroGrande = (long) 1000000.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500F;
        byte idadeByte = 40;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';


        System.out.println(inteiro );
        System.out.println(falso);
        System.out.println(verdadeiro);



    }

    public static class Aula05EstruturasCondicionais {
        public static void main(String[] args) {
            int idade = 17;
            if(idade >= 18){
                System.out.println("Está autorizado a retirar CNH");
            }else {
                System.out.println("Não está autorizado a retirar CNH");

            }
        }
    }
}
