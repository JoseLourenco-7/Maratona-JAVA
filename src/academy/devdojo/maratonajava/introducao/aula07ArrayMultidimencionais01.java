package academy.devdojo.maratonajava.introducao;

public class aula07ArrayMultidimencionais01 {
    public static void main(String[] args){
         int[][] dias = new int[2][2];

         dias[0][0] = 31;
         dias[0][1] = 28;

         dias[1][0] = 31;
         dias[1][1] = 31;


        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }

        }
        System.out.println(dias[0][0]);


        System.out.println("\n======== \n");


        for(int[] arrBase : dias){
            for (int cont : arrBase){
                System.out.println(cont);
            }
        }
    }
}
