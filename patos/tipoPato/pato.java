package patos.tipoPato;

import comportamiento.interfaces.ComportamientoVuelo;
import comportamiento.interfaces.ComportamientoGraznido;
import comportamiento.tipoVuelo.VolarConAlas;
import comportamiento.tipoVuelo.SinVuelo;
import comportamiento.graznido.Quack;
import comportamiento.graznido.Chillido;
import comportamiento.graznido.Mudo;
import java.util.HashMap;
import java.util.Map;

public abstract class Pato {

    // Atributos de comportamiento (composición - patrón Strategy)
    private ComportamientoVuelo comportamientoVuelo;
    private ComportamientoGraznido comportamientoGraznido;
    

    // Diccionarios que mapean nombres a instancias de comportamiento
    protected final Map<String, ComportamientoVuelo> tiposDeVuelo;
    protected final Map<String, ComportamientoGraznido> tiposDeGraznido;

    // Constructor: llena los diccionarios y asigna comportamientos por defecto
    public Pato() {
        // Llenar diccionario de vuelos
        tiposDeVuelo = new HashMap<>();
        tiposDeVuelo.put("volarconalas", new VolarConAlas());
        tiposDeVuelo.put("sinvuelo",     new SinVuelo());

        // Llenar diccionario de graznidos
        tiposDeGraznido = new HashMap<>();
        tiposDeGraznido.put("quack",    new Quack());
        tiposDeGraznido.put("chillido", new Chillido());
        tiposDeGraznido.put("mudo",     new Mudo());

        // Comportamientos por defecto
        this.comportamientoVuelo    = tiposDeVuelo.get("volarconalas");
        this.comportamientoGraznido = tiposDeGraznido.get("quack");
    }

    // Delega el nado (comportamiento común a todos)
    public void nadar() {
        System.out.println("Todos los patos saben nadar!");
    }

    // Subclases deben implementar su propia apariencia
    public abstract void dibujar();

    // Delega el graznido al comportamiento actual
    public void hacerQuack() {
        comportamientoGraznido.quack();
    }

    // Delega el vuelo al comportamiento actual
    public void emprenderVuelo() {
        comportamientoVuelo.volar();
    }

    // Permite cambiar el comportamiento de vuelo en tiempo de ejecución
    // Busca en el diccionario en vez de usar switch
    public void establecerComportamientoDeVuelo(String tipoVuelo) {
        ComportamientoVuelo nuevo = tiposDeVuelo.get(tipoVuelo.toLowerCase());
        if (nuevo != null) {
            this.comportamientoVuelo = nuevo;
        } else {
            System.out.println("Tipo de vuelo no reconocido: " + tipoVuelo);
            System.out.println("Opciones disponibles: " + tiposDeVuelo.keySet());
        }
    }

    // Permite cambiar el comportamiento de graznido en tiempo de ejecución
    // Busca en el diccionario en vez de usar switch
    public void establecerComportamientoDeGraznido(String tipoGraznido) {
        ComportamientoGraznido nuevo = tiposDeGraznido.get(tipoGraznido.toLowerCase());
        if (nuevo != null) {
            this.comportamientoGraznido = nuevo;
        } else {
            System.out.println("Tipo de graznido no reconocido: " + tipoGraznido);
            System.out.println("Opciones disponibles: " + tiposDeGraznido.keySet());
        }
    }
}