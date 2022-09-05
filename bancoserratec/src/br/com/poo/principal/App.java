package br.com.poo.principal;

import br.com.poo.contas.Conta;

public class App {
    public static void main(String[] args) {
        Conta minhaConta1 = new Conta(123, "kifel", 1000);
        Conta minhaConta2 = new Conta(1234, "Teste", 0);
        minhaConta1.sacar(100);
        minhaConta1.depositar(3000);
        System.out.println("\n");
        System.out.println("\n");
        minhaConta1.transferir(1000.0, minhaConta2);
        System.out.println("\n");

        System.out.println("Titular da conta:" + minhaConta1.getTitular() + "\nSaldo da conta:" + minhaConta1.getSaldo()
                + "\nNumero da conta:" + minhaConta1.getNumero());
        System.out.println("\n");
        System.out.println("Titular da conta:" + minhaConta2.getTitular() + "\nSaldo da conta:" + minhaConta2.getSaldo()
                + "\nNumero da conta:" + minhaConta2.getNumero());
        System.out.println("\n");

    }
}
