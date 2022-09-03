package br.com.residencia.poo.desafios;

import java.util.Scanner;

public class ArvoreDesafio {
    public static void main(String[] args) {
        int pos;
        int ini; 
        int quantidade = 1;

        // It's asking the user to input the size of the tree.
        Scanner myObj = new Scanner(System.in);
        System.out.print("Digite o tamanho da arvore: ");
        pos = myObj.nextInt();

        ini = pos;

        System.out.print("\n");

        // It's printing the tree.
        for (int i = 1; i <= pos; i++) {
            // It's printing the spaces before the stars.
            for (int j = 1; j <= ini; j++) {
                System.out.print(" ");
            }
            ini -= 1;
            // It's printing the stars.
            for (int j = 1; j <= quantidade; j++) {
                System.out.print("*");
            }
            quantidade += 2;
            System.out.print("\n");
        }
        ini = pos -1;

        // It's printing the trunk of the tree.
        for (int i = 0; i < 3; i++) {
            // It's printing the spaces before the stars.
            for(int j = 1; j <= ini; j++) {
                System.out.print(" ");
            }
            // It's printing the trunk of the tree.
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    
        myObj.close();
    }
}
