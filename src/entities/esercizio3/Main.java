package entities.esercizio3;

public class Main {


    static void main(String[] args) {
        ContoCorrente conto = new ContoOnline("Biagio", 200, 1000);


        try {
            conto.preleva(300);
            System.out.println("Saldo dopo prelievo: " + conto.getSaldo() + " Numero di movimenti: " + conto.getnMovimenti());
        } catch (BancaException e) {
            System.out.println("Errore: " + e.getMessage() + " Numero di movimenti: " + conto.getnMovimenti());
        }

        ContoOnline contoOnline = new ContoOnline("Isabella", 200, 100);
        try {
            contoOnline.preleva(201);
        } catch (BancaException e) {
            System.out.println("Errore: " + e.getMessage());
        }


    }


}
