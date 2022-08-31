package br.com.residencia.poo.lista1;

import javax.swing.JOptionPane;

public class PrimeiroExercicio {
    public static void main(String[] args) {
        // It's asking the user to input a name.
        String name = JOptionPane.showInputDialog("Digite o seu nome");
        // It's asking the user to input a surname.
        String sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome");

        // It's showing a message dialog with the name and surname.
        JOptionPane.showMessageDialog(null, "Bem vindo(a) "+ name + " " + sobrenome);
    }
}