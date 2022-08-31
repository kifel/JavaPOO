package br.com.residencia.poo.listas;

import java.util.Scanner;

public class Lista1QuartoExercicio {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        // It's printing a message on the screen.
        System.out.println("Digite a temperatura em Celsius");
        // It's getting the user input and storing it in the variable `temp`.
        double temp = myObj.nextDouble();
        // It's converting the temperature from Celsius to Fahrenheit.
        double fahrenheit =  (temp * 1.8) + 32;

        // It's printing the temperature in Fahrenheit with two decimal places.
        System.out.printf("A temperatura é %.2f°", fahrenheit);

        myObj.close();
        
    }
}