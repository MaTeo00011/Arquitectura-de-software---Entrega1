package patos.tipoPato;

public class PatoMallard extends pato {

    public PatoMallard() {

        comportamientoVuelo = new comportamiento.tipoVuelo.volarConAlas();
        comportamientoGraznido = new comportamiento.graznido.quack();

    }

    @Override
    public void dibujar() {
        System.out.println("Soy un pato Mallard");
    }
}