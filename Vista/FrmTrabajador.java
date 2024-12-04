package Vista;

import Controlador.TrabajadorControlador;
import Modelo.Trabajador.Trabajador;
import Utils.UtilGui;
import java.awt.Image;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author d2tod
 */
public class FrmTrabajador extends JInternalFrame implements Vista<Trabajador> {
    
    @Override
    public void show(Trabajador ent) {
        if (ent == null) {
//            limpiar();
            setCamposEditables(false);
            return;
        }
        trabajador = ent;
        txtCedula.setText(ent.getCedula());
        txtNombre.setText(ent.getNombre());
        txtCorreo.setText(ent.getCorreo());
        txtTelefono.setText(ent.getTelefono());
        txtSalario.setText(String.valueOf(ent.getSalario()));
        
        if (ent.getPuesto() != null) {
            txtPuesto.setSelectedItem(ent.getPuesto());
        } else {
            txtPuesto.setSelectedIndex(-1);
        }
        if (ent.getHorario() != null) {
            txtHorario.setSelectedItem(ent.getHorario());
        } else {
            txtHorario.setSelectedIndex(-1);
        }
    }
    
    @Override
    public void showAll(List<Trabajador> ents) {
        if (frm == null) {
            frm = new FrmBuscarTrabajador(null, true);
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
        return UtilGui.validateFields(txtCedula, txtNombre, txtCorreo, txtHorario, txtPuesto, txtTelefono, txtSalario);
    }
    
    private boolean validarHorario() {
        String formato = "\\d{2}:\\d{2} - \\d{2}:\\d{2}";
        return txtHorario.getSelectedItem().toString().matches(formato);
    }

    /**
     * Creates new form FrmTrabajador
     */
    private static FrmTrabajador instance;
    
    TrabajadorControlador controlador;
    Trabajador trabajador;
    FrmBuscarTrabajador frm;
    
    private FrmTrabajador() {
        initComponents();
        btnDes.setVisible(false);
        controlador = new TrabajadorControlador(this);
        cargarPuestos();
        cargarHorarios();
        ajustarTodo();
        
    }
    
    public static FrmTrabajador getInstancia() {
        if (instance == null) {
            instance = new FrmTrabajador();
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Infotxt2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtPuesto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnDes = new javax.swing.JButton();
        Infotxt = new javax.swing.JLabel();
        txtCedula = new javax.swing.JFormattedTextField();
        txtTelefono = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JFormattedTextField();
        txtHorario = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        Infotxt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        Infotxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Infotxt2MouseClicked(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Cedula:");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Puesto:");

        txtCorreo.setEditable(false);
        txtCorreo.setEnabled(false);
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });

        txtPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "Supervisor", "Operador", "Técnico", "Obrero" }));
        txtPuesto.setSelectedIndex(-1);
        txtPuesto.setEnabled(false);
        txtPuesto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPuestoFocusLost(evt);
            }
        });
        txtPuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPuestoMouseExited(evt);
            }
        });
        txtPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuestoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Trabajadores");

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
        Infotxt.setToolTipText("Informacion");
        Infotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InfotxtMouseClicked(evt);
            }
        });

        try {
            txtCedula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCedula.setEnabled(false);

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefono.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Telefono:");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Correo:");

        txtNombre.setEditable(false);
        txtNombre.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Salario:");

        txtSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtSalario.setEnabled(false);

        txtHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00 - 12:00", "08:00 - 16:00", "12:00 - 18:00", "13:00 - 21:00", "18:00 - 00:00", "22:00 - 06:00" }));
        txtHorario.setSelectedIndex(-1);
        txtHorario.setEnabled(false);
        txtHorario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHorarioFocusLost(evt);
            }
        });
        txtHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Horario:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("\"HH:mm - HH:mm\"");
        jLabel9.setToolTipText("Formato de Horario");
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(Infotxt))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel4)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Infotxt)
                    .addComponent(jLabel4)
                    .addComponent(btnDes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHorario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPuesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuestoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnDes.setVisible(true);
        ajustarImagenes("/Imagenes/deshacer.png", btnDes);
        limpiar();
        setCamposEditables(true);
        activarCampos(true);
        setBotonesEnabled();

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        btnDes.setVisible(false);
        
        if (!validateRequired()) {
            showError("Faltan datos requeridos");
            return;
        }
        if(!validarHorario()){
            showError("El horario debe tener el formato \"HH:mm - HH:mm\"");
            return;
        }
        
        trabajador = new Trabajador(
                txtCedula.getText(),
                txtNombre.getText(),
                txtTelefono.getText(),
                txtCorreo.getText(),
                txtPuesto.getSelectedItem().toString(),
                txtHorario.getSelectedItem().toString(),
                Double.parseDouble(txtSalario.getText())
        );
        controlador.create(trabajador);
        if (controlador.isCompleteOperation()) {
            guardarPuesto();
            guardarHorario();
            txtCedula.setEditable(false);
            controlador.setCompleteOperation(false);
        }
        setCamposEditables(false);
        setBotonesEnabled();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (trabajador == null) {
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
        controlador.delete(trabajador);
        setCamposEditables(false);
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        if (trabajador == null) {
            showError("No hay ningún trabajador cargado actualmente");
            return;
        }
        if (!validateRequired()) {
            showError("Faltan datos requeridos");
            return;
        }
        if (!validarHorario()){
            showError("El horario debe tener el formato \"HH:mm - HH:mm\"");
            return;
        }
        String newNombre = txtNombre.getText().trim();
        String newTelefono = txtTelefono.getText().trim();
        String newCorreo = txtCorreo.getText().trim();
        String newPuesto = txtPuesto.getSelectedItem().toString().trim();
        String newHorario = txtHorario.getSelectedItem().toString().trim();
        double newSalario = Double.parseDouble(txtSalario.getText());
        
        if (!txtCedula.getText().equals(trabajador.getCedula())) {
            showError("No está permitido cambiar la cedula del trabajador.");
            return;
        }
        
        boolean nombreCambiado = !newNombre.equals(trabajador.getNombre());
        boolean telefonoCambiado = !newTelefono.equals(trabajador.getTelefono());
        boolean correoCambiado = !newCorreo.equals(trabajador.getTelefono());
        boolean puestoCambiado = !newPuesto.equals(trabajador.getTelefono());
        boolean horarioCambiado = !newHorario.equals(trabajador.getTelefono());
        boolean salarioCambiado = newSalario != trabajador.getSalario();
        
        if (nombreCambiado || telefonoCambiado || correoCambiado || puestoCambiado || horarioCambiado || salarioCambiado) {
            if (nombreCambiado) {
                trabajador.setNombre(newNombre);
            }
            if (telefonoCambiado) {
                trabajador.setTelefono(newTelefono);
            }
            if (correoCambiado) {
                trabajador.setCorreo(newCorreo);
            }
            if (puestoCambiado) {
                trabajador.setPuesto(newPuesto);
            }
            if (horarioCambiado) {
                trabajador.setHorario(newHorario);
            }
            if (salarioCambiado) {
                trabajador.setSalario(newSalario);
            }
            controlador.update(trabajador);
            if (controlador.isCompleteOperation()) {
                if (puestoCambiado) {
                    guardarPuesto();
                }
                if (horarioCambiado) {
                    guardarHorario();
                }
                controlador.setCompleteOperation(false);
            }
        } else {
            showMessage("No se realizaron cambios.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        setCamposEditables(true);
        txtCedula.setEditable(false);
        activarCampos(true);
        controlador.readAll();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesActionPerformed
        show(trabajador);
        setCamposEditables(false);
        activarCampos(false);
        setBotonesEnabled();
        btnDes.setVisible(false);
    }//GEN-LAST:event_btnDesActionPerformed

    private void InfotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfotxtMouseClicked
        String msg = """
                -La Cedula debe digitarse en 9 digitos sin espacios.
                    Ej: 601230457
                     
                -El correo debe digitarse con formato: usuario@dominio.com
                    Ej: DanielJ@gmail.com
                     
                -Para añadir horarios nuevos, se debe cumplir el formato: HH:mm - HH:mm
                    Ej: 14:30 - 21:00
                """;
        showMessage(msg);

    }//GEN-LAST:event_InfotxtMouseClicked

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        String text = txtCorreo.getText();
        if (text.trim().isEmpty()) {
            return;
        }
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com$";
        if (!text.matches(emailRegex)) {
            txtCorreo.setText("");
            showError("Por favor, ingrese un correo válido con formato usuario@dominio.com");
            
        }

    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioActionPerformed

    private void Infotxt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Infotxt2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Infotxt2MouseClicked

    private void txtHorarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHorarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioFocusLost

    private void txtPuestoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPuestoFocusLost
//        showMessage("pasoó");
//        JTextField txt = (JTextField) txtPuesto.getEditor().getEditorComponent();
//        String texto = txt.getText();
//        if(texto == null){
//            showMessage("era null");
//            return;
//        }
//        texto = texto.trim();
//        if (texto.isEmpty()) {
//            showMessage("estaba vacio");
//            return;
//        }
//        txt.setText(texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase());
    }//GEN-LAST:event_txtPuestoFocusLost

    private void txtPuestoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPuestoMouseExited

    }//GEN-LAST:event_txtPuestoMouseExited
    
    private boolean guardarPuesto() {
        boolean existe = false;
        String nuevoPuesto = txtPuesto.getSelectedItem().toString();
        nuevoPuesto = nuevoPuesto.substring(0, 1).toUpperCase() + nuevoPuesto.substring(1).toLowerCase();
        ComboBoxModel modelo = txtPuesto.getModel();
        int size = modelo.getSize();
        for (int i = 0; i < size; i++) {
            if (modelo.getElementAt(i).toString().equalsIgnoreCase(nuevoPuesto)) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            txtPuesto.addItem(nuevoPuesto);
            JOptionPane.showMessageDialog(null, "El puesto ha sido agregado.");
        } /*else {
            JOptionPane.showMessageDialog(null, "El puesto ya existe.");
        }*/
        return existe;
    }
    
    private boolean guardarPuesto(String puesto) {
        boolean existe = false;
        ComboBoxModel modelo = txtPuesto.getModel();
        int size = modelo.getSize();
        for (int i = 0; i < size; i++) {
            if (modelo.getElementAt(i).toString().equalsIgnoreCase(puesto)) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            txtPuesto.addItem(puesto);
        }
        return existe;
    }
    
    private boolean guardarHorario() {
        boolean existe = false;
        String nuevoPuesto = txtHorario.getSelectedItem().toString();
        ComboBoxModel modelo = txtPuesto.getModel();
        int size = modelo.getSize();
        for (int i = 0; i < size; i++) {
            if (modelo.getElementAt(i).toString().equalsIgnoreCase(nuevoPuesto)) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            txtHorario.addItem(nuevoPuesto);
            JOptionPane.showMessageDialog(null, "El horario ha sido agregado.");
        } else {
            JOptionPane.showMessageDialog(null, "El horario ya existe.");
        }
        return existe;
    }
    
    private boolean guardarHorario(String horario) {
        boolean existe = false;
        ComboBoxModel modelo = txtHorario.getModel();
        int size = modelo.getSize();
        for (int i = 0; i < size; i++) {
            if (modelo.getElementAt(i).toString().equalsIgnoreCase(horario)) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            txtHorario.addItem(horario);
        }
        return existe;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Infotxt;
    private javax.swing.JLabel Infotxt2;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JComboBox<String> txtHorario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JComboBox<String> txtPuesto;
    private javax.swing.JFormattedTextField txtSalario;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtCedula.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtPuesto.setSelectedIndex(-1);
        txtHorario.setSelectedIndex(-1);
        txtSalario.setText("");
    }
    
    private void activarCampos(boolean valor) {
        txtCedula.setEnabled(valor);
        txtNombre.setEnabled(valor);
        txtTelefono.setEnabled(valor);
        txtCorreo.setEnabled(valor);
        txtPuesto.setEnabled(valor);
        txtHorario.setEnabled(valor);
        txtSalario.setEnabled(valor);
    }
    
    private void setCamposEditables(boolean valor) {
        txtCedula.setEditable(valor);
        txtNombre.setEditable(valor);
        txtTelefono.setEditable(valor);
        txtCorreo.setEditable(valor);
        txtPuesto.setEditable(valor);
        txtHorario.setEditable(valor);
        txtSalario.setEditable(valor);
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
    
    public void setBotonesEnabled() {
        UtilGui.changeStateButtons(btnGuardar, btnActualizar, btnBuscar, btnCancelar, btnNuevo, btnEliminar);
    }
    
    private void ajustarTodo() {
        ajustarImagenes("/Imagenes/nuevo.png", btnNuevo);
        ajustarImagenes("/Imagenes/guardar.png", btnGuardar);
        ajustarImagenes("/Imagenes/actualizar.png", btnActualizar);
        ajustarImagenes("/Imagenes/eliminar.png", btnEliminar);
        ajustarImagenes("/Imagenes/buscar.png", btnBuscar);
        ajustarImagenes("/Imagenes/cancelar.png", btnCancelar);
        
    }
    
    private void ajustarLabel(String ubicacion, javax.swing.JLabel cosa) {
        ImageIcon image = new ImageIcon(getClass().getResource(ubicacion));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(cosa.getWidth(), cosa.getHeight(), Image.SCALE_DEFAULT));
        cosa.setIcon(icon);
    }
    
    private void cargarPuestos() {
        List<String> puestos = controlador.getPuestos();
        for (String puesto : puestos) {
            guardarPuesto(puesto);
        }
    }
    
    private void cargarHorarios() {
        List<String> horarios = controlador.getHorarios();
        for (String horario : horarios) {
            guardarHorario(horario);
        }
    }
    
}
