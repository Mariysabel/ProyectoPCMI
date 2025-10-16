package botonesCambioFondo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class botonesCambiaFondo {
    final Color morado = new Color(178, 148, 255);
    final Color amarillo = new Color(255,248,151);
    final Color rosa = new Color(249,177,245);
    private JButton btnMorado;
    private JButton btnAmarillo;
    private JButton btnRosa;
    private JPanel panelFondo;

    public botonesCambiaFondo() {
        btnMorado.addActionListener((ActionEvent e) -> {
            panelFondo.setBackground(morado);
        });

        btnRosa.addActionListener((ActionEvent e) -> {
            panelFondo.setBackground(rosa);
        });

        btnAmarillo.addActionListener((ActionEvent e) -> {
            panelFondo.setBackground(amarillo);
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("botonesCambiaFondo");
        frame.setContentPane(new botonesCambiaFondo().panelFondo);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
