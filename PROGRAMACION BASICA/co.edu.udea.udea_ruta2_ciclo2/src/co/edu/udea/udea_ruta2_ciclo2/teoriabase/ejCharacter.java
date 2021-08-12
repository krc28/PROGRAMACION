/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.udea_ruta2_ciclo2.teoriabase;

import java.util.Scanner;


public class ejCharacter {

    public static void main(String[] args) {
 
        Scanner palabraScanner = new Scanner(System.in);
        String analizaTexto;
        int numCifras = 0, numLetras = 0;                                                                   
  
        System.out.println("Introduce texto ");
        analizaTexto = palabraScanner.nextLine();
  
        for (int i = 0; i < analizaTexto .length(); i++) {
            if (Character.isDigit(analizaTexto.charAt(i))) {
                numCifras++;
            } else if (Character.isLetter(analizaTexto.charAt(i))) {
                numLetras++;
            }
        }
  
        System.out.println("El texto contiene " + numCifras + " dígitos");                                     
        System.out.println("El texto contiene " + numLetras + " letras");
    }
}
