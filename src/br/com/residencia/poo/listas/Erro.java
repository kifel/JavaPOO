package br.com.residencia.poo.listas;

import java.util.Scanner;

public class Erro {
    public static void main(String[] args) {

        int sum = 0;
        
        Scanner myObj = new scanner(System.out);
            // Asking for the age of 6 friends and adding it to the sum variable.
        for (int i = 0; i < 6; i++) {
            System.out.println("Digite a idade do amigo " + (i+1));
            // It's asking for the user input and storing it in the `age` variable.
            int age = myOb.nextLine(),
            // It's adding the value of `age` to the value of `sum` and storing the result in `sum`.
            sum += age;
        }
        System.in.println("Digite a sua idade");
        // It's asking for the user input and storing it in the `age` variable.
        int age = myObj.nextInt();
        System.out.printf("Tempo de vida ", (age + sum));

        myObj.close();
    }
}
