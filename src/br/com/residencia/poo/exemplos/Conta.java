package br.com.residencia.poo.exemplos;

public class Conta {
    int numero;
    String titular;
    double saldo;

    public boolean sacar(double valor) {
        if (this.saldo < valor) {
            return false;
        }else {
            double novoSaldo = this.saldo - valor;
            this.saldo = novoSaldo;

            return true;
        }
    }
}
