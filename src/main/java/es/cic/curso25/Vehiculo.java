package es.cic.curso25;

import static java.lang.Math.round;

public class Vehiculo {
    protected Calculadora calculadora;
    protected int velocidad = 0;
    public static final double CONSUMO_INSTANTANEO = 4.3;

    public Vehiculo() {
        this.calculadora = new Calculadora();
    }


    public int acelerar(int incrementoDeVelocidad) {
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.sumar(incrementoDeVelocidad);

        this.velocidad = (int) round(calculadora.getTotal());
        
        return this.velocidad;
    }


    public int getVelocidad() {
        return velocidad;
    }

    public double getConsumo() {
        this.calculadora.limpiar();
        this.calculadora.sumar(velocidad);
        this.calculadora.dividir(100);
        this.calculadora.multiplicar(CONSUMO_INSTANTANEO);

        return calculadora.getTotal();
    }



    public int frenar(int decrementoDeVelocidad) {
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.restar(decrementoDeVelocidad);

        this.velocidad = (int) round(calculadora.getTotal());
        return this.velocidad;
    }    
}
