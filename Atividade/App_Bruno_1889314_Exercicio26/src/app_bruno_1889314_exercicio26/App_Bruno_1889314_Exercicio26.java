/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_bruno_1889314_exercicio26;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_Bruno_1889314_Exercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float celsius, fahrenheit;
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);

        System.out.println("Temperatura em Celsius: ");
        celsius = ler.nextFloat();

        fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }

}
