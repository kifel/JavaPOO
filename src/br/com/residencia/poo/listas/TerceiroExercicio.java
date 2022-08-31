package br.com.residencia.poo.listas;

import javax.swing.JOptionPane;

public class TerceiroExercicio {
    public static void main(String[] args) {
        // It's asking the user to input a number.
        String number1 = JOptionPane.showInputDialog("Digite um número");
        String number2 = JOptionPane.showInputDialog("Digite outro número");

        // It's converting the string to a double.
        Double num = Double.parseDouble(number1);
        Double num2 = Double.parseDouble(number2);

        // It's checking if the number is less than 0, if it is, it will show a message saying that the
        // value is invalid. If it's not, it will check if the number is 0 and the other number is 0,
        // if it is, it will show a message saying that it's impossible to divide. If it's not, it will
        // do the sum, subtraction, multiplication and division.
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
