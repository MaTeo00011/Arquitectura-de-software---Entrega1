import patos.tipoPato.PatoMallard;
import patos.tipoPato.patoDeHule;

public class main {

    public static void main(String[] args) {

        PatoMallard mallard = new PatoMallard();

        mallard.dibujar();
        mallard.volar();
        mallard.sonido();

        System.out.println();

        patoDeHule hule = new patoDeHule();

        hule.dibujar();
        hule.volar();
        hule.sonido();
    }
}