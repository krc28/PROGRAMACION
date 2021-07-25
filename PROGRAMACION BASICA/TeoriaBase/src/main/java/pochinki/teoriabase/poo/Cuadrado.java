package co.edu.udea.udea_ruta2_ciclo2.poo;

/**
 *
 * @author USUARIO
 */
public class Cuadrado extends Figura {

    private double lado;

    /**
     *
     */
    public Cuadrado() {
        this.lado = 0;
    }

    /**
     *
     * @param lado
     */
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    /**
     *
     * @return
     */
    public double getLado() {
        return lado;
    }

    /**
     *
     * @param lado
     */
    public void setLado(double lado) {
        this.lado = lado;
    }

    /**
     *
     * @return
     */
    @Override
    public double getArea() {
        return this.lado * this.lado;
    }

    /**
     *
     * @return
     */
    @Override
    public double getPerimetro() {
        return this.lado * 4;
    }

}