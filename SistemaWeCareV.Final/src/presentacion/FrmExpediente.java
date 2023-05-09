/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

//Librerias para cargar datos en la tabla
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import entidades.Expediente;
import datos.Dt_Expediente;
import datos.Dt_Mascota;
import entidades.Mascota;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

//Librerias para el Metodo de Buscar
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;

/**
 *
 * @author Emanuel Leite
 */
public class FrmExpediente extends javax.swing.JFrame {
    
    //Atributos
    private Expediente Expediente = new Expediente();
    private Mascota r = new Mascota();
    
    //Declaro las clases de datos
    private Dt_Expediente dtE = new Dt_Expediente();
    private Dt_Mascota dtm = new Dt_Mascota();
    
    //Declaro las listas de datos
    private ArrayList<Expediente> listaExpedientes = new ArrayList<Expediente>();
    private ArrayList<Mascota> listaMascotas = new ArrayList<Mascota>();
    
    // Entidades
    Mascota m = new Mascota();
    Expediente e = new Expediente();
    
    //Declaramos el modelo de datos de la tabla 
    DefaultTableModel myData = new DefaultTableModel();
    
    //Declaramos un filtro de datos para la tabla
    TableRowSorter trsfiltro;
    
    public FrmExpediente() {
        initComponents();
        llenarTablaExpediente();
        llenarComboMascotas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mascota1 = new entidades.Mascota();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtf_IdExpediente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtf_NumeroExpediente = new javax.swing.JTextField();
        jtf_FechaRegistro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtf_TipoSangre = new javax.swing.JTextField();
        jtf_Castrado = new javax.swing.JTextField();
        jtf_Estado = new javax.swing.JTextField();
        jb_Nuevo = new javax.swing.JButton();
        jb_Guardar = new javax.swing.JButton();
        jb_Editar = new javax.swing.JButton();
        jb_Suprimir = new javax.swing.JButton();
        comboBoxMascota = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtf_buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Expediente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario Expediente");

        jPanel1.setBackground(new java.awt.Color(27, 154, 170));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario Expediente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Expediente ID");

        jtf_IdExpediente.setEditable(false);
        jtf_IdExpediente.setBackground(new java.awt.Color(255, 255, 255));
        jtf_IdExpediente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mascota");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero Expediente");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de Registro");

        jtf_NumeroExpediente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jtf_FechaRegistro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de Sangre");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Castrado");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estado");

        jtf_TipoSangre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jtf_Castrado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jtf_Estado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jb_Nuevo.setBackground(new java.awt.Color(255, 102, 51));
        jb_Nuevo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jb_Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        jb_Nuevo.setText("Nuevo");
        jb_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_NuevoActionPerformed(evt);
            }
        });

        jb_Guardar.setBackground(new java.awt.Color(255, 102, 51));
        jb_Guardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jb_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        jb_Guardar.setText("Guardar");
        jb_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_GuardarActionPerformed(evt);
            }
        });

        jb_Editar.setBackground(new java.awt.Color(255, 102, 51));
        jb_Editar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jb_Editar.setForeground(new java.awt.Color(255, 255, 255));
        jb_Editar.setText("Editar");
        jb_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_EditarActionPerformed(evt);
            }
        });

        jb_Suprimir.setBackground(new java.awt.Color(255, 102, 51));
        jb_Suprimir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jb_Suprimir.setForeground(new java.awt.Color(255, 255, 255));
        jb_Suprimir.setText("Suprimir");
        jb_Suprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_SuprimirActionPerformed(evt);
            }
        });

        comboBoxMascota.setBackground(new java.awt.Color(255, 102, 51));
        comboBoxMascota.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        comboBoxMascota.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));

        jButton5.setBackground(new java.awt.Color(255, 102, 51));
        jButton5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxMascota, 0, 167, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_IdExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_NumeroExpediente, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jtf_FechaRegistro))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_Estado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_TipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_Castrado)))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jb_Suprimir)
                                .addComponent(jb_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jb_Editar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtf_IdExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jb_Nuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5)
                        .addComponent(jtf_TipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5))
                    .addComponent(jb_Guardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jtf_NumeroExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jtf_Castrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jb_Editar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_FechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Suprimir))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("Buscar:");

        jtf_buscar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtf_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_buscarKeyTyped(evt);
            }
        });

        jt_Expediente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "expedienteID", "mascotaID", "numeroExpediente", "fechaRegistro", "tipoSangre", "castrado", "estado"
            }
        ));
        jt_Expediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_ExpedienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_Expediente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_buscar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // Filtra la tabla
    private void jtf_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_buscarKeyTyped
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
        trsfiltro = new TableRowSorter(jt_Expediente.getModel());
        jt_Expediente.setRowSorter(trsfiltro); 
    }//GEN-LAST:event_jtf_buscarKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        r = (Mascota)this.comboBoxMascota.getSelectedItem();
        JOptionPane.showMessageDialog(null, "ID:  "+ r.getMascotaID());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jt_ExpedienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_ExpedienteMouseClicked
        
        // Obtenemos la fila seleccionada
        int fila = jt_Expediente.getSelectedRow();
        int idM = 0; // Guarda el idExpediente que se obtiene de la tabla
        int size = 0; // Guarda la cantidad de elementos que hay en el jcombobx de Locations
        int pos = 1; // Variable de control para recorrer las posiciones de los elementos en el jcombobox


        // Asignamos los valores a los campos del formulario
        jtf_IdExpediente.setText(jt_Expediente.getValueAt(fila, 0).toString());
        //comboBoxMascota.setSelectedIndex(Integer.parseInt(jt_Expediente.getValueAt(fila, 1).toString()));
        jtf_NumeroExpediente.setText(jt_Expediente.getValueAt(fila, 2).toString());
        jtf_FechaRegistro.setText(jt_Expediente.getValueAt(fila, 3).toString());
        jtf_TipoSangre.setText(jt_Expediente.getValueAt(fila, 4).toString());
        jtf_Castrado.setText(jt_Expediente.getValueAt(fila, 5).toString());
        jtf_Estado.setText(jt_Expediente.getValueAt(fila, 6).toString());
        
        // Obtenemos el idMascota del jtable
        idM = Integer.parseInt(this.jt_Expediente.getValueAt(fila, 1).toString());
        size = this.comboBoxMascota.getItemCount();
        do{
            
            m = (Mascota)this.comboBoxMascota.getItemAt(pos);
            if(m.getMascotaID()==idM){
                // Selecciono el objeto del jcombobox
                this.comboBoxMascota.setSelectedIndex(pos);
                break;
            }
            pos++;
            
        }
        while(pos<=size);
        
    }//GEN-LAST:event_jt_ExpedienteMouseClicked

    private void jb_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GuardarActionPerformed
        // Validamos que todos los campos sean ingresados por el usuario      
        if( comboBoxMascota.getSelectedIndex()==0 ||  jtf_NumeroExpediente.getText().equals("") || jtf_FechaRegistro.getText().equals("") || jtf_TipoSangre.getText().equals("") || jtf_Castrado.getText().equals("") || jtf_Estado.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            
            // Construimos nuestro objeto con los valores del formulario
            m = (Mascota)this.comboBoxMascota.getSelectedItem();
            e.setMascotaID(m.getMascotaID());
            
            e.setNumeroExpediente(Integer.parseInt(jtf_NumeroExpediente.getText()));
            e.setFechaRegistro(jtf_FechaRegistro.getText());
            e.setTipoSangre(jtf_TipoSangre.getText());
            e.setCastrado(Integer.parseInt(jtf_Castrado.getText()));
            e.setEstado(1);
            
            // Validamos que el id no exista en la tabla de la bd
            if(dtE.existeExpediente(e)){
                JOptionPane.showMessageDialog(this, "El Id de expediente ya existe!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
                jtf_IdExpediente.setText("");
                jtf_IdExpediente.grabFocus(); 
            }
            else{
                // Validamos que el metodo guardar devuelve un true
                if(dtE.guardarExpediente(e)){
                    JOptionPane.showMessageDialog (this, "El registro fue almacenado con éxito!", 
                      "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                    actualizarTabla();
                    limpiarCampos();
                }
                else{
                   JOptionPane.showMessageDialog(this, 
                      "Revise los datos e intente nuevamente. Si el error persiste contacte al Administrador del Sistema.", 
                      "ERROR", JOptionPane.ERROR_MESSAGE); 
                }
            }
        }
    }//GEN-LAST:event_jb_GuardarActionPerformed

    private void jb_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_EditarActionPerformed
        //validamos que todos los campos sean ingresados por el usuario      
        if( comboBoxMascota.getSelectedIndex()==0 ||  jtf_NumeroExpediente.getText().equals("") || jtf_FechaRegistro.getText().equals("") || jtf_TipoSangre.getText().equals("") || jtf_Castrado.getText().equals("") || jtf_Estado.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            // Construimos nuestro objeto con los valores del formulario
            m = (Mascota)this.comboBoxMascota.getSelectedItem();
            e.setMascotaID(m.getMascotaID());
            
            e.setExpedienteID(Integer.parseInt(jtf_IdExpediente.getText()));
            e.setNumeroExpediente(Integer.parseInt(jtf_NumeroExpediente.getText()));
            e.setFechaRegistro(jtf_FechaRegistro.getText());
            e.setTipoSangre(jtf_TipoSangre.getText());
            e.setCastrado(Integer.parseInt(jtf_Castrado.getText()));
            e.setEstado(2);

            // Validamos que el metodo editar devuelve un true
            if(dtE.editarExpediente(e)){
                JOptionPane.showMessageDialog (this, "El registro fue actualizado con éxito!", 
                  "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                actualizarTabla();
                limpiarCampos();

            }
            else{
               JOptionPane.showMessageDialog(this, 
                  "Revise los datos e intente nuevamente. Si el error persiste contacte al Administrador del Sistema.", 
                  "ERROR", JOptionPane.ERROR_MESSAGE); 
            }
        }
    }//GEN-LAST:event_jb_EditarActionPerformed

    private void jb_SuprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SuprimirActionPerformed
        // Validamos que todos los campos sean ingresados por el usuario      
        if( comboBoxMascota.getSelectedIndex()==0 ||  jtf_NumeroExpediente.getText().equals("") || jtf_FechaRegistro.getText().equals("") || jtf_TipoSangre.getText().equals("") || jtf_Castrado.getText().equals("") || jtf_Estado.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            // Construimos nuestro objeto con los valores del formulario
            m = (Mascota)this.comboBoxMascota.getSelectedItem();
            e.setMascotaID(m.getMascotaID());
            
            e.setExpedienteID(Integer.parseInt(jtf_IdExpediente.getText()));
            e.setNumeroExpediente(Integer.parseInt(jtf_NumeroExpediente.getText()));
            e.setFechaRegistro(jtf_FechaRegistro.getText());
            e.setTipoSangre(jtf_TipoSangre.getText());
            e.setCastrado(Integer.parseInt(jtf_Castrado.getText()));
            e.setEstado(Integer.parseInt(jtf_Estado.getText()));


                //validamos que el metodo editar devuelve un true
                if(dtE.deleteExpediente(e)){
                    JOptionPane.showMessageDialog (this, "El registro fue eliminado con éxito!", 
                      "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                    actualizarTabla();
                    limpiarCampos();
                    
                }
                else{
                   JOptionPane.showMessageDialog(this, 
                      "Revise los datos e intente nuevamente. Si el error persiste contacte al Administrador del Sistema.", 
                      "ERROR", JOptionPane.ERROR_MESSAGE); 
                }
            } 
    }//GEN-LAST:event_jb_SuprimirActionPerformed

    private void jb_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_NuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jb_NuevoActionPerformed

    
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
            java.util.logging.Logger.getLogger(FrmExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmExpediente().setVisible(true);
            }
        });
    }
    
    private void llenarTablaExpediente()
    {
         //llenamos la lista
        listaExpedientes = dtE.listarExpediente();
        
        //creamos un arraylist con las columnas del modelo
        ArrayList<Object> listNombreColumnas = new ArrayList<Object>();
        listNombreColumnas.add("expedienteID");
        listNombreColumnas.add("mascotaID");
        listNombreColumnas.add("numeroExpediente");
        listNombreColumnas.add("fechaRegistro");
        listNombreColumnas.add("tipoSangre");
        listNombreColumnas.add("castrado");
        listNombreColumnas.add("estado");

        //Recorremos cada elemento del arraylist y creamos un objeto
        for(Object column : listNombreColumnas){
            //asignamos las columnas al modelo
            myData.addColumn(column);
        }
        
       //Recorremos cada elemento de la lista y creamos el objeto
        for(Expediente dep: listaExpedientes){
            Object[] datosMascota = new Object[]{dep.getExpedienteID(), dep.getMascotaID(), dep.getNumeroExpediente(), dep.getFechaRegistro(), dep.getTipoSangre(), dep.getCastrado(), dep.getEstado()};
            
            //Asignamos un arreglo de objetos a una fila del modelo
            myData.addRow(datosMascota);
        }
        //Asignamos el modelo y/o coleccion de datos a la tabla
        jt_Expediente.setModel(myData);
    }
    
    // Funcion que filtra la tabla
    private void filtrarTabla(){
       trsfiltro.setRowFilter(RowFilter.regexFilter(jtf_buscar.getText(), 2));
    }
    
    //Agrega items al comboBox a partir de una clase
    private void llenarComboMascotas(){
    // Llenamos la lista
    listaMascotas = dtm.listarMascota();
    for(Mascota r: listaMascotas){
            
        // Llenar el combobox con los objetos de la lista
        this.comboBoxMascota.addItem(r);    
        }
    }
    
    // Limpia todos los TextFields
    private void limpiarCampos(){
        this.jtf_IdExpediente.setText("");
        //this.comboBoxExpediente.setText("");
        this.comboBoxMascota.setSelectedIndex(0);
        this.jtf_NumeroExpediente.setText("");
        this.jtf_FechaRegistro.setText("");
        this.jtf_TipoSangre.setText("");
        this.jtf_Castrado.setText("");
        this.jtf_Estado.setText("");
    }
    
    // Actualiza la tabla
    private void actualizarTabla(){
        myData.setColumnCount(0);
        myData.setRowCount(0);
        this.llenarTablaExpediente();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> comboBoxMascota;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Editar;
    private javax.swing.JButton jb_Guardar;
    private javax.swing.JButton jb_Nuevo;
    private javax.swing.JButton jb_Suprimir;
    private javax.swing.JTable jt_Expediente;
    private javax.swing.JTextField jtf_Castrado;
    private javax.swing.JTextField jtf_Estado;
    private javax.swing.JTextField jtf_FechaRegistro;
    private javax.swing.JTextField jtf_IdExpediente;
    private javax.swing.JTextField jtf_NumeroExpediente;
    private javax.swing.JTextField jtf_TipoSangre;
    private javax.swing.JTextField jtf_buscar;
    private entidades.Mascota mascota1;
    // End of variables declaration//GEN-END:variables
}
