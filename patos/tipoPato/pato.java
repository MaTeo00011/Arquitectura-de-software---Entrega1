package patos.tipoPato;
import comportamiento.interfaces.comportamientoGraznido;
import comportamiento.interfaces.comportamientoVuelo;

public abstract class pato {

    protected comportamientoGraznido comportamientoGraznido;
    protected comportamientoVuelo comportamientoVuelo;

    public void nadar() {
        System.out.println("Todos los patos pueden nadar");
    }

    public void sonido() {
        comportamientoGraznido.quack();
    }

    public void volar() {
        comportamientoVuelo.volar();
    }

    public void setComportamientoGraznido(
            comportamientoGraznido comportamientoGraznido) {

        this.comportamientoGraznido = comportamientoGraznido;
    }

    public void setComportamientoVuelo(
            comportamientoVuelo comportamientoVuelo) {

        this.comportamientoVuelo = comportamientoVuelo;
    }

    public abstract void dibujar();
}