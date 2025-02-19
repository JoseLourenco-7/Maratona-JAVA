package academy.devdojo.maratonajava.javacore.introducaoclass.exercicios.classes;

import academy.devdojo.maratonajava.javacore.introducaoclass.dominio.Professor;

public class CarroTest01 {
    public static void main(String[] argas){
        Carro carro01 = new Carro();
            carro01.nome = "Toyota Corolla";
            carro01.modelo = "Altis 2.0";
            carro01.ano = 2022;

        Carro carro02 = new Carro();
            carro02.nome = "Honda Civic";
            carro02.modelo = "Touring 1.5 Turbo";
            carro02.ano = 2023;



        System.out.println("Carro 01 - \n Nome: " + carro01.nome + " Modelo: " + carro01.modelo + " Ano: " + carro01.ano);

        System.out.println("\nCarro 02 - \n Nome: " + carro02.nome + " Modelo: " + carro02.modelo + " Ano: " + carro02.ano);
    }
}
