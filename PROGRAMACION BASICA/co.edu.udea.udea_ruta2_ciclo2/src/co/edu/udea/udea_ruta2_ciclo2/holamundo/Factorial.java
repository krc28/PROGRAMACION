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
            long factorial = 1;
            int num ;
            Scanner numero = new Scanner(System.in);
            num =  numero.nextInt();
                           for (int i=num; i>0; i--) {
                   factorial = factorial * i;
            }
            System.out.println(factorial);
        }
}