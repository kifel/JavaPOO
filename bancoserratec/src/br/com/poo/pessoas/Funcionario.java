package br.com.poo.pessoas;

public class Funcionario {
    private String name;
    private String cpf;
    private String agencia;
    private double salario;
    private int senha;
    
    public Funcionario () {
        super();
    }
    
    public Funcionario(String name, String cpf, String agencia, double salario, int senha) {
        this.name = name;
        this.cpf = cpf;
        this.agencia = agencia;
        this.salario = salario;
        this.senha = senha;
    }
    
    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    //This function returns the bonus of the employee, which is 10% of the salary.
    public double getBonificacao() {
        return this.salario * 0.10;
    }

    // A method that checks if the password and login are correct.
    public boolean autenticar(int senha, String login) {
        if (getSenha() == senha && getCpf() == login) {
            System.out.println("Acesso permitido");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
}
