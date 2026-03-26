import gui.VentanaBancoM;

/**
 * Author: Vinni 2025
 */
public class Principal {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBancoM().setVisible(true);
            }
        });
    }
}