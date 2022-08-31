package br.com.residencia.poo.lista1;

import javax.swing.JOptionPane;

public class TerceiroExercicio {
    public static void main(String[] args) {
        String number1 = JOptionPane.showInputDialog("Digite um número");
        String number2 = JOptionPane.showInputDialog("Digite outro número");

        Double num = Double.parseDouble(number1);
        Double num2 = Double.parseDouble(number2);

        if (num < 0) {
            JOptionPane.showMessageDialog(null, "Valor invalido");
        }else if (num == 0 && num2 == 0){
            JOptionPane.showMessageDialog(null, "Impossível de dividir");
        }else {
            Double sum = num + num2;
            Double sub = num - num2;
            Double mult = num * num2;
            Double divi = num / num2;

            JOptionPane.showMessageDialog(null, "Soma: " + sum + "\nSubstração: " + sub + "\nMultiplicação: " + mult + "\nDivisão: " + divi);
        }
    }
}
