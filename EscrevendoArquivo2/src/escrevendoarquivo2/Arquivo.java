/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escrevendoarquivo2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



/**
 *
 * @author BRUNO
 */
public class Arquivo {
    public static String Read(String Caminho) throws FileNotFoundException, IOException{
        String conteudo = "";
        try {
            FileReader arq = new FileReader(Caminho); // Caminho do arquivo
            BufferedReader lerArq = new BufferedReader(arq); // Vai "buffando" linha por linha
            String linha = "";
            try{
                linha = lerArq.readLine();
                while(linha !=null){
                    conteudo += linha+"\n"; // vai lendo linha por linha até ficar null
                    linha = lerArq.readLine();
                }
                arq.close();
            }catch(IOException ex){
                conteudo = "ERRO";
            }
            
        }catch(FileNotFoundException ex){
            conteudo = "ERRO";
        }
        if(conteudo.contains("ERRRO"))
            return "";
        else {
            return conteudo;
        }
    }
    
    public static boolean Write(String Caminho, String Texto){
        try {
            FileWriter arq = new FileWriter(Caminho); // Caminho do arquivo
            PrintWriter gravarArq = new PrintWriter(arq); // Oq vai ser gravado no arquivo
            gravarArq.println(Texto); // Conteudo do arquivo
            gravarArq.close();
            return true;
            
        }catch(IOException e){ 
            System.out.println(e.getMessage()); // Mensagem de erro
            return false;
        }
    }
    
}
