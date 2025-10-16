// María Isabel Pérez Cruz
package JListEjercicio;
import javax.swing.*;

public class JListEjercicio {
    private JPanel panelPrincipal;
    private JPanel panelLista;
    private JList listaProductos;
    private JLabel etiquetaProducto;

    public JListEjercicio() {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        String[] productos = {"Pizza de peperoni", "5 tacos jaja", "Café con leche", "Pastel Dulce"};
        modelo.addElement("Pizza");
        modelo.addElement("Taco");
        modelo.addElement("Bebida");
        modelo.addElement("Postre");
        listaProductos.setModel(modelo);

        listaProductos.addListSelectionListener(e -> {
            int index = listaProductos.getSelectedIndex();
            if (index != -1) {
                etiquetaProducto.setText(productos[index]);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana Principal");
        frame.setContentPane(new JListEjercicio().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
