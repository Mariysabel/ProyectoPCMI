// María Isabel Pérez Cruz
package formCheckBox;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formCheckBox {
    private int total;
    private JPanel panelPrincipal;
    private JCheckBox checkPizza;
    private JCheckBox checkTaco;
    private JCheckBox checkBebida;
    private JCheckBox checkPostre;
    private JPanel panelResultado;
    private JLabel labelPro;
    private JLabel labelTotal;

    public formCheckBox() {
        total = 0;
        checkPizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkPizza.isSelected()) {
                    total += 10;
                } else {
                    total -= 10;
                }
                labelTotal.setText(String.valueOf(total));
            }
        });

        checkBebida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBebida.isSelected()) {
                    total += 6;
                } else {
                    total -= 6;
                }
                labelTotal.setText(String.valueOf(total));
            }
        });

        checkPostre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkPostre.isSelected()) {
                    total += 20;
                } else {
                    total -= 20;
                }
                labelTotal.setText(String.valueOf(total));
            }
        });

        checkTaco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkTaco.isSelected()) {
                    total += 5;
                } else {
                    total -= 5;
                }
                labelTotal.setText(String.valueOf(total));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana Principal");
        frame.setContentPane(new formCheckBox().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
