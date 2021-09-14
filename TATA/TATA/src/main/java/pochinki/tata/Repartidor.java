package pochinki.tata;
/**
 *@author Katerin Restrepo Cano
 * cc.1017248147
 */
public class Repartidor extends Empleados {
    private String zona;
    
    public Repartidor(){
        super();
        this.zona = "3";
    }
    
    public Repartidor(String zona, String nombre, int edad, int salario, int bonificacion){
        super(nombre, edad, salario, bonificacion);
    }
    
    @Override
    public void bonificar(){
        if (super.getEdad() < 25 && zona.equals(this.zona)){
            super.setBonificacion(150000);
            System.out.println("Bonificación aplicada");
            } else{
                System.out.println("Bonificación no aplicada");}           
        }
    
    public String getZona(){
        return zona;
    }
    
    public void setZona(String zona){
        this.zona = zona;
    }
}