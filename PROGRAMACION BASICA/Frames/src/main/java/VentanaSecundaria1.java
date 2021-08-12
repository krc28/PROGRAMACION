
package Semana4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

/* Nuevo JDialog que implementa el interface ActionListener */
public class VentanaSecundaria1 extends JDialog implements ActionListener{
    
	/* Declaro variables */
	private JButton boton2;
	private JLabel label1;
    
	/* Constructor que recibe el JFrame Principal2 como parent y el modal */
	public VentanaSecundaria1(Principal2 parent, boolean modal) {
        
		/* Invoco al constructor de la clase superior */
		super(parent, modal);
        
		/* Layout absoluto y límites*/
		setLayout(null);
		setBounds(440,10,410,210);
        
		//Etiqueta
		label1 = new JLabel("Esta es la ventana secundaria");
		label1.setBounds(115,60,200,30);
		add(label1);
        
		//Botón
		boton2 = new JButton("Volver");
		boton2.setBounds(105,110,200,40);
		add(boton2);
        
		/* Inicializo escuchador del botón */
		boton2.addActionListener(this);
        
	}
    
	/* Método que implementa la acción del botón */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton2) {
			//Cierro la pantalla
			setVisible(false);
		}
	}
    
}