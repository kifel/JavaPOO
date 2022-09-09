package br.com.poo.pessoas;

public class Gerente extends Funcionario {

    protected boolean controleCaixa;
    protected int numeroFuncionarios;

    public Gerente() {
        super();
    }

    public Gerente(String name, String cpf, String agencia, double salario, int senha, boolean controleCaixa,
            int numeroFuncionarios) {
        super(name, cpf, agencia, salario, senha);
        this.controleCaixa = controleCaixa;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public boolean isControleCaixa() {
        return controleCaixa;
    }

    public void setControleCaixa(boolean controleCaixa) {
        this.controleCaixa = controleCaixa;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    // "If the employee is a manager, return the manager's bonus, witch is 15% of
    // the salary, otherwise return the employee's bonus."
    @Override
    public double getBonificacao() {
        return this.salario * 0.15;
    }

}
