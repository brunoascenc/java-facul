/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class Eleicao {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        String arq = "teste.txt";
        int i;

        for (i = 1; i <= 5; i++) {
            System.out.println("Escreva alguma coisa: \n");
            String texto = ler.nextLine();

            if (Arquivo.Write(arq, texto)) {
                System.out.println("Salvo");
            } else {
                System.out.println("Erro");
            }

        }

        /*
        String texto = "asoasojasijasjasasjasjasija\r\n"
                + "sjsajasjsajsajsjasojasjao\r\n" 
                + "sjaijsiajsaijsaasojasijaisjaisjiaj\r\n"
                + "asasjpasjpasjpasjpoasijpsijapojasioa";
         */
    }

}
