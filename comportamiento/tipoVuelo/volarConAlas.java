package comportamiento.tipoVuelo;

import comportamiento.interfaces.ComportamientoVuelo;

// Implementa un vuelo normal con alas
public class VolarConAlas implements ComportamientoVuelo {

    @Override
    public void volar() {
        System.out.println("Estoy volando con alas!");
    }
}