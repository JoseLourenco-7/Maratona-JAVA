package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao01 {
    public static void main(String[] args) {
      // while, do while, for

        System.out.println("\nWHILE \n");
       int count = 1;
       while (count < 11){
           System.out.println(count);
           count += 1;
       }

        System.out.println("\nDO-WHILE\n");

       count = 10;
       do {
           System.out.println(count);
           count -= 1;
       }       while (count >= 1);

        System.out.println(" \nFOR \n");

       for (int i = 1; i <= 10; i++){
           System.out.println( i);
       }

    }
}
