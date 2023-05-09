/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;
import entidades.Tipoproducto;
import datos.Dt_Tipoproducto;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author Maria Regina
 */
public class FrmTipoproducto extends javax.swing.JFrame {

    /**
     * Creates new form FrmTipoproducto
     */
    
    Tipoproducto tip = new Tipoproducto();
    Dt_Tipoproducto dttip = new Dt_Tipoproducto();
    ArrayList<Tipoproducto> listTipoproducto = new ArrayList<Tipoproducto>();
    DefaultTableModel myData = new DefaultTableModel();
    TableRowSorter trsfiltro;
    
    
    
    
    public FrmTipoproducto() {
        initComponents();
        limpiarCampos();
        llenarTablaTipoproducto();
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
        bnuevo = new javax.swing.JButton();
        bsuprimir = new javax.swing.JButton();
        beditar = new javax.swing.JButton();
        bguardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtf_tipoID = new javax.swing.JTextField();
        jtf_tiponombre = new javax.swing.JTextField();
        jtf_tipodesc = new javax.swing.JTextField();
        jtf_tipoes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablatipo = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jtf_buscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion de los Tipos de Productos");

        jPanel1.setBackground(new java.awt.Color(27, 154, 170));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestión de Tipo de Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        bnuevo.setBackground(new java.awt.Color(255, 102, 51));
        bnuevo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        bnuevo.setForeground(new java.awt.Color(255, 255, 255));
        bnuevo.setText("Nuevo");
        bnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnuevoActionPerformed(evt);
            }
        });

        bsuprimir.setBackground(new java.awt.Color(255, 102, 51));
        bsuprimir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        bsuprimir.setForeground(new java.awt.Color(255, 255, 255));
        bsuprimir.setText("Suprimir");
        bsuprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsuprimirActionPerformed(evt);
            }
        });

        beditar.setBackground(new java.awt.Color(255, 102, 51));
        beditar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        beditar.setForeground(new java.awt.Color(255, 255, 255));
        beditar.setText("Editar");
        beditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditarActionPerformed(evt);
            }
        });

        bguardar.setBackground(new java.awt.Color(255, 102, 51));
        bguardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        bguardar.setForeground(new java.awt.Color(255, 255, 255));
        bguardar.setText("Guardar");
        bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TipoProductoID: ");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripción: ");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estado:");

        jtf_tipoID.setEditable(false);
        jtf_tipoID.setBackground(new java.awt.Color(255, 255, 255));
        jtf_tipoID.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jtf_tiponombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtf_tiponombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_tiponombreKeyTyped(evt);
            }
        });

        jtf_tipodesc.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtf_tipodesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_tipodescKeyTyped(evt);
            }
        });

        jtf_tipoes.setEditable(false);
        jtf_tipoes.setBackground(new java.awt.Color(255, 255, 255));
        jtf_tipoes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jtf_tipoID, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_tipodesc, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_tiponombre, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_tipoes, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(beditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(bsuprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(bguardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_tipoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(bnuevo))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_tiponombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(bguardar))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jtf_tipodesc, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_tipoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(beditar)
                        .addGap(29, 29, 29)
                        .addComponent(bsuprimir)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tablatipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "tipoproductoID", "nombreTipoProducto", "descripcion", "estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablatipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablatipoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablatipo);

        jLabel5.setText("Buscar:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_buscarActionPerformed

    private void bnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnuevoActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_bnuevoActionPerformed

    private void bguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardarActionPerformed
        // TODO add your handling code here:
        if(jtf_tiponombre.getText().equals("") || jtf_tipodesc.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        else{
            //construimos nuestro objeto con los valores del formulario
            tip.setNombreTipoProducto(jtf_tiponombre.getText());
            tip.setDescripcion(jtf_tipodesc.getText());
            
            tip.setEstado(1);
            
            tip.setNombreTipoProducto(jtf_tiponombre.getText());       
        //validamos que el id no exista en la tabla de la bd
            if(dttip.existeTipoproducto(tip)){//*************************************************************************************
                JOptionPane.showMessageDialog(this, "la bodega que intenta ingresar ya existe!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
                
            }
            else{
                //validamos que el metodo guardar devuelve un true
                if(dttip.guardarTipoproducto(tip)){//****************************************************************
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
                                                                     
        
    }//GEN-LAST:event_bguardarActionPerformed

    private void beditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditarActionPerformed
        // TODO add your handling code here:
        //validamos que todos los campos sean ingresados por el usuario      
        if(jtf_tipoID.getText().equals("") ||jtf_tiponombre.getText().equals("") || jtf_tipodesc.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //construimos nuestro objeto con los valores del formulario
            tip.setTipoproductoID(Integer.parseInt(jtf_tipoID.getText()));
            tip.setNombreTipoProducto(jtf_tiponombre.getText());            
            tip.setDescripcion(jtf_tipodesc.getText());
            tip.setEstado(2);
            
                    
            //validamos que el metodo actualizar devuelve un true
            if(dttip.editarTipoproducto(tip)){//**************************************************************************************
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
    }//GEN-LAST:event_beditarActionPerformed

    private void bsuprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsuprimirActionPerformed
        // TODO add your handling code here:
        //validamos que todos los campos sean ingresados por el usuario      
        if(jtf_tiponombre.getText().equals("") || jtf_tipodesc.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //construimos nuestro objeto con los valores del formulario
            tip.setTipoproductoID(Integer.parseInt(jtf_tipoID.getText()));
            tip.setNombreTipoProducto(jtf_tiponombre.getText());
            tip.setDescripcion(jtf_tipodesc.getText());            
            tip.setEstado(3);
            
            //validamos que el metodo delete devuelve un true
            if(dttip.deleteTipoproducto(tip)){

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
        
    }//GEN-LAST:event_bsuprimirActionPerformed

    private void jtf_tiponombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_tiponombreKeyTyped
        // TODO add your handling code here:
        jtf_tiponombre.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(final KeyEvent e){
                String cadena = (jtf_tiponombre.getText()).toUpperCase();
                jtf_tiponombre.setText(cadena);
                repaint();
            }
            
           
            
        });
    }//GEN-LAST:event_jtf_tiponombreKeyTyped

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
        trsfiltro = new TableRowSorter(tablatipo.getModel());
        tablatipo.setRowSorter(trsfiltro); 
    }//GEN-LAST:event_jtf_buscarKeyTyped

    private void tablatipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablatipoMouseClicked
        // TODO add your handling code here:
               //obtenemos la fila seleccionada
        int fila = this.tablatipo.getSelectedRow();

        //asignamos los valores a los campos del formulario
        this.jtf_tipoID.setText(this.tablatipo.getValueAt(fila, 0).toString());
        this.jtf_tiponombre.setText(this.tablatipo.getValueAt(fila,1).toString());
        this.jtf_tipodesc.setText(this.tablatipo.getValueAt(fila, 2).toString());
        this.jtf_tipoes.setText(this.tablatipo.getValueAt(fila, 3).toString());

    }//GEN-LAST:event_tablatipoMouseClicked

    private void jtf_tipodescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_tipodescKeyTyped
        // TODO add your handling code here:
        jtf_tipodesc.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(final KeyEvent e){
                String cadena = (jtf_tipodesc.getText()).toUpperCase();
                jtf_tipodesc.setText(cadena);
                repaint();
            }
 
        });
    }//GEN-LAST:event_jtf_tipodescKeyTyped

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
            java.util.logging.Logger.getLogger(FrmTipoproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTipoproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTipoproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTipoproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTipoproducto().setVisible(true);
            }
        });
    }
    
 //metodos
    

    
    private void actualizarTabla()
    {
        myData.setColumnCount(0);
        myData.setRowCount(0);
        this.llenarTablaTipoproducto();
    }
    
    private void llenarTablaTipoproducto()
    {
         //llenamos la lista
        listTipoproducto = dttip.listarTipoproducto();
        
        //creamos un arraylist con las columnas del modelo
        ArrayList<Object> listNombreColumnas = new ArrayList<Object>();
        listNombreColumnas.add("tipoproductoID");
        listNombreColumnas.add("nombreTipoProducto");
        listNombreColumnas.add("descripcion");
        listNombreColumnas.add("estado");
        //recorremos cada elemento del arraylist y creamos un objeto
        for(Object column : listNombreColumnas){
            //asignamos las columnas al modelo
            myData.addColumn(column);
        }
        
       //recorremos cada elemento de la lista y creamos el objeto
        for(Tipoproducto pro: listTipoproducto){
            Object[] datosbod = new Object[]{pro.getTipoproductoID(), pro.getNombreTipoProducto(),pro.getDescripcion(), pro.getEstado()};
            //asignamos un arreglo de objetos a una fila del modelo
            myData.addRow(datosbod);
        }
        //Asignamos el modelo y/o coleccion de datos a la tabla
        tablatipo.setModel(myData);
    }
    
    private void filtrarTabla(){
       trsfiltro.setRowFilter(RowFilter.regexFilter(jtf_buscar.getText(),1));
    }
    
    private void limpiarCampos()
    {
        this.jtf_tipoID.setText("");
        this.jtf_tiponombre.setText("");
        this.jtf_tipodesc.setText("");
        this.jtf_tipoes.setText("");
       
    }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beditar;
    private javax.swing.JButton bguardar;
    private javax.swing.JButton bnuevo;
    private javax.swing.JButton bsuprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtf_buscar;
    private javax.swing.JTextField jtf_tipoID;
    private javax.swing.JTextField jtf_tipodesc;
    private javax.swing.JTextField jtf_tipoes;
    private javax.swing.JTextField jtf_tiponombre;
    private javax.swing.JTable tablatipo;
    // End of variables declaration//GEN-END:variables
}
