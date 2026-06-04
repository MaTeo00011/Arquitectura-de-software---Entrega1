package patos.tipoPato;

public class PatoDeCasa extends Pato {

    public PatoDeCasa() {
        super();
        // El pato de casa no vuela y es silencioso
        establecerComportamientoDeVuelo("sinvuelo");
        establecerComportamientoDeGraznido("mudo");
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato De Casa, domesticado y tranquilo.");
    }
}