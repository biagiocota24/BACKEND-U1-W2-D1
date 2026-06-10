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

    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) {
            saldo = saldo - x;
        } else saldo = saldo - x - 0.50;
        nMovimenti++;
        System.out.println("Hai prelevato: " + x + "€");
        System.out.println("Il tuo saldo attuale è: " + saldo + "€");
        if (saldo < 0) {
            throw new BancaException("Conto in rosso" + getSaldo());
        }
    }

    public double restituisciSaldo() {
        return saldo;
    }

}
