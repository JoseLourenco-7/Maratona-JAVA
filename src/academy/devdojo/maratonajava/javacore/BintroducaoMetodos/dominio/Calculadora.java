package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Calculadora {
   public void somaDoisNumeros(){
       System.out.println(10 + 10);
   };

   public void subtraiDoisNumeros(int num1, int num2){
       int resultado = num1 - num2;
       System.out.println(resultado);
   }

   public void multiplicaDoisNumeros(int num1, int num2){
       System.out.println(num1 * num2);
   }

   public double divideDoisNumeos (double num1, double num2){

        if (num2 == 0){
            return 0;
        }else {
            return num1 / num2;
        }
   };

   public void imprimeDivisaoDoisNumeros(double num1, double num2 ){
        if (num2 == 0){
            System.out.println("Não existe divião por zero");
        }else {
            System.out.println(num1 / num2);
        }
   }
};



















