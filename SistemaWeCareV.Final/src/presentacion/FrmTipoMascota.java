/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

//Librerias para cargar datos en la tabla
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import entidades.Tipomascota;
import datos.Dt_TipoMascota;
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
public class FrmTipoMascota extends javax.swing.JFrame {
    
    //Atributos
    private Tipomascota Tipomascota = new Tipomascota();
    
    //Declaro las clases de datos
    private Dt_TipoMascota dt_TM = new Dt_TipoMascota();
    
    //Declaro las listas de datos
    private ArrayList<Tipomascota> listaTiposMascotas = new ArrayList<Tipomascota>();
    
    // Entidades
    private Tipomascota tp = new Tipomascota();

    //Declaramos el modelo de datos de la tabla 
    DefaultTableModel myData = new DefaultTableModel();
    
    //Declaramos un filtro de datos para la tabla
    TableRowSorter trsfiltro;
    
    public FrmTipoMascota() {
        initComponents();
        llenarTablaMascota();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf_nombreTipoMascota = new javax.swing.JTextField();
        jtf_descripcion = new javax.swing.JTextField();
        jtf_estado = new javax.swing.JTextField();
        jtf_tipomascotaID = new javax.swing.JTextField();
        jb_Nuevo = new javax.swing.JButton();
        jb_Guardar = new javax.swing.JButton();
        jb_Editar = new javax.swing.JButton();
        jb_Suprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtf_buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Tipomascota = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario Tipo Mascota");
        setBackground(new java.awt.Color(230, 235, 240));

        jPanel1.setBackground(new java.awt.Color(27, 154, 170));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario Tipo Mascota", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo Mascota ID");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre Tipo Mascota");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripcion");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado");

        jtf_nombreTipoMascota.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtf_nombreTipoMascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_nombreTipoMascotaKeyTyped(evt);
            }
        });

        jtf_descripcion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jtf_estado.setEditable(false);
        jtf_estado.setBackground(java.awt.Color.white);
        jtf_estado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jtf_tipomascotaID.setEditable(false);
        jtf_tipomascotaID.setBackground(java.awt.Color.white);
        jtf_tipomascotaID.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_tipomascotaID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtf_descripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(jtf_nombreTipoMascota, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_estado))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_Suprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jb_Nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_Guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_Editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_Suprimir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtf_tipomascotaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtf_nombreTipoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtf_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jLabel1.setText("Buscar:");

        jtf_buscar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtf_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_buscarKeyTyped(evt);
            }
        });

        jt_Tipomascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "tipomascotaID", "nombreTipoMascota", "descripcion", "estado"
            }
        ));
        jt_Tipomascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_TipomascotaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_Tipomascota);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        trsfiltro = new TableRowSorter(jt_Tipomascota.getModel());
        jt_Tipomascota.setRowSorter(trsfiltro);
    }//GEN-LAST:event_jtf_buscarKeyTyped
    
    // Llena las casillas al hacer click en una fila
    private void jt_TipomascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_TipomascotaMouseClicked
        // Obtenemos la fila seleccionada
        int fila = jt_Tipomascota.getSelectedRow();
        
        // Asignamos los valores a los campos del formulario
        jtf_tipomascotaID.setText(jt_Tipomascota.getValueAt(fila, 0).toString());
        jtf_nombreTipoMascota.setText(jt_Tipomascota.getValueAt(fila, 1).toString());
        jtf_descripcion.setText(jt_Tipomascota.getValueAt(fila, 2).toString());
        jtf_estado.setText(jt_Tipomascota.getValueAt(fila, 3).toString());
      
    }//GEN-LAST:event_jt_TipomascotaMouseClicked
    
    // Guarda un nuevo elemento en la tabla
    private void jb_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GuardarActionPerformed
        // Validamos que todos los campos sean ingresados por el usuario      
        if( jtf_nombreTipoMascota.getText().equals("") || jtf_descripcion.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            
            // Construimos nuestro objeto con los valores del formulario
            tp.setNombreTipoMascota(jtf_nombreTipoMascota.getText());
            tp.setDescripcion(jtf_descripcion.getText());
            tp.setEstado(1);
            //tp.setTipomascotaID(jtf_tipomascotaID.getText());
            
            // Validamos que el id no exista en la tabla de la bd
            if(dt_TM.existeTipoMascota(Integer.toString(tp.getTipomascotaID()))){
                JOptionPane.showMessageDialog(this, "El Id de consulta ya existe!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
                jtf_tipomascotaID.setText("");
                jtf_tipomascotaID.grabFocus(); 
            }
            else{
                // Validamos que el metodo guardar devuelve un true
                if(dt_TM.guardarTipoMascota(tp)){
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
        if( jtf_nombreTipoMascota.getText().equals("") || jtf_descripcion.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            // Construimos nuestro objeto con los valores del formulario
            tp.setNombreTipoMascota(jtf_nombreTipoMascota.getText());
            tp.setDescripcion(jtf_descripcion.getText());
            tp.setEstado(2);
            tp.setTipomascotaID(Integer.parseInt(jtf_tipomascotaID.getText()));;

            // Validamos que el metodo editar devuelve un true
            if(dt_TM.editarTipoMascota(tp)){
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

    private void jb_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_NuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jb_NuevoActionPerformed

    private void jb_SuprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SuprimirActionPerformed
        //validamos que todos los campos sean ingresados por el usuario      
        if( jtf_nombreTipoMascota.getText().equals("") || jtf_descripcion.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            // Construimos nuestro objeto con los valores del formulario
            tp.setNombreTipoMascota(jtf_nombreTipoMascota.getText());
            tp.setDescripcion(jtf_descripcion.getText());
            tp.setEstado(3);
            tp.setTipomascotaID(Integer.parseInt(jtf_tipomascotaID.getText()));;

            // Validamos que el metodo editar devuelve un true
            if(dt_TM.editarTipoMascota(tp)){
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
    }//GEN-LAST:event_jb_SuprimirActionPerformed

    private void jtf_nombreTipoMascotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_nombreTipoMascotaKeyTyped
        jtf_nombreTipoMascota.addKeyListener(new KeyAdapter(){
            //Se ejecuta cuando el usuario libera una tecla
            @Override
            public void keyReleased(final KeyEvent e){
                String cadena = (jtf_nombreTipoMascota.getText()).toUpperCase();
                jtf_nombreTipoMascota.setText(cadena);
                repaint();
            }
        });
    }//GEN-LAST:event_jtf_nombreTipoMascotaKeyTyped

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
            java.util.logging.Logger.getLogger(FrmTipoMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTipoMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTipoMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTipoMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTipoMascota().setVisible(true);
            }
        });
    }
    
    // Llena la tabla
    private void llenarTablaMascota()
    {
         //llenamos la lista
        listaTiposMascotas = dt_TM.listarTipoMascota();
        
        //creamos un arraylist con las columnas del modelo
        ArrayList<Object> listNombreColumnas = new ArrayList<Object>();
        listNombreColumnas.add("tipomascotaID");
        listNombreColumnas.add("nombreTipoMascota");
        listNombreColumnas.add("descripcion");
        listNombreColumnas.add("estado");
        
        //Recorremos cada elemento del arraylist y creamos un objeto
        for(Object column : listNombreColumnas){
            //asignamos las columnas al modelo
            myData.addColumn(column);
        }
        
       //Recorremos cada elemento de la lista y creamos el objeto
        for(Tipomascota dep: listaTiposMascotas){
            Object[] datosMascota = new Object[]{dep.getTipomascotaID(), dep.getNombreTipoMascota(), dep.getDescripcion(), dep.getEstado() };
            
            //Asignamos un arreglo de objetos a una fila del modelo
            myData.addRow(datosMascota);
        }
        //Asignamos el modelo y/o coleccion de datos a la tabla
        jt_Tipomascota.setModel(myData);
    }
    
    // Funcion que filtra la tabla
     private void filtrarTabla(){
       trsfiltro.setRowFilter(RowFilter.regexFilter(jtf_buscar.getText(), 1));
    }
     
     // Actualiza la tabla
    private void actualizarTabla(){
        myData.setColumnCount(0);
        myData.setRowCount(0);
        this.llenarTablaMascota();
    }
    
    // Limpia todos los TextFields
    private void limpiarCampos(){
        this.jtf_tipomascotaID.setText("");
        this.jtf_nombreTipoMascota.setText("");
        this.jtf_descripcion.setText("");
        this.jtf_estado.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Editar;
    private javax.swing.JButton jb_Guardar;
    private javax.swing.JButton jb_Nuevo;
    private javax.swing.JButton jb_Suprimir;
    private javax.swing.JTable jt_Tipomascota;
    private javax.swing.JTextField jtf_buscar;
    private javax.swing.JTextField jtf_descripcion;
    private javax.swing.JTextField jtf_estado;
    private javax.swing.JTextField jtf_nombreTipoMascota;
    private javax.swing.JTextField jtf_tipomascotaID;
    // End of variables declaration//GEN-END:variables
}
