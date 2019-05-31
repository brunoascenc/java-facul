/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escrevendoarquivo2;

import java.io.IOException;

/**
 *
 * @author BRUNO
 */
public class EscrevendoArquivo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String arq = "teste.txt";
        
        /*
        String texto = "asoasojasijasjasasjasjasija\r\n"
                + "sjsajasjsajsajsjasojasjao\r\n" 
                + "sjaijsiajsaijsaasojasijaisjaisjiaj\r\n"
                + "asasjpasjpasjpasjpoasijpsijapojasioa";
        
       if(Arquivo.Write(arq,texto))
           System.out.println("Salvo");
       else {
           System.out.println("Erro");
       }
      */
        
        String texto = Arquivo.Read(arq);
        if(texto.isEmpty())
            System.out.println("Erro");
        else {
            System.out.println(texto);
        }
        
    }
    
}
