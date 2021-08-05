/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
import java.awt.Rectangle;
import java.io.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

@SuppressWarnings("serial")
public class ejCheckBox extends JFrame {

    private CheckboxGroup cbg = new CheckboxGroup(); // se crea el CheckboxGroup
    private Checkbox am = new Checkbox("AM", cbg, false); // constructores de los items
    private Checkbox fm = new Checkbox("FM", cbg, false);
    private Checkbox tv = new Checkbox("TV", cbg, true); // opción Con Foco

    public ejCheckBox() {
        jbInit();
    }

    private void jbInit() {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(400, 300));
        this.setTitle("Botones de radio mutuamente excluyentes");

        am.setBounds(new Rectangle(75, 85, 73, 23));
        am.addItemListener(new ItemListener() // se agrega un oyente al Checkbox am
        {
            @Override
            public void itemStateChanged(ItemEvent e) // si cambia su estado
            {
                am_itemStateChanged(e); // se dispara el evento por delegación
            }
        });

        fm.setBounds(new Rectangle(120, 85, 75, 25));
        fm.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                fm_itemStateChanged(e);
            }
        });

        tv.setBounds(new Rectangle(160, 85, 73, 23));
        tv.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                tv_itemStateChanged(e);
            }
        });

        this.getContentPane().add(tv, null);
        this.getContentPane().add(fm, null);
        this.getContentPane().add(am, null);
    }

// Se maneja el evento del Checkbox am
    private void am_itemStateChanged(ItemEvent e) {
        String modo = "No hay AM";
        if (e.getStateChange() == ItemEvent.SELECTED) {
            modo = "MODO AMPLITUD MODULADA";
        }
        System.out.println(e.getItem() + " => " + modo);
    }

    private void fm_itemStateChanged(ItemEvent e) {
        String modo = "No hay FM";
        if (e.getStateChange() == ItemEvent.SELECTED) {
            modo = "MODO FRECUENCIA MODULADA";
        }
        System.out.println(e.getItem() + " => " + modo);
    }

    private void tv_itemStateChanged(ItemEvent e) {
        String modo = "No hay TV";
        if (e.getStateChange() == ItemEvent.SELECTED) {
            modo = "MODO TELEVISIÓN";
        }
        System.out.println(e.getItem() + " => " + modo);
    }

    private void video_itemStateChanged(ItemEvent e) {
        String modo = "No hay VIDEO";
        if (e.getStateChange() == ItemEvent.SELECTED) {
            modo = "MODO VIDEO";
        }
        System.out.println(e.getItem() + " => " + modo);
    }

    public static void main(String args[]) throws IOException {
        ejCheckBox micbg = new ejCheckBox();
        micbg.setVisible(true);
    } // fin del main()
} // fin de la clase ejCheckBox

