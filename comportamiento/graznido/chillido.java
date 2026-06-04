package comportamiento.graznido;

import comportamiento.interfaces.ComportamientoGraznido;

// Sonido de pato producido por un pito
public class Chillido implements ComportamientoGraznido {

    @Override
    public void quack() {
        System.out.println("Fiiiiuuu! (sonido de pito)");
    }
}