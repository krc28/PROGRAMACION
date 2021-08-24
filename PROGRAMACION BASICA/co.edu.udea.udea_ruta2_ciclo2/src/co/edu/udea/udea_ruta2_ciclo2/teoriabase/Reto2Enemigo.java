package co.edu.udea.udea_ruta2_ciclo2.teoriabase;
public class Enemigo extends Personaje {
    //              ^ (Enemigo hereda de Personaje)
    //Inserte acá los atributos
    private int evolucionesAplicadas;
    private int resistencia;
    
    //Inserte acá el método constructor
     public Enemigo(){
        super();
        this.evolucionesAplicadas = 0;
        this.resistencia = 1;
    }
    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage){
        super(nombre, sexo, posicionX, posicionY, damage);
        this.evolucionesAplicadas = 0;
        this.resistencia = 1;
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void evolucionar(){
        if ((this.vida <= 30.0) && (this.evolucionesAplicadas == 0)){
            this.damage += 20.0;
            this.evolucionesAplicadas  +=1;}
        if ((this.vida <= 10.0) && (this.evolucionesAplicadas == 1)){
            this.resistencia  +=1;
            this.evolucionesAplicadas  +=1; 
            }
        }
    
    public void recibirImpacto(double d){
        if ((this.vida - (d / resistencia)) < 0){
            this.vida = 0.0;
        } else {
            this.vida -= (d / resistencia);
            }
        }
    //Inserte acá los SETTERS Y GETTERS
    
    public int getEvolucionesAplicadas(){
        return evolucionesAplicadas;
    }
    
    public void setEvolucionesAplicadas(int evolucionesAplicadas){
        this.evolucionesAplicadas = evolucionesAplicadas;
    }
    
    public int getResistencia(){
        return resistencia;
    }
    
    public void setResistencia(int resistencia){
        this.resistencia = resistencia;
    }
}