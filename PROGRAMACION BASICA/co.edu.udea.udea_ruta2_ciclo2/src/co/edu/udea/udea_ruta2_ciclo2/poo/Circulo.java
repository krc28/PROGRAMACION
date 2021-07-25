package co.edu.udea.udea_ruta2_ciclo2.poo;

/**
 *
 * @author USUARIO
 */
public class Circulo extends Figura {
    private double radio;

    /**
     *
     */
    public Circulo() {
        this.radio = 0;
    }

    /**
     *
     * @param radio
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     *
     * @return
     */
    public double getRadio() {
        return radio;
    }

    /**
     *
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     *
     * @return
     */
    @Override
    public double getArea() {
        return Math.PI * this.radio * this.radio;
    }

    /**
     *
     * @return
     */
    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.radio;
    }
}