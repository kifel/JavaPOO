package br.com.residencia.poo.aula1;

import javax.swing.JOptionPane;

public class QuartoExercicio {
    public static void main(String[] args) {
        String disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina");
        String name = JOptionPane.showInputDialog("Nome do aluno");
        Double soma = 0.0;

        for (int i = 0; i < 3; i++) {
            String num = JOptionPane.showInputDialog("Digite a nota " + (i + 1) + " ");

            Double nota = Double.parseDouble(num);

            soma += nota;
        }

        JOptionPane.showMessageDialog(null,
                "Na disciplina " + disciplina + " O aluno " + name + " teve como media " + (soma / 3));
    }
}
