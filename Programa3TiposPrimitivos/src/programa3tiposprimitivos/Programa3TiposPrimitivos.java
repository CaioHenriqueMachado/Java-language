/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa3tiposprimitivos;

//PARA ENTRADA DE DADOS
import java.util.Scanner;

/**
 *
 * @author caiom
 */
public class Programa3TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno");
        float nota = teclado.nextFloat();
        System.out.println("A nota é " + nota);
        System.out.printf("A do %s nota é %.2f \n",nome, nota);
        System.out.format("A do %s nota é %.2f \n",nome, nota);
    }
    
}
