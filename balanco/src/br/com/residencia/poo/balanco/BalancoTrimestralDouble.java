package br.com.residencia.poo.balanco;

import java.text.DecimalFormat;

public class BalancoTrimestralDouble {

	private Double gastosJaneiro = 15000.00;
	private Double gastosFevereiro = 23000.00;
	private Double gastosMarco = 17000.00;

	private Double somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
	
	public BalancoTrimestralDouble() {
	}

	public BalancoTrimestralDouble(Double gastosJaneiro, Double gastosFevereiro, Double gastosMarco, Double somaTotal) {
		this.gastosJaneiro = gastosJaneiro;
		this.gastosFevereiro = gastosFevereiro;
		this.gastosMarco = gastosMarco;
		this.somaTotal = somaTotal;
	}

	public Double soma() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("O balanço trimestral total é R$ " + df.format(somaTotal));
		
		System.out.printf("O balanço trimestral total é R$ %.2f", somaTotal);
		return somaTotal;
	}
	
	public Double soma(Double gastosJaneiro) {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\nO balanço de janeiro é R$ " + df.format(gastosJaneiro));
		
		System.out.printf("O balanço de janeiro é R$ %.2f", gastosJaneiro);
		return gastosJaneiro;
	}
	
	public Double soma(Double gastosJaneiro, Double gastosFevereiro) {
		Double somaTotal = gastosJaneiro + gastosFevereiro;
		
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\nO balanço bimestral total é R$ " + df.format(somaTotal));
		
		System.out.printf("O balanço bimestral total é R$ %.2f", somaTotal);
		return somaTotal;
	}
	
	public Double soma(Double gastosJaneiro, Double gastosFevereiro, Double gastosMarco) {
		Double somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.printf("\nO balanço trimestral total é R$ %.2f", somaTotal);

		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\nO balanço trimestral total é R$ " + df.format(somaTotal) + "\n*********");
		
		return somaTotal;
	}
	
}