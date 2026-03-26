package gui;

import datos.Cliente;
import datos.Cuenta;
import datos.CuentaAhorros;
import datos.CuentaCorriente;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class VentanaCrear extends JFrame {

    private JLabel titulo;
    private JLabel lbNombreCliente;
    private JLabel lbNumero;
    private JLabel lbIdentificacion;
    private JLabel lbSaldo;
    private JLabel lbTipoCuenta;

    private JTextField tNombreCliente;
    private JTextField tIdentificacion;
    private JTextField tSaldo;
    private JTextField tNumeroCuenta;

    private JRadioButton opcAhorros;
    private JRadioButton opcCorriente;

    private JButton bCrear;
    private JButton bGenerar;

    private String numCuentaAh;
    private String numCuentaCr;
    public VentanaCrear()
    {

        this.numCuentaAh = "";
        this.numCuentaCr = "";
        this.initComponents();
        this.tSaldo.setText("0");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        this.setTitle("Gestion Banco");

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // COMPONENTES
        titulo = new JLabel();
        titulo.setText(" El banco MIO - ");
        titulo.setBounds(100,20,150,30);
        titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(titulo);



        lbIdentificacion = new JLabel();
        lbIdentificacion.setText(" Identificación ");
        lbIdentificacion.setBounds(50,50,120,30);
        lbIdentificacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbIdentificacion.setForeground(Color.BLACK);
        getContentPane().add(lbIdentificacion);

        tIdentificacion = new JTextField();
        tIdentificacion.setBounds(100, 80, 150, 30);
        tIdentificacion.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(tIdentificacion);

        lbTipoCuenta = new JLabel();
        lbTipoCuenta.setText(" Tipo Cuenta ");
        lbTipoCuenta.setBounds(320,50,120,30);
        lbTipoCuenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTipoCuenta.setForeground(Color.BLACK);
        getContentPane().add(lbTipoCuenta);

        ButtonGroup grupoOpciones = new ButtonGroup();

        opcAhorros = new JRadioButton("Ahorros");
        opcAhorros.setBounds(300, 80, 100, 30);
        opcAhorros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(opcAhorros);

        opcCorriente = new JRadioButton("Corriente");
        opcCorriente.setBounds(300, 120, 100, 30);
        opcCorriente.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(opcCorriente);

        grupoOpciones.add(opcAhorros);
        grupoOpciones.add(opcCorriente);

        lbNombreCliente = new JLabel();
        lbNombreCliente.setText(" Nombre del cliente");
        lbNombreCliente.setBounds(50,120,150,30);
        lbNombreCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNombreCliente.setForeground(Color.BLACK);
        getContentPane().add(lbNombreCliente);

        tNombreCliente = new JTextField();
        tNombreCliente.setBounds(100, 160, 150, 30);
        tNombreCliente.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(tNombreCliente);

        lbNumero = new JLabel();
        lbNumero.setText(" Número");
        lbNumero.setBounds(50,190,100,30);
        lbNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNumero.setForeground(Color.BLACK);
        getContentPane().add(lbNumero);

        tNumeroCuenta = new JTextField();
        tNumeroCuenta.setBounds(100, 220, 150, 30);
        tNumeroCuenta.setEnabled(false);
        tNumeroCuenta.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(tNumeroCuenta);



        bGenerar = new JButton("Generar");
        bGenerar.addActionListener(e -> {
            this.generar();
        });
        bGenerar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bGenerar.setBounds(300,220,100,30);
        getContentPane().add(bGenerar);

        lbSaldo = new JLabel();
        lbSaldo.setText(" Saldo ");
        lbSaldo.setBounds(50,260,100,30);
        lbSaldo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbSaldo.setForeground(Color.BLACK);
        getContentPane().add(lbSaldo);

        tSaldo = new JTextField();
        tSaldo.setBounds(100, 300, 150, 30);
        tSaldo.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(tSaldo);

        bCrear = new JButton("Registrar");
        bCrear.addActionListener(e -> {
            this.crear();
        });
        bCrear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bCrear.setBounds(300,300,100,30);
        //bCrear.setEnabled(false);
        getContentPane().add(bCrear);


        setLayout(null);
        setLocationRelativeTo(null);

        getContentPane().setLayout(null);
    }
        mensajeTxt2.setEditable(false);
    private void generar()
    {
        /*JOptionPane.showMessageDialog(null,
                "Generar."+opcAhorros.isSelected(),
                "Información",
                JOptionPane.INFORMATION_MESSAGE);*/

        if (this.numCuentaAh.isEmpty() )
            this.numCuentaAh = "4524"+this.generarNumAletorio();
        if (this.numCuentaCr.isEmpty() )
            this.numCuentaCr = "8524"+this.generarNumAletorio();

        if (opcAhorros.isSelected()){
            tNumeroCuenta.setText(this.numCuentaAh);
        }else if (opcCorriente.isSelected()){
            tNumeroCuenta.setText(this.numCuentaCr);
        }else{
            JOptionPane.showMessageDialog(null,
                    "Selecione la opción tipo cuenta.",
                    "Atención",
                    JOptionPane.WARNING_MESSAGE);
        }


    }
    private void crear()
    {
        if(tNumeroCuenta.getText().isEmpty()|| tNombreCliente.getText().isEmpty()||tIdentificacion.getText().isEmpty()||tSaldo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,
            "No hay numero de cuenta ",
            "Atencion",
            JOptionPane.WARNING_MESSAGE);
            return ;
        }
        Cuenta cuenta =null;
        
        Cliente cliente = new Cliente(tNombreCliente.getText(),tIdentificacion.getText());


        if (opcAhorros.isSelected()){
            cuenta = new CuentaAhorros(cliente,tNumeroCuenta.getText(),0);

        }else if (opcCorriente.isSelected()){
            cuenta = new CuentaCorriente(cliente,tNumeroCuenta.getText(),0);

    }
    JOptionPane.showMessageDialog(null,
            "Crear."+cuenta.obtenerNumero()+" Saldo "+cuenta.getSaldo(),
            "Información",
            JOptionPane.INFORMATION_MESSAGE);

    }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        EventQueue.invokeLater(() -> {
            VentanaCrear ventana = new VentanaCrear();
            ventana.setVisible(true);
        });
    }
    private String generarNumAletorio(){
       int numero =  ThreadLocalRandom.current().nextInt(1000, 10000);
       String valor = String.valueOf(numero);
       return valor;
    }

}

