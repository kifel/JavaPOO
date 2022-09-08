package br.com.residencia.poo.listas;

public class BalancoTrimestral {
    private double gastosJaneiro;
    private double gastosFevereiro;
    private double gastosMarco;
    private double abril;
    private double maio;
    private double junho;
    private double julho;
    private double agosto;
    private double setembro;
    private double outubro;
    private double novembro;
    private double dezembro;

    private double somaTrimestre;

    public BalancoTrimestral() {

    }

    public BalancoTrimestral(double gastosJaneiro, double gastosFevereiro, double gastosMarco, double abril,
            double maio, double junho, double julho, double agosto, double setembro, double outubro, double novembro,
            double dezembro, double somaTrimestre) {
        this.gastosJaneiro = gastosJaneiro;
        this.gastosFevereiro = gastosFevereiro;
        this.gastosMarco = gastosMarco;
        this.abril = abril;
        this.maio = maio;
        this.junho = junho;
        this.julho = julho;
        this.agosto = agosto;
        this.setembro = setembro;
        this.outubro = outubro;
        this.novembro = novembro;
        this.dezembro = dezembro;
        this.somaTrimestre = somaTrimestre;
    }

    public double getGastosJaneiro() {
        return gastosJaneiro;
    }

    public double getGastosFevereiro() {
        return gastosFevereiro;
    }

    public double getGastosMarco() {
        return gastosMarco;
    }

    public double getAbril() {
        return abril;
    }

    public double getMaio() {
        return maio;
    }

    public double getJunho() {
        return junho;
    }

    public double getJulho() {
        return julho;
    }

    public double getAgosto() {
        return agosto;
    }

    public double getSetembro() {
        return setembro;
    }

    public double getOutubro() {
        return outubro;
    }

    public double getNovembro() {
        return novembro;
    }

    public double getDezembro() {
        return dezembro;
    }

    public void setGastosJaneiro(double gastosJaneiro) {
        this.gastosJaneiro = gastosJaneiro;
    }

    public void setGastosFevereiro(double gastosFevereiro) {
        this.gastosFevereiro = gastosFevereiro;
    }

    public void setGastosMarco(double gastosMarco) {
        this.gastosMarco = gastosMarco;
    }

    public void setAbril(double abril) {
        this.abril = abril;
    }

    public void setMaio(double maio) {
        this.maio = maio;
    }

    public void setJunho(double junho) {
        this.junho = junho;
    }

    public void setJulho(double julho) {
        this.julho = julho;
    }

    public void setAgosto(double agosto) {
        this.agosto = agosto;
    }

    public void setSetembro(double setembro) {
        this.setembro = setembro;
    }

    public void setOutubro(double outubro) {
        this.outubro = outubro;
    }

    public void setNovembro(double novembro) {
        this.novembro = novembro;
    }

    public void setDezembro(double dezembro) {
        this.dezembro = dezembro;
    }

    // calcula o segundo Trimestre
    // public double somaT(double gastosJaneiro, double gastosFevereiro, double gastosMarco) {
    //     setGastosJaneiro(gastosJaneiro);
    //     setGastosFevereiro(gastosFevereiro);
    //     setGastosMarco(gastosMarco);
    //     somaTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
    //     return somaTrimestre;
    // }

    // Calcula o segundo trimestre
    // public double soma(double abril, double maio, double junho) {
    //     setAbril(abril);
    //     setMaio(maio);
    //     setJunho(junho);
    //     somaTrimestre += abril + maio + junho;
    //     return somaTrimestre;
    // }

    // Calcula o Semestre
    // public double soma(double julho, double agosto, double setembro, double outubro, double novembro, double dezembro) {
    //     setJulho(julho);
    //     setAgosto(agosto);
    //     setSetembro(setembro);
    //     setOutubro(outubro);
    //     setNovembro(novembro);
    //     setDezembro(dezembro);
    //     somaTrimestre += julho + agosto + outubro + setembro + novembro + dezembro;
    //     return somaTrimestre;
    // }

    // Calcula o Trimestre, sendo ele o primeiro e o segundo
    public double soma(double primeiroMes, double segundoMes, double terceiroMes) {
        somaTrimestre += primeiroMes + segundoMes + terceiroMes;
        return somaTrimestre;
    }

    // Calcula o Semestre
    public double soma(double primeiroMes, double segundoMes, double terceiroMes, double quartoMes, double quintoMes, double sextoMes) {
        somaTrimestre += primeiroMes + segundoMes + terceiroMes + quartoMes + quintoMes + sextoMes;
        return somaTrimestre;
    }

    public static void main(String[] args) {
        BalancoTrimestral balanco = new BalancoTrimestral();

        System.out.println(balanco.soma(15.0, 15.0, 20.0));
        System.out.println(balanco.soma(30.0, 45.0, 150.0));
        System.out.println(balanco.soma(55.0, 1025.0, 45.0, 95.0, 456.0, 125.0));
    }

}