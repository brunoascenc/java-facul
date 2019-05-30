/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_1889314_bruno_exercicio10;

import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_1889314_Bruno_Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int soma = 0;
        int i;

        Scanner valor = new Scanner(System.in);

        for (i = 1; i <= 10; i++) {
            System.out.println("Digite um numero: ");
            numero = valor.nextInt();
            soma = soma + numero;

        }
        System.out.println("Soma total dos numeros: " + soma);
    }

}
