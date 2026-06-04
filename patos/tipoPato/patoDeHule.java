package patos.tipoPato;

public class PatoDeHule extends Pato {
    public PatoDeHule() {
        super();
        // El pato de hule no vuela y hace chillido (pito)
        establecerComportamientoDeVuelo("sinvuelo");
        establecerComportamientoDeGraznido("chillido");
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato de Hule (goma), amarillo y pequeño.");
    }
}