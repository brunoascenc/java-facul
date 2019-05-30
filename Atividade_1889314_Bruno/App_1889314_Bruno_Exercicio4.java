/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_1889314_bruno_exercicio4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class App_1889314_Bruno_Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner valores = new Scanner(System.in);
        valores.useLocale(Locale.US);

        double base;
        double altura;
        double area;

        System.out.println("Insira a base do retangulo: ");
        base = valores.nextDouble();
        System.out.print("Insira a altura do retangulo: ");
        altura = valores.nextDouble();

        area = base * altura / 2;

        System.out.printf("Area do retangulo é: " + area);
    }
    
}
