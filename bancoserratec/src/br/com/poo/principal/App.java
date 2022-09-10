package br.com.poo.principal;

import br.com.poo.contas.Conta;
import br.com.poo.pessoas.*;

public class App {
    public static void main(String[] args) {
        Conta minhaConta1 = new Conta(123, "kifel", 1000);
        Conta minhaConta2 = new Conta(1234, "Teste", 0);
        
        Funcionario objFuncionario = new Funcionario();
        Funcionario objFunc = new Funcionario("kifel", "123", "25-b", 3000.0, 123456);
        
        Diretor objDiretor = new Diretor();
        Diretor objDir = new Diretor("DiretorTeste", "1234", "25-b", 3000.0, 123456, "123-4", 10000.0);

        System.out.println(objFunc.getBonificacao() + objFunc.getSalario());
        System.out.println(objDir.getBonificacao() + objDir.getSalario());


        
        if(minhaConta1.sacar(100) == false) {
            System.out.println("Saldo insuficiente");
        }else {
            System.out.println("Sacado com sucesso");
        }

        if (minhaConta1.depositar(3000) == false) {
            System.out.println("Impossível depositar");
        }else {
            System.out.println("Depositado com sucesso");
        }

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
