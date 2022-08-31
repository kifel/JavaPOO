package br.com.residencia.poo.exemplos;

import javax.swing.JOptionPane;

public class QuartoExercicio {
    public static void main(String[] args) {
        String disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina");
        String name = JOptionPane.showInputDialog("Nome do aluno");
        Double soma = 0.0;

        // It's a for loop that will run 3 times.
        for (int i = 0; i < 3; i++) {
            // It's asking the user to input a number.
            String num = JOptionPane.showInputDialog("Digite a nota " + (i + 1) + " ");

            // It's converting the string to a double.
            Double nota = Double.parseDouble(num);

            // It's adding the value of `nota` to `soma`.
            soma += nota;
        }

        /*
        int count = 0;
        while (count < 3) {
            // It's asking the user to input a number.
            String num = JOptionPane.showInputDialog("Digite a nota " + (count + 1) + " ");

            // It's converting the string to a double.
            Double nota = Double.parseDouble(num);

            // It's adding the value of `nota` to `soma`.
            soma += nota;

            // It's incrementing the value of `count` by 1.
            count++;
        }
        */

        /*
        do {

            // It's asking the user to input a number.
            String num = JOptionPane.showInputDialog("Digite a nota " + (count + 1) + " ");

            // It's converting the string to a double.
            Double nota = Double.parseDouble(num);

            // It's adding the value of `nota` to `soma`.
            soma += nota;

            // It's incrementing the value of `count` by 1.
            count++;

        } while (count < 3);
        */

        JOptionPane.showMessageDialog(null,"Na disciplina " + disciplina + " O aluno " + name + " teve como media " + (soma / 3));
    }
}
