/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_1889314_bruno_exercicio28;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_1889314_Bruno_Exercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);
        Double volume;
        Double pi = 3.14159;
        Double raio;
        Double altura;

        System.out.println("Informe o raio da circunferência: ");
        raio = ler.nextDouble();

        System.out.println("Informe a altura: ");
        altura = ler.nextDouble();

        volume = pi * (raio * raio) * altura;
        System.out.printf("O valor do volume de uma lata de óleo é: %.2f", volume);
    }

}
