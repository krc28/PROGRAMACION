/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pochinki.teoriabase;

/**
 *
 * @author niret
 */
public class PersonajeReto1 {
    //Inserte acá los atributos

    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double distanciaTotal;
    private int numeroBotiquines;
    private double vida;

    //Inserte acá el método constructor
    public PersonajeReto1() {
        this.nombre = "";
        this.sexo = 'm';
        this.posicionX = 0.0;
        this.posicionY = 0.0;
        this.distanciaTotal = 0.0;
        this.numeroBotiquines = 0;
        this.vida = 100.0;
    }

    public PersonajeReto1(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = 0.0;
        this.posicionY = 0.0;
        this.distanciaTotal = 0.0;
        this.numeroBotiquines = 0;
        this.vida = 100.0;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void usarBotiquin() {
        if (this.numeroBotiquines > 0) {
            this.numeroBotiquines--;
            this.vida += 5;
        }
    }

    public void recogerBotiquin() {
        this.numeroBotiquines++;
    }

    public void moverDerecha(double d) {
        this.posicionX += d;
        this.distanciaTotal += d;
    }

    public void moverIzquierda(double d) {
        this.posicionX -= d;
        this.distanciaTotal += d;
    }

    public void moverArriba(double d) {
        this.posicionY += d;
        this.distanciaTotal += d;
    }

    public void moverAbajo(double d) {
        this.posicionY -= d;
        this.distanciaTotal += d;
    }

    public double calcularDistanciaRespectoOrigen() {
        double posicionXX = Math.pow(posicionX, 2);
        double posicionYY = Math.pow(posicionY, 2);
        return Math.sqrt(posicionXX + posicionYY);
    }

    //Inserte acá los SETTERS Y GETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
}