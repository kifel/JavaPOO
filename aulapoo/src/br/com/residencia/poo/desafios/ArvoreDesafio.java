package br.com.residencia.poo.desafios;

import java.util.Scanner;

public class ArvoreDesafio {
    public static void main(String[] args) {
        int pos;
        int ini;
        int tronco = 0;
        int alturaTronco = 3;
        int quantidade = 1;

        // It's asking the user to input the size of the tree.
        Scanner myObj = new Scanner(System.in);
        System.out.print("Digite o tamanho da arvore: ");
        pos = myObj.nextInt();

        ini = pos;

        System.out.print("\n");

        // It's printing the tree.
        for (int i = 0; i <= pos; i++) {
            // It's printing the spaces before the stars.
            for (int j = 1; j <= ini; j++) {
                System.out.print(" ");
            }
            ini -= 1;
            // It's printing the stars.
            for (int j = 1; j <= quantidade; j++) {
                if (j == 1) {
                    System.out.print("/");
                    if (quantidade == 1) {
                        System.out.print("\\");
                    }
                } else if (j == quantidade) {
                    System.out.print("*");
                    System.out.print("\\");
                } else {
                    System.out.print("*");
                }
            }
            quantidade += 2;
            System.out.print("\n");
        }

        // It's checking the size of the tree and setting the trunk size and height.
        if (pos > 10 && pos < 24) {
            pos -= 2;
            tronco = 4;
        } else if (pos >= 25) {
            alturaTronco = 5;
            pos -= 3;
            tronco = 6;
        } else {
            tronco = 2;
            pos -= 1;
        }

        // It's printing the trunk of the tree.
        for (int i = 0; i < alturaTronco; i++) {
            // It's printing the spaces before the stars.
            for (int j = 1; j <= pos; j++) {
                System.out.print(" ");
            }
            // It's printing the trunk of the tree.
            for (int j = 0; j < tronco; j++) {
                if (j == 0) {
                    System.out.print("|");
                    System.out.print("*");

                } else {
                    System.out.print("*");
                }

                if (j == tronco - 1) {
                    System.out.print("|");
                }
            }
            System.out.print("\n");
        }

        myObj.close();
    }
}
