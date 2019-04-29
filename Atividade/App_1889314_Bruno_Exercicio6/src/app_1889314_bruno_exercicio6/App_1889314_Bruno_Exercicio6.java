/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_1889314_bruno_exercicio6;

import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_1889314_Bruno_Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner valor = new Scanner(System.in);
        int numero;
        int soma = 0;
        int i;

        System.out.println("Digite 0 para terminar: ");
        for (i = 1; i < 10;) {
            System.out.println("Digite um numero: ");
            numero = valor.nextInt();

            if (numero == 0) {
                break;

            } else if (numero % 2 != 0) {
                soma = numero + numero;
            }
        }
        
        System.out.println("Soma dos numeros primos: " + soma);
    }

}
