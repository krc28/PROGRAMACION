package Semana4;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.*;

/**
 *
 * @author Víctor Castro Pérez
 */
public class Principal1 {
    public static void main(String[] args) {
        jFormCodigo ventana= new jFormCodigo();
        ventana.setVisible(true);

        JOptionPane.showMessageDialog(ventana,"Información","Título Ventana", 1);
        JOptionPane.showMessageDialog(ventana,"Advertencia","Título Ventana", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(ventana,"Error","Título Ventana", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(ventana,"Continuamos","Título Ventana", 2);
               
        
    }
}
