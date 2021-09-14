package pochinki.tata;
/**
 *@author Katerin Restrepo Cano
 * cc.1017248147
 */
public class Comercial extends Empleados {
    private int comision;
    
    public Comercial(){
        super();
        this.comision = 0;
    }
    
    public Comercial(int comision, String nombre, int edad, int salario, int bonificacion){
        super(nombre, edad, salario, bonificacion);
    }

    @Override
    public void bonificar(){
        if (super.getEdad() > 30 && comision > 400000){
            super.setBonificacion(150000);
            System.out.println("Bonificación aplicada");
            }           
        }
    
    public int getComision(){
        return comision;
        }
    
    public void setComision(int comision){
        this.comision = comision;
        }
    }


