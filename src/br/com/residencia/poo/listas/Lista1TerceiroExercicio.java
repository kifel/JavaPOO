package br.com.residencia.poo.listas;

import javax.swing.JOptionPane;

public class Lista1TerceiroExercicio {
    public static void main(String[] args) {
        // It's asking the user to input a number.
        String number1 = JOptionPane.showInputDialog("Digite um número");
        String number2 = JOptionPane.showInputDialog("Digite outro número");

        // It's converting the string to a double.
        try {
            double num = Double.parseDouble(number1);   
            double num2 = Double.parseDouble(number2);
            if (num < 0) {
                JOptionPane.showMessageDialog(null, "Valor invalido");
            }else if (num == 0 && num2 == 0){
                JOptionPane.showMessageDialog(null, "Impossível de dividir");
            }else {
                double sum = num + num2;
                double sub = num - num2;
                double mult = num * num2;
                double divi = num / num2;
    
                JOptionPane.showMessageDialog(null, "Soma: " + sum + "\nSubstração: " + sub + "\nMultiplicação: " + mult + "\nDivisão: " + divi);
            }
        }catch(NumberFormatException ex){

            JOptionPane.showMessageDialog(null,"São permitidos apenas números","Alerta",JOptionPane.ERROR_MESSAGE);
        }
    }
}