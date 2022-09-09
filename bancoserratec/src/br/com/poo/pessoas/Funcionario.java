package br.com.poo.pessoas;

public class Funcionario {
    protected String name;
    protected String cpf;
    protected double salario;
    protected String senha;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //This function returns the bonus of the employee, which is 10% of the salary.
    public double getBonificacao() {
        return this.salario * 0.10;
    }

    // A method that checks if the password and login are correct.
    public boolean autenticar(String senha, String login) {
        if (getSenha() == senha && getCpf() == login) {
            System.out.println("Acesso permitido");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
}
