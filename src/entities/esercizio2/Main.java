package entities.esercizio2;

import entities.esercizio1.EccezzioneNumero;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        calcolaConsumo();
    }


    static void calcolaConsumo() {
        Scanner scanner = new Scanner(System.in);
        double litri = 0;
        double km = 0;
        boolean valoriValidi = false;

        do {

            try {
                System.out.println("Quanti km ha percorso l'auto ?");
                km = Double.parseDouble(scanner.nextLine());

                System.out.println("Quanti litri ha consumato?");
                litri = Double.parseDouble(scanner.nextLine());
                ;

                if (km == 0 || km < 0) {
                    throw new EccezzioneNumero("Valore non valido");
                }
                if (litri == 0 || litri < 0) {
                    throw new EccezzioneNumero("Valore non valido");
                }

                double kmLitro = km / litri;
                System.out.println(kmLitro + " km/litro");
                valoriValidi = true;

            } catch (NumberFormatException e) {
                System.out.println("Errore : inserisci solo numeri interi !");
            } catch (EccezzioneNumero e) {
                System.out.println("Errore: " + e.getMessage());
            }
        } while (!valoriValidi);
    }
}
