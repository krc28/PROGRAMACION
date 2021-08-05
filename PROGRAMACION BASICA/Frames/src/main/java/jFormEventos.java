/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;

import javax.swing.JMenuBar;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class jFormEventos {

    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setLocation(50, 50); // posición de la esquina superior izquierda de la ventana
        FlowLayout objetoLayout = new FlowLayout(); // administrador de diseño
        marco.getContentPane().setLayout(objetoLayout); // establece el administrador de diseño 
        marco.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //cerrar ventana 
        marco.setTitle("Ejemplo de Eventos"); // pone texto en el título de la ventana
        
        JButton boton1 = new JButton("Botón Uno"); 
        marco.getContentPane().add(boton1); 
// añade un oyente al JFrame y lo maneja con una adaptador
// para el Mouse cuando entre a la forma o cuando salga
// lo hace todo mediante una clase interna anónima
        marco.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt); 
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt); 
            }
        });
        marco.pack(); // asigna tamaño iniciales a los componentes
        marco.setVisible(true); // hace visible o invisible la ventana
        marco.setSize(250, 200); // tamaño de la ventana
    }

    private static void formMouseExited(java.awt.event.MouseEvent evt) {
        System.out.println("Apuntador de Ratón fuera del JFrame");
    } 
    private static void formMouseEntered(java.awt.event.MouseEvent evt) {
        System.out.println("Apuntador de Ratón dentro del JFrame");
    } 
}
