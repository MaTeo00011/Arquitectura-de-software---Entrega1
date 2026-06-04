package patos.tipoPato;

import comportamiento.tipoVuelo.sinVuelo;

public class PatoDeCasa extends pato {

    public PatoDeCasa() {

        comportamientoVuelo = new sinVuelo();
        comportamientoGraznido = new comportamiento.graznido.mudo();

    }

    @Override
    public void dibujar() {
        System.out.println("Soy un pato de casa");
    }
}