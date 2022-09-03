package br.com.residencia.poo.listas;

import javax.swing.JOptionPane;

public class ListaUmTerceiroExercicio {
    public static void main(String[] args) {
        // It's asking the user to input a number.
        String number1 = JOptionPane.showInputDialog("Digite um número");
        String number2 = JOptionPane.showInputDialog("Digite outro número");

        // It's a try catch block. It's trying to parse the input from the user to a double. If it
        // fails, it will show an error message.
        try {
            // It's parsing the input from the user to a double.
            double num = Double.parseDouble(number1);   
            double num2 = Double.parseDouble(number2);
            // It's checking if the user input is less than 0. If it is, it will show an error message.
            // If it's not, it will check if the user input is 0. If it is, it will show an error
            // message. If it's not, it will do the math.
            if (num < 0) {
                JOptionPane.showMessageDialog(null, "Valor invalido");
            }else if (num == 0 || num2 == 0){
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