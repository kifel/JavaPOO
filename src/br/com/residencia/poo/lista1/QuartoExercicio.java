package br.com.residencia.poo.lista1;

import java.util.Scanner;

public class QuartoExercicio {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            // It's printing a message on the screen.
            System.out.println("Digite a temperatura em Celsius");
            // It's getting the user input and storing it in the variable `temp`.
            Double temp = myObj.nextDouble();
            // It's converting the temperature from Celsius to Fahrenheit.
            Double fahrenheit =  (temp * 1.8) + 32;

           // It's printing the temperature in Fahrenheit with two decimal places.
            System.out.printf("A temperatura é %.2f°", fahrenheit);
        }
    }
}