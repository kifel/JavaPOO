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

    // ANUAL.
    public BalancoTrimestral(double gastosJaneiro, double gastosFevereiro, double gastosMarco, double abril,
            double maio, double junho, double julho, double agosto, double setembro, double outubro,
            double novembro, double dezembro, double somaTrimestre) {
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

    // SEMESTRAL.
    public BalancoTrimestral(double gastosJaneiro, double gastosFevereiro, double gastosMarco, double abril,
            double maio, double junho, double somaTrimestre) {
        this.gastosJaneiro = gastosJaneiro;
        this.gastosFevereiro = gastosFevereiro;
        this.gastosMarco = gastosMarco;
        this.abril = abril;
        this.maio = maio;
        this.junho = junho;
        this.somaTrimestre = somaTrimestre;
    }

    // TRIMESTRAL.
    public BalancoTrimestral(double gastosJaneiro, double gastosFevereiro, double gastosMarco, double somaTrimestre) {
        this.gastosJaneiro = gastosJaneiro;
        this.gastosFevereiro = gastosFevereiro;
        this.gastosMarco = gastosMarco;
        this.somaTrimestre = somaTrimestre;
    }


    public double trimestre(double gastosJaneiro, double gastosFevereiro, double gastosMarco) {
        this.somaTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        return this.somaTrimestre;
    }

    public double semestre(double gastosJaneiro, double gastosFevereiro, double gastosMarco, double abril,
            double maio, double junho) {
        somaTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco + abril +
                maio + junho;
        return somaTrimestre;
    }

    public double anual(double gastosJaneiro, double gastosFevereiro, double gastosMarco, double abril,
            double maio, double junho, double julho, double agosto, double setembro, double outubro,
            double novembro, double dezembro) {
        somaTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco + abril +
                maio + junho + julho + agosto + outubro + setembro + novembro + dezembro;
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
        BalancoTrimestral trimestre = new BalancoTrimestral(150.0, 250.0, 350.0, 0);
        BalancoTrimestral semestre = new BalancoTrimestral(150.0, 250.0, 350.0, 350.0, 650.0, 1005.5, 0);
        BalancoTrimestral anual = new BalancoTrimestral(150.0, 250.0, 350.0, 350.0, 650.0, 1005.5, 359.0, 500.0, 1250.5,
                1500.0, 650.25, 150.0, 0);

        System.out.println(trimestre.trimestre(150.0, 250.0, 350.0));
        System.out.println(semestre.semestre(150.0, 250.0, 350.0, 350.0, 650.0, 1005.5));
        System.out.println(anual.anual(150.0, 250.0, 350.0, 350.0, 650.0, 1005.5, 359.0, 500.0, 1250.5,
                1500.0, 650.25, 150.0));
    }

}