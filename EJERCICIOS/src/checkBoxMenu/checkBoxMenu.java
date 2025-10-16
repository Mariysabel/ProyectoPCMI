package checkBoxMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class checkBoxMenu {
    private JCheckBox checkPizza;
    private JCheckBox checkRefresco;
    private JCheckBox checkHelado;
    private JCheckBox checkHamburguesa;
    private JButton btnMostrar;
    private JPanel panelFodo;

    public checkBoxMenu() {
        ArrayList<String> seleccionados = new ArrayList<>();
        btnMostrar.addActionListener((ActionEvent e) -> {
            if(checkPizza.isSelected()) {seleccionados.add("Pizza");}
            if(checkRefresco.isSelected()) {seleccionados.add("Refresco");}
            if(checkHelado.isSelected()) {seleccionados.add("Helado");}
            if(checkHamburguesa.isSelected()) {seleccionados.add("Hamburguesa");}
            String lista = lista(seleccionados);
            JOptionPane.showMessageDialog(null,
                    (lista!=""?"Orden realizada: \n"+lista:"No hay pedido"));
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("checkBoxMenu");
        frame.setContentPane(new checkBoxMenu().panelFodo);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private String lista(ArrayList<String> lista) {
        String resultado = "";
        for(int i = 0; i < lista.size(); i++) {
            resultado += lista.get(i) + "\n";
        }
        return resultado;
    }
}
