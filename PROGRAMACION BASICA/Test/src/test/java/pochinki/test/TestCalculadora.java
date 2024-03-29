/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pochinki.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author niret
 */
public class TestCalculadora {
    //Pruebas unitarias para el cuadrado
    @Test
    public void testCuadradoPositivo() {
        Calculadora calc = new Calculadora();
        assertEquals(25.0, calc.cuadrado(5.0), 0.000000001);
    }

    @Test
    public void testCuadradoCero() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.cuadrado(0.0), 0.000000001);
    }

    @Test
    public void testCuadradoUno() {
        Calculadora calc = new Calculadora();
        assertEquals(1.0, calc.cuadrado(1.0), 0.000000001);
    }

    @Test
    public void testCuadradoNegativo() {
        Calculadora calc = new Calculadora();
        assertEquals(16.0, calc.cuadrado(-4.0), 0.000000001);
    }

    //Pruebas unitarias para el cubo
    @Test
    public void testCuboPositivo() {
        Calculadora calc = new Calculadora();
        assertEquals(125.0, calc.cubo(5.0), 0.000000001);
    }

    @Test
    public void testCuboCero() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.cubo(0.0), 0.000000001);
    }

    @Test
    public void testCuboUno() {
        Calculadora calc = new Calculadora();
        assertEquals(1.0, calc.cubo(1.0), 0.000000001);
    }

    @Test
    public void testCuboMenosUno() {
        Calculadora calc = new Calculadora();
        assertEquals(-1.0, calc.cubo(-1.0), 0.000000001);
    }

    @Test
    public void testCuboNegativo() {
        Calculadora calc = new Calculadora();
        assertEquals(-64.0, calc.cubo(-4.0), 0.000000001);
    }
}
