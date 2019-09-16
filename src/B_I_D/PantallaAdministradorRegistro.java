package B_I_D;

import com.placeholder.PlaceHolder;
import javax.swing.JOptionPane;

public class PantallaAdministradorRegistro extends javax.swing.JFrame {
    
    PlaceHolder holder;
    
    public PantallaAdministradorRegistro() {
        initComponents();
         placeHolder();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelShadow2 = new org.edisoncor.gui.panel.PanelShadow();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        panelImage6 = new org.edisoncor.gui.panel.PanelImage();
        txt_contrasenaReg = new javax.swing.JTextField();
        panelImage7 = new org.edisoncor.gui.panel.PanelImage();
        panelImage9 = new org.edisoncor.gui.panel.PanelImage();
        txt_usuarioReg = new javax.swing.JTextField();
        panelImage10 = new org.edisoncor.gui.panel.PanelImage();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_informacion = new javax.swing.JTextArea();
        panel_top = new org.edisoncor.gui.panel.Panel();
        lbl_head = new org.edisoncor.gui.label.LabelMetric();
        btn_close = new javax.swing.JButton();
        btn_min = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        clockDigital1 = new org.edisoncor.gui.varios.ClockDigital();
        panel_info = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelImage3.setForeground(new java.awt.Color(255, 102, 102));
        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Backgound.png"))); // NOI18N

        panelImage1.setToolTipText("ITNL");
        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/itnl.png"))); // NOI18N
        panelImage1.setPreferredSize(new java.awt.Dimension(224, 223));
        panelImage1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelShadow2.setDistance(0);
        panelShadow2.setDoubleBuffered(false);

        buttonAction1.setBackground(new java.awt.Color(153, 0, 0));
        buttonAction1.setText("Registrarse");
        buttonAction1.setDistanciaDeSombra(0);
        buttonAction1.setFocusPainted(false);
        buttonAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction1ActionPerformed(evt);
            }
        });

        panelImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/campo.png"))); // NOI18N

        txt_contrasenaReg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_contrasenaReg.setBorder(null);
        txt_contrasenaReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_contrasenaRegMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt_contrasenaRegMouseReleased(evt);
            }
        });
        txt_contrasenaReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contrasenaRegActionPerformed(evt);
            }
        });
        txt_contrasenaReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_contrasenaRegKeyTyped(evt);
            }
        });

        panelImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/key-id.png"))); // NOI18N

        javax.swing.GroupLayout panelImage7Layout = new javax.swing.GroupLayout(panelImage7);
        panelImage7.setLayout(panelImage7Layout);
        panelImage7Layout.setHorizontalGroup(
            panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        panelImage7Layout.setVerticalGroup(
            panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelImage6Layout = new javax.swing.GroupLayout(panelImage6);
        panelImage6.setLayout(panelImage6Layout);
        panelImage6Layout.setHorizontalGroup(
            panelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImage7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_contrasenaReg)
                .addContainerGap())
        );
        panelImage6Layout.setVerticalGroup(
            panelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelImage7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_contrasenaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelImage9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/campo.png"))); // NOI18N

        txt_usuarioReg.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txt_usuarioReg.setBorder(null);
        txt_usuarioReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioRegActionPerformed(evt);
            }
        });
        txt_usuarioReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usuarioRegKeyTyped(evt);
            }
        });

        panelImage10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user-id.png"))); // NOI18N

        javax.swing.GroupLayout panelImage10Layout = new javax.swing.GroupLayout(panelImage10);
        panelImage10.setLayout(panelImage10Layout);
        panelImage10Layout.setHorizontalGroup(
            panelImage10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        panelImage10Layout.setVerticalGroup(
            panelImage10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelImage9Layout = new javax.swing.GroupLayout(panelImage9);
        panelImage9.setLayout(panelImage9Layout);
        panelImage9Layout.setHorizontalGroup(
            panelImage9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImage10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_usuarioReg)
                .addContainerGap())
        );
        panelImage9Layout.setVerticalGroup(
            panelImage9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelImage9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelImage10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_usuarioReg, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/campoBig.png"))); // NOI18N

        jScrollPane1.setBorder(null);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txt_informacion.setEditable(false);
        txt_informacion.setColumns(1);
        txt_informacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_informacion.setForeground(new java.awt.Color(102, 102, 102));
        txt_informacion.setLineWrap(true);
        txt_informacion.setRows(5);
        txt_informacion.setTabSize(5);
        txt_informacion.setText("Consulta con el administrador  el nombre de usuarios disponibles");
        txt_informacion.setToolTipText("");
        txt_informacion.setWrapStyleWord(true);
        txt_informacion.setAutoscrolls(false);
        txt_informacion.setBorder(null);
        txt_informacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt_informacion.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txt_informacion.setEnabled(false);
        txt_informacion.setSelectionColor(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(txt_informacion);
        txt_informacion.setWrapStyleWord(true);

        txt_informacion.setEnabled(true);

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelShadow2Layout = new javax.swing.GroupLayout(panelShadow2);
        panelShadow2.setLayout(panelShadow2Layout);
        panelShadow2Layout.setHorizontalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonAction1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(panelImage6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelImage9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow2Layout.setVerticalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(panelImage9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelImage6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_head.setText("REGISTRO DE ADMINISTRADOR");
        lbl_head.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        btn_close.setBackground(new java.awt.Color(204, 0, 0));
        btn_close.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_close.setForeground(new java.awt.Color(0, 0, 0));
        btn_close.setText("X");
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        btn_min.setBackground(new java.awt.Color(51, 51, 51));
        btn_min.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_min.setForeground(new java.awt.Color(0, 0, 0));
        btn_min.setText("-");
        btn_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(51, 51, 51));
        btn_back.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(0, 0, 0));
        btn_back.setText("←");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_topLayout = new javax.swing.GroupLayout(panel_top);
        panel_top.setLayout(panel_topLayout);
        panel_topLayout.setHorizontalGroup(
            panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(btn_back)
                .addGap(0, 0, 0)
                .addComponent(btn_min)
                .addGap(0, 0, 0)
                .addComponent(btn_close))
        );
        panel_topLayout.setVerticalGroup(
            panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_head, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_min, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_back)
        );

        clockDigital1.setForeground(new java.awt.Color(153, 0, 0));
        clockDigital1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel1.setText("Contraseña de solo 3 caracteres.");

        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N

        javax.swing.GroupLayout panelImage4Layout = new javax.swing.GroupLayout(panelImage4);
        panelImage4.setLayout(panelImage4Layout);
        panelImage4Layout.setHorizontalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        panelImage4Layout.setVerticalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_infoLayout = new javax.swing.GroupLayout(panel_info);
        panel_info.setLayout(panel_infoLayout);
        panel_infoLayout.setHorizontalGroup(
            panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_infoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelImage4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_infoLayout.setVerticalGroup(
            panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelShadow2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage3Layout.createSequentialGroup()
                .addComponent(panel_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage3Layout.createSequentialGroup()
                .addComponent(panel_top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panel_info.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction1ActionPerformed
       PantAdminIngre.setVisible(true);
        this.dispose();
        mensajeRegistro();
    }//GEN-LAST:event_buttonAction1ActionPerformed

    private void txt_contrasenaRegMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_contrasenaRegMouseReleased
       // showInfo();
    }//GEN-LAST:event_txt_contrasenaRegMouseReleased

    private void txt_contrasenaRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contrasenaRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contrasenaRegActionPerformed

    private void txt_contrasenaRegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contrasenaRegKeyTyped
        int limite = 3;
        if(txt_contrasenaReg.getText().length() >= limite){
            showInfo();
            evt.consume();
        }else{
            panel_info.setVisible(false);
        }
    }//GEN-LAST:event_txt_contrasenaRegKeyTyped

    private void txt_usuarioRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioRegActionPerformed

    private void txt_usuarioRegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioRegKeyTyped
        int limite = 7;
        char validar = evt.getKeyChar();

        if(!Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        }
        if(txt_usuarioReg.getText().length() >limite){
            evt.consume();
        }
    }//GEN-LAST:event_txt_usuarioRegKeyTyped

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_btn_minActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        PantAdminIngre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_contrasenaRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_contrasenaRegMouseClicked
    panel_info.setVisible(true);     
    }//GEN-LAST:event_txt_contrasenaRegMouseClicked

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
            java.util.logging.Logger.getLogger(PantallaAdministradorRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaAdministradorRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaAdministradorRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaAdministradorRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PantAdminRegis.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_min;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private org.edisoncor.gui.varios.ClockDigital clockDigital1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric lbl_head;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage10;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelImage panelImage6;
    private org.edisoncor.gui.panel.PanelImage panelImage7;
    private org.edisoncor.gui.panel.PanelImage panelImage9;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    private org.edisoncor.gui.panel.PanelShadow panelShadow2;
    private javax.swing.JPanel panel_info;
    private org.edisoncor.gui.panel.Panel panel_top;
    private javax.swing.JTextField txt_contrasenaReg;
    private javax.swing.JTextArea txt_informacion;
    private javax.swing.JTextField txt_usuarioReg;
    // End of variables declaration//GEN-END:variables

    public static PantallaAdministradorIngreso  PantAdminIngre = new PantallaAdministradorIngreso();
    public static PantallaAdministradorRegistro PantAdminRegis = new PantallaAdministradorRegistro();
    
    private void showInfo() {
        panel_info.setVisible(true);
    }

    private void placeHolder() {
        panel_info.setVisible(false);
        holder = new PlaceHolder(txt_usuarioReg, "Credencial / NºControl");
        holder = new PlaceHolder(txt_contrasenaReg, "●●●");        
    }

    void mensajeRegistro() {
         JOptionPane.showMessageDialog(null, "Registrado con exito");
    }
}
