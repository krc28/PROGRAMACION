public class Personaje {
    //Inserte acá los atributos
    private String nombre;
    private char sexo;
    public double posicionX;
    public double posicionY;
    public double damage;
    public double vida;
    
    //Inserte acá el método constructor
    public Personaje(){
        this.nombre = "Explorador";
        this.sexo = 'm';
        this.sexo = 'f';
        this.posicionX = 0.0;
        this.posicionY = 0.0;
        this.damage = 0.0;
        this.vida = 100.0;
    }
    
    public Personaje(String nombre, char sexo, double posicionX, double posicionY, double damage){
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.damage = damage;
        this.vida = 100.0;
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void golpear(Personaje p){
       p.recibirImpacto(this.getDamage() / this.calcularDistanciaRespectoPersonaje(p));
    }
    
    public void recibirImpacto (double d){
       if ((this.vida - d) < 0){
           this.vida = 0.0;
       } else {
           this.vida -= d;
       }
    }
    
    public double calcularDistanciaRespectoPersonaje(Personaje p){
        double posicionXX = Math.pow(p.getPosicionX() - this.getPosicionX(), 2);
        double posicionYY = Math.pow(p.getPosicionY() - this.getPosicionY(), 2);
        return Math.sqrt(posicionXX + posicionYY);
    }
    
    
    //Inserte acá los SETTERS Y GETTERS
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public double getPosicionX(){
        return posicionX;
    }
    
    public void setPosicionX(double posicionX){
        this.posicionX = posicionX;
    }
    
    public double getPosicionY(){
        return posicionY;
    }
    
    public void setPosicionY(double posicionY){
        this.posicionY = posicionY;
    }
    
    public double getDamage(){
        return damage;
    }
    
    public void setDamage(double damage){
        this.damage = damage;
    }
    
    public double getVida(){
        return vida;
    }
    
    public void setVida(double vida){
        this.vida = vida;
    }
}
