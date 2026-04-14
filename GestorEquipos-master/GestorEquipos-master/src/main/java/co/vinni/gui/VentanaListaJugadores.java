package co.vinni.gui;

import co.vinni.datos.Jugador;
import co.vinni.operaciones.OperacionesJugador;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class VentanaListaJugadores extends JFrame {
    private JTable tabla;
    private DefaultTableModel modelo;
    private OperacionesJugador controlJugador;

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public VentanaListaJugadores(OperacionesJugador control) {
        this.controlJugador = control;

        setTitle("Listado de Jugadores");
        setSize(800, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        inicializarTabla();
        cargarDatos();
    }

    private void inicializarTabla() {
        // Definir columnas
        String[] columnas = { "País", "Dirección", "Equipo", "Jugador","F. Nacimiento", "Edad", "Posición", "Número" }; //NUEVO
        modelo = new DefaultTableModel(columnas, 0);
        tabla = new JTable(modelo);

        // ScrollPane para la tabla (Layout Null requiere setBounds)
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(20, 20, 740, 400);
        add(scroll);
    }

    private void cargarDatos() {
        List<Jugador> jugadores = controlJugador.obtenerTodos();
        modelo.setRowCount(0); // Limpiar tabla

        for (Jugador j : jugadores) {
            // Calcular edad usando Java Time API
            int edad = Period.between(j.getFechaNacimiento(), LocalDate.now()).getYears();


            // Extraer datos del objeto anidado 'Equipo'
            String pais = j.getPais() != null ? j.getPais().toString() : "N/A"; //NUEVO
            String direccion = j.getDireccion() != null ? j.getDireccion() : "N/A"; //NUEVO
            String nombreEquipo = j.getEquipo() != null ? j.getEquipo().getNombre() : "Sin Equipo";
            Object[] fila = {
                    pais,  //NUEVO
                    direccion,  //NUEVO
                    nombreEquipo,
                    j.getNombre(),
                    j.getFechaNacimiento().format(formato),
                    edad,
                    j.getPosicion(),
                    j.getNumero()
            };
            modelo.addRow(fila);
        }
    }

}
