package Aula1;

import java.util.Scanner; // Import the Scanner class

class Main {
    public static void main(String[] args) {
        // A try-with-resources statement.
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter username");
            String userName = myObj.nextLine(); // Read user input
            System.out.println("Username is: " + userName); // Output user input
            System.out.println("digite um número: ");
            int number = myObj.nextInt(); // Read number
            System.out.println("digite Outro número: ");
            int number2 = myObj.nextInt(); // Read number
            // Comparing the two numbers and printing the bigger one.
            if (number > number2) {
                System.out.println("Esse número é maior " + number);
            } else {
                System.out.println("Esse número é maior " + number2);
            }
        }
    }
}
