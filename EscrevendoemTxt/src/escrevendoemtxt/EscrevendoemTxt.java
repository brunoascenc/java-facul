/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escrevendoemtxt;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author BRUNO
 */
public class EscrevendoemTxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path caminho = Paths.get("test.txt");
        // String texto = "Ola! tudo bem?"; Escrevendo direto
        String texto = JOptionPane.showInputDialog("Escreva algo no bloco de notas");
        byte[] textoEmByte = texto.getBytes();

        try {

            Files.write(caminho, textoEmByte);

        } catch (Exception erro) {

        }
    }

}
