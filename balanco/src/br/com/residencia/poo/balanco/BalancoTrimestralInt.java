package br.com.residencia.poo.balanco;

public class BalancoTrimestralInt {

	private int gastosJaneiro = 15000;
	private int gastosFevereiro = 23000;
	private int gastosMarco = 17000;

	private int somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
	
	public BalancoTrimestralInt() {
	}

	public BalancoTrimestralInt(int gastosJaneiro, int gastosFevereiro, int gastosMarco, int somaTotal) {
		super();
		this.gastosJaneiro = gastosJaneiro;
		this.gastosFevereiro = gastosFevereiro;
		this.gastosMarco = gastosMarco;
		this.somaTotal = somaTotal;
	}

	public int soma() {
		System.out.println("O balanço trimestral total é R$ " + somaTotal);
		return somaTotal;
	}
	
	public int soma(int gastosJaneiro) {
		System.out.println("O balanço de janeiro é R$ " + gastosJaneiro);
		return gastosJaneiro;
	}
	
	public int soma(int gastosJaneiro, int gastosFevereiro) {
		int somaTotal = gastosJaneiro + gastosFevereiro;
		System.out.println("O balanço bimestral total é R$ " + somaTotal);
		return somaTotal;
	}
	
	public int soma(int gastosJaneiro, int gastosFevereiro, int gastosMarco) {
		int somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println("O balanço trimestral total é R$ " + somaTotal);
		return somaTotal;
	}
	
}
