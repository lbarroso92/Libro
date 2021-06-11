/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.java;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class LibroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese el título del libro: ");
        Scanner teclado = new Scanner (System.in);
        var titulo = teclado.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        var autor = teclado.nextLine();
        System.out.println(titulo +  "fue escrito por " + autor);    }
    
}
