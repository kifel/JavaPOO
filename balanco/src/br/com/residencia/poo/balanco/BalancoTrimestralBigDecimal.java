package br.com.residencia.poo.balanco;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BalancoTrimestralBigDecimal {

	private BigDecimal gastosJaneiro = new BigDecimal(15000.00);
	private BigDecimal gastosFevereiro = new BigDecimal(23000.00);
	private BigDecimal gastosMarco = new BigDecimal(17000.00);

	private BigDecimal soma = gastosJaneiro.add(gastosFevereiro);
	private BigDecimal somaTotal = soma.add(gastosMarco);
	
	public BalancoTrimestralBigDecimal() {
	}
	
	public BalancoTrimestralBigDecimal(BigDecimal gastosJaneiro, BigDecimal gastosFevereiro, BigDecimal gastosMarco,
			BigDecimal soma, BigDecimal somaTotal) {
		this.gastosJaneiro = gastosJaneiro;
		this.gastosFevereiro = gastosFevereiro;
		this.gastosMarco = gastosMarco;
		this.soma = soma;
		this.somaTotal = somaTotal;
	}

	public BigDecimal soma() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("O balanço trimestral total é R$ " + df.format(somaTotal));
		
		System.out.printf("O balanço trimestral total é R$ %.2f", somaTotal);
		return somaTotal;
	}
	
	public BigDecimal soma(BigDecimal gastosJaneiro) {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\nO balanço de janeiro é R$ " + df.format(gastosJaneiro));
		
		System.out.printf("O balanço de janeiro é R$ %.2f", gastosJaneiro);
		return gastosJaneiro;
	}
	
	public BigDecimal soma(BigDecimal gastosJaneiro, BigDecimal gastosFevereiro) {
		BigDecimal somaTotal = gastosJaneiro.add(gastosFevereiro);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\nO balanço bimestral total é R$ " + df.format(somaTotal));
		
		System.out.printf("O balanço bimestral total é R$ %.2f", somaTotal);
		return somaTotal;
	}
	
	public BigDecimal soma(BigDecimal gastosJaneiro, BigDecimal gastosFevereiro, BigDecimal gastosMarco) {
		BigDecimal soma = gastosJaneiro.add(gastosFevereiro);
		BigDecimal somaTotal = soma.add(gastosMarco);

		System.out.printf("\nO balanço trimestral total é R$ %.2f", somaTotal);
		
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\nO balanço trimestral total é R$ " + df.format(somaTotal) + "\n*********");
		
		return somaTotal;
	}
	
}
