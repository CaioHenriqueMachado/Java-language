/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa3testetipos;

/**
 *
 * @author caiom
 */
public class Programa3TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CONVERSÃO SÓ PODE SER FEITO POR CLASSES ENVOLOCROS
        
        int idade = 30;
        String valor = Integer.toString(idade);
        
        String outroValor = "30";
        int outraIdade = Integer.parseInt(outroValor);
        
        String outroValorReal = "30.5";
        float outraIdadeReal = Float.parseFloat(outroValorReal);
    }
    
}
