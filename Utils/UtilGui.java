/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author d2tod
 */
public class UtilGui {
    public static boolean validateFields(JComponent... components) {
       for (JComponent component : components) {
        if (component instanceof JTextField) {
            JTextField textField = (JTextField) component;
            System.out.println("Validando JTextField: " + textField.getText().trim());  // Imprime el texto del campo
            if (textField.getText().trim().isEmpty()) {
                System.out.println("Campo vacío: " + textField.getName());  // Imprime el nombre del campo
                return false;
            }
        } else if (component instanceof JPasswordField) {
            JPasswordField passwordField = (JPasswordField) component;
            String password = new String(passwordField.getPassword()).trim();
            System.out.println("Validando JPasswordField: " + password);  // Imprime la contraseña
            if (password.isEmpty()) {
                System.out.println("Campo vacío: " + passwordField.getName());  // Imprime el nombre del campo
                return false;
            }
        } else if (component instanceof JComboBox) {
            JComboBox<?> comboBox = (JComboBox<?>) component;
            System.out.println("Validando JComboBox: " + comboBox.getSelectedItem());  // Imprime la selección
            if (comboBox.getSelectedItem() == null || comboBox.getSelectedIndex() == -1) {
                System.out.println("Selección no válida en JComboBox: " + comboBox.getName());
                return false;  // Si el JComboBox no tiene selección válida, la validación falla
            }
        }
    }
    return true;
    }
    
    public static void clearTxts(JComponent... components){
        for (JComponent component : components) {
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                textField.setText("");
            } else if (component instanceof JComboBox) {
                JComboBox<?> comboBox = (JComboBox<?>) component;
                comboBox.setSelectedIndex(-1);
            }
            // Puedes agregar más casos si es necesario para otros tipos de componentes
        }
    }
    
    public static void SetEditableStateTxts(boolean value,JComponent... components){
        for (JComponent component : components) {
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                textField.setEditable(value);
            } else if (component instanceof JComboBox) {
                JComboBox<?> comboBox = (JComboBox<?>) component;
                comboBox.setEnabled(value);
            }
            // Puedes agregar más casos si es necesario para otros tipos de componentes
        }
    }
    
    public static void changeStateButtons(JButton... btns) {
        for (JButton btn : btns) {
            btn.setEnabled(!btn.isEnabled());
        }
    }
}
