package es.cic.curso25;

public class Calculadora extends Object {
    private double total;

    public double getTotal() {
        return total;
    }

    public void sumar(double valor) {
        total += valor;
    }

    public void restar(double valor) {
        total -= valor;
    }

    public void multiplicar(double valor) {
        total *= valor;
    }

    public void dividir(double valor) {
        if (valor == 0) {
            throw new ArithmeticException("División por cero");
        } else {
            total /= valor;
        }
    }    

    public void limpiar() {
        total = 0;
    }
}
