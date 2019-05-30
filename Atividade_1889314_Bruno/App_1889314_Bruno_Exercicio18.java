/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_1889314_bruno_exercicio18;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_1889314_Bruno_Exercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);

        double saldoMedio;
        double valorCredito;

        System.out.println("Digite o saldo médio: ");
        saldoMedio = ler.nextDouble();

        if (saldoMedio >= 0 && saldoMedio <= 200) {
            System.out.println("Você não possui crédito");

        } else if (saldoMedio >= 201 && saldoMedio <= 400) {
            valorCredito = saldoMedio * 0.2;
            System.out.println("Valor do crédito: " + valorCredito);

        } else if (saldoMedio >= 400 && saldoMedio <= 600) {
            valorCredito = saldoMedio * 0.3;
            System.out.println("Valor do crédito: " + valorCredito);

        } else if (saldoMedio >= 601) {
            valorCredito = saldoMedio * 0.4;
            System.out.println("Valor do crédito: " + valorCredito);
        }
    }

}
