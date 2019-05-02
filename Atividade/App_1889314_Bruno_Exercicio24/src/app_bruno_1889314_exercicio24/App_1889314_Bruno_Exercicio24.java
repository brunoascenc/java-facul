/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_bruno_1889314_exercicio24;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_Bruno_1889314_Exercicio24 {

    /**
     * @param args the command line arguments
     */
    public final static int MAX = 100;

    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        float[][] matriz = new float[MAX][MAX];
        int delimitador; // delimitador da ordem da matriz
        float soma;

        System.out.print("\nDigite a ordem da matriz: ");
        delimitador = STDIN_SCANNER.nextInt();

        System.out.println("\nEntre com os valores da matriz:");
        for (int i = 0; i < delimitador; i++) {
            for (int j = 0; j < delimitador; j++) {
                System.out.print("matriz[" + (i + 1) + "][" + (j + 1) + "]= ");
                matriz[i][j] = STDIN_SCANNER.nextFloat();
            }
        }

        // Somando os termos desejados
        soma = 0;
        for (int i = 0; i < delimitador; i++) {
            for (int j = i + 1; j < delimitador; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.printf("A soma dos elementos que estao acima da diagonal principal é: %.2f\n", soma);
    }
    public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
