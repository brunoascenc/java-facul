/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author BRUNO
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static int fibonacciCalcular(int num) {
        // TODO code application logic here
        if (num < 2) {
            return 1;
        }
        return fibonacciCalcular(num-1) + fibonacciCalcular(num-2);
    }
    
}
