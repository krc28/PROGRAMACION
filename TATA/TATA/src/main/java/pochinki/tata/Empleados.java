package pochinki.tata;
/**
 *@author Katerin Restrepo Cano
 * cc.1017248147
 */
public abstract class Empleados {
    private String nombre;
    private int edad;
    private int salario;
    private int bonificacion;

    public Empleados(String nombre, int edad, int salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.bonificacion = 0;
    } 
  
    public abstract String bonificar();
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getSalario(){
        return salario;
    }
    
    public void setSalario(int salario){
        this.salario = salario;
    }
    
    public int getBonificacion(){
        return bonificacion;
    }
    
    public void setBonificacion(int bonificacion){
        this.bonificacion = bonificacion;
    }
}