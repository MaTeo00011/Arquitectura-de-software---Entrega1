package comportamiento.graznido;

import comportamiento.interfaces.comportamientoGraznido;

public class quack implements comportamientoGraznido {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }

}