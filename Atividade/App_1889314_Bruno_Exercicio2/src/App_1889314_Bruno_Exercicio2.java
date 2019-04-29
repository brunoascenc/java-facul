
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author BRUNO
 */
public class App_1889314_Bruno_Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int soma = 0;
        int i;

        Scanner in = new Scanner(System.in);

        for (i = 1; i <= 4; i++) {
            System.out.println("Digite um numero: ");
            numero = in.nextInt();

            if (numero % 2 == 0) {
                soma = soma + numero;
            }
        }

        System.out.println("Soma dos numeros pares: " + soma);

    }

}
