/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.udea_ruta2_ciclo2.teoriabase;

/**
 *
 * @author niret
 */
public class CadenadeStrings {
     public static void main (String[] args){
        String nombre, nombreCompleto;
        String apellido = "Pochinok";
            nombre = "Pochinki";
             nombreCompleto = nombre + " " + apellido;
                    System.out.println(nombreCompleto);
//Imprime Pochinki Pochinok
    //comparar dos cadenas de caracteres
        String a = "higo";
        String b = "HIGO";
        String c = "higo";
            System.out.println(a.equals(b)); //Imprime false
            System.out.println(a.equalsIgnoreCase(b)); //Imprime true     
            System.out.println(a.equals(c)); //Imprime true      
    }
}