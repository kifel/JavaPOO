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

    public double somaT(double gastosJaneiro, double gastosFevereiro, double gastosMarco) {
        somaTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        return somaTrimestre;
    }

    public double soma(double abril, double maio, double junho) {
        somaTrimestre += abril + maio + junho;
        return somaTrimestre;
    }

    public double soma(double julho, double agosto, double setembro, double outubro, double novembro, double dezembro) {
        somaTrimestre += julho + agosto + outubro + setembro + novembro + dezembro;
        return somaTrimestre;
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

    public static void main(String[] args) {
        BalancoTrimestral balanco = new BalancoTrimestral();
 
        System.out.println(balanco.somaT(1.0, 1.0, 1.0)); 
        System.out.println(balanco.soma(1.0, 1.0, 1.0));
        System.out.println(balanco.soma(1.0, 1.0, 1.0, 1.0, 1.0, 1.0));
    }

}