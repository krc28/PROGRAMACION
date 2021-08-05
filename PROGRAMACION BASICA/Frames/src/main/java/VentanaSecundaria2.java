
package Semana4;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VentanaSecundaria2 extends JFrame {

public VentanaSecundaria2() {
    setBounds(500, 300, 400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JFrame marco = new JFrame();
    marco.setLocation(50, 50); // posición de la esquina superior izquierda de la ventana
    setVisible(true);
  
    JButton btn = new JButton("Mostrar Ventana de Dialogo");
    add(btn);
  
    btn.addActionListener(new ActionListener() 
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            mostrarDialogo();
        }
    });
}

private void mostrarDialogo() 
{

    JDialog ventanaDialogo = new JDialog(this, Dialog.ModalityType.APPLICATION_MODAL);
       ventanaDialogo.setBounds(350, 350, 200, 200);
    ventanaDialogo.setVisible(true);
}

public static void main(String[] args) 
{
    VentanaSecundaria2 ventanaSecundaria = new VentanaSecundaria2();
}
}