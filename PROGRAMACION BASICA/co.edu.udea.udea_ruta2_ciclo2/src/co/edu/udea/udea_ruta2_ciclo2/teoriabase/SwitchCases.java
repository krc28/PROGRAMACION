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
    /*También, es posible evaluar opciones asociadas a diferentes etiquetas case al mismo tiempo. En el siguiente ejemplo, se parte de una variable cuyo valor es el número de un mes (entre 1 y 12). 
Luego, el programa imprime el número de días que tiene dicho mes tomando en cuenta también el año*/

public class SwitchCases {
    public static void main(String[] args) {
        int mes = 2;
        int anio = 2000;
        int numeroDias = 0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if (((anio % 4 == 0)
                        && !(anio % 100 == 0))
                        || (anio % 400 == 0)) {
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
            default:
                System.out.println("Mes inválido");
                break;
        }
        System.out.println("Número de días = " + numeroDias);
    }
}      