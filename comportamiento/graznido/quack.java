package comportamiento.graznido;

import comportamiento.interfaces.ComportamientoGraznido;

// Sonido normal de pato
public class Quack implements ComportamientoGraznido {

    @Override
    public void quack() {
        System.out.println("Quack! Quack!");
    }
}