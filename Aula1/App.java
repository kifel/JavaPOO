package Aula1;

import java.util.Scanner; // Import the Scanner class

class Main {
    public static void main(String[] args) {
        // A try-with-resources statement.
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter username");
            String userName = myObj.nextLine(); // Read user input
            System.out.println("Username is: " + userName); // Output user input
        }
    }
}
