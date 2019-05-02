/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_bruno_1889314_exercicio14;

import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_Bruno_1889314_Exercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pontoX;
        int pontoY;
        Scanner valores = new Scanner(System.in);

        System.out.println("ponto X: ");
        pontoX = valores.nextInt();
        System.out.println("ponto Y: ");
        pontoY = valores.nextInt();

        System.out.println("Area da elipse: " + (Math.PI * pontoX + pontoY));

    }

}
