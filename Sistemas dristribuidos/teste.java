import java.util.Random;

public class teste {
    public static void main(String[] args) {
        int i;
        // double tempo;
        int[] vetor = new int[10000];
        int intervaloInicial = 0;
        int intervaloFinal = 10000;
        for (i = 0; i < vetor.length; i++) {
            vetor[i] = getRandomNumberRange(intervaloInicial, intervaloFinal);
            System.out.println(vetor[i]);
        }
        // new Thread(t1).start();
        int maior = Integer.MIN_VALUE;
        int indiceMaior = -1;
        for (int o = 0; o < vetor.length; o++) {
            if (vetor[o] > maior) {
                maior = vetor[o];
                indiceMaior = o;
            }
        }
        System.out.printf("Maior número é %d, no índice %d", maior, indiceMaior);

    }

    private static int getRandomNumberRange(int min, int max) {
        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
    }

    public static void bubbleSort(int[] a) {
        if (a == null) {
            throw new NullPointerException("The array doesn't exist.");
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}