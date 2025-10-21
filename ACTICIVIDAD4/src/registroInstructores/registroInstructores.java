// María Isabel Pérez Cruz
package registroInstructores;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class registroInstructores {
    private JPanel panelPrincipal;
    private JTextField nombre;
    private JTextField primerApellido;
    private JTextField segundoApellido;
    private JTextField email;
    private JTextField resumenProfesional;
    private JComboBox comboGenero;
    private JButton btnGuardar;
    private JButton btnClear;
    private JButton btnAceptar;
    private JLabel state;

    public registroInstructores() {
        btnAceptar.addActionListener(e -> {
            String patron = "^[^@]+@[^@]+\\.[^@]+$";
            Pattern pattern = Pattern.compile(patron);
            Matcher matcher = pattern.matcher(email.getText());
            if (nombre.getText().isEmpty() || primerApellido.getText().isEmpty() || segundoApellido.getText().isEmpty()
                    || email.getText().isEmpty() || resumenProfesional.getText().isEmpty()) {
                JOptionPane.showMessageDialog(panelPrincipal, "Debe ingresar correctamente los datos");
            } else if (!matcher.matches()) {
                aparecerEtiqueta(false);
            } else {
                aparecerEtiqueta(true);
                JOptionPane.showMessageDialog(panelPrincipal, "Instructor: \n"
                        + nombre.getText() + " "
                        + primerApellido.getText() + " "
                        + segundoApellido.getText() + "\n"
                        + email.getText() + "\n"
                        + comboGenero.getSelectedItem().toString() + "\n"
                        + resumenProfesional.getText() + "\n");
            }
        });

        btnClear.addActionListener(e -> {
            nombre.setText("");
            primerApellido.setText("");
            segundoApellido.setText("");
            email.setText("");
            comboGenero.setSelectedIndex(0);
            resumenProfesional.setText("");
        });


        btnGuardar.addActionListener(e -> {
            JOptionPane.showMessageDialog(panelPrincipal, "Instructor registrado con éxito:\n\n" +
                    "Nombre: " + nombre.getText() + " " +
                    primerApellido.getText() + " " +
                    segundoApellido.getText() + "\n" +
                    "Email: " + email.getText() + "\n" +
                    "Género: " + comboGenero.getSelectedItem().toString() + "\n" +
                    "Resumen: " + resumenProfesional.getText());
        });


        DocumentListener listener = new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                validarFormulario();
            }

            public void removeUpdate(DocumentEvent e) {
                validarFormulario();
            }

            public void changedUpdate(DocumentEvent e) {
                validarFormulario();
            }
        };
        nombre.getDocument().addDocumentListener(listener);
        primerApellido.getDocument().addDocumentListener(listener);
        segundoApellido.getDocument().addDocumentListener(listener);
        resumenProfesional.getDocument().addDocumentListener(listener);

        email.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                validarFormulario();
                validarCorreo();
            }

            public void removeUpdate(DocumentEvent e) {
                validarFormulario();
                validarCorreo();
            }

            public void changedUpdate(DocumentEvent e) {
                validarFormulario();
                validarCorreo();
            }


        });
    }

    private boolean validarCorreo(){
        String patron = "^[^@]+@[^@]+\\.[^@]+$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(email.getText());
        if (matcher.matches()) {
            aparecerEtiqueta(true);
            return true;
        } else {
            if(!email.getText().isEmpty()) {
                aparecerEtiqueta(false);
            }else{
                state.setVisible(false);
            }
            return false;
        }
    }

    private void validarFormulario() {
        boolean camposLlenos = !nombre.getText().isEmpty() && !primerApellido.getText().isEmpty() &&
                !segundoApellido.getText().isEmpty() && !email.getText().isEmpty() && !resumenProfesional.getText().isEmpty();

        if (camposLlenos && validarCorreo()) {
            btnGuardar.setVisible(true);
        } else {
            btnGuardar.setVisible(false);
        }
    }

    private void aparecerEtiqueta(Boolean flag){
        state.setText((flag)?"OK":"INVALIDO");
        state.setForeground((flag)?Color.GREEN:Color.RED);
        state.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("REGISTRO INSTRUCTORES");
        frame.setContentPane(new registroInstructores().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
