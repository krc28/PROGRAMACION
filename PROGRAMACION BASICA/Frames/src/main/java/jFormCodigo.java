package Semana4;
/**
 *
 * @author Víctor Castro Pérez
 */
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class jFormCodigo extends JFrame {

    JButton btn1, btn2, btn3, btn4;
    
    public jFormCodigo() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500, 300);
       botones();
    }
    
    
    private void botones(){
        setLayout(new FlowLayout(FlowLayout.LEADING));
        
        btn1=new JButton();
        btn1.setText("Aceptar");
        add(btn1);
        
        btn2=new JButton();
        btn2.setText("Cancelar");
        add(btn2);
        
        btn3=new JButton();
        btn3.setText("Mostrar");
        add(btn3);
        
        btn4=new JButton();
        btn4.setText("Otro");
        add(btn4);
        
    }
    
    public static void main(String[] args) {
        jFormCodigo ventana=new jFormCodigo();
        ventana.setVisible(true);
    }
    
}
