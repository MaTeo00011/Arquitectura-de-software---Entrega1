import patos.tipoPato.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("  SIMULADOR DE PATOS - Patrón Strategy");
        System.out.println("====================================\n");

    // Lista de patos — fácil de ampliar sin cambiar el resto del código
        List<Pato> patos = new ArrayList<>();
        patos.add(new PatoMallard());
        patos.add(new PatoMandarin());
        patos.add(new PatoDeHule());
        patos.add(new PatoDeCasa());

    // Recorrer todos los patos con el mismo código
        for (Pato p : patos) {
            p.dibujar();
            p.nadar();
            p.hacerQuack();
            p.emprenderVuelo();
            System.out.println();
        }

    
        System.out.println("\n====================================");
        System.out.println("  Fin de la simulación");
        System.out.println("====================================");
    }
}