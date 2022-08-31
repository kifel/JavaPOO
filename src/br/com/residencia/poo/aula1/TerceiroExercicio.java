package br.com.residencia.poo.aula1;

import java.util.Scanner;

public class TerceiroExercicio {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o seu nome");
            String name = scanner.nextLine();
            System.out.println("Digite a sua idade");
            int age = scanner.nextInt();
            System.out.println("O seu nome: " + name + " e sua idade é " + age);
        }
    }
}
