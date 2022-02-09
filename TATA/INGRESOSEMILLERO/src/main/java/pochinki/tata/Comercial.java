package pochinki.tata;

/**
 * @author Katerin Restrepo Cano cc.1017248147
 */
public class Comercial extends Empleados {

    private int comision;

    public Comercial(String nombre, int edad, int salario,int comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    @Override
    public String bonificar() {
        String respuesta;
        if (this.getEdad() > 30 && this.comision > 400000) {
            this.setBonificacion(150000);
            respuesta = "Bonificación aplicada de:" + this.getBonificacion();
        } else {
            respuesta = "Bonificación no aplicada";
        }
        System.out.println(respuesta);
        return respuesta;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }
}
