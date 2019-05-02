/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_bruno_1889314_exercicio32;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_Bruno_1889314_Exercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);

        double impostoMunicipal, impostoEstadual, impostoFederal;
        double soma = 0;
        double porcentagem;

        System.out.println("Digite o imposto municipal: ");
        impostoMunicipal = ler.nextDouble();

        System.out.println("Digite o imposto estadual: ");
        impostoEstadual = ler.nextDouble();

        System.out.println("Digite o imposto federal: ");
        impostoFederal = ler.nextDouble();

        soma = impostoMunicipal + impostoEstadual + impostoFederal;
        porcentagem = (soma * 3) / 100;

        System.out.println("A porcentagem é:  " + porcentagem + "%");
    }

}
