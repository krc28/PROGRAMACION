public class Jugador extends Personaje{
    //              ^ (Jugador hereda de Personaje)
    //Inserte acá los atributos
    private int numeroBotiquines;
    
    
    
    //Inserte acá el método constructor
    public Jugador(){
        super();
        this.numeroBotiquines = 0;
    }
    
    public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage){
        super(nombre, sexo, posicionX, posicionY, damage);
        this.numeroBotiquines = 0;
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
     public void usarBotiquin() {
        if ((this.vida >= 0) && (this.numeroBotiquines >= 1)) {
            this.numeroBotiquines--;
            if (this.vida <= 95.0){
            this.vida += 5.0;
            } else {
                this.vida = 100.0;
            }
        }
    }

    public void recogerBotiquin() {
        this.numeroBotiquines++;
    }

    public void moverDerecha(double d) {
        this.posicionX += d;
    }

    public void moverIzquierda(double d) {
        this.posicionX -= d;
    }

    public void moverArriba(double d) {
        this.posicionY += d;
    }

    public void moverAbajo(double d) {
        this.posicionY -= d;
    }
    
    public void golpear(Enemigo p){
      p.recibirImpacto (this.getDamage() / this.calcularDistanciaRespectoPersonaje(p));
      p.evolucionar();
    }
    
    //Inserte acá los SETTERS Y GETTERS
    public int getNumeroBotiquines(){
        return numeroBotiquines;
    }
    
    public void setNumeroBotiquines(int numeroBotiquines){
        this.numeroBotiquines = numeroBotiquines;
    }
}
