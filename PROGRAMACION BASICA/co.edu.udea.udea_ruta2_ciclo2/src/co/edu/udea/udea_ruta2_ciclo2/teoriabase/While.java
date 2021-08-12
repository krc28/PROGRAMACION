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
public class While {
   public static void main(String[] args) {
        int numero = 3;
        int i = 0;
        while (i <= 10) {
            System.out.println(numero + " * " + i + " = " + numero*i);
            i = i+1;
        }
    } 
}
