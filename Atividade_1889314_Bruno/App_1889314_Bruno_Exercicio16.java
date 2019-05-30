/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_1889314_bruno_exercicio16;

import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_1889314_Bruno_Exercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner valor = new Scanner(System.in);

        int numeroUm = 0;
        int numeroDois;
        int i = numeroUm;
        int soma = numeroUm;

        System.out.println("Digite o primeiro valor: ");
        numeroUm = valor.nextInt();
        System.out.println("Digite o segundo valor: ");
        numeroDois = valor.nextInt();

        while (i < numeroDois) {
            i++;
            soma += i;
        }
        System.out.println("Soma dos numeros existentes: " + soma);
    }

}
