/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_bruno_1889314_exercicio8;

import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_Bruno_1889314_Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner valor = new Scanner(System.in);

        int dia;
        int mes;
        int ano;
        int anoAtual = 2019;
        int anoDias;
        int idadeEmDias;

        System.out.print("Digite o dia de nascimento: ");
        dia = valor.nextInt();
        System.out.print("Digite o mês do nascimento: ");
        mes = valor.nextInt();
        System.out.print("Digite o ano do nascimento: ");
        ano = valor.nextInt();

        int mesDias = mes * 30;
        anoDias = (anoAtual - ano) * 365;
        idadeEmDias = anoDias + mesDias + dia;

        System.out.printf("A sua idade em dias é: " + idadeEmDias);
    }

}
