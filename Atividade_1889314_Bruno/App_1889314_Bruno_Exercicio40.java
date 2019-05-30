/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_1889314_bruno_exercicio40;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_1889314_Bruno_Exercicio40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);

        int codigo, quantidade;
        double total;

        System.out.println("Digite o codigo do pedido: ");
        codigo = ler.nextInt();
        System.out.println("Digite a quantidade: ");
        quantidade = ler.nextInt();

        switch (codigo) {
            case 100:
                total = quantidade * 1.20;
                System.out.printf("Total a pagar R$: %.2f\n", total);
                break;
            case 101:
                total = quantidade * 1.30;
                System.out.printf("Total a pagar R$: %.2f\n", total);
                break;
            case 102:
                total = quantidade * 1.50;
                System.out.printf("Total a pagar R$: %.2f\n", total);
                break;
            case 104:
                total = quantidade * 1.30;
                System.out.printf("Total a pagar R$: %.2f\n", total);
                break;
            case 105:
                total = quantidade * 1.00;
                System.out.printf("Total a pagar R$: %.2f\n", total);
                break;
            default:
                System.out.println("Codigo invalido!!!");
                break;
        }

    }

}
