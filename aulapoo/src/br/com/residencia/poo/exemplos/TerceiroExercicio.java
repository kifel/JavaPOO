package br.com.residencia.poo.exemplos;

import java.util.Scanner;

public class TerceiroExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String name = scanner.nextLine();
        System.out.println("Digite a sua idade");
        int age = scanner.nextInt();
        System.out.println("O seu nome: " + name + " e sua idade é " + age);
        scanner.close();
    }
}
