package formularioSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class formularioSwing {
    private JTextField nombre;
    private JTextField edad;
    private JButton btnMostrar;
    private JLabel etiquetaNombre;
    private JLabel etiquetaEdad;
    private JPanel panelFormulario;


    public formularioSwing() {

        btnMostrar.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null,
                    "Bienvenido:" + nombre.getText() + "\nEdad:" + edad.getText());

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("formularioSwing");
        frame.setContentPane(new formularioSwing().panelFormulario);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public JTextField getEdad() {
        return edad;
    }

    public JTextField getNombre() {
        return nombre;
    }

}
