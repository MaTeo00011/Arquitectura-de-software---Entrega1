package comportamiento.tipoVuelo;

import comportamiento.interfaces.comportamientoVuelo;

public class sinVuelo implements comportamientoVuelo {

    @Override
    public void volar() {
        System.out.println("No puedo volar");
    }
}