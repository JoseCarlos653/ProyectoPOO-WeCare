
package presentacion;

//Librerias para cargar datos en la tabla
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import entidades.Mascota;
import datos.Dt_Mascota;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import entidades.Tipomascota;
import datos.Dt_TipoMascota;
import javax.swing.JOptionPane;

//Librerias para el Metodo de Buscar
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;
import presentacion.FrmExpediente;


/**
 *
 * @author Emanuel Leite
 */
public class FrmMascota extends javax.swing.JFrame {
    
    //Atributos
    private Mascota Mascota = new Mascota();
    private Tipomascota tp = new Tipomascota();
    
    //Declaro las clases de datos
    private Dt_Mascota dtm = new Dt_Mascota();
    private Dt_TipoMascota dt_tm = new Dt_TipoMascota();
    
    //Declaro las listas de datos
    private ArrayList<Mascota> listaMascotas = new ArrayList<Mascota>();
    private ArrayList<Tipomascota> listEspecies = new ArrayList<Tipomascota>();
    
    //Declaramos el modelo de datos de la tabla 
    DefaultTableModel myData = new DefaultTableModel();
    
    //Entidades
    Mascota m = new Mascota();
    
    //Declaramos un filtro de datos para la tabla
    TableRowSorter trsfiltro;


    public FrmMascota() {
        initComponents();
        llenarTablaMascota();
        llenarComboTipoMascota();
        limpiarCampos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Mascota = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_IdMascota = new javax.swing.JTextField();
        jtf_IdCliente = new javax.swing.JTextField();
        jtf_Sexo = new javax.swing.JTextField();
        jtf_Color = new javax.swing.JTextField();
        jtf_Raza = new javax.swing.JTextField();
        jtf_FechaNacimiento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtf_Nombre = new javax.swing.JTextField();
        comboBoxTipoMascota = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtf_Edad = new javax.swing.JTextField();
        ButtonNuevo = new javax.swing.JToggleButton();
        ButtonGuardar = new javax.swing.JToggleButton();
        ButtonEditar = new javax.swing.JToggleButton();
        ButonSuprimir = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        jtf_buscar = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario Mascota");

        jt_Mascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Sexo", "Especie", "Raza", "Color", "Fecha de Nacimiento"
            }
        ));
        jt_Mascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_MascotaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_Mascota);

        jPanel1.setBackground(new java.awt.Color(27, 154, 170));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario Mascota", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(27, 154, 170));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Mascota");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Cliente");

        jtf_IdMascota.setEditable(false);
        jtf_IdMascota.setBackground(java.awt.Color.white);
        jtf_IdMascota.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtf_IdMascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_IdMascotaKeyTyped(evt);
            }
        });

        jtf_IdCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtf_IdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_IdClienteKeyTyped(evt);
            }
        });

        jtf_Sexo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jtf_Color.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jtf_Raza.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jtf_FechaNacimiento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sexo");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Especie");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Raza");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Color");

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha de Nacimiento");

        jtf_Nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtf_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_NombreKeyTyped(evt);
            }
        });

        comboBoxTipoMascota.setBackground(new java.awt.Color(255, 102, 51));
        comboBoxTipoMascota.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        comboBoxTipoMascota.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxTipoMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        comboBoxTipoMascota.setToolTipText("");

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edad");

        jtf_Edad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_IdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_IdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_Nombre)
                            .addComponent(jtf_Sexo))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxTipoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_Color)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtf_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtf_Edad)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_FechaNacimiento))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jtf_IdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_IdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jtf_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtf_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jtf_FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxTipoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        ButtonNuevo.setBackground(new java.awt.Color(255, 102, 51));
        ButtonNuevo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        ButtonNuevo.setForeground(new java.awt.Color(255, 255, 255));
        ButtonNuevo.setText("Nuevo");
        ButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNuevoActionPerformed(evt);
            }
        });

        ButtonGuardar.setBackground(new java.awt.Color(255, 102, 51));
        ButtonGuardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        ButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonGuardar.setText("Guardar");
        ButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGuardarActionPerformed(evt);
            }
        });

        ButtonEditar.setBackground(new java.awt.Color(255, 102, 51));
        ButtonEditar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        ButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEditar.setText("Editar");
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });

        ButonSuprimir.setBackground(new java.awt.Color(255, 102, 51));
        ButonSuprimir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        ButonSuprimir.setForeground(new java.awt.Color(255, 255, 255));
        ButonSuprimir.setText("Suprimir");
        ButonSuprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonSuprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButonSuprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(ButtonNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonGuardar)
                .addGap(8, 8, 8)
                .addComponent(ButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButonSuprimir)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setText("Buscar:");

        jtf_buscar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtf_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_buscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        trsfiltro = new TableRowSorter(jt_Mascota.getModel());
        jt_Mascota.setRowSorter(trsfiltro);
    }//GEN-LAST:event_jtf_buscarKeyTyped
    
    //Autollena el text de ID Mascota
    private void jtf_IdMascotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_IdMascotaKeyTyped
        // TODO add your handling code here:
        jtf_IdMascota.addKeyListener(new KeyAdapter(){
            
            //Se ejecuta cuando el usuario libera una tecla
            @Override
            public void keyReleased(final KeyEvent e){
                String cadena = (jtf_IdMascota.getText()).toUpperCase();
                jtf_IdMascota.setText(cadena);
                repaint();
            }
        });
    }//GEN-LAST:event_jtf_IdMascotaKeyTyped
    
    //Autollena el textField de ID Cliente
    private void jtf_IdClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_IdClienteKeyTyped
        // TODO add your handling code here:
        jtf_IdCliente.addKeyListener(new KeyAdapter(){
            //Se ejecuta cuando el usuario libera una tecla
            @Override
            public void keyReleased(final KeyEvent e){
                String cadena = (jtf_IdCliente.getText()).toUpperCase();
                jtf_IdCliente.setText(cadena);
                repaint();
            }
        });
    }//GEN-LAST:event_jtf_IdClienteKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tp = (Tipomascota)this.comboBoxTipoMascota.getSelectedItem();
        JOptionPane.showMessageDialog(null, "ID:  "+ tp.getTipomascotaID());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGuardarActionPerformed
        // Validamos que todos los campos sean ingresados por el usuario      
        if( comboBoxTipoMascota.getSelectedIndex()==0 || jtf_IdCliente.getText().equals("") || jtf_Nombre.getText().equals("") || jtf_Sexo.getText().equals("") || jtf_Edad.getText().equals("") || jtf_Raza.getText().equals("") || jtf_Color.getText().equals("") || jtf_FechaNacimiento.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            
            // Construimos nuestro objeto con los valores del formulario
            tp = (Tipomascota)this.comboBoxTipoMascota.getSelectedItem();
            m.setEspecie(tp.getNombreTipoMascota());
            
            m.setTipomascotaID(tp.getTipomascotaID());
            m.setClienteID(Integer.parseInt(jtf_IdCliente.getText()));
            m.setNombrePaciente(jtf_Nombre.getText().toString());
            m.setSexo(Integer.parseInt(jtf_Sexo.getText()));
            m.setEdad(Integer.parseInt(jtf_Edad.getText()));
            m.setRaza(jtf_Raza.getText().toString());
            m.setColor(jtf_Color.getText().toString());
            m.setFechaNacimiento(jtf_FechaNacimiento.getText().toString());
            
            // Validamos que el id no exista en la tabla de la bd
            if(dtm.existeMascota(Integer.toString(m.getMascotaID()))){
                JOptionPane.showMessageDialog(this, "El Id de consulta ya existe!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
                jtf_IdMascota.setText("");
                jtf_IdMascota.grabFocus(); 
            }
            else{
                // Validamos que el metodo guardar devuelve un true
                if(dtm.guardarMascota(m)){
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
    }//GEN-LAST:event_ButtonGuardarActionPerformed
    
    // Al hacer click en una fila, se llenan automaticamente los valores en los TextFields
    private void jt_MascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_MascotaMouseClicked
        // Obtenemos la fila seleccionada
        int fila = jt_Mascota.getSelectedRow();
        String tipoMascota; // Guarda el tipo de mascota que se obtiene de la tabla
        int size = 0; // Guarda la cantidad de elementos que hay en el jcombobx de Locations
        int pos = 1; // Variable de control para recorrer las posiciones de los elementos en el jcombobox

        // Asignamos los valores a los campos del formulario
        jtf_IdMascota.setText(jt_Mascota.getValueAt(fila, 0).toString()); 
        jtf_IdCliente.setText(jt_Mascota.getValueAt(fila, 1).toString());
        jtf_Nombre.setText(jt_Mascota.getValueAt(fila, 3).toString());
        jtf_Sexo.setText(jt_Mascota.getValueAt(fila, 4).toString());
        jtf_Edad.setText(jt_Mascota.getValueAt(fila, 5).toString());
        //comboBoxEspecie.setSelectedIndex(Integer.parseInt(jt_Mascota.getValueAt(fila,4).toString()));
        jtf_Raza.setText(jt_Mascota.getValueAt(fila, 7).toString());
        jtf_Color.setText(jt_Mascota.getValueAt(fila, 8).toString());
        jtf_FechaNacimiento.setText(jt_Mascota.getValueAt(fila, 9).toString());
        
        // Obtenemos el nombre del Tipo de Mascota del jtable
        tipoMascota = this.jt_Mascota.getValueAt(fila, 6).toString();
  
        size = this.comboBoxTipoMascota.getItemCount(); // Obtenemos la cantidad de elementos contenidos en el jcombobox
        do{    
            tp = (Tipomascota)this.comboBoxTipoMascota.getItemAt(pos);
            if(tp.getNombreTipoMascota() == null ? tipoMascota == null : tp.getNombreTipoMascota().equals(tipoMascota)){
                // Selecciono el objeto del jcombobox
                this.comboBoxTipoMascota.setSelectedIndex(pos);
                break;
            }
            pos++;
            
        }
        while(pos<=size);
    }//GEN-LAST:event_jt_MascotaMouseClicked

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        //validamos que todos los campos sean ingresados por el usuario      
        if(comboBoxTipoMascota.getSelectedIndex()==0 || jtf_IdCliente.getText().equals("") || jtf_Nombre.getText().equals("") || jtf_Sexo.getText().equals("") || jtf_Edad.getText().equals("") || jtf_Raza.getText().equals("") || jtf_Color.getText().equals("") || jtf_FechaNacimiento.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //Construimos nuestro objeto con los valores del formulario
            tp = (Tipomascota)this.comboBoxTipoMascota.getSelectedItem();
            m.setEspecie(tp.getNombreTipoMascota());
            
            m.setMascotaID(Integer.parseInt(jtf_IdMascota.getText()));
            m.setTipomascotaID(tp.getTipomascotaID());
            m.setClienteID(Integer.parseInt(jtf_IdCliente.getText()));
            m.setNombrePaciente(jtf_Nombre.getText().toString());
            m.setSexo(Integer.parseInt(jtf_Sexo.getText()));
            m.setEdad(Integer.parseInt(jtf_Edad.getText()));
            m.setRaza(jtf_Raza.getText().toString());
            m.setColor(jtf_Color.getText().toString());
            m.setFechaNacimiento(jtf_FechaNacimiento.getText().toString());

            // Validamos que el metodo editar devuelve un true
            if(dtm.editarMascota(m)){
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
    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void ButonSuprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonSuprimirActionPerformed
        // Validamos que todos los campos sean ingresados por el usuario      
        if(comboBoxTipoMascota.getSelectedIndex()==0 || jtf_IdCliente.getText().equals("") || jtf_Nombre.getText().equals("") || jtf_Sexo.getText().equals("") || jtf_Edad.getText().equals("") || jtf_Raza.getText().equals("") || jtf_Color.getText().equals("") || jtf_FechaNacimiento.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            // Construimos nuestro objeto con los valores del formulario
            tp = (Tipomascota)this.comboBoxTipoMascota.getSelectedItem();
            m.setEspecie(tp.getNombreTipoMascota());
            
            m.setMascotaID(Integer.parseInt(jtf_IdMascota.getText()));
            m.setTipomascotaID(tp.getTipomascotaID());
            m.setClienteID(Integer.parseInt(jtf_IdCliente.getText()));
            m.setNombrePaciente(jtf_Nombre.getText().toString());
            m.setSexo(Integer.parseInt(jtf_Sexo.getText()));
            m.setEdad(Integer.parseInt(jtf_Edad.getText()));
            m.setRaza(jtf_Raza.getText().toString());
            m.setColor(jtf_Color.getText().toString());
            m.setFechaNacimiento(jtf_FechaNacimiento.getText().toString());

                // Validamos que el metodo editar devuelve un true
                if(dtm.deleteMascota(m)){
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
    }//GEN-LAST:event_ButonSuprimirActionPerformed

    private void ButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_ButtonNuevoActionPerformed

    private void jtf_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_NombreKeyTyped

        jtf_Nombre.addKeyListener(new KeyAdapter(){
            //Se ejecuta cuando el usuario libera una tecla
            @Override
            public void keyReleased(final KeyEvent e){
                String cadena = (jtf_Nombre.getText()).toUpperCase();
                jtf_Nombre.setText(cadena);
                repaint();
            }
        });
    }//GEN-LAST:event_jtf_NombreKeyTyped
    
    
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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMascota().setVisible(true);
            }
        });
    }
    
    // Funcion que llena la tabla
     private void llenarTablaMascota()
    {
         //llenamos la lista
        listaMascotas = dtm.listarMascota();
        
        //creamos un arraylist con las columnas del modelo
        ArrayList<Object> listNombreColumnas = new ArrayList<Object>();
        listNombreColumnas.add("mascotaID");
        listNombreColumnas.add("clienteID");
        listNombreColumnas.add("tipomascotaID");
        listNombreColumnas.add("nombrePaciente");
        listNombreColumnas.add("sexo");
        listNombreColumnas.add("edad");
        listNombreColumnas.add("especie");
        listNombreColumnas.add("raza");
        listNombreColumnas.add("color");
        listNombreColumnas.add("fechaNacimiento");
        
        //Recorremos cada elemento del arraylist y creamos un objeto
        for(Object column : listNombreColumnas){
            //asignamos las columnas al modelo
            myData.addColumn(column);
        }
        
       //Recorremos cada elemento de la lista y creamos el objeto
        for(Mascota dep: listaMascotas){
            Object[] datosMascota = new Object[]{dep.getMascotaID(), dep.getClienteID(), dep.getTipomascotaID(), dep.getNombrePaciente(), dep.getSexo(), dep.getEdad(), dep.getEspecie(), dep.getRaza(), dep.getColor(), dep.getFechaNacimiento()};
            
            //Asignamos un arreglo de objetos a una fila del modelo
            myData.addRow(datosMascota);
        }
        //Asignamos el modelo y/o coleccion de datos a la tabla
        jt_Mascota.setModel(myData);
    }
     
    // Funcion que filtra la tabla
     private void filtrarTabla(){
       trsfiltro.setRowFilter(RowFilter.regexFilter(jtf_buscar.getText(), 3));
    }
     
    // Funcion para limpiar los campos
     private void limpiarCampos(){
        this.jtf_IdCliente.setText("");
        this.jtf_IdMascota.setText("");
        this.jtf_Color.setText("");
        //this.jtf_Especie.setText("");
        this.jtf_FechaNacimiento.setText("");
        this.jtf_IdCliente.setText("");
        this.jtf_IdMascota.setText("");
        //this.jtf_IdTipoMascota.setText("");
        this.jtf_Nombre.setText("");
        this.jtf_Raza.setText("");
        this.jtf_Sexo.setText("");
        
        //this.jtf_buscar.setText("");
        //this.jcb_region.setSelectedIndex(0);
    }
     
     // Funcion para llenar los items del comboBox
     private void llenarComboTipoMascota(){
        // Llenamos la lista
        listEspecies = dt_tm.listarTipoMascota();
        
        for(Tipomascota r: listEspecies){
            
            // Llenar el combobox con los objetos de la lista
            this.comboBoxTipoMascota.addItem(r);    
        }
        
    }
     
     // Actualiza la tabla
    private void actualizarTabla(){
        myData.setColumnCount(0);
        myData.setRowCount(0);
        this.llenarTablaMascota();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ButonSuprimir;
    private javax.swing.JToggleButton ButtonEditar;
    private javax.swing.JToggleButton ButtonGuardar;
    private javax.swing.JToggleButton ButtonNuevo;
    private javax.swing.JComboBox<Object> comboBoxTipoMascota;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jt_Mascota;
    private javax.swing.JTextField jtf_Color;
    private javax.swing.JTextField jtf_Edad;
    private javax.swing.JTextField jtf_FechaNacimiento;
    private javax.swing.JTextField jtf_IdCliente;
    private javax.swing.JTextField jtf_IdMascota;
    private javax.swing.JTextField jtf_Nombre;
    private javax.swing.JTextField jtf_Raza;
    private javax.swing.JTextField jtf_Sexo;
    private javax.swing.JTextField jtf_buscar;
    // End of variables declaration//GEN-END:variables
}
