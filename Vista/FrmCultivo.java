/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.CultivoControlador;
import Enums.EstadoCrecimiento;
import Enums.TipoCultivo;
import Modelo.Cultivo.Cultivo;
import Utils.UtilGui;
import java.awt.Image;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author DYLAN
 */
public class FrmCultivo extends javax.swing.JInternalFrame implements Vista<Cultivo> {

    /**
     * Creates new form FrmCultivo
     */
    CultivoControlador controller;
    Cultivo cultivo;
    FrmBuscarCultivo frm;

    public FrmCultivo() {
        initComponents();
        btnDes.setVisible(false);
        ajustarTodo();
        controller = new CultivoControlador(this);
        cargarNombresCultivos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtFechaCosecha = new javax.swing.JTextField();
        btnDes = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cbxNombre = new javax.swing.JComboBox<>();
        txtArea = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JComboBox<>();
        txtFechaSiembra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Nombre del Cultivo:");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Tipo de cultivo:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Cultivo");

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

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Fecha de cosecha:");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtFechaCosecha.setEditable(false);
        txtFechaCosecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaCosechaActionPerformed(evt);
            }
        });

        btnDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/deshacer.png"))); // NOI18N
        btnDes.setBorder(null);
        btnDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Area sembrada:");

        cbxNombre.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cbxNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNombreActionPerformed(evt);
            }
        });

        txtArea.setEditable(false);
        txtArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Codigo:");

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEREALES", "LEGUMINOSAS", "OLEAGINOSAS", "HORTALIZAS", "FRUTALES", "ORNAMENTALES", "RAICES", "TUBERCULOS", " PASTOS" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Estado de crecimiento:");

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GERMINANDO", "EN_DESARROLLO", "EN_FLORACION", "MADURANDO", "LISTO_PARA_COSECHA", "COSECHADO" }));
        cbxEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbxEstadoFocusLost(evt);
            }
        });
        cbxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoActionPerformed(evt);
            }
        });

        txtFechaSiembra.setEditable(false);
        txtFechaSiembra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaSiembraActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Fecha de Siembra:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("dd/MM/yyyy");

        jLabel10.setBackground(new java.awt.Color(0, 0, 51));
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("dd/MM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel4)
                .addGap(0, 139, Short.MAX_VALUE)
                .addComponent(btnDes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
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
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTipo, 0, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbxEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFechaSiembra))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel10))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFechaCosecha)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnDes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFechaSiembra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaCosecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(34, 34, 34)
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

        if (!validateRequired()) {
            showError("Faltan datos requeridos");
            return;
        }

        try {
            int id = Integer.parseInt(txtId.getText().trim());
            String nombre = cbxNombre.getSelectedItem() != null ? cbxNombre.getSelectedItem().toString().trim() : "";

            String tipoSeleccionadoString = (String) cbxTipo.getSelectedItem();
            TipoCultivo tipoCultivo = convertirTipoCultivo(tipoSeleccionadoString);
            if (tipoCultivo == null) {
                return;
            }

            String estadoSeleccionadoString = (String) cbxEstado.getSelectedItem();
            EstadoCrecimiento estado = convertirEstadoCrecimiento(estadoSeleccionadoString);
            if (estado == null) {
                return;
            }

            int area = Integer.parseInt(txtArea.getText().trim());

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaSiembra = LocalDate.parse(txtFechaSiembra.getText().trim(), formatter);
            LocalDate fechaCosecha = LocalDate.parse(txtFechaCosecha.getText().trim(), formatter);

            if (fechaCosecha.isBefore(fechaSiembra)) {
                showError("La fecha de cosecha no puede ser anterior a la fecha de siembra.");
                return;
            }

            cultivo = new Cultivo(
                    id,
                    nombre,
                    tipoCultivo,
                    area,
                    estado,
                    fechaSiembra,
                    fechaCosecha
            );

            controller.create(cultivo);
            this.Editar(false);
            estadosBotones();

        } catch (NumberFormatException e) {
            showError("Los campos ID y Área deben contener valores numéricos válidos.");
        } catch (DateTimeParseException e) {
            showError("Las fechas deben estar en el formato 'dd/MM/yyyy'.");
        } catch (Exception e) {
            showError("Ocurrió un error al guardar los datos: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (cultivo == null) {
            showError("No hay ningun cultivo cargado actualmente");
            return;
        }
        int option = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro que desea eliminar el cultivo actual?",
                "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION
        );
        if (option == JOptionPane.NO_OPTION) {
            return;
        }
        controller.delete(cultivo);
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (cultivo == null) {
            showError("No hay ningún cultivo cargado actualmente.");
            return;
        }

        if (!validateRequired()) {
            showError("Faltan datos requeridos.");
            return;
        }

        String newFechaCosechaText = txtFechaCosecha.getText().trim();
        LocalDate newFechaCosecha;

        String estadoSeleccionadoString = (String) cbxEstado.getSelectedItem();
        if (estadoSeleccionadoString != null && estadoSeleccionadoString.equals("COSECHADO")) {
            newFechaCosecha = LocalDate.now();
        } else {
            try {
                newFechaCosecha = LocalDate.parse(newFechaCosechaText);
            } catch (DateTimeParseException e) {
                showError("La fecha de cosecha no tiene un formato válido. Use el formato AAAA-MM-DD.");
                return;
            }
        }

        EstadoCrecimiento newEstadoCrecimiento;
        switch (estadoSeleccionadoString) {
            case "GERMINANDO":
                newEstadoCrecimiento = EstadoCrecimiento.GERMINANDO;
                break;
            case "EN_DESARROLLO":
                newEstadoCrecimiento = EstadoCrecimiento.EN_DESARROLLO;
                break;
            case "EN_FLORACION":
                newEstadoCrecimiento = EstadoCrecimiento.EN_FLORACION;
                break;
            case "MADURANDO":
                newEstadoCrecimiento = EstadoCrecimiento.MADURANDO;
                break;
            case "LISTO_PARA_COSECHA":
                newEstadoCrecimiento = EstadoCrecimiento.LISTO_PARA_COSECHA;
                break;
            case "COSECHADO":
                newEstadoCrecimiento = EstadoCrecimiento.COSECHADO;
                break;
            default:
                showError("El estado de crecimiento seleccionado no es válido.");
                return;
        }

        if (!validarTransicionEstado(cultivo.getEstado(), newEstadoCrecimiento)) {
            showError("La transición de estado no es válida.");
            return;
        }

        boolean fechaCosechaCambiada = !newFechaCosecha.equals(cultivo.getFechaCosecha());
        boolean estadoCrecimientoCambiado = !newEstadoCrecimiento.equals(cultivo.getEstado());

        if (fechaCosechaCambiada || estadoCrecimientoCambiado) {
            if (fechaCosechaCambiada) {
                cultivo.setFechaCosecha(newFechaCosecha);
            }
            if (estadoCrecimientoCambiado) {
                cultivo.setEstado(newEstadoCrecimiento);
            }

            try {
                controller.update(cultivo);

                if (fechaCosechaCambiada && estadoCrecimientoCambiado) {
                    showMessage("Fecha de cosecha y estado de crecimiento actualizados correctamente.");
                } else if (fechaCosechaCambiada) {
                    showMessage("Fecha de cosecha actualizada correctamente.");
                } else if (estadoCrecimientoCambiado) {
                    showMessage("Estado de crecimiento actualizado correctamente.");
                }
            } catch (Exception e) {
                showError("Error al actualizar el cultivo: " + e.getMessage());
            }
        } else {
            showMessage("No se realizaron cambios en la fecha de cosecha ni en el estado de crecimiento.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Editar(true);
        controller.readAll();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtFechaCosechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaCosechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaCosechaActionPerformed

    private void btnDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesActionPerformed
        show(cultivo);
        this.Editar(false);
        estadosBotones();
        btnDes.setVisible(false);
    }//GEN-LAST:event_btnDesActionPerformed

    private void cbxNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNombreActionPerformed

    private void txtAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed

    }//GEN-LAST:event_cbxTipoActionPerformed

    private void cbxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoActionPerformed

    private void txtFechaSiembraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaSiembraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaSiembraActionPerformed

    private void cbxEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbxEstadoFocusLost
        if ("COSECHADO".equals(cbxEstado.getSelectedItem())) {
            txtFechaCosecha.setText(LocalDate.now().toString());
        }
    }//GEN-LAST:event_cbxEstadoFocusLost
    private boolean validarTransicionEstado(EstadoCrecimiento estadoActual, EstadoCrecimiento nuevoEstado) {
        switch (estadoActual) {
            case GERMINANDO:
                return nuevoEstado == EstadoCrecimiento.EN_DESARROLLO;
            case EN_DESARROLLO:
                return nuevoEstado == EstadoCrecimiento.EN_FLORACION;
            case EN_FLORACION:
                return nuevoEstado == EstadoCrecimiento.MADURANDO;
            case MADURANDO:
                return nuevoEstado == EstadoCrecimiento.LISTO_PARA_COSECHA;
            case LISTO_PARA_COSECHA:
                return nuevoEstado == EstadoCrecimiento.COSECHADO;
            case COSECHADO:
                return false;
            default:
                return false;
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDes;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxNombre;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtFechaCosecha;
    private javax.swing.JTextField txtFechaSiembra;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables

    @Override
    public void show(Cultivo ent) {
        cultivo = ent;
        if (ent == null) {
            limpiar();
            return;
        }

        txtId.setText(String.valueOf(ent.getId()));
        cbxNombre.setSelectedItem(ent.getNombre());
        cbxTipo.setSelectedItem(ent.getTipo());
        txtArea.setText(String.valueOf(ent.getAreasembrada()));
        cbxEstado.setSelectedItem(ent.getEstado());

        if (ent.getFechaSiembra() != null) {
            txtFechaSiembra.setText(ent.getFechaSiembra().toString());
        } else {
            txtFechaSiembra.setText("");
        }

        if (ent.getFechaCosecha() != null) {
            txtFechaCosecha.setText(ent.getFechaCosecha().toString());
        } else {
            txtFechaCosecha.setText("");
        }
    }

    @Override
    public void showAll(List<Cultivo> ents) {
        if (frm == null) {
            frm = new FrmBuscarCultivo(null, true, this);
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
        return UtilGui.validateFields(txtId, cbxNombre, cbxTipo, txtArea, cbxEstado, txtFechaSiembra, txtFechaCosecha);
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

    private void limpiar() {
        txtId.setText("0");
        cbxNombre.setSelectedItem(0);
        cbxTipo.setSelectedItem(0);
        txtArea.setText("");
        cbxEstado.setSelectedItem(0);
        txtFechaSiembra.setText("");
        txtFechaCosecha.setText("");
    }

    public void Editar(boolean valor) {
        txtId.setEditable(valor);
        cbxNombre.setEditable(valor);
        cbxTipo.setEditable(valor);
        txtArea.setEditable(valor);
        txtArea.setEditable(valor);
        cbxEstado.setEditable(valor);
        txtFechaSiembra.setEditable(valor);
        txtFechaCosecha.setEditable(valor);
    }

    public TipoCultivo convertirTipoCultivo(String tipoSeleccionadoString) {
        switch (tipoSeleccionadoString) {
            case "CEREALES":
                return TipoCultivo.CEREALES;
            case "LEGUMINOSAS":
                return TipoCultivo.LEGUMINOSAS;
            case "OLEAGINOSAS":
                return TipoCultivo.OLEAGINOSAS;
            case "HORTALIZAS":
                return TipoCultivo.HORTALIZAS;
            case "FRUTALES":
                return TipoCultivo.FRUTALES;
            case "ORNAMENTALES":
                return TipoCultivo.ORNAMENTALES;
            case "RAICES":
                return TipoCultivo.RAICES;
            case "TUBERCULOS":
                return TipoCultivo.TUBERCULOS;
            case "PASTOS":
                return TipoCultivo.PASTOS;
            default:
                showError("Tipo de cultivo inválido");
                return null;
        }
    }

    public EstadoCrecimiento convertirEstadoCrecimiento(String estadoSeleccionadoString) {
        switch (estadoSeleccionadoString) {
            case "GERMINANDO":
                return EstadoCrecimiento.GERMINANDO;
            case "EN_DESARROLLO":
                return EstadoCrecimiento.EN_DESARROLLO;
            case "EN_FLORACION":
                return EstadoCrecimiento.EN_FLORACION;
            case "MADURANDO":
                return EstadoCrecimiento.MADURANDO;
            case "LISTO_PARA COSECHA":
                return EstadoCrecimiento.LISTO_PARA_COSECHA;
            case "COSECHADO":
                return EstadoCrecimiento.COSECHADO;
            default:
                showError("Estado de crecimiento inválido");
                return null;
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

    private void cargarNombresCultivos() {
        List<String> nombresCultivos = controller.obtenerNombresCultivosUnicos();
        cbxNombre.removeAllItems();
        for (String nombre : nombresCultivos) {
            cbxNombre.addItem(nombre);
        }
    }

}
