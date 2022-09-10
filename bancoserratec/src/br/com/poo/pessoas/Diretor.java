package br.com.poo.pessoas;

public class Diretor extends Funcionario {
    private String listaAgencia;
    private Double capitalBruto;

    public Diretor() {
        super();
    }

    public Diretor(String name, String cpf, String agencia, double salario, int senha, String listaAgencia,
            Double capitalBruto) {
        super(name, cpf, agencia, salario, senha);
        this.listaAgencia = listaAgencia;
        this.capitalBruto = capitalBruto;
    }

    public String getListaAgencia() {
        return listaAgencia;
    }

    public void setListaAgencia(String listaAgencia) {
        this.listaAgencia = listaAgencia;
    }

    public Double getCapitalBruto() {
        return capitalBruto;
    }

    public void setCapitalBruto(Double capitalBruto) {
        this.capitalBruto = capitalBruto;
    }

    public double getBonificacao() {
        return getSalario() * 0.15;
    }
}
