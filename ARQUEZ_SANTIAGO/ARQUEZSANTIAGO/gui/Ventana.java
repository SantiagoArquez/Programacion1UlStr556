package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.*;

import datos.Equipo;
import datos.Jugador;



public class Ventana extends JFrame {
    
    // componentes gráficos
    private JLabel titulo;
    private JLabel lbIdentificacion;
    private JLabel lbNumero;
    private JLabel lbNombreJugador;
    private JLabel lbEquipo;
    private JLabel lbPiernaPreferida;
    private JLabel lbPosicion;
    private JLabel JugadorRegistrado;

    private JTextField tIdentificacion;
    private JTextField tNombreJugador;
    private JTextField tEquipo;
    private JTextField tNumero;
    private JTextField tJugadoresRegistrados;

    private JRadioButton opcDerecha;
    private JRadioButton opcIzquierda;


    private JRadioButton opcPortero;
    private JRadioButton opcDefensa;
    private JRadioButton opcDelantero;
    private JRadioButton opcMediocampista;


    private JButton bCrear;
   
  

    //constructor creo
    public Ventana(){

        this.initComponents();

    
    }
    private void initComponents() {

        //establece el titulo de la ventana
        this.setTitle("Gestion Jugadores");
        //tamaño de la ventana
        setSize(500, 500);
        //operacion para cerrar si dan x
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // COMPONENTES

        //Titulo
        titulo = new JLabel();
        titulo.setText(" Jugadores de futbol ");
        titulo.setBounds(50,20,150,30); // donde esta el titulo
        titulo.setFont(new java.awt.Font("Tahoma", 1, 14));
        titulo.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(titulo);

        //label titulo
        lbNombreJugador = new JLabel();
        lbNombreJugador.setText(" Nombre de Jugador ");
        lbNombreJugador.setBounds(50,80,150,30);
        lbNombreJugador.setFont(new java.awt.Font("Tahoma", 1, 14));
        lbNombreJugador.setForeground(Color.RED);
        getContentPane().add(lbNombreJugador);

        //Area de nombre de jugador Jtextfield
        tNombreJugador = new JTextField();
        tNombreJugador.setBounds(250, 80, 150, 30);
        tNombreJugador.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(tNombreJugador);

        //titulo tipo cuenta
        lbPiernaPreferida = new JLabel();
        lbPiernaPreferida.setText(" Pierna Preferida ");
        lbPiernaPreferida.setBounds(220,170,120,30);
        lbPiernaPreferida.setFont(new java.awt.Font("Tahoma", 1, 14));
        lbPiernaPreferida.setForeground(Color.BLACK);
        getContentPane().add(lbPiernaPreferida);


        // la teoria dice que esto son las opciones
        ButtonGroup grupoOpciones = new ButtonGroup();

        opcDerecha = new JRadioButton("Derecha");
        opcDerecha.setBounds(320, 200, 100, 30);
        opcDerecha.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(opcDerecha);

        opcIzquierda = new JRadioButton("Izquierda");
        opcIzquierda.setBounds(220, 200, 100, 30);
        opcIzquierda.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(opcIzquierda);

        grupoOpciones.add(opcDerecha);
        grupoOpciones.add(opcIzquierda);

        lbPosicion = new JLabel();
        lbPosicion.setText(" Posicion ");
        lbPosicion.setBounds(50,240,120,30);
        lbPosicion.setFont(new java.awt.Font("Tahoma", 1, 14));
        lbPosicion.setForeground(Color.BLACK);
        getContentPane().add(lbPosicion);

        // la teoria dice que esto son las opciones
        ButtonGroup grupoOpciones2 = new ButtonGroup();

        opcPortero = new JRadioButton("Portero");
        opcPortero.setBounds(250, 250, 100, 30);
        opcPortero.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(opcPortero);

        opcDefensa = new JRadioButton("Defensa");
        opcDefensa.setBounds(150, 250, 100, 30);
        opcDefensa.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(opcDefensa);

        opcDelantero = new JRadioButton("Delantero");
        opcDelantero.setBounds(150, 280, 100, 30);
        opcDelantero.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(opcDelantero);

        opcMediocampista = new JRadioButton("Mediocampista");
        opcMediocampista.setBounds(250, 280, 200, 30);
        opcMediocampista.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(opcMediocampista);

        grupoOpciones2.add(opcPortero);
        grupoOpciones2.add(opcDefensa);
        grupoOpciones2.add(opcDelantero);
        grupoOpciones2.add(opcMediocampista);


        //titulo Identificacion

        lbIdentificacion = new JLabel();
        lbIdentificacion.setText(" Identificacion del jugador ");
        lbIdentificacion.setBounds(50,120,250,30);
        lbIdentificacion.setFont(new java.awt.Font("Tahoma", 1, 14));
        lbIdentificacion.setForeground(Color.BLUE);//COLOR DE LA LETRA
        getContentPane().add(lbIdentificacion);

        //espacio del nombre
        tIdentificacion = new JTextField();
        tIdentificacion.setBounds(250, 120, 150, 30);
        tIdentificacion.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(tIdentificacion);
        
        //titulo del numero
        lbNumero = new JLabel();
        lbNumero.setText(" Número Preferido ");
        lbNumero.setBounds(50,170,250,30);
        lbNumero.setFont(new java.awt.Font("Tahoma", 1, 14));
        lbNumero.setForeground(Color.BLACK);
        getContentPane().add(lbNumero);

        //Espacio del numero
        tNumero = new JTextField();
        tNumero.setBounds(50, 200, 150, 30);
        tNumero.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(tNumero);



        //titulo equipo
        lbEquipo = new JLabel();
        lbEquipo.setText(" Equipo ");
        lbEquipo.setBounds(50,320,100,30);
        lbEquipo.setFont(new java.awt.Font("Tahoma", 1, 14));
        lbEquipo.setForeground(Color.BLACK);
        getContentPane().add(lbEquipo);

        //espacio equipo
        tEquipo = new JTextField();
        tEquipo.setBounds(250, 320, 150, 30);
        tEquipo.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(tEquipo);

        JugadorRegistrado = new JLabel();
        JugadorRegistrado.setText(" Jugadores Registrados ");
        JugadorRegistrado.setBounds(50,400,200,30); // donde esta el titulo
        JugadorRegistrado.setFont(new java.awt.Font("Tahoma", 1, 14));
        JugadorRegistrado.setForeground(Color.RED);
        getContentPane().add(JugadorRegistrado);

        tJugadoresRegistrados = new JTextField();
        tJugadoresRegistrados.setBounds(50, 435, 350, 100);
        tJugadoresRegistrados.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(tJugadoresRegistrados);

        //boton de crear
        bCrear = new JButton("Registrar");
        bCrear.addActionListener(e -> {
            this.crear();
        });
        bCrear.setFont(new java.awt.Font("Tahoma", 1, 14));
        bCrear.setBounds(300,370,100,30);
        getContentPane().add(bCrear);

        setLayout(null);
        setLocationRelativeTo(null);
    }

    private void crear() {

    if (tNombreJugador.getText().isEmpty() || tIdentificacion.getText().isEmpty() || tNumero.getText().isEmpty() || tEquipo.getText().isEmpty()) {

        JOptionPane.showMessageDialog(null,
                "Complete todos los campos",
                "Atención",
                JOptionPane.WARNING_MESSAGE);
        return;
    }
    if (!opcDerecha.isSelected() && !opcIzquierda.isSelected()) {
        JOptionPane.showMessageDialog(null,
                "Seleccione la pierna preferida",
                "Atención",
                JOptionPane.WARNING_MESSAGE);
        return;
    }
    if (!opcPortero.isSelected() && !opcDefensa.isSelected() && !opcDelantero.isSelected() && !opcMediocampista.isSelected()) {

        JOptionPane.showMessageDialog(null,
                "Seleccione una posicion",
                "Atención",
                JOptionPane.WARNING_MESSAGE);
        return;
    }

    String pierna = opcDerecha.isSelected() ? "Derecha" : "Izquierda";

    String posicion = "";
    if (opcPortero.isSelected()) posicion = "Portero";
    if (opcDefensa.isSelected()) posicion = "Defensa";
    if (opcDelantero.isSelected()) posicion = "Delantero";
    if (opcMediocampista.isSelected()) posicion = "Mediocampista";

    // Crear jugador (ajústalo a tu clase Jugador)
    Jugador jugador = new Jugador(
            tNombreJugador.getText(),
            tIdentificacion.getText(),
            Integer.parseInt(tNumero.getText()),
            pierna,
            posicion,
            tEquipo.getText()
    );

    JOptionPane.showMessageDialog(null,
            "Jugador registrado:\n" +
            jugador.toString(),
            "Información",
            JOptionPane.INFORMATION_MESSAGE);

    // Mostrar en el área de registrados
            tJugadoresRegistrados.setText(
            tJugadoresRegistrados.getText() + "\n" + jugador.toString()
    );
}

}

