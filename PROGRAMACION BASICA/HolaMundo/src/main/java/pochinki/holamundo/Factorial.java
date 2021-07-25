/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pochinki.holamundo;

/**
 *
 * @author niret
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int factorial = 1;
            while ( numero!=0) {
                factorial= factorial*numero;
                numero--;
            }
            System.out.println(factorial);
        }
}