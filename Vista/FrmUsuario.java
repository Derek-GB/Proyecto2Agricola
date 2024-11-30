/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Controlador.UsuarioControlador;
import Enums.Rol;
import Modelo.Usuario.Usuario;
import Utils.UtilDate;
import Utils.UtilGui;
import java.awt.Image;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Fernando
 */
public class FrmUsuario extends javax.swing.JInternalFrame implements Vista<Usuario> {

    /**
     * Creates new form FrmUsuario
     */
    UsuarioControlador controller;
    Usuario usuario;
    FrmBuscarUsuario frm;

    public FrmUsuario() {
        initComponents();
        btnDes.setVisible(false);
        controller = new UsuarioControlador(this);
        ajustarTodo();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        txtRol = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnDes = new javax.swing.JButton();
        Infotxt = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Nombre de Usuario:");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Contraseña:");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Rol:");

        txtContraseña.setEditable(false);
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        txtUsuario.setEditable(false);

        txtRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "TRABAJADOR" }));
        txtRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRolActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Usuarios");

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        btnNuevo.setBorder(null);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/deshacer.png"))); // NOI18N
        btnDes.setBorder(null);
        btnDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesActionPerformed(evt);
            }
        });

        Infotxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        Infotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InfotxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Infotxt)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnDes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnDes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Infotxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRolActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnDes.setVisible(true);
        ajustarImagenes("/Imagenes/deshacer.png", btnDes);
        limpiar();
        Editar(true);
        estadosBotones();

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        btnDes.setVisible(false);

        if (!validateRequired()) {
            showError("Faltan datos requeridos");
            return;
        }

        usuario = new Usuario(
                txtUsuario.getText(),
                txtContraseña.getText(),
                ConversionRol()
        );
        if (!validarContraseña(usuario)) {
            return;
        }
        controller.create(usuario);

        this.Editar(false);
        estadosBotones();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (usuario == null) {
            showError("No hay ningun cliente cargado actualmente");
            return;
        }
        int option = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro que desea eliminar el cliente actual?",
                "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION
        );
        if (option == JOptionPane.NO_OPTION) {
            return;
        }
        controller.delete(usuario);
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        if (usuario == null) {
            showError("No hay ningún usuario cargado actualmente");
            return;
        }
        if (!validateRequired()) {
            showError("Faltan datos requeridos");
            return;
        }
        String newNombre = txtUsuario.getText().trim();
        String newContraseña = txtContraseña.getText().trim();
        Rol newRol = ConversionRol();

        if (!newNombre.equals(usuario.getNombre())) {
            showError("No es posible cambiar el nombre de usuario.");
            return;
        }

        boolean contraseñaCambiada = !newContraseña.equals(usuario.getContraseña());
        boolean rolCambiado = newRol != null && !newRol.equals(usuario.getRol());

        if (contraseñaCambiada || rolCambiado) {
            if (contraseñaCambiada) {
                usuario.setContraseña(newContraseña);
            }
            if (rolCambiado) {
                usuario.setRol(newRol);
            }
            controller.update(usuario);

            if (contraseñaCambiada && rolCambiado) {
                showMessage("Contraseña y rol actualizados correctamente.");
            } else if (contraseñaCambiada) {
                showMessage("Contraseña actualizada correctamente.");
            } else if (rolCambiado) {
                showMessage("Rol actualizado correctamente.");
            }
        } else {
            showMessage("No se realizaron cambios.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Editar(true);
        controller.readAll();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesActionPerformed
        show(usuario);
        this.Editar(false);
        estadosBotones();
        btnDes.setVisible(false);
    }//GEN-LAST:event_btnDesActionPerformed

    private void InfotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfotxtMouseClicked
        String msg = """
                La contraseña debe cumplir con los siguientes requisitos:
                1. Al menos una letra mayúscula.
                2. Al menos un número.
                3. Al menos 8 caracteres de longitud.
                4. Al menos un caracteres especiales.
                """;
        JOptionPane.showMessageDialog(null, msg, "Información", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_InfotxtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Infotxt;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDes;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JComboBox<String> txtRol;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtUsuario.setText("");
        txtContraseña.setText("");
    }

    private void Editar(boolean valor) {
        txtUsuario.setEditable(valor);
        txtRol.setEditable(valor);
        txtContraseña.setEditable(valor);
    }

    public void ajustarImagenes(String ubicacion, javax.swing.JButton cosa) {
        ImageIcon image = new ImageIcon(getClass().getResource(ubicacion));
        if (cosa.getWidth() > 0 && cosa.getHeight() > 0) {
            Icon icon = new ImageIcon(image.getImage().getScaledInstance(cosa.getWidth(), cosa.getHeight(), Image.SCALE_SMOOTH));
            cosa.setIcon(icon);
        } else {
            SwingUtilities.invokeLater(() -> {
                Icon icon = new ImageIcon(image.getImage().getScaledInstance(cosa.getWidth(), cosa.getHeight(), Image.SCALE_SMOOTH));
                cosa.setIcon(icon);
            });
        }
    }

    public void estadosBotones() {
        UtilGui.changeStateButtons(btnGuardar, btnActualizar, btnBuscar, btnCancelar, btnNuevo, btnEliminar);
    }

    public void ajustarTodo() {
        ajustarImagenes("/Imagenes/nuevo.png", btnNuevo);
        ajustarImagenes("/Imagenes/guardar.png", btnGuardar);
        ajustarImagenes("/Imagenes/actualizar.png", btnActualizar);
        ajustarImagenes("/Imagenes/eliminar.png", btnEliminar);
        ajustarImagenes("/Imagenes/buscar.png", btnBuscar);
        ajustarImagenes("/Imagenes/cancelar.png", btnCancelar);

    }

    public boolean validarContraseña(Usuario entidad) {
        String contraseña = entidad.getContraseña();

        if (contraseña == null || contraseña.trim().isEmpty()) {
            this.showError("La contraseña no puede estar vacía.");
            return false;
        }
        if (contraseña.length() < 8) {
            this.showError("La contraseña debe tener al menos 8 caracteres.");
            return false;
        }
        if (!contraseña.matches(".*[A-Z].*")) {
            this.showError("La contraseña debe contener al menos una letra mayúscula.");
            return false;
        }
        if (!contraseña.matches(".*\\d.*")) {
            this.showError("La contraseña debe contener al menos un número.");
            return false;
        }
        if (!contraseña.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            this.showError("La contraseña debe contener al menos un carácter especial.");
            return false;
        }
        return true;
    }

    public void ajustarLabel(String ubicacion, javax.swing.JLabel cosa) {
        ImageIcon image = new ImageIcon(getClass().getResource(ubicacion));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(cosa.getWidth(), cosa.getHeight(), Image.SCALE_DEFAULT));
        cosa.setIcon(icon);
    }

    @Override
    public void show(Usuario ent) {
        usuario = ent;
        if (ent == null) {
            limpiar();
            return;
        }
        txtUsuario.setText(ent.getNombre());
        txtContraseña.setText(ent.getContraseña());

        if (ent.getRol() != null) {
            txtRol.setSelectedItem(ent.getRol().toString()); 
        } else {
 
            txtRol.setSelectedIndex(0); 
        }
    }

    @Override
    public void showAll(List<Usuario> ents) {
        if (frm == null) {
            frm = new FrmBuscarUsuario(null, true);
            frm.setObserver(this);
        }
        frm.setEnts(ents);
        frm.setVisible(true);
    }

    @Override
    public void showMessage(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void showError(String err) {
        JOptionPane.showMessageDialog(this, err, "Error", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public boolean validateRequired() {
        return UtilGui.validateFields(txtUsuario, txtContraseña, txtRol);
    }

    public Rol ConversionRol() {
        Rol rolSeleccionado = null;
        String rolSeleccionadoString = (String) txtRol.getSelectedItem();

        switch (rolSeleccionadoString) {
            case "ADMINISTRADOR":
                return rolSeleccionado = Rol.ADMINISTRADOR;
            case "TRABAJADOR":
                return rolSeleccionado = Rol.TRABAJADOR;
            default:
                this.showError("Rol inválido");
                return Rol.TRABAJADOR;
        }

    }

}
