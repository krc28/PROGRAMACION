/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;

import javax.swing.JFileChooser;
import java.io.File;

public class ejFileChooser {

    public static void main(String[] a) {
        File fent = null;
// se crea el selector de archivos
        JFileChooser selector = new JFileChooser();
//solo posibilidad de seleccionar directorios
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
//se muestra y se espera a que el usuario acepte o cancele la selección
        int opcion = selector.showOpenDialog(null); // cuadro Abrir archivo
        if (opcion == JFileChooser.APPROVE_OPTION) {
// se obtiene el archivo o directorio seleccionado
            fent = selector.getSelectedFile(); // devuelve un objeto File
            System.out.println("Nombre archivo:" + fent.getName() + "\n"
                    + "Directorio padre: " + fent.getParent() + "\n"
                    + "Ruta: " + fent.getPath());
            }// fin del if
}// fin del main
}// fin de la clase EjemploFileChosser