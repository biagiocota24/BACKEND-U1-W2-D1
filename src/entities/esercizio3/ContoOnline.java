package entities.esercizio3;

public class ContoOnline extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stamaSaldo() {
        System.out.println("Titolare: " + getTitolare() + "- Saldo: " + getSaldo() + " nMovimenti: " + getnMovimenti() + " - Massimo movimenti: " + getMaxMovimenti() + " -Massimo prelievo possibile: " + maxPrelievo);
    }
}
