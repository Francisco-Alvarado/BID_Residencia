package B_I_D;

import com.placeholder.PlaceHolder;
import conexiondepurada.BidJDBC;
import conexiondepurada.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

//paginación






public class PantallaAdministrador extends javax.swing.JFrame {
    PlaceHolder holder;
           
    public PantallaAdministrador() {
        initComponents();   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBackgroundTitle1 = new org.edisoncor.gui.label.LabelBackgroundTitle();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panel1 = new org.edisoncor.gui.panel.Panel();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        clockDigital1 = new org.edisoncor.gui.varios.ClockDigital();
        jPanel1 = new javax.swing.JPanel();
        txt_Ncontrol = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        buttonRect1 = new org.edisoncor.gui.button.ButtonRect();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistro = new javax.swing.JTable();
        Combo_CveCarrera = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelImage3.setForeground(new java.awt.Color(255, 102, 102));
        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Backgound.png"))); // NOI18N

        panelImage1.setToolTipText("ITNL");
        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoITNL small.png"))); // NOI18N
        panelImage1.setPreferredSize(new java.awt.Dimension(224, 223));
        panelImage1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelMetric1.setText("ADMINISTRADOR");
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("X");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton5.setText("ᶜᵉʳʳᵃʳ");
        jButton5.setToolTipText("cerrar sesion");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(0, 0, 0)
                .addComponent(jButton2)
                .addGap(0, 0, 0)
                .addComponent(jButton1))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMetric1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5)))
        );

        clockDigital1.setForeground(new java.awt.Color(153, 0, 0));
        clockDigital1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txt_Ncontrol.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_Ncontrol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NcontrolKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("N° de Control");

        buttonRect1.setBackground(new java.awt.Color(204, 0, 0));
        buttonRect1.setText("Buscar");
        buttonRect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRect1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Ncontrol, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(buttonRect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonRect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txt_Ncontrol)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        jButton4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton6.setText("Limpiar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tablaRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaRegistro.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nº Control", "Nombre", "Carrera", "Fecha", "Entrada/Salida", "Casillero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaRegistro.setToolTipText("");
        tablaRegistro.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaRegistro.setAutoscrolls(false);
        tablaRegistro.setEnabled(false);
        tablaRegistro.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tablaRegistro);
        if (tablaRegistro.getColumnModel().getColumnCount() > 0) {
            tablaRegistro.getColumnModel().getColumn(0).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(0).setPreferredWidth(65);
            tablaRegistro.getColumnModel().getColumn(1).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(1).setPreferredWidth(180);
            tablaRegistro.getColumnModel().getColumn(2).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(2).setPreferredWidth(48);
            tablaRegistro.getColumnModel().getColumn(3).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(3).setPreferredWidth(140);
            tablaRegistro.getColumnModel().getColumn(4).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(4).setPreferredWidth(90);
            tablaRegistro.getColumnModel().getColumn(5).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(5).setPreferredWidth(55);
        }

        Combo_CveCarrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Combo_CveCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_CveCarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clockDigital1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelImage3Layout.createSequentialGroup()
                        .addGroup(panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelImage3Layout.createSequentialGroup()
                                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                                .addGroup(panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelImage3Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Combo_CveCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage3Layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShadow1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton6))))
                .addGroup(panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelImage3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE))
                    .addGroup(panelImage3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Combo_CveCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(668, 695));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setExtendedState(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_NcontrolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NcontrolKeyTyped
        int limite = 7;
        char validar = evt.getKeyChar();

        if(!Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        }
        
        if(txt_Ncontrol.getText().length() >limite){        
            evt.consume();
       } 
    }//GEN-LAST:event_txt_NcontrolKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
        tablaRegistro.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        tablaRegistro.getColumnModel().getColumn(1).setCellRenderer(Alinear);
        tablaRegistro.getColumnModel().getColumn(2).setCellRenderer(Alinear);
        tablaRegistro.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        tablaRegistro.getColumnModel().getColumn(4).setCellRenderer(Alinear);
        tablaRegistro.getColumnModel().getColumn(5).setCellRenderer(Alinear);     
//          app.setVisible(false);
// app.setVisible(true);
        try {
            actualizarTabla();
                    
     
        
        } catch (SQLException ex) {
            Logger.getLogger(PantallaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        PantAdminIngre.setVisible(true);
        PantAdminIngre.placeHolder();
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
DefaultTableModel modelo = (DefaultTableModel) tablaRegistro.getModel();
        modelo.setRowCount(0);

for (int i = 0; i < tablaRegistro.getRowCount(); i++) {
modelo.removeRow(i);
i-=1;
}

    }//GEN-LAST:event_jButton6ActionPerformed

    private void buttonRect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRect1ActionPerformed
    int matricula = Integer.parseInt(txt_Ncontrol.getText());
        try {
              if (objeto.BuscarEnRegistro(matricula) == true) {
         
                  buscarAlumnoEnTabla(matricula);
              }else{
                   JOptionPane.showMessageDialog(null, "El alumno con la matricula " + matricula + " no ha utilizado casillero");
              }
        } catch (SQLException ex) {
            Logger.getLogger(PantallaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonRect1ActionPerformed

    
    
    private void Combo_CveCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_CveCarreraActionPerformed
        PreparedStatement st = null;
        Connection conn = null;
        ResultSet rs = null;
        String Carrera = Combo_CveCarrera.getSelectedItem().toString();
        
        DefaultTableModel modelo = (DefaultTableModel) tablaRegistro.getModel(); 
        modelo.setRowCount(0);
        
         try {
            conn = (objeto.usercon != null) ? objeto.usercon : Conexion.getConexion();
            st = conn.prepareStatement(
                     "SELECT No_Control, Nombre, Carrera, Fecha, Entrada_Salida, CasilleroID FROM Registros Where Carrera="+Carrera+" ORDER BY Fecha "
            );
            rs = st.executeQuery();
            while (rs.next()) {
                Vector v = new Vector();
                    v.add(rs.getObject(1));
                    v.add(rs.getObject(2));
                    v.add(rs.getObject(3));
                    v.add(rs.getObject(4));
                    v.add(rs.getObject(5));
                    v.add(rs.getObject(6));
                   modelo.addRow(v);
                    tablaRegistro.setModel(modelo);
   
           }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra Carrera");
        }
    }//GEN-LAST:event_Combo_CveCarreraActionPerformed

//Para traer los datos del combo
//String estatus = comboEstatus.getSelectedItem().toString();
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       getCombo_Carreras(Combo_CveCarrera);
    }//GEN-LAST:event_formWindowOpened

        public void getCombo_Carreras(JComboBox combo) {
        PreparedStatement st = null;
        Connection conn = null;
        ResultSet rs = null;
        try{
           conn = (objeto.usercon != null) ? objeto.usercon : Conexion.getConexion();
            st = conn.prepareStatement(
                     "SELECT CveCarrera FROM Carrera ORDER BY IdCarrera "
            );
            rs = st.executeQuery();
            while(rs.next()){
                combo.addItem(rs.getObject(1).toString());
            }
            
            conn.close();
        } catch (SQLException ex) {
            System.out.printf("Error al obtener los nombres de los empleados para ingresarlos al combo SQL");
        } 
    }
        
    
    
    
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
            java.util.logging.Logger.getLogger(PantallaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PantAdmin.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Combo_CveCarrera;
    private org.edisoncor.gui.button.ButtonRect buttonRect1;
    private org.edisoncor.gui.varios.ClockDigital clockDigital1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelBackgroundTitle labelBackgroundTitle1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    public javax.swing.JTable tablaRegistro;
    private javax.swing.JTextField txt_Ncontrol;
    // End of variables declaration//GEN-END:variables


    
    public static PantallaAdministradorIngreso PantAdminIngre = new PantallaAdministradorIngreso();  
    public static PantallaAdministrador PantAdmin = new PantallaAdministrador();
    public  static  BidJDBC  objeto = new BidJDBC(); 
    
     
    DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer(); 
    
    
    
  
      public void actualizarTabla() throws  SQLException{
         PreparedStatement st = null;
        Connection conn = null;
        ResultSet rs = null;
        
        DefaultTableModel modelo = (DefaultTableModel) tablaRegistro.getModel(); 
        modelo.setRowCount(0);
        
         try {
            conn = (objeto.usercon != null) ? objeto.usercon : Conexion.getConexion();
            st = conn.prepareStatement(
                     "SELECT No_Control, Nombre, Carrera, Fecha, Entrada_Salida, CasilleroID FROM Registros ORDER BY Fecha "
            );
            rs = st.executeQuery();
            while (rs.next()) {
                Vector v = new Vector();
                    v.add(rs.getObject(1));
                    v.add(rs.getObject(2));
                    v.add(rs.getObject(3));
                    v.add(rs.getObject(4));
                    v.add(rs.getObject(5));
                    v.add(rs.getObject(6));
                   modelo.addRow(v);
                    tablaRegistro.setModel(modelo);
   
           }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "debugear 2");
        }
    }
    
         public void buscarAlumnoEnTabla(int matricula) throws  SQLException{
         PreparedStatement st = null;
        Connection conn = null;
        ResultSet rs = null;
        int mat = matricula;
        
        DefaultTableModel modelo = (DefaultTableModel) tablaRegistro.getModel(); 
        modelo.setRowCount(0);
        
         try {
            conn = (objeto.usercon != null) ? objeto.usercon : Conexion.getConexion();
            st = conn.prepareStatement(
                     "SELECT No_Control, Nombre, Carrera, Fecha, Entrada_Salida, CasilleroID FROM Registros WHERE No_Control = ' " + mat +"  ' ORDER BY Fecha "
            );
            rs = st.executeQuery();
            while (rs.next()) {
                Vector v = new Vector();
                    v.add(rs.getObject(1));
                    v.add(rs.getObject(2));
                    v.add(rs.getObject(3));
                    v.add(rs.getObject(4));
                    v.add(rs.getObject(5));
                    v.add(rs.getObject(6));
                    modelo.addRow(v);
                    tablaRegistro.setModel(modelo);
    
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "debugear 2");
        }
    }
    
}
