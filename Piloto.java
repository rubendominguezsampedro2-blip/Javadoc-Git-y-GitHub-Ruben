
import java.time.LocalDate;

/**
 * Representa a un piloto participante en una carrera. Cada piloto tiene un nombre,
 * DNI, fecha de nacimiento y un registro de carreras ganadas y perdidas.
 *
 * Esta clase se utiliza como propietario de un {@link Coche}.
 *
 * @author Ruben
 * @version 1.0
 * @since 2026
 */
public class Piloto {

    /** Nombre del piloto. */
    private String nombre;

    /** DNI del piloto (valor inmutable). */
    private final String dni;

    /** Fecha de nacimiento del piloto (valor inmutable). */
    private final LocalDate fechaNac;

    /** Número de carreras ganadas por el piloto. */
    private int cGanadas;

    /** Número de carreras perdidas por el piloto. */
    private int cPerdidas;

    /**
     * Crea un nuevo piloto con sus datos personales.
     *
     * @param nombre Nombre del piloto.
     * @param dni DNI del piloto.
     * @param fechaNac Fecha de nacimiento del piloto.
     */
    public Piloto(String nombre, String dni, LocalDate fechaNac) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.cGanadas = 0;
        this.cPerdidas = 0;
    }

    /**
     * Obtiene el nombre del piloto.
     *
     * @return Nombre del piloto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del piloto.
     *
     * @param nombre Nuevo nombre del piloto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el DNI del piloto.
     *
     * @return DNI del piloto.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Obtiene la fecha de nacimiento del piloto.
     *
     * @return Fecha de nacimiento.
     */
    public LocalDate getFechaNac() {
        return fechaNac;
    }

    /**
     * Obtiene el número de carreras ganadas.
     *
     * @return Carreras ganadas.
     */
    public int getcGanadas() {
        return cGanadas;
    }

    /**
     * Establece el número de carreras ganadas.
     *
     * @param cGanadas Número de carreras ganadas.
     */
    public void setcGanadas(int cGanadas) {
        this.cGanadas = cGanadas;
    }

    /**
     * Obtiene el número de carreras perdidas.
     *
     * @return Carreras perdidas.
     */
    public int getcPerdidas() {
        return cPerdidas;
    }

    /**
     * Establece el número de carreras perdidas.
     *
     * @param cPerdidas Número de carreras perdidas.
     */
    public void setcPerdidas(int cPerdidas) {
        this.cPerdidas = cPerdidas;
    }
}
