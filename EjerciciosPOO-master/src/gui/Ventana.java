package gui;

import util.UtilArchivos;
import dto.Docente;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {
    // componentes gráficos
    private JButton btEnviar;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JScrollPane jScrollPane1;
    private JTextArea mensajesTxt;
    private JTextField mensajeTxt;
    public Ventana() {
        this.setTitle("Ventana");
        this.iniciarComponentes();
    }
    private void iniciarComponentes() {

        this.setTitle("Gestion Docente ");
        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        mensajesTxt = new JTextArea();
        mensajeTxt = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        btEnviar = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Se realiza para que se cierre cuando le de X
        getContentPane().setLayout(null); //desde aca se inicia a medir columnas y flas


        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Registrar Docente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 10, 250, 17);

        mensajesTxt.setColumns(20);
        mensajesTxt.setRows(5);

        jScrollPane1.setViewportView(mensajesTxt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 210, 410, 110);

        mensajeTxt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(mensajeTxt);
        mensajeTxt.setBounds(40, 120, 350, 30);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 120, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 180, 120, 30);

        btEnviar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btEnviar.setText("Enviar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btEnviar);
        btEnviar.setBounds(327, 160, 120, 27);

        setSize(new java.awt.Dimension(491, 375));
        setLocationRelativeTo(null);
    }

    private void btEnviarActionPerformed(ActionEvent evt) {
        this.guardar();
    }

    private void guardar() {
        JOptionPane.showMessageDialog(this,"Aqui se guarda ");
        String contenidoCaja = this.mensajeTxt.getText();
        Docente docente = new Docente();
        docente.GuardarNombre(contenidoCaja);
        this.mensajesTxt.append(contenidoCaja+"\n");
        String[] dato = new String[1];
        dato[0] = docente.ObtenerNombre();
        UtilArchivos.guardar("archivo.txt",dato, true); // ERROR

    }
}
