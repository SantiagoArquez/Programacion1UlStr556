package datos;

public class Jugador {

    private String nombre;
    private String identificacion;
    private int numero;
    private String piernaPreferida;
    private String posicion;
    private String equipo;

    // Constructor
    public Jugador(String nombre, String identificacion, int numero, String piernaPreferida, String posicion, String equipo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.numero = numero;
        this.piernaPreferida = piernaPreferida;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public int obtenerNumero() {
        return numero;
    }

    public String obtenerPiernaPreferida() {
        return piernaPreferida;
    }

    public String obtenerPosicion() {
        return posicion;
    }

    public String obtenerEquipo() {
        return equipo;
    }
    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void cambiarNumero(int numero) {
        this.numero = numero;
    }

    public void cambiarPiernaPreferida(String piernaPreferida) {
        this.piernaPreferida = piernaPreferida;
    }

    public void cambiarPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void cambiarEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               " |ID: " + identificacion +
               " |Nº: " + numero +
               " |Pierna: " + piernaPreferida +
               " |Posicion: " + posicion +
               " |Equipo: " + equipo;
    }
}