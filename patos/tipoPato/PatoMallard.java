package patos.tipoPato;

public class PatoMallard extends Pato {

    public PatoMallard() {
        super(); // Hereda VolarConAlas + Quack por defecto
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato Mallard (pato real) con cabeza verde brillante.");
    }
}