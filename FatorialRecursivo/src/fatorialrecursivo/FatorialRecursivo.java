/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorialrecursivo;

/**
 *
 * @author BRUNO
 */
public class FatorialRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    }
    private static int fatorial(int num) {    
        if(num == 0){
            return 1; // Quando chegar a 0 retorna 1
        }   
        return num * fatorial (num - 1); // Vai decrementando até chegar a 0
    }
    
}
