/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;


import Controlador.ProduccionControlador;
import Enums.Rol;
import Modelo.Cultivo.Cultivo;
import Modelo.Cultivo.CultivoDTO;
import Modelo.Produccion.Produccion;
import Utils.UtilDate;
import Utils.UtilGui;
import java.awt.Image;
import java.sql.SQLException;
import java.time.LocalDate;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import Modelo.Produccion.ReporteProduccion;
import java.io.File;

/**
 *
 * @author Tony
 */
public class FrmProduccionn extends javax.swing.JInternalFrame implements Vista<Produccion> {

    ReporteProduccion reporte;
    ProduccionControlador controller;
    Produccion produccion;
    FrmBuscarProduccion frm;

    public FrmProduccionn() {
        initComponents();
        controller = new ProduccionControlador(this);

        btnDes4.setVisible(false);
        ajustarTodo();
        Editar(false);
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
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCalidad = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnDes4 = new javax.swing.JButton();
        btnNuevo4 = new javax.swing.JButton();
        btnGuardar4 = new javax.swing.JButton();
        btnActualizar4 = new javax.swing.JButton();
        btnBuscar4 = new javax.swing.JButton();
        btnEliminar4 = new javax.swing.JButton();
        btnCancelar4 = new javax.swing.JButton();
        btnLlamarFrmBuscarCultivo = new javax.swing.JButton();
        txtDestino = new javax.swing.JComboBox<>();
        txtCultivo = new javax.swing.JTextField();
        txtCantidadRecolectada = new javax.swing.JTextField();
        txtCantidadEsperada = new javax.swing.JTextField();
        txtProductividad = new javax.swing.JFormattedTextField();
        btnImprimir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel23.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 51));
        jLabel23.setText(" Productividad");

        jLabel19.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 51));
        jLabel19.setText("Cantidad Recolectada(Kg)");

        jLabel21.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 51));
        jLabel21.setText("Calidad");

        jLabel18.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 51));
        jLabel18.setText("Fecha");

        txtFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaFocusLost(evt);
            }
        });
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 51));
        jLabel17.setText("ID Cultivo");

        jLabel22.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 51));
        jLabel22.setText("Destino");

        jLabel24.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 51));
        jLabel24.setText("Cantidad Esperada(Kg)");

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 51));
        jLabel20.setText("Producción");

        btnDes4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/deshacer.png"))); // NOI18N
        btnDes4.setBorder(null);
        btnDes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDes4ActionPerformed(evt);
            }
        });

        btnNuevo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        btnNuevo4.setBorder(null);
        btnNuevo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo4ActionPerformed(evt);
            }
        });

        btnGuardar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnGuardar4.setBorder(null);
        btnGuardar4.setEnabled(false);
        btnGuardar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar4ActionPerformed(evt);
            }
        });

        btnActualizar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnActualizar4.setBorder(null);
        btnActualizar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar4ActionPerformed(evt);
            }
        });

        btnBuscar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnBuscar4.setBorder(null);
        btnBuscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar4ActionPerformed(evt);
            }
        });

        btnEliminar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar4.setBorder(null);
        btnEliminar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar4ActionPerformed(evt);
            }
        });

        btnCancelar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar4.setBorder(null);
        btnCancelar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar4ActionPerformed(evt);
            }
        });

        btnLlamarFrmBuscarCultivo.setBackground(new java.awt.Color(30, 30, 30));
        btnLlamarFrmBuscarCultivo.setForeground(new java.awt.Color(255, 255, 255));
        btnLlamarFrmBuscarCultivo.setText("+");
        btnLlamarFrmBuscarCultivo.setBorder(null);
        btnLlamarFrmBuscarCultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlamarFrmBuscarCultivoActionPerformed(evt);
            }
        });

        txtDestino.setBackground(new java.awt.Color(30, 30, 30));
        txtDestino.setEditable(true);
        txtDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Venta", "Almacenamiento" }));
        txtDestino.setBorder(null);

        txtCultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCultivoActionPerformed(evt);
            }
        });

        txtCantidadRecolectada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCantidadRecolectadaFocusLost(evt);
            }
        });
        txtCantidadRecolectada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadRecolectadaActionPerformed(evt);
            }
        });

        txtCantidadEsperada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCantidadEsperadaFocusLost(evt);
            }
        });
        txtCantidadEsperada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadEsperadaActionPerformed(evt);
            }
        });

        txtProductividad.setEditable(false);
        txtProductividad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0%"))));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imprimir.png"))); // NOI18N
        btnImprimir.setBorder(null);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btnNuevo4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btnActualizar4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDes4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(txtCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCantidadRecolectada, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 2, Short.MAX_VALUE)
                                        .addComponent(jLabel17)
                                        .addGap(106, 106, 106)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLlamarFrmBuscarCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel24)
                            .addComponent(txtCantidadEsperada))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel23))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(txtCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(27, 27, 27)
                                            .addComponent(jLabel21))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtProductividad, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDes4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLlamarFrmBuscarCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel18)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadRecolectada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadEsperada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductividad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnActualizar4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDes4ActionPerformed
        show(produccion);
        this.Editar(false);
        estadosBotones();
        limpiar();
        btnDes4.setVisible(false);
    }//GEN-LAST:event_btnDes4ActionPerformed

    private void btnNuevo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo4ActionPerformed
        btnDes4.setVisible(true);
        Editar(true);
        ajustarImagenes("/Imagenes/deshacer.png", btnDes4);
        limpiar();
        estadosBotones();
    }//GEN-LAST:event_btnNuevo4ActionPerformed

    private void btnGuardar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar4ActionPerformed
        btnDes4.setVisible(false);

        if (!validateRequired()) {
            showError("Faltan datos requeridos");
            return;
        }

        Integer cultivoId = Integer.valueOf(txtCultivo.getText());
        Cultivo cultivo = controller.obtenerCultivoPorId(cultivoId);

        if (cultivo == null) {
            showError("El cultivo ingresado no existe");
            return;
        }

        produccion = new Produccion(
                cultivo,
                Double.parseDouble(txtCantidadRecolectada.getText()),
                txtCalidad.getText(),
                txtDestino.getSelectedItem().toString()
        );

        controller.create(produccion);
        estadosBotones();
    }//GEN-LAST:event_btnGuardar4ActionPerformed

    private void btnActualizar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar4ActionPerformed
        if (produccion == null) {
            showError("No hay ningúna produccion cargada actualmente");
            return;
        }
        if (!validateRequired()) {
            showError("Faltan datos requeridos");
            return;
        }

        String newCantidadRecolectada = txtCantidadRecolectada.getText();
        String newCalidad = txtCalidad.getText();
        String newDestino = txtDestino.getSelectedItem().toString();

        boolean cantidadCambiada = !newCantidadRecolectada.equals(produccion.getCantidadRecolectada());
        boolean calidadCambiada = !newCalidad.equals(produccion.getCalidad());
        boolean destinoCambiado = !newDestino.equals(produccion.getDestino());

        if (cantidadCambiada || calidadCambiada || destinoCambiado) {
            if (cantidadCambiada) {
                try {

                    int cantidad = Integer.parseInt(newCantidadRecolectada);
                    if (cantidad < 0) {
                        showError("La cantidad recolectada no puede ser negativa.");
                        return;
                    }
                    produccion.setCantidadRecolectada(cantidad);
                } catch (NumberFormatException e) {
                    showError("La cantidad recolectada debe ser un número válido.");
                    return;
                }
            }

            if (calidadCambiada) {

                if (newCalidad.trim().isEmpty()) {
                    showError("La calidad del producto no puede estar vacía.");
                    return;
                }
                produccion.setCalidad(newCalidad);
            }

            if (destinoCambiado) {

                if (!newDestino.equalsIgnoreCase("Venta") && !newDestino.equalsIgnoreCase("Almacenamiento")) {
                    showError("El destino debe ser 'Venta' o 'Almacenamiento'.");
                    return;
                }
                produccion.setDestino(newDestino);
            }

            controller.update(produccion);

            if (cantidadCambiada && calidadCambiada && destinoCambiado) {
                showMessage("Cantidad, calidad y destino actualizados correctamente.");
            } else if (cantidadCambiada && calidadCambiada) {
                showMessage("Cantidad y calidad actualizadas correctamente.");
            } else if (cantidadCambiada && destinoCambiado) {
                showMessage("Cantidad y destino actualizados correctamente.");
            } else if (calidadCambiada && destinoCambiado) {
                showMessage("Calidad y destino actualizados correctamente.");
            } else if (cantidadCambiada) {
                showMessage("Cantidad actualizada correctamente.");
            } else if (calidadCambiada) {
                showMessage("Calidad actualizada correctamente.");
            } else if (destinoCambiado) {
                showMessage("Destino actualizado correctamente.");
            }
        } else {
            showMessage("No se realizaron cambios.");
        }


    }//GEN-LAST:event_btnActualizar4ActionPerformed

    private void btnBuscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar4ActionPerformed
        Editar(true);
        controller.readAll();

    }//GEN-LAST:event_btnBuscar4ActionPerformed

    private void btnEliminar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar4ActionPerformed
        if (produccion == null) {
            showError("No hay ninguna Produccion  cargada actualmente");
            return;
        }
        int option = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro que desea eliminar la produccion actual?",
                "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION
        );
        if (option == JOptionPane.NO_OPTION) {
            return;
        }
        controller.delete(produccion);
        limpiar();
    }//GEN-LAST:event_btnEliminar4ActionPerformed

    private void btnCancelar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelar4ActionPerformed

    private void txtFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaFocusLost
        String date = txtFecha.getText();
        if (date.trim().isEmpty()) {
            return;
        }

        if (!UtilDate.validate(date)) {
            showError("La fecha ingresada no tiene el formato correcto (dd/MM/yyyy).");
            txtFecha.setText("");
            return;
        }

        LocalDate fechaIngresada = UtilDate.toLocalDate(date);

        LocalDate fechaActual = LocalDate.now();

        if (fechaIngresada.isAfter(fechaActual)) {
            showError("No se permite ingresar fechas futuras.");
            txtFecha.setText("");
            return;
        }

        if (fechaIngresada.isBefore(LocalDate.of(1900, 1, 1))) {
            showError("La fecha ingresada es demasiado antigua. Ingresa una fecha posterior al 01/01/1900.");
            txtFecha.setText("");
            return;
        }

    }//GEN-LAST:event_txtFechaFocusLost

    private void btnLlamarFrmBuscarCultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlamarFrmBuscarCultivoActionPerformed

        try {
            List<CultivoDTO> listCultivoDTO = controller.readCultivos();
            FrmMiniBuscarCultivo mini = new FrmMiniBuscarCultivo(null, false);
            mini.setObserver(this);
            mini.setDtos(listCultivoDTO);
            mini.setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(FrmProduccionn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLlamarFrmBuscarCultivoActionPerformed

    private void txtCantidadRecolectadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadRecolectadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadRecolectadaActionPerformed

    private void txtCantidadEsperadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadEsperadaActionPerformed

    }//GEN-LAST:event_txtCantidadEsperadaActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtCultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCultivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCultivoActionPerformed

    private void txtCantidadEsperadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadEsperadaFocusLost
        if (txtCantidadEsperada.getText().trim().isEmpty() || txtCantidadRecolectada.getText().trim().isEmpty()) {
            return;
        }

        double cantidadRecolectada = Double.parseDouble(txtCantidadRecolectada.getText());
        double cantidadEsperada2 = Double.parseDouble(txtCantidadEsperada.getText());
        double productividad = Produccion.calcularProductividad(cantidadRecolectada, cantidadEsperada2);
        txtProductividad.setText(String.valueOf(productividad + "%"));

        String cantidadEsperada = txtCantidadEsperada.getText();

        try {
            double cantidadNumerica = Double.parseDouble(cantidadEsperada);
            if (cantidadNumerica <= 0) {
                showError("No se permiten cantidades negativas o iguales a 0.");
                txtCantidadEsperada.setText("");
                return;
            }

        } catch (NumberFormatException e) {

            txtCantidadEsperada.setText("");
        }
    }//GEN-LAST:event_txtCantidadEsperadaFocusLost

    private void txtCantidadRecolectadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadRecolectadaFocusLost
        String cantidad = txtCantidadRecolectada.getText();
        try {
            double cantidadNumerica = Double.parseDouble(cantidad);
            if (cantidadNumerica <= 0) {
                showError("No se permiten cantidades negativas o iguales a 0.");
                txtCantidadRecolectada.setText("");
                return;
            }
        } catch (NumberFormatException e) {

            txtCantidadRecolectada.setText("");
        }
    }//GEN-LAST:event_txtCantidadRecolectadaFocusLost

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
Produccion produccion = obtenerDatosProduccion();
        if (produccion == null) {
            JOptionPane.showMessageDialog(this, "Error: No se pudieron obtener los datos de producción.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ReporteProduccion reporte = new ReporteProduccion();
        String rutaArchivo;

        try {
                rutaArchivo = "reporteProduccion.pdf";
                reporte.generarReportePDF(rutaArchivo, produccion);
                JOptionPane.showMessageDialog(this, "Reporte PDF generado en: " + new File(rutaArchivo).getAbsolutePath());
                         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al generar el reporte: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar4;
    private javax.swing.JButton btnBuscar4;
    private javax.swing.JButton btnCancelar4;
    private javax.swing.JButton btnDes4;
    private javax.swing.JButton btnEliminar4;
    private javax.swing.JButton btnGuardar4;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLlamarFrmBuscarCultivo;
    private javax.swing.JButton btnNuevo4;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCalidad;
    private javax.swing.JTextField txtCantidadEsperada;
    private javax.swing.JTextField txtCantidadRecolectada;
    private javax.swing.JTextField txtCultivo;
    private javax.swing.JComboBox<String> txtDestino;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JFormattedTextField txtProductividad;
    // End of variables declaration//GEN-END:variables

    @Override
    public void show(Produccion ent) {
  
        produccion = ent;
        if (ent == null) {
            limpiar();
            return;
        }
        txtCultivo.setText(String.valueOf(ent.getCultivo().getId()));
        txtFecha.setText(String.valueOf(ent.getFecha()));
        txtCalidad.setText(ent.getCalidad());
        txtDestino.setSelectedItem(ent.getDestino());
        txtCantidadRecolectada.setText(String.valueOf(ent.getCantidadRecolectada()));

        
    }

    @Override
    public void showAll(List<Produccion> ents) {
        if (frm == null) {
            frm = new FrmBuscarProduccion(null, true);
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
        return UtilGui.validateFields(txtFecha, txtCalidad, txtCantidadEsperada, txtCantidadRecolectada, txtDestino, txtFecha);
    }

    private void limpiar() {
        txtCultivo.setText("");
        txtFecha.setText("");
        txtFecha.setText("");
        txtCalidad.setText("");
        txtDestino.setSelectedIndex(-1);
        txtCantidadEsperada.setText("");
        txtCantidadRecolectada.setText("");
        txtProductividad.setText("");
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
        UtilGui.changeStateButtons(btnGuardar4, btnActualizar4, btnBuscar4, btnCancelar4, btnNuevo4, btnEliminar4);
    }

    public void ajustarTodo() {
        ajustarImagenes("/Imagenes/nuevo.png", btnNuevo4);
        ajustarImagenes("/Imagenes/guardar.png", btnGuardar4);
        ajustarImagenes("/Imagenes/actualizar.png", btnActualizar4);
        ajustarImagenes("/Imagenes/eliminar.png", btnEliminar4);
        ajustarImagenes("/Imagenes/buscar.png", btnBuscar4);
        ajustarImagenes("/Imagenes/cancelar.png", btnCancelar4);

    }

    private void Editar(boolean valor) {
        txtCultivo.setEditable(valor);
        txtCalidad.setEditable(valor);
        txtCantidadEsperada.setEditable(valor);
        txtCantidadRecolectada.setEditable(valor);
        txtFecha.setEditable(valor);
        txtDestino.setEditable(valor);
        txtFecha.setEditable(valor);
    }

    public void updateIdCultivo(int id) {
        txtCultivo.setText(String.valueOf(id));
    }

    private Produccion obtenerDatosProduccion() {
        try {
            Integer cultivoId = Integer.valueOf(txtCultivo.getText());
            Cultivo cultivo = controller.obtenerCultivoPorId(cultivoId);
            Produccion produccion = new Produccion(cultivo,
                    Double.parseDouble(txtCantidadRecolectada.getText()),
                    txtCalidad.getText(),
                    txtDestino.getSelectedItem().toString()
            );

            return produccion;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Verifique los datos numéricos ingresados.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
     public void setVistaP(Rol rol) {
        switch (rol) {
            case (Rol.ADMINISTRADOR) -> {
                ajustarImagenes("/Imagenes/eliminar.png", btnEliminar4);
                btnEliminar4.setVisible(true);

            }
            case (Rol.TRABAJADOR) -> {
                btnEliminar4.setVisible(false);
            }
        }
    }
}
