package B_I_D;

import BID_MAIN.*;
import com.panamahitek.ArduinoException;
import com.placeholder.PlaceHolder;
import conexiondepurada.BidJDBC;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jssc.SerialPortException;

public final class PantallaAlumnoIngreso extends javax.swing.JFrame {

    PlaceHolder holder;

    public PantallaAlumnoIngreso() {
        initComponents();
        inicicarFocus();
   
        placeHolder();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        panel_center = new org.edisoncor.gui.panel.PanelShadow();
        img_logo = new org.edisoncor.gui.panel.PanelImage();
        panel_bottom = new org.edisoncor.gui.panel.PanelShadow();
        btn_ingresar = new org.edisoncor.gui.button.ButtonAction();
        lbl_pregunta = new javax.swing.JLabel();
        lbl_registrar = new javax.swing.JLabel();
        panelImage6 = new org.edisoncor.gui.panel.PanelImage();
        txt_contrasena = new javax.swing.JTextField();
        panelImage7 = new org.edisoncor.gui.panel.PanelImage();
        panelImage9 = new org.edisoncor.gui.panel.PanelImage();
        txt_usuario = new javax.swing.JTextField();
        panelImage10 = new org.edisoncor.gui.panel.PanelImage();
        panel_top = new org.edisoncor.gui.panel.Panel();
        lbl_head = new org.edisoncor.gui.label.LabelMetric();
        btn_close = new javax.swing.JButton();
        btn_min = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        clockDigital1 = new org.edisoncor.gui.varios.ClockDigital();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelImage3.setForeground(new java.awt.Color(255, 102, 102));
        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Backgound.png"))); // NOI18N

        img_logo.setToolTipText("ITNL");
        img_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/itnl.png"))); // NOI18N
        img_logo.setPreferredSize(new java.awt.Dimension(224, 223));
        img_logo.setRequestFocusEnabled(false);

        javax.swing.GroupLayout img_logoLayout = new javax.swing.GroupLayout(img_logo);
        img_logo.setLayout(img_logoLayout);
        img_logoLayout.setHorizontalGroup(
            img_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );
        img_logoLayout.setVerticalGroup(
            img_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_centerLayout = new javax.swing.GroupLayout(panel_center);
        panel_center.setLayout(panel_centerLayout);
        panel_centerLayout.setHorizontalGroup(
            panel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_centerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_centerLayout.setVerticalGroup(
            panel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img_logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel_bottom.setDistance(0);
        panel_bottom.setDoubleBuffered(false);

        btn_ingresar.setBackground(new java.awt.Color(153, 0, 0));
        btn_ingresar.setText("Ingresar");
        btn_ingresar.setDistanciaDeSombra(0);
        btn_ingresar.setFocusPainted(false);
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        lbl_pregunta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_pregunta.setForeground(new java.awt.Color(0, 153, 153));
        lbl_pregunta.setText("¿No estás registrado?,");
        lbl_pregunta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl_registrar.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        lbl_registrar.setForeground(new java.awt.Color(0, 153, 153));
        lbl_registrar.setText("click aqui");
        lbl_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_registrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_registrarMouseClicked(evt);
            }
        });

        panelImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/campo.png"))); // NOI18N

        txt_contrasena.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_contrasena.setBorder(null);
        txt_contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contrasenaActionPerformed(evt);
            }
        });
        txt_contrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_contrasenaKeyTyped(evt);
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
                .addComponent(txt_contrasena)
                .addContainerGap())
        );
        panelImage6Layout.setVerticalGroup(
            panelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelImage7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelImage9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/campo.png"))); // NOI18N

        txt_usuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_usuario.setBorder(null);
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyTyped(evt);
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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelImage9Layout = new javax.swing.GroupLayout(panelImage9);
        panelImage9.setLayout(panelImage9Layout);
        panelImage9Layout.setHorizontalGroup(
            panelImage9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImage10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_usuario)
                .addContainerGap())
        );
        panelImage9Layout.setVerticalGroup(
            panelImage9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelImage10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_bottomLayout = new javax.swing.GroupLayout(panel_bottom);
        panel_bottom.setLayout(panel_bottomLayout);
        panel_bottomLayout.setHorizontalGroup(
            panel_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_ingresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelImage6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelImage9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_bottomLayout.createSequentialGroup()
                        .addComponent(lbl_pregunta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_bottomLayout.setVerticalGroup(
            panel_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bottomLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(panelImage9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelImage6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_registrar)
                    .addComponent(lbl_pregunta))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        lbl_head.setText("INGRESO DE ALUMNO");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_center, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_bottom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage3Layout.createSequentialGroup()
                .addComponent(panel_top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 46, Short.MAX_VALUE)
                .addComponent(panel_center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(panel_bottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        // si uno de los dos campos (usuaro y contraseña) 
        //no se ha modificado envia un mensaje con la leyenda "Campo Vacío" y no realiza la acción
        if ("Credencial / NºControl".equals(txt_usuario.getText()) || "●●●".equals(txt_contrasena.getText())) {
            JOptionPane.showMessageDialog(null, "Campo vacío");
            
        } else {
            //convertimos el usuario y la contraseña en variables tipo entero para poder llamar al metodo
            int usuario = Integer.parseInt(txt_usuario.getText());
            int contrasena = Integer.parseInt(txt_contrasena.getText());
            
            try {//intenta la siguiente instrucción si por alguna razón falla manta un mensaje con error de conexión
                //se realiza una busqueda en la tabla Alumnos (nuestra tabla BID) 
                //si el alumno se encuentra registrado en BID proceden los siguientes pasos
                if (objeto.BuscarEnAlumnos(usuario, contrasena) == true) {
                    txt_usuario.setText("");                                                       //INSTRUCCIÓN 1: se borra el texto de los campos (usuario y contraseña)
                    txt_contrasena.setText("");
                    placeHolder();                                                                       //INSTRUCCIÓN 4: Devuelve a los campos el placeholder con el que contaban (Credencial / NºControl & ●●●)
                    this.dispose();                                                                      //INSTRUCCIÓN 5: cierra esta ventana
                    IngreLogic.AsignarEntradaOSalidaLogica(usuario);//INSTRUCCIÓN 2: LLAMA A UN METODO Y DETERMINA SI ES UNA ENTRADA O UNA SALIDA
                    PantPrinc.setVisible(true);                                              //INSTRUCCIÓN 3: muestra la pantalla principal
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se establece la conexión"
                        + e.getMessage(), "Error de Conexión", JOptionPane.ERROR_MESSAGE);
            } catch (ArduinoException | SerialPortException ex) {
                Logger.getLogger(PantallaAlumnoIngreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void lbl_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_registrarMouseClicked
        if (!"Credencial / NºControl".equals(txt_usuario.getText())
                || !"●●●".equals(txt_contrasena.getText())) {
            txt_contrasena.setText("");
            holder = new PlaceHolder(txt_contrasena, "●●●");
            pantAlumReg.setVisible(true);
            this.dispose();
        } else {
            pantAlumReg.setVisible(true);
            this.dispose();
        }    
    }//GEN-LAST:event_lbl_registrarMouseClicked

    private void txt_contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contrasenaActionPerformed
        btn_ingresar.requestFocus();
        btn_ingresarActionPerformed(evt);
    }//GEN-LAST:event_txt_contrasenaActionPerformed

    private void txt_contrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contrasenaKeyTyped
        char validar = evt.getKeyChar();
        int limite = 4;
 /*
        if(Character.getNumericValue(validar) == 0){
            getToolkit().beep();
            evt.consume();
        }*/
        
       if (!Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
       
        if (txt_contrasena.getText().length() >= limite) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_contrasenaKeyTyped

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        txt_contrasena.requestFocus();
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyTyped
        int limite = 7;
        
        
        char validar = evt.getKeyChar();
        

        if (!Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }

        if (txt_usuario.getText().length() > limite) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_usuarioKeyTyped

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_btn_minActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        if (!"Credencial / NºControl".equals(txt_usuario.getText())
                || !"●●●".equals(txt_contrasena.getText())) {
            txt_contrasena.setText("");
            holder = new PlaceHolder(txt_contrasena, "●●●");
            PantPrinc.setVisible(true);
            this.dispose();
        } else {
            PantPrinc.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaAlumnoIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaAlumnoIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaAlumnoIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaAlumnoIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PantAlumIngre.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_close;
    private org.edisoncor.gui.button.ButtonAction btn_ingresar;
    private javax.swing.JButton btn_min;
    private org.edisoncor.gui.varios.ClockDigital clockDigital1;
    private org.edisoncor.gui.panel.PanelImage img_logo;
    private org.edisoncor.gui.label.LabelMetric lbl_head;
    private javax.swing.JLabel lbl_pregunta;
    private javax.swing.JLabel lbl_registrar;
    private org.edisoncor.gui.panel.PanelImage panelImage10;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage6;
    private org.edisoncor.gui.panel.PanelImage panelImage7;
    private org.edisoncor.gui.panel.PanelImage panelImage9;
    private org.edisoncor.gui.panel.PanelShadow panel_bottom;
    private org.edisoncor.gui.panel.PanelShadow panel_center;
    private org.edisoncor.gui.panel.Panel panel_top;
    private javax.swing.JTextField txt_contrasena;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    public static PantallaPrincipal PantPrinc = new PantallaPrincipal();
    public static PantallaAlumnoRegistro pantAlumReg = new PantallaAlumnoRegistro();
    public static IngresoLogica IngreLogic = new IngresoLogica();
    public static BidJDBC objeto = new BidJDBC();
    public static PantallaAlumnoIngreso PantAlumIngre = new PantallaAlumnoIngreso();

    public void placeHolder() {
        holder = new PlaceHolder(txt_usuario, "Credencial / NºControl");
        holder = new PlaceHolder(txt_contrasena, "●●●");
    }

    private void asignarCasillero() {
        int casillero;
        casillero = (int) Math.floor(Math.random() * 9 + 1);

        JOptionPane.showMessageDialog(null, "Su casillero es " + casillero);
    }

    public void inicicarFocus() {
            txt_usuario.requestFocus();
    }


}
