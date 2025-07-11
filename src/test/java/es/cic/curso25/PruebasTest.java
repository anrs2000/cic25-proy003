package es.cic.curso25;

import org.junit.jupiter.api.Test;

public class PruebasTest {

    @Test
    public void lanzame() {
        boolean valor = true;
        char letra = 'e';
        char otraLetra = "e".charAt(0);

        Coche miCoche2 = new Coche();
        Object miCoche = miCoche2;
        
        Camion miCamioncito = new Camion();

        miCamioncito.meterCarga();



        GruaDelPuerto teodoro = new GruaDelPuerto();

        teodoro.meterCarga();

        Object referencia = teodoro;
        referencia.toString();
        referencia = miCamioncito;
        referencia.toString();

        ((GruaDelPuerto)referencia).meterCarga();
    }


    public void acelerarRemotamente(Vehiculo vehiculo, int incremento) {
        vehiculo.acelerar(incremento);
    }

}
