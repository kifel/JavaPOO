package br.com.residencia.poo.lista1;

import javax.swing.JOptionPane;

public class PrimeiroExercicio {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Digite o seu nome");
        String sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome");

        JOptionPane.showMessageDialog(null, "Bem vindo(a) "+ name + " " + sobrenome);
    }
}
