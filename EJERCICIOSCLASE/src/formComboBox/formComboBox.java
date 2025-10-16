// María Isabel Pérez Cruz
package formComboBox;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formComboBox {
    final Color morado = new Color(178, 148, 255);
    final Color amarillo = new Color(255,248,151);
    final Color rosa = new Color(249,177,245);
    private JPanel panelPrincipal;
    private JComboBox combo;
    private JLabel resultado;
    private JPanel panelResultado;

    public formComboBox() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Opcion1");
        modelo.addElement("Opcion2");
        modelo.addElement("Opcion3");
        modelo.addElement("Opcion4");

        combo.setModel(modelo);



        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (combo.getSelectedIndex()) {
                    case 0:
                        resultado.setText("Opcion 1");
                        panelResultado.setBackground(Color.BLUE);
                        break;
                    case 1:
                        resultado.setText("Opcion 2");
                        panelResultado.setBackground(morado);
                        break;
                    case 2:
                        resultado.setText("Opcion 3");
                        panelResultado.setBackground(amarillo);
                        break;
                    case 3:
                        resultado.setText("Opcion 4");
                        panelResultado.setBackground(rosa);
                        break;

                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana Principal");
        frame.setContentPane(new formComboBox().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
