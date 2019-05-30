/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_1889314_bruno_exercicio30;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_1889314_Bruno_Exercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);

        int qtdParafusos, qtdCaixasGrandes, qtdCaixasPequenas, resto;

        System.out.println("Digite a quantidade de parafusos: ");
        qtdParafusos = ler.nextInt();

        qtdCaixasGrandes = qtdParafusos / 40;
        qtdCaixasPequenas = qtdParafusos % 40 / 10;
        resto = qtdParafusos % 40 % 10;

        System.out.println("Caixas grandes: " + qtdCaixasGrandes);
        System.out.println("Caixas pequenas: " + qtdCaixasPequenas);
        System.out.println("Resto parafusos: " + resto);
    }

}
