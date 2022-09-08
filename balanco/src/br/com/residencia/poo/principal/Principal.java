package br.com.residencia.poo.principal;

import java.math.BigDecimal;

import br.com.residencia.poo.balanco.BalancoTrimestralBigDecimal;
import br.com.residencia.poo.balanco.BalancoTrimestralDouble;
import br.com.residencia.poo.balanco.BalancoTrimestralInt;

public class Principal {

	public static void main(String[] args) {
		
//Balanco feito com bigDecimal
		BalancoTrimestralBigDecimal bt = new BalancoTrimestralBigDecimal();
		bt.soma();
		bt.soma(new BigDecimal(2000.00));
		bt.soma(new BigDecimal(2000.00), new BigDecimal(2000.00));
		bt.soma(new BigDecimal(2000.00), new BigDecimal(2000.00), new BigDecimal(2000.00));
		
//Balanco feito com double
		BalancoTrimestralDouble btd = new BalancoTrimestralDouble();
		btd.soma();
		btd.soma(2000.00);
		btd.soma(20000.00, 2000.00);
		btd.soma(2000.00, 45000.00, 2000.00);
		
//Balanco feito com int
		BalancoTrimestralInt bti = new BalancoTrimestralInt();
		bti.soma();
		bti.soma(2000);
		bti.soma(20000, 2000);
		bti.soma(2000, 45000, 2000);
	}

}
