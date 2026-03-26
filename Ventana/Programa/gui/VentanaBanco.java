package gui;


import java.awt.event.ActionEvent;
import javax.swing.*;


public class VentanaBanco extends JFrame {
    // componentes gráficos
    private JButton btEnviar;
    private JButton btEnviarApellido;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JScrollPane jScrollPane1;
    private JTextArea mensajesTxt;
    private JTextField mensajeTxt;
    private JTextField mensajeTxt2;

    public VentanaBanco() {
        this.setTitle("Ventana");
        this.iniciarComponentes();
    }
    private void iniciarComponentes() {

        this.setTitle("Gestion Docente ");
        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        mensajesTxt = new JTextArea();
        mensajeTxt = new JTextField();
        mensajeTxt2 = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        btEnviar = new JButton();
        btEnviarApellido = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Se realiza para que se cierre cuando le de X
        getContentPane().setLayout(null); //desde aca se inicia a medir columnas y flas

        //Titulo
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Registrar Docente");
        //Area
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 10, 250, 17);

        //Area donde se muesta el titulo
        mensajesTxt.setColumns(20);
        mensajesTxt.setRows(5);
        jScrollPane1.setViewportView(mensajesTxt);
        
        //Area en blanco grande ABAJO DEL TODO
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 350, 410, 110);


        //Nombre titulo
        //Area
        mensajeTxt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(mensajeTxt);
        mensajeTxt.setBounds(40, 120, 350, 30);
        //titulo
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 120, 30);



        //Apellido titulo

        //Area
        mensajeTxt2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(mensajeTxt2);
        mensajeTxt2.setBounds(40, 240, 350, 30);

        //titulo

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 180, 120, 30);

        //Boton Nombre
        btEnviar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btEnviar.setText("Enviar Nombre");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt); // agregas un metodo
            }
        });

        //LITERALMETE EL BOTON DONDE ESTA
        getContentPane().add(btEnviar);
        btEnviar.setBounds(327, 160, 140, 27);
        setSize(new java.awt.Dimension(491, 375));
        setLocationRelativeTo(null);
    
        //Boton Apellido
        btEnviarApellido.setFont(new java.awt.Font("Verdana", 0, 14));
        btEnviarApellido.setText("Enviar Apellido");
        btEnviarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarApellidoActionPerformed(evt); // agregas un metodo
            }
        });
        //LITERALMETE EL BOTON DONDE ESTA
        getContentPane().add(btEnviarApellido);
        btEnviarApellido.setBounds(327, 290, 140, 27);
        setSize(new java.awt.Dimension(491, 375));
        setLocationRelativeTo(null);

    }
    // Metodo al presionar el boton nombre (eso estaba pidiendo el profe perdido)
        private void btEnviarActionPerformed(ActionEvent evt) {
        this.guardarNombre();
    }

    // Metodo al presionar el boton apellido
    private void btEnviarApellidoActionPerformed(ActionEvent evt) {
        this.guardarApellido();
    }


    private void guardarNombre() {
    JOptionPane.showMessageDialog(this,"Aqui se guarda ");
    String contenidoCaja = this.mensajeTxt.getText();
    Docente docente = new Docente(contenidoCaja, "");//Contructor
    this.mensajesTxt.append("Nombre: " + contenidoCaja + "\n");
    String[] dato = new String[1];
    dato[0] = docente.ObtenerNombre();
    UtilArchivos.guardar("archivo.txt", dato, true);

}
    private void guardarApellido() {
        JOptionPane.showMessageDialog(this,"Aqui se guarda el apellido");
        String contenidoCaja = this.mensajeTxt2.getText();
        Docente docente = new Docente("", contenidoCaja);//Contructor
        this.mensajesTxt.append("Apellido: " + contenidoCaja + "\n");
        String[] dato = new String[1];
        dato[0] = docente.ObtenerApellido();
        UtilArchivos.guardar("archivo.txt", dato, true);
}
    }