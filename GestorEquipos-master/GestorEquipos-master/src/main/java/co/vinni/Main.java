package co.vinni;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import co.vinni.gui.VentanaMenu;

/**
 * @Author : Vinni
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio aplicación.");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {
            new VentanaMenu().setVisible(true);
        });
    }
}
