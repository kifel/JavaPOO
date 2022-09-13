package br.com.poo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class LeituraEscrita {

	static final String PATH_BASICO = "./bancoserratec/temp/";
	static final String EXTENSAO = ".txt";

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
		String linha = "";
		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				System.out.println(linha);
			} else {
				break;
			}
		}
		buffRead.close();
	}

	public static void escritor(String path) throws IOException {
		try {
			FileWriter arq = new FileWriter(PATH_BASICO + path + EXTENSAO, true);
			BufferedWriter buffWrite = new BufferedWriter(arq);
			Scanner myObj = new Scanner(System.in);
			System.out.println("Escreva algo: ");
			String escrita = myObj.nextLine();
			buffWrite.append(escrita + "\n");
			buffWrite.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
