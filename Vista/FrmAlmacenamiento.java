/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.AlmacenamientoControlador;
import Enums.Rol;
import Modelo.Almacenamiento.Almacenamiento;
import Modelo.Produccion.Produccion;
import Modelo.Produccion.ProduccionDTO;
import Utils.UtilGui;
import java.awt.Image;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author DYLAN
 */
public class FrmAlmacenamiento extends javax.swing.JInternalFrame implements Vista<Almacenamiento> {

    /**
     * Creates new form FrmAlmacenamiento
     */
    private static FrmAlmacenamiento instance;

    AlmacenamientoControlador controller;
    Almacenamiento almacenamiento;
    FrmBuscarAlmacenamiento frm;
    FrmPrincipal frmPrin;

    private FrmAlmacenamiento(FrmPrincipal Prin) {
        initComponents();
        btnDes.setVisible(false);
        this.frmPrin = Prin;
        controller = new AlmacenamientoControlador(this);
        ajustarTodo();
    }

    public static FrmAlmacenamiento getInstancia(FrmPrincipal Prin) {
        if (instance == null) {
            instance = new FrmAlmacenamiento(Prin);
        }
        return instance;
    }

    public void eliminarInstanciaAlmacenamiento() {
        instance = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtIdAlmacenamiento = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtFechaIngreso = new javax.swing.JTextField();
        txtFechaEgreso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnDes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtIdProduccion = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnMas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Almacenamiento");

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.setBorder(null);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Codigo de almacenamiento:");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtIdAlmacenamiento.setEditable(false);
        txtIdAlmacenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAlmacenamientoActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setToolTipText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Fecha de Egreso:");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtFechaIngreso.setEditable(false);
        txtFechaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaIngresoActionPerformed(evt);
            }
        });

        txtFechaEgreso.setEditable(false);
        txtFechaEgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaEgresoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Fecha de Ingreso:");

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Codigo de produccion:");

        btnDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/deshacer.png"))); // NOI18N
        btnDes.setToolTipText("Regresar");
        btnDes.setBorder(null);
        btnDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Cantidad:");

        txtIdProduccion.setEditable(false);
        txtIdProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProduccionActionPerformed(evt);
            }
        });

        txtCantidad.setEditable(false);
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnMas.setFont(new java.awt.Font("sansserif", 0, 8)); // NOI18N
        btnMas.setText("+");
        btnMas.setEnabled(false);
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("dd/MM/yyyy");

        jLabel6.setBackground(new java.awt.Color(0, 0, 51));
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("dd/MM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFechaEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addComponent(btnDes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMas)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(btnDes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFechaEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnDes.setVisible(true);
        ajustarImagenes("/Imagenes/deshacer.png", btnDes);
        limpiar();
        Editar(true);
        estadosBotones();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        btnDes.setVisible(false);
        ajustarImagenes("/Imagenes/deshacer.png", btnDes);
        if (!validateRequired()) {
            showError("Faltan datos requeridos");
            btnDes.setVisible(true);
            return;
        }

        try {

            int idAlmacenamiento = Integer.parseInt(txtIdAlmacenamiento.getText());
            Integer produccionId = Integer.parseInt(txtIdProduccion.getText());
            Produccion produccion = controller.obtenerProduccionPorId(produccionId);
            int cantidad = Integer.parseInt(txtCantidad.getText());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaIngreso = LocalDate.parse(txtFechaIngreso.getText(), formatter);

            if (fechaIngreso.isBefore(LocalDate.now())) {
                showError("La fecha de ingreso no puede ser menor que hoy.");
                btnDes.setVisible(true);
                return;
            }

            almacenamiento = new Almacenamiento(
                    idAlmacenamiento,
                    produccion,
                    cantidad,
                    fechaIngreso
            );
            controller.create(almacenamiento);

            this.Editar(false);
            estadosBotones();
        } catch (NumberFormatException e) {
            showError("Los campos ID y Cantidad deben contener valores numéricos válidos.");
            btnDes.setVisible(true);
        } catch (DateTimeParseException e) {
            showError("La fecha de ingreso debe estar en el formato 'dd/MM/yyyy'.");
            btnDes.setVisible(true);
        } catch (Exception e) {
            showError("Ocurrió un error al guardar los datos: " + e.getMessage());
            btnDes.setVisible(true);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (almacenamiento == null) {
            showError("No hay ningun almacenamiento cargado actualmente");
            return;
        }
        int option = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro que desea eliminar el almacenamiento actual?",
                "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION
        );
        if (option == JOptionPane.NO_OPTION) {
            return;
        }
        controller.delete(almacenamiento);
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtIdAlmacenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAlmacenamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAlmacenamientoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (almacenamiento == null) {
            showError("No hay ningún almacenamiento cargado actualmente");
            return;
        }
        if (!validateRequired()) {
            showError("Faltan datos requeridos");
            return;
        }
        try {
            int newCantidad = Integer.parseInt(txtCantidad.getText().trim());

            LocalDate newFechaEgreso = null;
            boolean fechaEgresoCambiada = false;

            if (!txtFechaEgreso.getText().trim().isEmpty()) {
                String fechaEgresoText = txtFechaEgreso.getText().trim();
                DateTimeFormatter formatter = null;

                if (fechaEgresoText.matches("\\d{4}-\\d{2}-\\d{2}")) {
                    formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                } else if (fechaEgresoText.matches("\\d{2}/\\d{2}/\\d{4}")) {
                    formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                }

                if (formatter != null) {
                    newFechaEgreso = LocalDate.parse(fechaEgresoText, formatter);
                    fechaEgresoCambiada = !newFechaEgreso.equals(almacenamiento.getFechaEgreso());
                    if (newFechaEgreso.isBefore(almacenamiento.getFechaIngreso())) {
                        showError("La fecha de egreso no puede ser menor que la fecha de ingreso.");
                        return;
                    }
                } else {
                    showError("La fecha de egreso debe estar en un formato válido ('dd/MM/yyyy' o 'yyyy-MM-dd').");
                    return;
                }
            }

            boolean cantidadCambiado = newCantidad != almacenamiento.getCantidad();

            if (cantidadCambiado || fechaEgresoCambiada) {
                if (cantidadCambiado) {
                    almacenamiento.setCantidad(newCantidad);
                }
                if (fechaEgresoCambiada) {
                    almacenamiento.setFechaEgreso(newFechaEgreso);
                }

                controller.update(almacenamiento);

            } else {
                showMessage("No se realizaron cambios.");
            }
        } catch (DateTimeParseException e) {
            showError("La fecha de egreso debe estar en el formato 'dd/MM/yyyy' o 'yyyy-MM-dd'.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Editar(true);
        txtFechaEgreso.setEditable(false);
        controller.readAll();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtFechaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaIngresoActionPerformed

    private void txtFechaEgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaEgresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaEgresoActionPerformed

    private void btnDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesActionPerformed
        show(almacenamiento);
        this.Editar(false);
        estadosBotones();
        btnDes.setVisible(false);
    }//GEN-LAST:event_btnDesActionPerformed

    private void txtIdProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProduccionActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed

        try {
            List<ProduccionDTO> listPro;
            listPro = controller.readProducciones();
            FrmMiniProduccion frm = new FrmMiniProduccion(null, false,frmPrin);
            frm.setObserver(this);
            frm.setDtos(listPro);
            frm.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmAlmacenamiento.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnMasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDes;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFechaEgreso;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtIdAlmacenamiento;
    private javax.swing.JTextField txtIdProduccion;
    // End of variables declaration//GEN-END:variables

    @Override
    public void show(Almacenamiento ent) {
        almacenamiento = ent;
        if (ent == null) {
            limpiar();
            return;
        }

        txtIdAlmacenamiento.setText(String.valueOf(ent.getId()));
        txtIdProduccion.setText(String.valueOf(ent.getId()));
        txtCantidad.setText(String.valueOf(ent.getCantidad()));

        if (ent.getFechaIngreso() != null) {
            txtFechaIngreso.setText(ent.getFechaIngreso().toString());
        } else {
            txtFechaIngreso.setText("");
        }

        if (ent.getFechaEgreso() != null) {
            txtFechaEgreso.setText(ent.getFechaEgreso().toString());
        } else {
            txtFechaEgreso.setText("");
        }
    }

    @Override
    public void showAll(List<Almacenamiento> ents) {
        if (frm == null) {
            frm = new FrmBuscarAlmacenamiento(null, true, this);
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
        return UtilGui.validateFields(txtIdAlmacenamiento, txtIdProduccion, txtCantidad, txtFechaIngreso);
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

    public void ajustarTodo() {
        ajustarImagenes("/Imagenes/nuevo.png", btnNuevo);
        ajustarImagenes("/Imagenes/guardar.png", btnGuardar);
        ajustarImagenes("/Imagenes/actualizar.png", btnActualizar);
        ajustarImagenes("/Imagenes/eliminar.png", btnEliminar);
        ajustarImagenes("/Imagenes/buscar.png", btnBuscar);
        ajustarImagenes("/Imagenes/cancelar.png", btnCancelar);

    }

    private void limpiar() {
        txtIdAlmacenamiento.setText("");
        txtIdProduccion.setText("");
        txtCantidad.setText("");
        txtFechaIngreso.setText("");
        txtFechaEgreso.setText("");
    }

    public void Editar(boolean valor) {
        txtCantidad.setEditable(valor);
        txtIdAlmacenamiento.setEditable(valor);
        txtIdProduccion.setEditable(valor);
        txtFechaIngreso.setEditable(valor);
        btnMas.setEnabled(valor);

    }

    public void EditarMini(boolean valor) {
        txtIdAlmacenamiento.setEditable(valor);
        txtIdProduccion.setEditable(valor);
        txtFechaIngreso.setEditable(valor);
        btnMas.setEnabled(valor);
    }

    public void estadosBotones() {
        UtilGui.changeStateButtons(btnGuardar, btnActualizar, btnBuscar, btnCancelar, btnNuevo, btnEliminar);
    }

    public void updateIdProduccion(int id) {
        txtIdProduccion.setText(String.valueOf(id));
    }

    public void fechaEgresoEditable() {
        txtFechaEgreso.setEditable(true);
    }

    public void administrarPermisos() {
        if (frmPrin.getRolUsuario() == Rol.TRABAJADOR) {
            btnEliminar.setVisible(false);

        }
    }

    public void setVista(Rol rol) {
        switch (rol) {
            case (Rol.ADMINISTRADOR) -> {
                ajustarImagenes("/Imagenes/eliminar.png", btnEliminar);
                btnEliminar.setVisible(true);

            }
            case (Rol.TRABAJADOR) -> {
                btnEliminar.setVisible(false);
            }
        }
    }

}
