package br.com.poo.pessoas;

public class Gerente extends Funcionario{
    

    //"If the employee is a manager, return the manager's bonus, witch is 15% of the salary, otherwise return the employee's bonus."
    @Override
    public double getBonificacao() {
        return this.salario * 0.15;
    }
    
}
