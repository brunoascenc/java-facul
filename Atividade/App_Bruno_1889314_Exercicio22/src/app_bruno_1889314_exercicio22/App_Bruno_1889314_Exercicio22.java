/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_bruno_1889314_exercicio22;

/**
 *
 * @author BRUNO
 */
public class App_Bruno_1889314_Exercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = {
            {8, 9, 3},
            {6, 5, 6},
            {25, 8, 9},
        };
        
        somarLinhasColunas(matriz);
    }

    private static void somarLinhasColunas(int[][] matriz) {
        int mediaLinha = 0;
        int mediaColuna = 0;
        int somaLinha = 0;
        int [] somaColuna = new int[matriz.length];
        for(int i = 0; i < somaColuna.length; i++){
            for(int j = 0; j < somaColuna.length; j++){
                somaLinha += matriz[i][j];
                mediaLinha = somaLinha / 3;
                somaColuna[j] += matriz[i][j];
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("| " + somaLinha + " |MEDIA " +mediaLinha); // Soma e media das linhas
            somaLinha = 0;
        }
        
        System.out.println("--------");
        for(int i = 0; i < somaColuna.length; i++){
            System.out.print(somaColuna[i]+ " ");
        }
    }

}
