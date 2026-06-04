package comportamiento.tipoVuelo;

import comportamiento.interfaces.comportamientoVuelo;

public class volarConAlas implements comportamientoVuelo {

    @Override
    public void volar() {
        System.out.println("Estoy volando con alas");
    }
}