package patos.tipoPato;

public class PatoMandarin extends Pato {

    public PatoMandarin() {
        super(); // Hereda VolarConAlas + Quack por defecto
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato Mandarín con plumaje multicolor.");
    }
}