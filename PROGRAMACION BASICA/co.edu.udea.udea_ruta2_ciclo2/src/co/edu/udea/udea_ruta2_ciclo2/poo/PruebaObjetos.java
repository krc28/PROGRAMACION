package co.edu.udea.udea_ruta2_ciclo2.poo;

public class PruebaObjetos {

    public static void main(String[] args) {
        Bicicleta miBicicleta = new Bicicleta();
        Bicicleta miBicicleta2 = new Bicicleta("Razer", "azul", 3);
        System.out.println("Detalles de mi bicicleta");
        System.out.println(miBicicleta.getColor());
        System.out.println(miBicicleta.getMarca());
        System.out.println(miBicicleta.getVelocidad());
        System.out.println("Detalles de mi bicicleta2");
        System.out.println(miBicicleta2.getColor());
        System.out.println(miBicicleta2.getMarca());
        System.out.println(miBicicleta2.getVelocidad());
        miBicicleta.setColor("verde");
        System.out.println(miBicicleta.getColor());
        miBicicleta.pedalear(5);
        miBicicleta.pedalear(10);
        miBicicleta.frenar();
        miBicicleta.frenar(4);
        miBicicleta.frenar("fuerte");
        System.out.println(miBicicleta.getVelocidad());
        System.out.println(Bicicleta.bicicletasCreadas);
        
        /*miBicicleta.marca = "Hyperx";
        System.out.println(miBicicleta.getMarca());
        System.out.println(miBicicleta.marca);*/
        /*Estudiante inscrito = new Estudiante("Pepito", "Pérez", 17, 3.5);
        
        System.out.println(miBicicleta.getMarca());
        miBicicleta.setMarca("Specialized");
        System.out.println("La marca de mi bicicleta es " + miBicicleta.getMarca());
        System.out.println("Velocidad inicial: " + miBicicleta.getVelocidad());
        miBicicleta.pedalear(5);
        miBicicleta.pedalear(2);
        System.out.println("Velocidad actual: " + miBicicleta.getVelocidad());
        miBicicleta.frenar(6);
        System.out.println("Velocidad actual: " + miBicicleta.getVelocidad());
        System.out.println("Me llamo " + inscrito.getNombres() + " " + inscrito.getApellidos());
        System.out.println(inscrito.getEdad());
        System.out.println("Promedio: " + inscrito.getPromedio());
        inscrito.setPromedio(4.7);
        System.out.println("Nuevo promedio: " + inscrito.getPromedio());
        System.out.println("Operación loca... velocidad más promedio: " + (miBicicleta.getVelocidad() + inscrito.getPromedio()));*/
    }
}