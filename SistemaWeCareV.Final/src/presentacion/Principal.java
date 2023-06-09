package presentacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Luswi Torres
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.jl_user.setText(Login.user.getNombreUsuario());
        this.jl_rol.setText(Login.rol.getRolNombre());
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jl_user = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jl_rol = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuPpal = new javax.swing.JMenu();
        jmi_general = new javax.swing.JMenuItem();
        jmi_bodega = new javax.swing.JMenuItem();
        jmi_inventario = new javax.swing.JMenuItem();
        jmi_cliente = new javax.swing.JMenuItem();
        jmi_tipo_cliente = new javax.swing.JMenuItem();
        jmi_producto = new javax.swing.JMenuItem();
        jmi_tipo_producto = new javax.swing.JMenuItem();
        jmi_mascota = new javax.swing.JMenuItem();
        jmi_tipo_mascota = new javax.swing.JMenuItem();
        jmi_consulta = new javax.swing.JMenuItem();
        jmi_expediente = new javax.swing.JMenuItem();
        jmi_usuario = new javax.swing.JMenuItem();
        jmi_salida = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(27, 154, 170), 5, true));

        jPanel2.setBackground(new java.awt.Color(27, 154, 170));
        jPanel2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 5, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido:");

        jl_user.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jl_user.setForeground(new java.awt.Color(255, 255, 255));
        jl_user.setText("*PLACEHOLDER*");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Su rol es:");

        jl_rol.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jl_rol.setForeground(new java.awt.Color(255, 255, 255));
        jl_rol.setText("*PLACEHOLDER*");
        jl_rol.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_rol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_user, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jl_user))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jl_rol))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Logo WeCare 500x500.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 557, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jMenuPpal.setText("Menu Principal");
        jMenuPpal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jmi_general.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jmi_general.setText("Informacion General");
        jmi_general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_generalActionPerformed(evt);
            }
        });
        jMenuPpal.add(jmi_general);

        jmi_bodega.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jmi_bodega.setText("Gestionar Bodegas");
        jmi_bodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_bodegaActionPerformed(evt);
            }
        });
        jMenuPpal.add(jmi_bodega);

        jmi_inventario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jmi_inventario.setText("Gestionar Inventarios");
        jmi_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_inventarioActionPerformed(evt);
            }
        });
        jMenuPpal.add(jmi_inventario);

        jmi_cliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jmi_cliente.setText("Gestionar Clientes");
        jmi_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_clienteActionPerformed(evt);
            }
        });
        jMenuPpal.add(jmi_cliente);

        jmi_tipo_cliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jmi_tipo_cliente.setText("Gestionar Tipos de Clientes");
        jmi_tipo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_tipo_clienteActionPerformed(evt);
            }
        });
        jMenuPpal.add(jmi_tipo_cliente);

        jmi_producto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jmi_producto.setText("Gestionar Productos");
        jmi_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_productoActionPerformed(evt);
            }
        });
        jMenuPpal.add(jmi_producto);

        jmi_tipo_producto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jmi_tipo_producto.setText("Gestionar Tipos de Productos");
        jmi_tipo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_tipo_productoActionPerformed(evt);
            }
        });
        jMenuPpal.add(jmi_tipo_producto);

        jmi_mascota.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jmi_mascota.setText("Gestionar Mascotas");
        jmi_mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_mascotaActionPerformed(evt);
            }
        });
        jMenuPpal.add(jmi_mascota);

        jmi_tipo_mascota.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jmi_tipo_mascota.setText("Gestionar Tipos de Mascotas");
        jmi_tipo_mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_tipo_mascotaActionPerformed(evt);
            }
        });
        jMenuPpal.add(jmi_tipo_mascota);

        jmi_consulta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jmi_consulta.setText("Gestionar Consultas");
        jmi_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_consultaActionPerformed(evt);
            }
        });
        jMenuPpal.add(jmi_consulta);

        jmi_expediente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jmi_expediente.setText("Gestionar Expedientes");
        jmi_expediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_expedienteActionPerformed(evt);
            }
        });
        jMenuPpal.add(jmi_expediente);

        jmi_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jmi_usuario.setText("Gestionar Usuarios");
        jmi_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_usuarioActionPerformed(evt);
            }
        });
        jMenuPpal.add(jmi_usuario);

        jmi_salida.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jmi_salida.setText("Salir");
        jmi_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_salidaActionPerformed(evt);
            }
        });
        jMenuPpal.add(jmi_salida);

        jMenuBar.add(jMenuPpal);

        setJMenuBar(jMenuBar);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_usuarioActionPerformed

        if (jl_rol.getText().equals("Administrador")) {
            FrmUsuario frmUser = new FrmUsuario();
            frmUser.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No tiene permiso para acceder!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jmi_usuarioActionPerformed

    private void jmi_generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_generalActionPerformed
        // TODO add your handling code here:
        if (jl_rol.getText().equals("Administrador")) {
            FrmWeCare frmWC = new FrmWeCare();
            frmWC.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No tiene permiso para acceder!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jmi_generalActionPerformed

    private void jmi_tipo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_tipo_clienteActionPerformed
        // TODO add your handling code here:
        if (jl_rol.getText().equals("Administrador")) {
            FrmTipoCliente frmTipoC = new FrmTipoCliente();
            frmTipoC.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No tiene permiso para acceder!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jmi_tipo_clienteActionPerformed

    private void jmi_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_clienteActionPerformed
        // TODO add your handling code here:
        FrmClientes frmClient = new FrmClientes();
        frmClient.setVisible(true);
    }//GEN-LAST:event_jmi_clienteActionPerformed

    private void jmi_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_consultaActionPerformed
        // TODO add your handling code here:
        FrmConsulta frmConsult = new FrmConsulta();
        frmConsult.setVisible(true);
    }//GEN-LAST:event_jmi_consultaActionPerformed

    private void jmi_expedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_expedienteActionPerformed
        // TODO add your handling code here:
        FrmExpediente frmEx = new FrmExpediente();
        frmEx.setVisible(true);
    }//GEN-LAST:event_jmi_expedienteActionPerformed

    private void jmi_mascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_mascotaActionPerformed
        // TODO add your handling code here:
        FrmMascota frmMascot = new FrmMascota();
        frmMascot.setVisible(true);
    }//GEN-LAST:event_jmi_mascotaActionPerformed

    private void jmi_tipo_mascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_tipo_mascotaActionPerformed
        // TODO add your handling code here:
        if (jl_rol.getText().equals("Administrador")) {
            FrmTipoMascota frmTipoM = new FrmTipoMascota();
            frmTipoM.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No tiene permiso para acceder!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jmi_tipo_mascotaActionPerformed

    private void jmi_bodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_bodegaActionPerformed
        // TODO add your handling code here:
        FrmBodega frmCellar = new FrmBodega();
        frmCellar.setVisible(true);
    }//GEN-LAST:event_jmi_bodegaActionPerformed

    private void jmi_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_inventarioActionPerformed
        // TODO add your handling code here:
        FrmInventario frmInventory = new FrmInventario();
        frmInventory.setVisible(true);
    }//GEN-LAST:event_jmi_inventarioActionPerformed

    private void jmi_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_productoActionPerformed
        // TODO add your handling code here:
        FrmProducto frmProd = new FrmProducto();
        frmProd.setVisible(true);
    }//GEN-LAST:event_jmi_productoActionPerformed

    private void jmi_tipo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_tipo_productoActionPerformed
        // TODO add your handling code here:
        if (jl_rol.getText().equals("Administrador")) {
            FrmTipoproducto frmTipoP = new FrmTipoproducto();
            frmTipoP.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No tiene permiso para acceder!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jmi_tipo_productoActionPerformed

    private void jmi_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_salidaActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jmi_salidaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuPpal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jl_rol;
    private javax.swing.JLabel jl_user;
    private javax.swing.JMenuItem jmi_bodega;
    private javax.swing.JMenuItem jmi_cliente;
    private javax.swing.JMenuItem jmi_consulta;
    private javax.swing.JMenuItem jmi_expediente;
    private javax.swing.JMenuItem jmi_general;
    private javax.swing.JMenuItem jmi_inventario;
    private javax.swing.JMenuItem jmi_mascota;
    private javax.swing.JMenuItem jmi_producto;
    private javax.swing.JMenuItem jmi_salida;
    private javax.swing.JMenuItem jmi_tipo_cliente;
    private javax.swing.JMenuItem jmi_tipo_mascota;
    private javax.swing.JMenuItem jmi_tipo_producto;
    private javax.swing.JMenuItem jmi_usuario;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
