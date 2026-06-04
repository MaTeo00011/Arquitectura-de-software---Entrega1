package comportamiento.graznido;

import comportamiento.interfaces.ComportamientoGraznido;

// Deshabilita el sonido
public class Mudo implements ComportamientoGraznido {

    @Override
    public void quack() {
        System.out.println("...(silencio)");
    }
}