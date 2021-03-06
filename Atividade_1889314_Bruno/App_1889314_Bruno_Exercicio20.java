/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_1889314_bruno_exercicio20;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_1889314_Bruno_Exercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);

        double[] notas = new double[300];
        double soma, mediaAlunos;
        double maiorNota = 0;
        double menorNota = 0;

        // Ler o número de alunos
        System.out.print("\nDigite a quantidade de alunos: ");
        int qtdAlunos = ler.nextInt();

        // Leitura das notas
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.print("\nDigite a nota: ");
            notas[i] = ler.nextDouble();

            if (i == 0) {
                menorNota = notas[i];
                maiorNota = notas[i];

            } else if (notas[i] < menorNota) {
                menorNota = notas[i];

            } else if (notas[i] > maiorNota) {
                maiorNota = notas[i];

            }
        }

        // Cálculo da média
        soma = 0.0;
        for (int i = 0; i < qtdAlunos; i++) {
            soma += notas[i];
        }

        mediaAlunos = soma / qtdAlunos;
        System.out.printf("Média das notas: %.2f\n", mediaAlunos);
        System.out.println("Melhor nota: " + maiorNota);
        System.out.println("Pior nota: " + menorNota);
    }

}
