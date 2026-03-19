package gui;


import java.awt.event.ActionEvent;
import javax.swing.*;


public class VentanaBancoM extends JFrame {
    // componentes gráficos
    private JButton btAhorros;
    private JButton btCorriente;
    private JButton btEnviarApellido;
    private JButton btCrear;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;  
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JScrollPane jScrollPane1;
    private JTextArea mensajesTxt;
    private JTextField mensajeTxt;
    private JTextField mensajeTxt2;
    private JTextField mensajeTxt3;
    private JTextField mensajeTxt4;


    public VentanaBancoM() {
        this.setTitle("Ventana");
        this.iniciarComponentes();
    }
    private void iniciarComponentes() {

        this.setTitle("Banco Mio ");
        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        mensajesTxt = new JTextArea();
        mensajeTxt = new JTextField();
        mensajeTxt2 = new JTextField();
        mensajeTxt3 = new JTextField();
        mensajeTxt4 = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        btAhorros = new JButton();
        btCorriente = new JButton();
        btCrear = new JButton();
        btEnviarApellido = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Se realiza para que se cierre cuando le de X
        getContentPane().setLayout(null); //desde aca se inicia a medir columnas y flas

        //Titulo
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Banco Mio");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 10, 250, 17);

        //Area donde se muesta el titulo
        mensajesTxt.setColumns(20);
        mensajesTxt.setRows(5);
        jScrollPane1.setViewportView(mensajesTxt);
        
        
        //Cuenta Tipo titulo
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Cuenta Tipo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 120, 30);


        //Ahorros titulo
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Ahorros");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(55, 90, 120, 30);



        //Corriente titulo
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Corriente");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 90, 120, 30);



        // la teoria dice que esto son las opciones PERO NO ME SIRVE AUN
        ButtonGroup group = new ButtonGroup();
        group.add(btAhorros);
        group.add(btCorriente);

        btAhorros.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(btAhorros);
        btAhorros.setBounds(40, 102, 10, 10);

        btCorriente.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(btCorriente);
        btCorriente.setBounds(135, 102, 10, 10);


    
        //Numero titulo

        //espacio para el generado
        mensajeTxt2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(mensajeTxt2);
        mensajeTxt2.setBounds(110, 130, 140, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Numero:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 130, 120, 30);

    
        //Boton Generar
        btEnviarApellido.setFont(new java.awt.Font("Verdana", 0, 14));
        btEnviarApellido.setText("Generar");
        btEnviarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarApellidoActionPerformed(evt); // agregas un metodo
            }
        });
        //LITERALMETE EL BOTON DONDE ESTA Generar
        getContentPane().add(btEnviarApellido);
        btEnviarApellido.setBounds(327, 130, 140, 27);
        setSize(new java.awt.Dimension(491, 375));
        setLocationRelativeTo(null);





        //espacio del saldo
        mensajeTxt3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(mensajeTxt3);
        mensajeTxt3.setBounds(110, 190, 140, 30);

        //Titulo del saldo
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Saldo inicial:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 190, 120, 30);




        //botonCrear
        btCrear.setFont(new java.awt.Font("Verdana", 0, 14));
        btCrear.setText("Crear");
        btCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarApellidoActionPerformed(evt); // agregas un metodo
            }
        });
        //LITERALMETE EL BOTON DONDE ESTA Crear
        getContentPane().add(btCrear);
        btCrear.setBounds(327, 240, 140, 27);
        setSize(new java.awt.Dimension(491, 375));
        setLocationRelativeTo(null);




        //espacio donde salga la cuenta creada
        mensajeTxt4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(mensajeTxt4);
        mensajeTxt4.setBounds(20, 300, 450, 100);








    
    }
    // Metodo al presionar el boton nombre (eso estaba pidiendo el profe perdido)
        private void btTipoCuentaAActionPerformed(ActionEvent evt) {
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