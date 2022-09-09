package br.com.poo.pessoas;

public class Gerente extends Funcionario{
    
    @Override
    public double getBonificacao() {
        return this.salario * 0.15;
    }
    
}
