package gui;


import java.awt.event.ActionEvent;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.*;

import datos.Cliente;
import datos.Cuenta;
import datos.CuentaAhorros;
import datos.CuentaCorriente;


public class VentanaBancoM extends JFrame {
    // componentes gráficos
    private JRadioButton btAhorros;
    private JRadioButton btCorriente;
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
        btAhorros = new JRadioButton();
        btCorriente = new JRadioButton();
        btCrear = new JButton();
        btEnviarApellido = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        //Titulo
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Banco Mio");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 10, 250, 17);

        //Area donde se muesta el titulo
        mensajesTxt.setColumns(20);
        mensajesTxt.setRows(5);
        jScrollPane1.setViewportView(mensajesTxt);
        
        
        //Cuenta Tipo titulo
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14));
        jLabel2.setText("Cuenta Tipo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 120, 30);


        //Ahorros titulo
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14));
        jLabel4.setText("Ahorros");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 90, 120, 30);



        //Corriente titulo
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14));
        jLabel5.setText("Corriente");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 90, 120, 30);



        // la teoria dice que esto son las opciones PERO NO ME SIRVE AUN
        ButtonGroup grupoOpciones = new ButtonGroup();
        btAhorros = new JRadioButton("Ahorros");
        btAhorros.setBounds(40, 95, 20, 20);
        btAhorros.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(btAhorros);
    
        btCorriente = new JRadioButton("Corriente");
        btCorriente.setBounds(135, 95, 20, 20);
        btCorriente.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(btCorriente);

        grupoOpciones.add(btAhorros);
        grupoOpciones.add(btCorriente);

        //Numero titulo

        //espacio para el generado
        mensajeTxt2.setFont(new java.awt.Font("Verdana", 0, 14));
        getContentPane().add(mensajeTxt2);
        mensajeTxt2.setBounds(140, 130, 140, 30);
        mensajeTxt2.setEditable(false);
        

        //titulo numero
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14));
        jLabel3.setText("Numero:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 130, 120, 30);

    
        //Boton Generar
        //titulo
        btEnviarApellido.setFont(new java.awt.Font("Verdana", 0, 14));
        btEnviarApellido.setText("Generar");


        //accion del boton
        btEnviarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarNumeroActionPerformed(evt);//genera el evento
            }
        });
        getContentPane().add(btEnviarApellido);

        //posicion
        btEnviarApellido.setBounds(327, 130, 140, 27);
        setSize(new java.awt.Dimension(491, 375));
        setLocationRelativeTo(null);

        //espacio del saldo
        mensajeTxt3.setFont(new java.awt.Font("Verdana", 0, 14));
        getContentPane().add(mensajeTxt3);
        mensajeTxt3.setBounds(140, 190, 140, 30);

        //Titulo del saldo
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14));
        jLabel6.setText("Saldo inicial:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 190, 120, 30);

        //botonCrear
        btCrear.setFont(new java.awt.Font("Verdana", 0, 14));
        btCrear.setText("Crear");
        btCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(btCrear);
        btCrear.setBounds(327, 190, 140, 27);
        setSize(new java.awt.Dimension(491, 375));
        setLocationRelativeTo(null);

        //espacio donde salga la cuenta creada
        mensajeTxt4.setFont(new java.awt.Font("Verdana", 0, 14));
        getContentPane().add(mensajeTxt4);
        mensajeTxt4.setBounds(20, 240, 450, 100);
    }

    // Metodo al presionar el boton Crear (eso estaba pidiendo el profe, perdido)
    private void btCrearCuentaActionPerformed(ActionEvent evt) {

        if(mensajeTxt2.getText().isEmpty() || mensajeTxt3.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,
            "No hay numero de cuenta o Saldo escrito ",
            "Atencion",
            JOptionPane.WARNING_MESSAGE);
            return ;
        }

        Cuenta cuenta = null;
        Cliente cliente = new Cliente("Cliente","000");

        double saldo;

        try{
            saldo = Double.parseDouble(mensajeTxt3.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Saldo invalido");
            return;
        }

        if (btAhorros.isSelected()){
            cuenta = new CuentaAhorros(cliente, mensajeTxt2.getText(), saldo);

        }else if (btCorriente.isSelected()){
            cuenta = new CuentaCorriente(cliente, mensajeTxt2.getText(), saldo);
        }

        if(cuenta == null){
            JOptionPane.showMessageDialog(null,"Seleccione tipo de cuenta");
            return;
        }

        JOptionPane.showMessageDialog(null,
            "Crear."+cuenta.obtenerNumero()+" Saldo "+cuenta.getSaldo(),
            "Información",
            JOptionPane.INFORMATION_MESSAGE);
    }
    
    private String generarNumAleatorio(){
        int numero =  ThreadLocalRandom.current().nextInt(1000, 10000);
        String valor = String.valueOf(numero);
        return valor;
    }

    // Metodo al presionar el boton Generar
    // Metodo al presionar el boton Generar
    private void btGenerarNumeroActionPerformed(ActionEvent evt) {
    String numAleatorio = generarNumAleatorio();

    if(btAhorros.isSelected()){
        mensajeTxt2.setText("4524" + numAleatorio);

    } else if(btCorriente.isSelected()){
        mensajeTxt2.setText("8524" + numAleatorio);

    } else {
        JOptionPane.showMessageDialog(null,
            "Seleccione la opción tipo cuenta",
            "Atención",
            JOptionPane.WARNING_MESSAGE);
    }
}
}
