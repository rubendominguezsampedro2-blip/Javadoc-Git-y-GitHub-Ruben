
import java.util.Random;

/**
 * Representa un coche participante en una carrera. Cada coche tiene un piloto,
 * una cantidad de gasolina y un registro de kilómetros recorridos.
 *
 * Los coches pueden conducir, repostar y mostrar información detallada del piloto.
 *
 * @author Ruben
 * @version 1.0
 * @since 2026
 */
public class Coche {

    /** Marca del coche. */
    private String marca;

    /** Piloto asociado al coche. */
    private Piloto piloto;

    /** Kilómetros recorridos en la carrera actual. */
    private float nKilometrosRecorridos;

    /** Cantidad actual de gasolina del coche. */
    private float cantidadGasolina;

    /** Kilómetros totales acumulados por el coche. */
    private float nKilometrosTotales;

    /**
     * Crea un nuevo coche con su piloto, gasolina inicial y marca.
     *
     * @param piloto Piloto que conduce el coche.
     * @param cantidadGasolina Cantidad inicial de gasolina.
     * @param marca Marca del coche.
     */
    public Coche(Piloto piloto, float cantidadGasolina, String marca) {
        this.piloto = piloto;
        this.cantidadGasolina = cantidadGasolina;
        this.nKilometrosRecorridos = 0.0f;
        this.nKilometrosTotales = 0.0f;
        this.marca = marca;
    }

    /**
     * Devuelve los kilómetros totales recorridos por el coche.
     *
     * @return Kilómetros totales.
     */
    public float getnKilometrosTotales() {
        return nKilometrosTotales;
    }

    /**
     * Establece los kilómetros totales recorridos.
     *
     * @param nKilometrosTotales Nuevos kilómetros totales.
     */
    public void setnKilometrosTotales(float nKilometrosTotales) {
        this.nKilometrosTotales = nKilometrosTotales;
    }

    /**
     * Simula que el coche conduce una distancia aleatoria entre 1 y 30 km.
     * Si no tiene suficiente gasolina, el coche repostará automáticamente.
     *
     * @throws IllegalStateException si el piloto es null.
     */
    public void conducir() throws IllegalStateException {
        if (piloto == null) {
            throw new IllegalStateException("El coche no tiene piloto asignado.");
        }

        Random random = new Random();
        float kmAleatorio = random.nextFloat(1, 31);

        float gasAux = this.cantidadGasolina - (kmAleatorio - (1.0f / 3.0f));

        if (gasAux < 0) {
            repostar();
            System.out.println(this.piloto.getNombre() + " está repostando (pierde turno)");
        } else {
            this.cantidadGasolina = gasAux;
            this.nKilometrosRecorridos += kmAleatorio;
            System.out.println(this.piloto.getNombre() + " avanza en la carrera");
        }
    }

    /**
     * Reposta una cantidad aleatoria de gasolina entre 0 y 30 litros.
     */
    public void repostar() {
        Random random = new Random();
        this.cantidadGasolina += random.nextFloat(0, 31);
    }

    /**
     * Imprime información básica del coche.
     */
    public void imprimir() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Dueño Nombre: " + this.piloto.getNombre());
        System.out.println("Cantidad Gasolina: " + this.cantidadGasolina);
        System.out.println("Número de Kilómetros: " + this.nKilometrosRecorridos);
    }

    /**
     * Imprime información completa del coche y del piloto.
     */
    public void imprimirTotal() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Dueño Nombre: " + this.piloto.getNombre());
        System.out.println("DNI DUEÑO: " + this.piloto.getDni());
        System.out.println("Fecha nacimiento: " + this.piloto.getFechaNac());
        System.out.println("Carreras Ganadas: " + this.piloto.getcGanadas());
        System.out.println("Carreras Perdidas: " + this.piloto.getcPerdidas());
        System.out.println("Cantidad Gasolina: " + this.cantidadGasolina);
        System.out.println("Número de Kilómetros totales: " + this.nKilometrosTotales);
    }

    // GETTERS Y SETTERS DOCUMENTADOS

    /**
     * Obtiene la marca del coche.
     *
     * @return Marca del coche.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del coche.
     *
     * @param marca Nueva marca.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el piloto del coche.
     *
     * @return Piloto asignado.
     */
    public Piloto getPiloto() {
        return piloto;
    }

    /**
     * Asigna un nuevo piloto al coche.
     *
     * @param piloto Nuevo piloto.
     */
    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    /**
     * Obtiene los kilómetros recorridos en la carrera actual.
     *
     * @return Kilómetros recorridos.
     */
    public float getnKilometrosRecorridos() {
        return nKilometrosRecorridos;
    }

    /**
     * Establece los kilómetros recorridos.
     *
     * @param nKilometrosRecorridos Nuevos kilómetros recorridos.
     */
    public void setnKilometrosRecorridos(float nKilometrosRecorridos) {
        this