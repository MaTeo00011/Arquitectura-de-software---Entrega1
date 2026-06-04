package comportamiento.graznido;

import comportamiento.interfaces.comportamientoGraznido;

public class mudo implements comportamientoGraznido {

    @Override
    public void quack() {
        System.out.println("...");
    }
}