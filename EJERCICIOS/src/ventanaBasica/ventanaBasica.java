package ventanaBasica;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ventanaBasica {
    private JPanel principal;
    private JButton btn;
    private JLabel etiqueta;

    public ventanaBasica() {
        btn.addActionListener((ActionEvent e) -> {
            etiqueta.setText("holis");
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ventanaBasica");
        frame.setContentPane(new ventanaBasica().principal);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
