package entities.esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static void mostraDatiArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + "° Elemento = " + array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numbers = new int[5];
        numbers[0] = random.nextInt(10) + 1;
        numbers[1] = random.nextInt(10) + 1;
        numbers[2] = random.nextInt(10) + 1;
        numbers[3] = random.nextInt(10) + 1;
        numbers[4] = random.nextInt(10) + 1;

        mostraDatiArray(numbers);

        boolean ripeti = true;
        while (ripeti) {
            int indice = 1;
            do {
                if (indice < 0 || indice >= numbers.length) {
                    System.out.println("Inserisci un indice valido ");
                } else {
                    System.out.println("Quale elemento vuoi modificare ?");
                }
                try {
                    String valore = scanner.nextLine();
                    if (!valore.matches("-?\\d+")) {
                        throw new EccezzioneNumero("'" + valore + "' non è un numero intero!");
                    }
                    indice = Integer.parseInt(valore);
                } catch (EccezzioneNumero e) {
                    System.out.println("Errore: " + e.getMessage());
                    indice = -1;
                }
            } while (indice < 0 || indice >= numbers.length);


            int nuovoValore;
            do {
                try {
                    System.out.println("Insersici il nuovo valore ");
                    String preValore = scanner.nextLine();
                    if (!preValore.matches("-?\\d+")) {
                        throw new EccezzioneNumero("'" + preValore + "' non è un numero intero!");
                    }
                    nuovoValore = Integer.parseInt(preValore);
                    numbers[indice] = nuovoValore;
                    mostraDatiArray(numbers);
                    if (nuovoValore == 0) {
                        ripeti = false;
                    }
                } catch (EccezzioneNumero e) {
                    System.out.println("Errore: " + e.getMessage());
                    nuovoValore = -1;
                }
            } while (nuovoValore == -1);
        }
    }
}
