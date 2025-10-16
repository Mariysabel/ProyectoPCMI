package combosYRadios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class combosYRadios {
    final Color morado = new Color(178, 148, 255);
    final Color amarillo = new Color(255,248,151);
    final Color rosa = new Color(249,177,245);
    private JPanel panelFondo;
    private JComboBox comboBox1;
    private JRadioButton radioLetraMini;
    private JRadioButton radioLetraMediana;
    private JRadioButton radioLetraGrande;
    private JPanel panelResultado;
    private JLabel etiquetaResultado;
    private JButton btnAceptar;

    public combosYRadios() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioLetraMini);
        buttonGroup.add(radioLetraMediana);
        buttonGroup.add(radioLetraGrande);
        radioLetraMini.setActionCommand("LetraMini");
        radioLetraMediana.setActionCommand("LetraMediana");
        radioLetraGrande.setActionCommand("LetraGrande");

        btnAceptar.addActionListener((ActionEvent e) -> {
            switch (comboBox1.getSelectedIndex()) {
                case 0:
                    panelResultado.setBackground(rosa);
                    break;
                case 1:
                    panelResultado.setBackground(amarillo);
                    break;
                case 2:
                    panelResultado.setBackground(morado);
                    break;
            }

            switch (buttonGroup.getSelection().getActionCommand()) {
                case "LetraMini":
                    etiquetaResultado.setFont(new Font("Arial", 0, 10));
                    break;
                case "LetraMediana":
                    etiquetaResultado.setFont(new Font("Arial", 0, 14));
                    break;
                case "LetraGrande":
                    etiquetaResultado.setFont(new Font("Arial", 0, 18));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("combosYRadios");
        frame.setContentPane(new combosYRadios().panelFondo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
