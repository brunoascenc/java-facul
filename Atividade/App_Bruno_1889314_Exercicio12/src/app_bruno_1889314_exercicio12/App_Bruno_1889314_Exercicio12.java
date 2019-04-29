/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_bruno_1889314_exercicio12;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_Bruno_1889314_Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner valores = new Scanner(System.in);
        valores.useLocale(Locale.US);

        double pontosNov;
        double pontosDez;
        double pontosJan;
        double i;
        double pontosGeral = 0;
        double media;

        for (i = 1; i <= 15; i++) {
            System.out.println("Informe a pontuação, para os meses de novembro, dezembro e janeiro, do funcionário: " + i);
            pontosNov = valores.nextDouble();
            pontosDez = valores.nextDouble();
            pontosJan = valores.nextDouble();

            pontosGeral = pontosNov + pontosDez + pontosJan;
            media = pontosGeral / 3;
            System.out.println("Pontuação geral: " + pontosGeral);
            System.out.println("Media: " + media);
        }
    }

}
