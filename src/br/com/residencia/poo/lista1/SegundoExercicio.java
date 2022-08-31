package br.com.residencia.poo.lista1;

import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) {

        int sum = 0;
        
        try(Scanner myObj = new Scanner(System.in)) {
            for (int i = 0; i < 6; i++) {
                System.out.println("Digite a idade do amigo " + (i+1));
                int age = myObj.nextInt();
                sum += age;
            }
            System.out.println("Digite a sua idade");
            int age = myObj.nextInt();
            System.out.println("Tempo de vida " + (age + sum));
        }
    }
}