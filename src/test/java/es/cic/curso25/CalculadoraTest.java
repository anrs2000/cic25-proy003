package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        // Preparo
        Calculadora cut = new Calculadora();


        // Ejecuto
        cut.sumar(5.6);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(5.6, valorActual, 0.000001);


        cut.sumar(3.4);
        valorActual = cut.getTotal();

        assertEquals(9, valorActual, 0.000001);
    }

    @Test
    public void testRestar() {
        // Preparo
        Calculadora cut = new Calculadora();


        // Ejecuto
        cut.restar(5.6);
        cut.restar(-2.14);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(-3.46, valorActual, 0.000001);
    }    

    @Test
    public void testMultiplicar() {
        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(4.2);

        // Ejecuto
        cut.multiplicar(2);
        cut.multiplicar(-1);


        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(-8.4, valorActual, 0.000001);

    }   
    

    @Test
    public void testDividir() {
        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(4.2);

        // Ejecuto
        cut.dividir(2);
        cut.dividir(-3);


        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(-0.7, valorActual, 0.000001);

    }    
    
    // @Disabled
    @Test()
    public void testDividirPorCerto() {
        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(4.2);

        // Ejecuto
        assertThrows(ArithmeticException.class, 
            () -> cut.dividir(0));
    }

    @Test
    void testLimpiar() {
        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(4.2);

        cut.limpiar();

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(0, valorActual);
        
    }
}
