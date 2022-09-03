package br.com.residencia.poo.exemplos;

public class Conta {
    int numero;
    String titular;
    double saldo;

    public void sacar(double valor) {
        double novoSaldo = this.saldo - valor;
        this.saldo = novoSaldo;
    }
}
