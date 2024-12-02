/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Enums.Rol;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import java.awt.event.MouseEvent;

/**
 *
 * @author Fernando
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    private String nombreUsuario;
    private String contrasenaUsuario;
    private Rol rolUsuario;
    FrmInicioSesión frm;

    public FrmPrincipal(String nombre, String contrasena, Rol rol) {
        this.nombreUsuario = nombre;
        this.contrasenaUsuario = contrasena;
        this.rolUsuario = rol;
        initComponents();
        setExtendedState(FrmPrincipal.MAXIMIZED_BOTH);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panelLateral, BorderLayout.WEST);
        getContentPane().add(panelCentro, BorderLayout.CENTER);
        ajustarTodo();
        ajustarRol();
        administarPermisos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLateral = new javax.swing.JPanel();
        Usertxt = new javax.swing.JLabel();
        txtPresentacion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cultivotxt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAlmacenamiento = new javax.swing.JPanel();
        almacentxt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        protxt1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTrabajadores = new javax.swing.JPanel();
        tratxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuarios = new javax.swing.JPanel();
        usertxt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelCentro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DeskPrincipal = new javax.swing.JDesktopPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtRol = new javax.swing.JLabel();
        Infotxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelLateral.setBackground(new java.awt.Color(0, 0, 51));

        Usertxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario.png"))); // NOI18N

        txtPresentacion.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtPresentacion.setForeground(new java.awt.Color(255, 255, 255));
        txtPresentacion.setText("FEBOLIVARBR");

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        cultivotxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cultivo.png"))); // NOI18N
        cultivotxt.setText("jLabel3");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cultivos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cultivotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cultivotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtAlmacenamiento.setBackground(new java.awt.Color(0, 0, 51));
        txtAlmacenamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAlmacenamientoMouseClicked(evt);
            }
        });

        almacentxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/almacen.png"))); // NOI18N
        almacentxt.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Almacenamiento");

        javax.swing.GroupLayout txtAlmacenamientoLayout = new javax.swing.GroupLayout(txtAlmacenamiento);
        txtAlmacenamiento.setLayout(txtAlmacenamientoLayout);
        txtAlmacenamientoLayout.setHorizontalGroup(
            txtAlmacenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtAlmacenamientoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(almacentxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(32, 32, 32))
        );
        txtAlmacenamientoLayout.setVerticalGroup(
            txtAlmacenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtAlmacenamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtAlmacenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(almacentxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));

        protxt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/produccion.png"))); // NOI18N
        protxt1.setText("jLabel3");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Producción");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(protxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(protxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTrabajadores.setBackground(new java.awt.Color(0, 0, 51));
        txtTrabajadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTrabajadoresMouseClicked(evt);
            }
        });

        tratxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trabajador.png"))); // NOI18N
        tratxt.setText("jLabel3");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Trabajadores");

        javax.swing.GroupLayout txtTrabajadoresLayout = new javax.swing.GroupLayout(txtTrabajadores);
        txtTrabajadores.setLayout(txtTrabajadoresLayout);
        txtTrabajadoresLayout.setHorizontalGroup(
            txtTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtTrabajadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tratxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(32, 32, 32))
        );
        txtTrabajadoresLayout.setVerticalGroup(
            txtTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtTrabajadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tratxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtUsuarios.setBackground(new java.awt.Color(0, 0, 51));
        txtUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuariosMouseClicked(evt);
            }
        });

        usertxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/adUsuario.png"))); // NOI18N
        usertxt.setText("jLabel3");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Usuarios");

        javax.swing.GroupLayout txtUsuariosLayout = new javax.swing.GroupLayout(txtUsuarios);
        txtUsuarios.setLayout(txtUsuariosLayout);
        txtUsuariosLayout.setHorizontalGroup(
            txtUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        txtUsuariosLayout.setVerticalGroup(
            txtUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(txtUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)))
        );

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLateralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLateralLayout.createSequentialGroup()
                        .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtUsuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTrabajadores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAlmacenamiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLateralLayout.createSequentialGroup()
                        .addComponent(Usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPresentacion)
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        panelCentro.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("GESTOR AGRICOLA");

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tractor.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel8)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 232, Short.MAX_VALUE))
        );

        DeskPrincipal.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DeskPrincipalLayout = new javax.swing.GroupLayout(DeskPrincipal);
        DeskPrincipal.setLayout(DeskPrincipalLayout);
        DeskPrincipalLayout.setHorizontalGroup(
            DeskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DeskPrincipalLayout.setVerticalGroup(
            DeskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txtRol.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtRol.setForeground(new java.awt.Color(0, 0, 51));
        txtRol.setText("jLabel2");

        Infotxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ajustes.png"))); // NOI18N
        Infotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InfotxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelCentroLayout = new javax.swing.GroupLayout(panelCentro);
        panelCentro.setLayout(panelCentroLayout);
        panelCentroLayout.setHorizontalGroup(
            panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentroLayout.createSequentialGroup()
                        .addComponent(DeskPrincipal)
                        .addContainerGap())
                    .addGroup(panelCentroLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Infotxt)
                        .addGap(28, 28, 28))))
        );
        panelCentroLayout.setVerticalGroup(
            panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentroLayout.createSequentialGroup()
                .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtRol)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Infotxt)))
                .addGap(18, 18, 18)
                .addComponent(DeskPrincipal)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuariosMouseClicked
        FrmUsuario frmUsuario = new FrmUsuario();
        if (!frmUsuario.isVisible()) {
            DeskPrincipal.add(frmUsuario);
            frmUsuario.setVisible(true);
            frmUsuario.setLocation((DeskPrincipal.getWidth() - frmUsuario.getWidth()) / 2,
                    (DeskPrincipal.getHeight() - frmUsuario.getHeight()) / 2);
        } else {
            try {
                frmUsuario.setSelected(true);
            } catch (java.beans.PropertyVetoException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_txtUsuariosMouseClicked

    private void InfotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfotxtMouseClicked

        if (evt.getButton() == MouseEvent.BUTTON1) {
            JPopupMenu popupMenu = new JPopupMenu();

            JMenuItem opcion1 = new JMenuItem("Cerrar sesión");

            JMenuItem opcion2 = new JMenuItem("Cambiar Contraseña");

            popupMenu.add(opcion1);
            popupMenu.add(opcion2);

            opcion1.addActionListener(e -> {
                this.dispose();
                frm = new FrmInicioSesión();
                frm.setVisible(true);
            });
            opcion2.addActionListener(e -> {
                FrmCambiarContraseña frmCambiarContraseña = new FrmCambiarContraseña(this, true, nombreUsuario);
                frmCambiarContraseña.setLocationRelativeTo(DeskPrincipal);
                frmCambiarContraseña.setVisible(true);

            });
            popupMenu.show(Infotxt, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_InfotxtMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        FrmCultivo frmCultivo = new FrmCultivo();
        if (!frmCultivo.isVisible()) {
            DeskPrincipal.add(frmCultivo);
            frmCultivo.setVisible(true);
            frmCultivo.setLocation((DeskPrincipal.getWidth() - frmCultivo.getWidth()) / 2,
                    (DeskPrincipal.getHeight() - frmCultivo.getHeight()) / 2);
        } else {
            try {
                frmCultivo.setSelected(true);
            } catch (java.beans.PropertyVetoException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        FrmProduccionn frmProduccionn = new FrmProduccionn();
        if (!frmProduccionn.isVisible()) {
            DeskPrincipal.add(frmProduccionn);
            frmProduccionn.setVisible(true);
            frmProduccionn.setLocation((DeskPrincipal.getWidth() - frmProduccionn.getWidth()) / 2,
                    (DeskPrincipal.getHeight() - frmProduccionn.getHeight()) / 2);
        } else {
            try {
                frmProduccionn.setSelected(true);
            } catch (java.beans.PropertyVetoException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void txtTrabajadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTrabajadoresMouseClicked
        FrmTrabajador frm = new FrmTrabajador();
        DeskPrincipal.add(frm);
        frm.setVisible(true);
        frm.setLocation((DeskPrincipal.getWidth() - frm.getWidth()) / 2, (DeskPrincipal.getHeight() - frm.getHeight()) / 2);

    }//GEN-LAST:event_txtTrabajadoresMouseClicked

    private void txtAlmacenamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAlmacenamientoMouseClicked
        FrmAlmacenamiento frmAlmacenamiento = new FrmAlmacenamiento();
        if (!frmAlmacenamiento.isVisible()) {
            DeskPrincipal.add(frmAlmacenamiento);
            frmAlmacenamiento.setVisible(true);
            frmAlmacenamiento.setLocation((DeskPrincipal.getWidth() - frmAlmacenamiento.getWidth()) / 2,
                    (DeskPrincipal.getHeight() - frmAlmacenamiento.getHeight()) / 2);
        } else {
            try {
                frmAlmacenamiento.setSelected(true);
            } catch (java.beans.PropertyVetoException ex) {
                ex.printStackTrace();
            }
        }    }//GEN-LAST:event_txtAlmacenamientoMouseClicked

    /**
     * @param args the command line arguments
     */
    public void ajustarImagenes(String ubicacion, javax.swing.JLabel cosa) {
        ImageIcon image = new ImageIcon(getClass().getResource(ubicacion));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(cosa.getWidth(), cosa.getHeight(), Image.SCALE_DEFAULT));
        cosa.setIcon(icon);
    }

    public void ajustarTodo() {
        ajustarImagenes("/Imagenes/Usuario.png", Usertxt);
        ajustarImagenes("/Imagenes/cultivo.png", cultivotxt);
        ajustarImagenes("/Imagenes/produccion.png", protxt1);
        ajustarImagenes("/Imagenes/almacen.png", almacentxt);
        ajustarImagenes("/Imagenes/trabajador.png", tratxt);
        ajustarImagenes("/Imagenes/adUsuario.png", usertxt);

    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public Rol getRolUsuario() {
        return rolUsuario;
    }

    public void ajustarRol() {
        txtPresentacion.setText(nombreUsuario);
        txtPresentacion.setHorizontalAlignment(JTextField.CENTER);
        txtRol.setText("( " + rolUsuario + " )");
        txtPresentacion.setHorizontalAlignment(JTextField.CENTER);
    }

    public void administarPermisos() {
        if (rolUsuario == Rol.TRABAJADOR) {
            txtUsuarios.setVisible(false);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DeskPrincipal;
    private javax.swing.JLabel Infotxt;
    private javax.swing.JLabel Usertxt;
    private javax.swing.JLabel almacentxt;
    private javax.swing.JLabel cultivotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel panelCentro;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JLabel protxt1;
    private javax.swing.JLabel tratxt;
    private javax.swing.JPanel txtAlmacenamiento;
    private javax.swing.JLabel txtPresentacion;
    private javax.swing.JLabel txtRol;
    private javax.swing.JPanel txtTrabajadores;
    private javax.swing.JPanel txtUsuarios;
    private javax.swing.JLabel usertxt;
    // End of variables declaration//GEN-END:variables
}
