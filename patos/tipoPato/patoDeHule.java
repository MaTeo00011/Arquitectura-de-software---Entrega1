package patos.tipoPato;

import comportamiento.graznido.chillido;
import comportamiento.tipoVuelo.sinVuelo;

public class patoDeHule extends pato {

    public patoDeHule() {

        comportamientoVuelo = new sinVuelo();
        comportamientoGraznido = new chillido();

    }

    @Override
    public void dibujar() {
        System.out.println("Soy un pato de hule");
    }
}