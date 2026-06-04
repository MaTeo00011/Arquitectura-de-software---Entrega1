package comportamiento.tipoVuelo;

import comportamiento.interfaces.ComportamientoVuelo;

// Deshabilita el vuelo
public class SinVuelo implements ComportamientoVuelo {

    @Override
    public void volar() {
        System.out.println("No puedo volar!");
    }
}