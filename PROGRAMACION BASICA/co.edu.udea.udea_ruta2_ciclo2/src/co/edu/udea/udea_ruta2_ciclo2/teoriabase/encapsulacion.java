package co.edu.udea.udea_ruta2_ciclo2.teoriabase;

/**
 *
 * @author USUARIO
 */
public class encapsulacion {

  
    public static void main(String[] args) {
        testEncap objEncap = new testEncap();
        objEncap.setNombre("Bugs Bunny");
        objEncap.setEdad(7);

        System.out.println("Nombre: " + objEncap.getNombre());
        System.out.println("Edad: " + objEncap.getEdad());

    }
}