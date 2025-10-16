package jTableVentana;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class jTableVentana {
    private JPanel panelFondo;
    private JButton btnAgregar;
    private JTable tablaBase;
    private JTextField nombre;
    private JLabel etiquetaNombre;
    private JTextField carrera;
    private JPanel panelTabla;
    private JSpinner edad;
    private DefaultTableModel modeloTabla;

    public jTableVentana() {
        modeloTabla = new DefaultTableModel(
                new Object[]{"NOMBRE", "EDAD", "CARRERA"}, 0 // columnas, sin filas iniciales
        );

        tablaBase.setModel(modeloTabla);

        String[] nombres = {"Juan", "Mario", "Julio", "César", "Francisco", "Fredy"};
        String[] apellidos = {"Pérez", "Ruiz", "Castillo", "Santiago", "Cuevas", "Gómez"};
        String[] carreras = {"Sistemas", "Gestión", "Industrial"};

        for (int i = 0; i < 23; i++) {
            modeloTabla.addRow(new Object[]{
                    nombres[(int)(Math.random() * nombres.length)] + " " + apellidos[(int)(Math.random() * apellidos.length)]+ " " + apellidos[(int)(Math.random() * apellidos.length)],
                    18 + (int)(Math.random() * 50),
                    carreras[(int)(Math.random() * carreras.length)]
            });
        }

        btnAgregar.addActionListener((ActionEvent e) -> {
            System.out.println(edad.getValue());
            modeloTabla.addRow(new Object[]{nombre.getText(), ""+ edad.getValue(), carrera.getText()});
            nombre.setText("");
            carrera.setText("");
            edad.setValue(0);
        });

        carrera.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    if(nombre.getText().equals("") || carrera.getText().equals("") || edad.getValue().equals(0)){
                        JOptionPane.showMessageDialog(null, "Datos Incompletos");
                    }else{
                        btnAgregar.doClick();}
                }
                super.keyPressed(e);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("jTableVentana");
        frame.setContentPane(new jTableVentana().panelFondo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
