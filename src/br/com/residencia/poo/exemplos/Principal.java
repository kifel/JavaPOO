package br.com.residencia.poo.exemplos;

public class Principal {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();

        minhaConta.titular = "kifel";
        minhaConta.numero = 123;
        minhaConta.saldo = 12312;

        System.out.println(minhaConta.titular+ "\n " + minhaConta.saldo + "\n " + minhaConta.numero);

        minhaConta.sacar(1000);

        System.out.println(minhaConta.titular+ "\n " + minhaConta.saldo + "\n " + minhaConta.numero);
    }
}
