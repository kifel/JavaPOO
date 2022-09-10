package br.com.poo.contas;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta() {
        super();
    }

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

    public boolean sacar(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }
    
    public boolean depositar(double valor) {
        if (valor < 0) {
            return false;
        } else {
            this.saldo += valor;
            return true;
        }
    }

    public boolean transferir(double valor, Conta nomeConta) {
        boolean transfere = sacar(valor);
        if (transfere == false) {
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            nomeConta.depositar(valor);
            System.out.println("Transferido com sucesso");
            return true;
        }
    }
}
