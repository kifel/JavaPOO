package br.com.residencia.poo.aula1;

import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) {
        // A try-with-resources statement.
        System.out.println("Digite o seu nome");
        try (Scanner myObj = new Scanner(System.in)) {
            String name = myObj.nextLine(); // Getting the user input and storing it in the variable `name`.
            System.out.println("Olá O seu nome é " + name);
        }
    }
}
