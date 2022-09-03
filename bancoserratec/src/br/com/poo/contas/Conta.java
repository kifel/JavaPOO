package br.com.poo.contas;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            this.saldo -= valor;
            System.out.println("Sacado com sucesso");
            return true;
        }
    }

    public boolean depositar(double valor) {
        if (valor < 0) {
            System.out.println("Valor invalido");
            return false;
        } else {
            this.saldo += valor;
            System.out.println("Depositado com sucesso");
            return true;
        }
    }

    public boolean transferir(double valor, Conta nomeConta) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            this.saldo -= valor;
            nomeConta.depositar(valor);
            System.out.println("Transferido com sucesso");
            return true;
        }
    }
}
