
package presentacion;

//Librerias para cargar datos en la tabla
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import entidades.Consulta;
import datos.Dt_Consulta;
import entidades.Expediente;
import datos.Dt_Expediente;
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
public class FrmConsulta extends javax.swing.JFrame {
    
    //Atributos
    private Consulta Consulta = new Consulta();
    private Expediente Expediente = new Expediente();
    
    //Declaro las clases de datos
    private Dt_Consulta dtc = new Dt_Consulta();
    private Dt_Expediente dte = new Dt_Expediente();
    
    //Declaro las listas de datos
    private ArrayList<Consulta> listaConsultas = new ArrayList<Consulta>();
    private ArrayList<Expediente> listaExpedientes = new ArrayList<Expediente>();
    
    //Entidades
    Consulta c = new Consulta();
    Expediente r = new Expediente();
    
    //Declaramos el modelo de datos de la tabla 
    DefaultTableModel myData = new DefaultTableModel(); 
    
    //Declaramos un filtro de datos para la tabla
    TableRowSorter trsfiltro;
    
    public FrmConsulta() {
        initComponents();
        llenarComboExpediente();
        llenarTablaConsulta();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Consulta = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtf_IdConsulta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtf_Seguimiento = new javax.swing.JTextField();
        jtf_EstadoSaludGeneral = new javax.swing.JTextField();
        jtf_Diagnostico = new javax.swing.JTextField();
        jtf_ResultadosExamenes = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtf_FechaConsulta = new javax.swing.JTextField();
        jtf_NombreMedico = new javax.swing.JTextField();
        jtf_Peso = new javax.swing.JTextField();
        jb_Nuevo = new javax.swing.JButton();
        jb_Editar = new javax.swing.JButton();
        jb_Guardar = new javax.swing.JButton();
        jb_Suprimir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jtf_Tratamiento = new javax.swing.JTextField();
        comboBoxExpediente = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jtf_buscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario Consulta");

        jt_Consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "consultaID", "expedienteID", "fechaConsulta", "nombreMedico", "tratamiento", "peso", "estadoSaludGeneral", "diagnostico", "seguimiento", "resultadosExamenes"
            }
        ));
        jt_Consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_ConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_Consulta);

        jPanel1.setBackground(new java.awt.Color(27, 154, 170));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consulta ID");

        jtf_IdConsulta.setEditable(false);
        jtf_IdConsulta.setBackground(java.awt.Color.white);
        jtf_IdConsulta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Expediente ID");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Cosnsulta");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre Medico");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Peso");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Diagnostico");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado Salud General");

        jtf_Seguimiento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jtf_EstadoSaludGeneral.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jtf_Diagnostico.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jtf_ResultadosExamenes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Seguimiento");

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Resultados Examenes");

        jtf_FechaConsulta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtf_FechaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_FechaConsultaActionPerformed(evt);
            }
        });

        jtf_NombreMedico.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtf_NombreMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_NombreMedicoKeyTyped(evt);
            }
        });

        jtf_Peso.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jb_Nuevo.setBackground(new java.awt.Color(255, 102, 51));
        jb_Nuevo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jb_Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        jb_Nuevo.setText("Nuevo");
        jb_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_NuevoActionPerformed(evt);
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

        jb_Guardar.setBackground(new java.awt.Color(255, 102, 51));
        jb_Guardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jb_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        jb_Guardar.setText("Guardar");
        jb_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_GuardarActionPerformed(evt);
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

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tratamiento");

        jtf_Tratamiento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        comboBoxExpediente.setBackground(new java.awt.Color(255, 102, 51));
        comboBoxExpediente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        comboBoxExpediente.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxExpediente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_IdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtf_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtf_NombreMedico, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtf_FechaConsulta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jtf_Tratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addComponent(jtf_EstadoSaludGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                        .addComponent(jtf_Diagnostico))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtf_Seguimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                .addComponent(jtf_ResultadosExamenes))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb_Suprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_Nuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_Editar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_Guardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_IdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(comboBoxExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtf_Seguimiento)
                            .addComponent(jtf_Diagnostico))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_ResultadosExamenes, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(jtf_EstadoSaludGeneral)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb_Nuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_Editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_Guardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_Suprimir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtf_FechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtf_NombreMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6))
                                    .addComponent(jtf_Tratamiento))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("Buscar:");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_FechaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_FechaConsultaActionPerformed
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
        trsfiltro = new TableRowSorter(jt_Consulta.getModel());
        jt_Consulta.setRowSorter(trsfiltro);
    }//GEN-LAST:event_jtf_FechaConsultaActionPerformed

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
        trsfiltro = new TableRowSorter(jt_Consulta.getModel());
        jt_Consulta.setRowSorter(trsfiltro);
    }//GEN-LAST:event_jtf_buscarKeyTyped
    
    // Llena las casillas al hacer click en una fila
    private void jt_ConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_ConsultaMouseClicked
        // Obtenemos la fila seleccionada
        int fila = jt_Consulta.getSelectedRow();
        int idExp = 0; // Guarda el idExpediente que se obtiene de la tabla
        int size = 0; // Guarda la cantidad de elementos que hay en el jcombobx de Locations
        int pos = 1; // Variable de control para recorrer las posiciones de los elementos en el jcombobox

        // Asignamos los valores a los campos del formulario
        jtf_IdConsulta.setText(jt_Consulta.getValueAt(fila, 0).toString());
        //comboBoxExpediente.setSelectedIndex(Integer.parseInt(jt_Consulta.getValueAt(fila,1).toString()));
        jtf_FechaConsulta.setText(jt_Consulta.getValueAt(fila, 2).toString());
        jtf_NombreMedico.setText(jt_Consulta.getValueAt(fila, 3).toString());
        jtf_Tratamiento.setText(jt_Consulta.getValueAt(fila, 4).toString());
        jtf_Peso.setText(jt_Consulta.getValueAt(fila, 5).toString());
        jtf_Diagnostico.setText(jt_Consulta.getValueAt(fila, 7).toString());
        jtf_EstadoSaludGeneral.setText(jt_Consulta.getValueAt(fila, 6).toString());
        jtf_Seguimiento.setText(jt_Consulta.getValueAt(fila, 8).toString());
        jtf_ResultadosExamenes.setText(jt_Consulta.getValueAt(fila, 9).toString());
        
        // Obtenemos el idConsulta del jtable
        idExp = Integer.parseInt(this.jt_Consulta.getValueAt(fila, 1).toString());
        System.out.println("idLoc: "+idExp);
  
        size = this.comboBoxExpediente.getItemCount(); // Obtenemos la cantidad de elementos contenidos en el jcombobox
        System.out.println("size: "+size);
        do{
            
            Expediente = (Expediente)this.comboBoxExpediente.getItemAt(pos);
            if(Expediente.getExpedienteID()==idExp){
                // Selecciono el objeto del jcombobox
                this.comboBoxExpediente.setSelectedIndex(pos);
                System.out.println("pos: "+pos);
                break;
            }
            pos++;
            
        }
        while(pos<=size);
        
    }//GEN-LAST:event_jt_ConsultaMouseClicked
    
    // Guarda una nueva fila
    private void jb_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GuardarActionPerformed

        // Validamos que todos los campos sean ingresados por el usuario      
        if( comboBoxExpediente.getSelectedIndex()==0 ||  jtf_NombreMedico.getText().equals("") || jtf_Peso.getText().equals("") || jtf_Diagnostico.getText().equals("") || jtf_EstadoSaludGeneral.getText().equals("") || jtf_Seguimiento.getText().equals("") || jtf_ResultadosExamenes.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            
            // Construimos nuestro objeto con los valores del formulario
            r = (Expediente)this.comboBoxExpediente.getSelectedItem();
            c.setExpedienteID(r.getExpedienteID());
            
            c.setFechaConsulta(jtf_FechaConsulta.getText());
            c.setNombreMedico(jtf_NombreMedico.getText());
            c.setTratamiento(jtf_Tratamiento.getText());
            c.setPeso(Float.parseFloat(jtf_Peso.getText()));
            c.setEstadoSaludGeneral(jtf_EstadoSaludGeneral.getText());
            c.setDiagnostico(jtf_Diagnostico.getText());
            c.setSeguimiento(jtf_Seguimiento.getText());
            c.setResultadosExamenes(jtf_ResultadosExamenes.getText());
            
            // Validamos que el id no exista en la tabla de la bd
            if(dtc.existeConsulta(Integer.toString(c.getConsultaID()))){
                JOptionPane.showMessageDialog(this, "El Id de consulta ya existe!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
                jtf_IdConsulta.setText("");
                jtf_IdConsulta.grabFocus(); 
            }
            else{
                // Validamos que el metodo guardar devuelve un true
                if(dtc.guardarConsulta(c)){
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
    
    // Edita una fila
    private void jb_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_EditarActionPerformed
        
        //validamos que todos los campos sean ingresados por el usuario      
        if(comboBoxExpediente.getSelectedIndex()==0 ||  jtf_NombreMedico.getText().equals("") || jtf_Peso.getText().equals("") || jtf_Diagnostico.getText().equals("") || jtf_EstadoSaludGeneral.getText().equals("") || jtf_Seguimiento.getText().equals("") || jtf_ResultadosExamenes.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            // Construimos nuestro objeto con los valores del formulario
            c.setConsultaID(Integer.parseInt(jtf_IdConsulta.getText()));
            r = (Expediente)this.comboBoxExpediente.getSelectedItem();
            c.setExpedienteID(r.getExpedienteID());
            c.setFechaConsulta(jtf_FechaConsulta.getText());
            c.setNombreMedico(jtf_NombreMedico.getText());
            c.setTratamiento(jtf_Tratamiento.getText());
            c.setPeso(Float.parseFloat(jtf_Peso.getText()));
            c.setEstadoSaludGeneral(jtf_EstadoSaludGeneral.getText());
            c.setDiagnostico(jtf_Diagnostico.getText());
            c.setSeguimiento(jtf_Seguimiento.getText());
            c.setResultadosExamenes(jtf_ResultadosExamenes.getText());

            // Validamos que el metodo editar devuelve un true
            if(dtc.editarConsulta(c)){
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
    
    // Borra una fila de la tabla
    private void jb_SuprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SuprimirActionPerformed
        // Validamos que todos los campos sean ingresados por el usuario      
        if(comboBoxExpediente.getSelectedIndex()==0 ||  jtf_NombreMedico.getText().equals("") || jtf_Peso.getText().equals("") || jtf_Diagnostico.getText().equals("") || jtf_EstadoSaludGeneral.getText().equals("") || jtf_Seguimiento.getText().equals("") || jtf_ResultadosExamenes.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe seleccionar al menos un registro de la tabla!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            // Construimos nuestro objeto con los valores del formulario
            c.setConsultaID(Integer.parseInt(jtf_IdConsulta.getText()));
            r = (Expediente)this.comboBoxExpediente.getSelectedItem();
            c.setExpedienteID(r.getExpedienteID());
            c.setFechaConsulta(jtf_FechaConsulta.getText());
            c.setNombreMedico(jtf_NombreMedico.getText());
            c.setTratamiento(jtf_Tratamiento.getText());
            c.setPeso(Float.parseFloat(jtf_Peso.getText()));
            c.setEstadoSaludGeneral(jtf_EstadoSaludGeneral.getText());
            c.setDiagnostico(jtf_Diagnostico.getText());
            c.setSeguimiento(jtf_Seguimiento.getText());
            c.setResultadosExamenes(jtf_ResultadosExamenes.getText());

                //validamos que el metodo editar devuelve un true
                if(dtc.deleteConsulta(c)){
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
    
    // Limpia todas las celdas
    private void jb_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_NuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jb_NuevoActionPerformed

    private void jtf_NombreMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_NombreMedicoKeyTyped
        jtf_NombreMedico.addKeyListener(new KeyAdapter(){
            //Se ejecuta cuando el usuario libera una tecla
            @Override
            public void keyReleased(final KeyEvent e){
                String cadena = (jtf_NombreMedico.getText()).toUpperCase();
                jtf_NombreMedico.setText(cadena);
                repaint();
            }
        });
    }//GEN-LAST:event_jtf_NombreMedicoKeyTyped

    
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
            java.util.logging.Logger.getLogger(FrmConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsulta().setVisible(true);
            }
        });
    }
    
    // Funcion que llena la tabla
    private void llenarTablaConsulta()
    {
        //llenamos la lista
        listaConsultas = dtc.listarConsulta();
        
        //creamos un arraylist con las columnas del modelo
        ArrayList<Object> listNombreColumnas = new ArrayList<Object>();
        listNombreColumnas.add("consultaID");
        listNombreColumnas.add("expedienteID");
        listNombreColumnas.add("fechaConsulta");
        listNombreColumnas.add("nombreMedico");
        listNombreColumnas.add("tratamiento");
        listNombreColumnas.add("peso");
        listNombreColumnas.add("estadoSaludGeneral");
        listNombreColumnas.add("diagnostico");
        listNombreColumnas.add("seguimiento");
        listNombreColumnas.add("resultadosExamenes");
        
        //Recorremos cada elemento del arraylist y creamos un objeto
        for(Object column : listNombreColumnas){
            //asignamos las columnas al modelo
            myData.addColumn(column);
        }
        
       //Recorremos cada elemento de la lista y creamos el objeto
        for(Consulta dep: listaConsultas){
            Object[] datosConsulta = new Object[]{dep.getConsultaID(), dep.getExpedienteID(), dep.getFechaConsulta(), dep.getNombreMedico(), dep.getTratamiento(), dep.getPeso(), dep.getEstadoSaludGeneral(), dep.getDiagnostico(), dep.getSeguimiento(), dep.getResultadosExamenes()};
            
            //Asignamos un arreglo de objetos a una fila del modelo
            myData.addRow(datosConsulta);
        }
        //Asignamos el modelo y/o coleccion de datos a la tabla
        jt_Consulta.setModel(myData);
    }
    
    // Funcion que filtra la tabla
     private void filtrarTabla(){
       trsfiltro.setRowFilter(RowFilter.regexFilter(jtf_buscar.getText(), 3));
    }
    
    // Actualiza la tabla
    private void actualizarTabla(){
        myData.setColumnCount(0);
        myData.setRowCount(0);
        this.llenarTablaConsulta();
    }
    
    // Limpia todos los TextFields
    private void limpiarCampos(){
        this.jtf_IdConsulta.setText("");
        this.comboBoxExpediente.setSelectedIndex(0);
        this.jtf_FechaConsulta.setText("");
        this.jtf_NombreMedico.setText("");
        this.jtf_Tratamiento.setText("");
        this.jtf_Peso.setText("");
        this.jtf_EstadoSaludGeneral.setText("");
        this.jtf_Diagnostico.setText("");
        this.jtf_Seguimiento.setText("");
        this.jtf_ResultadosExamenes.setText("");
    }
    
    // LLena el comboBox de Expediente
    private void llenarComboExpediente(){
        // Llenamos la lista
        listaExpedientes = dte.listarExpediente();
        
        for(Expediente exp: listaExpedientes){
            //llenar el combobox con los objetos de la lista
            this.comboBoxExpediente.addItem(exp);
            //this.jcb_locations.addItem(l.toString());
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> comboBoxExpediente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Editar;
    private javax.swing.JButton jb_Guardar;
    private javax.swing.JButton jb_Nuevo;
    private javax.swing.JButton jb_Suprimir;
    private javax.swing.JTable jt_Consulta;
    private javax.swing.JTextField jtf_Diagnostico;
    private javax.swing.JTextField jtf_EstadoSaludGeneral;
    private javax.swing.JTextField jtf_FechaConsulta;
    private javax.swing.JTextField jtf_IdConsulta;
    private javax.swing.JTextField jtf_NombreMedico;
    private javax.swing.JTextField jtf_Peso;
    private javax.swing.JTextField jtf_ResultadosExamenes;
    private javax.swing.JTextField jtf_Seguimiento;
    private javax.swing.JTextField jtf_Tratamiento;
    private javax.swing.JTextField jtf_buscar;
    // End of variables declaration//GEN-END:variables
}
