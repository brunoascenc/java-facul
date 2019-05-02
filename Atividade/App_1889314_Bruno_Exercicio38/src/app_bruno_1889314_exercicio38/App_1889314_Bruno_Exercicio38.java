/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_bruno_1889314_exercicio38;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_Bruno_1889314_Exercicio38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);
        double tempoGastoNaViagem;
        double velocidadeMedia;
        double distancia;
        double litrosUsados;

        System.out.println("Informe o tempo gasto na viagem: ");
        tempoGastoNaViagem = ler.nextDouble();

        System.out.println("Informe a velocidade média: ");
        velocidadeMedia = ler.nextDouble();

        distancia = tempoGastoNaViagem * velocidadeMedia;

        litrosUsados = (distancia / 12);

        System.out.println("A distância percorrida é: " + distancia);
        System.out.println("A quantidade de litros utilizados é: " + litrosUsados);
    }

}
