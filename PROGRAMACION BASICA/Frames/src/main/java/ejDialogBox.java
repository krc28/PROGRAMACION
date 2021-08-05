/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;
import javax.swing.*;
/**
 *
 * @author USUARIO
 */
public class ejDialogBox {
    public static void main(String[] args) {
        String cadena; // icono
        cadena = JOptionPane.showInputDialog(null,"Digite Numero",
                "Solicitud de un número", //título
                JOptionPane.QUESTION_MESSAGE);
        int n = Integer.parseInt(cadena);
        JOptionPane.showMessageDialog(null,cadena );
        JOptionPane.showMessageDialog(null, cadena, "Número digitado", 2);
    }
}
