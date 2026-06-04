package comportamiento.graznido;

import comportamiento.interfaces.comportamientoGraznido;

public class chillido implements comportamientoGraznido {

    @Override
    public void quack() {
        System.out.println("Piiiiii!");
    }
}