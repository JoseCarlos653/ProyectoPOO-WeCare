package presentacion;
import entidades.Rol;
import entidades.Usuario;
import datos.Dt_Rol;
import datos.Dt_Usuario;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Luswi Torres
 */
public class FrmUsuario extends javax.swing.JFrame {

    // Atributos
    
    // Entidades
    private Rol rol = new Rol();
    private Usuario user = new Usuario();
    
    // Datos
    private Dt_Rol dtr = new Dt_Rol();
    private Dt_Usuario dtu = new Dt_Usuario();
    
    // Listas de Datos
    private ArrayList<Rol> listRol = new ArrayList<Rol>();
    private ArrayList<Usuario> listUsuario = new ArrayList<Usuario>();
    
    // Modelo de datos de la tabla
    DefaultTableModel myData = new DefaultTableModel();
    
    // Filtro de datos de la tabla
    TableRowSorter trsfiltro;
    
    
    // Constructor
    public FrmUsuario() {
        initComponents();
        llenarComboRol();
        llenarTablaUsuario();
        limpiarCampos();
        
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
        jl_id = new javax.swing.JLabel();
        jtf_id = new javax.swing.JTextField();
        jl_nombre_usuario = new javax.swing.JLabel();
        jtf_nombre_usuario = new javax.swing.JTextField();
        jl_rol = new javax.swing.JLabel();
        jcb_rol = new javax.swing.JComboBox<>();
        btn_mostrar_id = new javax.swing.JButton();
        jl_clave = new javax.swing.JLabel();
        jpf_clave = new javax.swing.JPasswordField();
        btn_nuevo = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_suprimir = new javax.swing.JButton();
        jl_estado = new javax.swing.JLabel();
        jtf_estado = new javax.swing.JTextField();
        jl_buscar = new javax.swing.JLabel();
        jtf_buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_usuario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion de los Usuarios");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(27, 154, 170));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion de Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jl_id.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jl_id.setForeground(new java.awt.Color(255, 255, 255));
        jl_id.setText("ID");

        jtf_id.setEditable(false);
        jtf_id.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtf_id.setFocusable(false);
        jtf_id.setRequestFocusEnabled(false);
        jtf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_idActionPerformed(evt);
            }
        });

        jl_nombre_usuario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jl_nombre_usuario.setForeground(new java.awt.Color(255, 255, 255));
        jl_nombre_usuario.setText("Nombre");

        jtf_nombre_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtf_nombre_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_nombre_usuarioKeyTyped(evt);
            }
        });

        jl_rol.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jl_rol.setForeground(new java.awt.Color(255, 255, 255));
        jl_rol.setText("Rol");

        jcb_rol.setBackground(new java.awt.Color(255, 102, 51));
        jcb_rol.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jcb_rol.setForeground(new java.awt.Color(255, 255, 255));
        jcb_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));

        btn_mostrar_id.setBackground(new java.awt.Color(255, 102, 51));
        btn_mostrar_id.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_mostrar_id.setForeground(new java.awt.Color(255, 255, 255));
        btn_mostrar_id.setText("...");
        btn_mostrar_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrar_idActionPerformed(evt);
            }
        });

        jl_clave.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jl_clave.setForeground(new java.awt.Color(255, 255, 255));
        jl_clave.setText("Clave");

        jpf_clave.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        btn_nuevo.setBackground(new java.awt.Color(255, 102, 51));
        btn_nuevo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevo.setText("Nuevo");
        btn_nuevo.setToolTipText("");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_guardar.setBackground(new java.awt.Color(255, 102, 51));
        btn_guardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_editar.setBackground(new java.awt.Color(255, 102, 51));
        btn_editar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_suprimir.setBackground(new java.awt.Color(255, 102, 51));
        btn_suprimir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_suprimir.setForeground(new java.awt.Color(255, 255, 255));
        btn_suprimir.setText("Suprimir");
        btn_suprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suprimirActionPerformed(evt);
            }
        });

        jl_estado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jl_estado.setForeground(new java.awt.Color(255, 255, 255));
        jl_estado.setText("Estado");

        jtf_estado.setEditable(false);
        jtf_estado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtf_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_estadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_rol)
                    .addComponent(jl_id)
                    .addComponent(jl_clave)
                    .addComponent(jl_estado)
                    .addComponent(jl_nombre_usuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jpf_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtf_nombre_usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcb_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_mostrar_id)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_suprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtf_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_id)
                    .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nuevo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(jl_rol)
                    .addComponent(jcb_rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mostrar_id))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar)
                    .addComponent(jl_nombre_usuario)
                    .addComponent(jtf_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_clave)
                    .addComponent(btn_suprimir)
                    .addComponent(jpf_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_estado)
                    .addComponent(jtf_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jl_buscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jl_buscar.setText("Buscar:");

        jtf_buscar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtf_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_buscarActionPerformed(evt);
            }
        });
        jtf_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_buscarKeyTyped(evt);
            }
        });

        jtbl_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtbl_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "usuarioID", "rolID", "nombreUsuario", "clave", "estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbl_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbl_usuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbl_usuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_buscar)
                    .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_idActionPerformed

    private void btn_mostrar_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrar_idActionPerformed
        // TODO add your handling code here:
        if (jcb_rol.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un rol!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else {
            rol = (Rol)this.jcb_rol.getSelectedItem();
            JOptionPane.showMessageDialog(null, "ID:  "+rol.getRolID());
        }
    }//GEN-LAST:event_btn_mostrar_idActionPerformed

    private void jtf_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_estadoActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void jtbl_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_usuarioMouseClicked
        // TODO add your handling code here:
        
        //obtenemos la fila seleccionada del jtable
        int fila = this.jtbl_usuario.getSelectedRow();
        int idRol = 0; //guarda el idLocations que se obtiene de la tabla
        int size = 0; //guarda la cantidad de elementos que hay en el jcombobx de Locations
        int pos = 1; //variable de control para recorrer las posiciones de los elementos en el jcombobox
        
        //asignamos los valores a los campos del formulario
        this.jtf_id.setText(this.jtbl_usuario.getValueAt(fila, 0).toString());
        this.jtf_nombre_usuario.setText(this.jtbl_usuario.getValueAt(fila, 2).toString());
        this.jpf_clave.setText(this.jtbl_usuario.getValueAt(fila, 3).toString());
        this.jtf_estado.setText(this.jtbl_usuario.getValueAt(fila, 4).toString());
        
        //obtenemos el idLocations del jtable
        idRol = Integer.parseInt(this.jtbl_usuario.getValueAt(fila, 1).toString());
        size = this.jcb_rol.getItemCount(); //obtenemos la cantidad de elementos contenidos en el jcombobox
        do{
            rol = (Rol)this.jcb_rol.getItemAt(pos);
            if(rol.getRolID() == idRol){
                //selecciono el objeto del jcombobox
                this.jcb_rol.setSelectedIndex(pos);
                break;
            }
            pos++;
        }
        while(pos<=size);
    }//GEN-LAST:event_jtbl_usuarioMouseClicked

    private void jtf_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_buscarActionPerformed
     
    }//GEN-LAST:event_jtf_buscarActionPerformed

    private void jtf_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_buscarKeyTyped
        // TODO add your handling code here:
        
        // TODO add your handling code here:
        
        jtf_buscar.addKeyListener(new KeyAdapter(){
            //Se ejecuta cuando el usuario libera una tecla
            @Override
            public void keyReleased(final KeyEvent e){
                String cadena = (jtf_buscar.getText()).toUpperCase();
                jtf_buscar.setText(cadena);
                repaint();
                filtrarTabla();
            }
        });
        trsfiltro = new TableRowSorter(jtbl_usuario.getModel());
        jtbl_usuario.setRowSorter(trsfiltro);
    }//GEN-LAST:event_jtf_buscarKeyTyped

    private void jtf_nombre_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_nombre_usuarioKeyTyped
        // TODO add your handling code here:
        jtf_nombre_usuario.addKeyListener(new KeyAdapter(){
            //Se ejecuta cuando el usuario libera una tecla
            @Override
            public void keyReleased(final KeyEvent e){
                String cadena = (jtf_nombre_usuario.getText()).toUpperCase();
                jtf_nombre_usuario.setText(cadena);
                repaint();
            }
        });
    }//GEN-LAST:event_jtf_nombre_usuarioKeyTyped

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        //validamos que todos los campos sean ingresados por el usuario      
        if (jcb_rol.getSelectedIndex()==0 || jtf_nombre_usuario.getText().equals("") || jpf_clave.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else {
            //construimos nuestro objeto con los valores del formulario
            rol = (Rol)this.jcb_rol.getItemAt(this.jcb_rol.getSelectedIndex());
            user.setRolID(rol.getRolID());
            user.setNombreUsuario(jtf_nombre_usuario.getText());
            user.setClave(jpf_clave.getText());
            user.setEstado(1);
            
            //validamos que el id no exista en la tabla de la bd
            if(dtu.existeUsuario(user)){
                JOptionPane.showMessageDialog(this, "El ID del usuario ya existe!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
                jtf_id.setText("");
                jtf_id.grabFocus(); 
            }
            else {
                //validamos que el metodo guardar devuelve un true
                if(dtu.guardarUsuario(user)){
                    JOptionPane.showMessageDialog (this, "El registro fue almacenado con éxito!", 
                      "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                    actualizarTabla();
                    limpiarCampos();
                    
                }
                else {
                   JOptionPane.showMessageDialog(this, 
                      "Revise los datos e intente nuevamente. Si el error persiste contacte al Administrador del Sistema.", 
                      "ERROR", JOptionPane.ERROR_MESSAGE); 
                }
            }
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_suprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suprimirActionPerformed
        // TODO add your handling code here:
        //validamos que todos los campos sean ingresados por el usuario      
        if (jcb_rol.getSelectedIndex()==0 || jtf_nombre_usuario.getText().equals("") || jpf_clave.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un registro!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else {
            //construimos nuestro objeto con los valores del formulario
            user.setUsuarioID(Integer.parseInt(jtf_id.getText()));
            rol = (Rol)this.jcb_rol.getItemAt(this.jcb_rol.getSelectedIndex());
            user.setRolID(rol.getRolID());
            user.setNombreUsuario(jtf_nombre_usuario.getText());
            user.setClave(jpf_clave.getText());
            user.setEstado(3);
            
            
            //validamos que el metodo guardar devuelve un true
            if(dtu.deleteUsuario(user)){
                JOptionPane.showMessageDialog (this, "El registro fue eliminado con éxito!", 
                  "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                actualizarTabla();
                limpiarCampos();
                    
            }
            else {
                JOptionPane.showMessageDialog(this, 
                  "Revise los datos e intente nuevamente. Si el error persiste contacte al Administrador del Sistema.", 
                  "ERROR", JOptionPane.ERROR_MESSAGE); 
            }
        }
    }//GEN-LAST:event_btn_suprimirActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        //validamos que todos los campos sean ingresados por el usuario      
        //validamos que todos los campos sean ingresados por el usuario      
        if (jcb_rol.getSelectedIndex()==0 || jtf_nombre_usuario.getText().equals("") || jpf_clave.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben ser rellenados!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else {
            //construimos nuestro objeto con los valores del formulario
            user.setUsuarioID(Integer.parseInt(jtf_id.getText()));
            rol = (Rol)this.jcb_rol.getItemAt(this.jcb_rol.getSelectedIndex());
            user.setRolID(rol.getRolID());
            user.setNombreUsuario(jtf_nombre_usuario.getText());
            user.setClave(jpf_clave.getText());
            user.setEstado(2);
            
            
            //validamos que el metodo guardar devuelve un true
            if(dtu.editarUsuario(user)){
                JOptionPane.showMessageDialog (this, "El registro fue actualizado con éxito!", 
                  "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                actualizarTabla();
                limpiarCampos();
                    
            }
            else {
                JOptionPane.showMessageDialog(this, 
                  "Revise los datos e intente nuevamente. Si el error persiste contacte al Administrador del Sistema.", 
                  "ERROR", JOptionPane.ERROR_MESSAGE); 
            }
        }
    }//GEN-LAST:event_btn_editarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUsuario().setVisible(true);
            }
        });
    }
    
    
    // Metodos
    
    private void llenarComboRol(){
        //llenamos la lista
        listRol = dtr.listarRol();
        
        for(Rol r: listRol){
            //llenar el combobox con los objetos de la lista
            this.jcb_rol.addItem(r);
            //this.jcb_locations.addItem(l.toString());
        }
    }
    
    
    private void actualizarTabla(){
        myData.setColumnCount(0);
        myData.setRowCount(0);
        this.llenarTablaUsuario();
    }
    
    
    private void llenarTablaUsuario()
    {
         //llenamos la lista
        listUsuario = dtu.listarUsuario();
        
        //creamos un arraylist con las columnas del modelo
        ArrayList<Object> listNombreColumnas = new ArrayList<Object>();
        listNombreColumnas.add("usuarioID");
        listNombreColumnas.add("rolID");
        listNombreColumnas.add("nombreUsuario");
        listNombreColumnas.add("clave");
        listNombreColumnas.add("estado");
        //recorremos cada elemento del arraylist y creamos un objeto
        for(Object column : listNombreColumnas){
            //asignamos las columnas al modelo
            myData.addColumn(column);
        }
        
       //recorremos cada elemento de la lista y creamos el objeto
        for(Usuario usuario: listUsuario){
            Object[] datosUsuario = new Object[]{usuario.getUsuarioID(), usuario.getRolID(), usuario.getNombreUsuario(), usuario.getClave(), usuario.getEstado()};
            //asignamos un arreglo de objetos a una fila del modelo
            myData.addRow(datosUsuario);
        }
        //Asignamos el modelo y/o coleccion de datos a la tabla
        jtbl_usuario.setModel(myData);
    }
    
    
    private void filtrarTabla(){
       trsfiltro.setRowFilter(RowFilter.regexFilter(jtf_buscar.getText(),2));
    }
    
    
    private void limpiarCampos()
    {
        this.jtf_id.setText("");
        this.jtf_nombre_usuario.setText("");
        this.jcb_rol.setSelectedIndex(0);
        this.jtf_nombre_usuario.setText("");
        this.jpf_clave.setText("");
        this.jtf_estado.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_mostrar_id;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_suprimir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Object> jcb_rol;
    private javax.swing.JLabel jl_buscar;
    private javax.swing.JLabel jl_clave;
    private javax.swing.JLabel jl_estado;
    private javax.swing.JLabel jl_id;
    private javax.swing.JLabel jl_nombre_usuario;
    private javax.swing.JLabel jl_rol;
    private javax.swing.JPasswordField jpf_clave;
    private javax.swing.JTable jtbl_usuario;
    private javax.swing.JTextField jtf_buscar;
    private javax.swing.JTextField jtf_estado;
    private javax.swing.JTextField jtf_id;
    private javax.swing.JTextField jtf_nombre_usuario;
    // End of variables declaration//GEN-END:variables
}
