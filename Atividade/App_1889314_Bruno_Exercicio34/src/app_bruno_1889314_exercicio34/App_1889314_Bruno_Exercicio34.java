/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_bruno_1889314_exercicio34;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_Bruno_1889314_Exercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);
        double comprimentoC;
        double forca1;
        double forca2;
        double soma = 0;
        double medidas;

        System.out.println("Digite  comprimento: ");
        comprimentoC = ler.nextDouble();

        System.out.println("Digite a força 1: ");
        forca1 = ler.nextDouble();
        System.out.println("Digite a força 2: ");
        forca2 = ler.nextDouble();

        soma = comprimentoC + forca1 + forca2;
        medidas = soma / 3;

        System.out.printf("Medidas do C1 e C2: %.2f", medidas);
    }

}
