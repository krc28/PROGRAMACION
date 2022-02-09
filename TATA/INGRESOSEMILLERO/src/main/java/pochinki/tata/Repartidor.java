package pochinki.tata;

/**
 * @author Katerin Restrepo Cano cc.1017248147
 */
public class Repartidor extends Empleados {

    private String zona;

    public Repartidor(String nombre, int edad, int salario,String zona) {
        super(nombre, edad, salario);
        this.zona=zona;
    }

    @Override
    public String bonificar() {
        String respuesta;
        if (this.getEdad() < 25 && this.zona.equals("zona 3")) {
            this.setBonificacion(150000);
            respuesta = "Bonificación aplicada de:" + this.getBonificacion();
        } else {
            respuesta = "Bonificación no aplicada";
        }
        System.out.println(respuesta);
        return respuesta;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}
