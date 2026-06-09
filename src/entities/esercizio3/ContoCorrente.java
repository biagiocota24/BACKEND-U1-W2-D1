package entities.esercizio3;

public class ContoCorrente {
    private String titolare;
    private int nMovimenti;
    private final int maxMovimenti = 50;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public String getTitolare() {
        return titolare;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }

    public int getMaxMovimenti() {
        return maxMovimenti;
    }

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) {
        if (nMovimenti < maxMovimenti) saldo = saldo - x;
        else saldo = saldo - x - 0 - 50;
        nMovimenti++;
    }

    public double restituisciSaldo() {
        return saldo;
    }

}
