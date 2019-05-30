/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_1889314_bruno_exercicio36;

import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_1889314_Bruno_Exercicio36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int idade;
        int i;
        int media = 0;
        int soma = 0;

        for (i = 1; i <= 10; i++) {
            System.out.println("Digite a " + i + " idade");
            idade = ler.nextInt();
            soma += idade;
            media = soma / 10;
        }

        System.out.println("A idade média é: " + media);
    }

}
