package B_I_D;

import B_I_D.PantallaAdministradorIngreso;
import B_I_D.PantallaAlumnoIngreso;
import javax.swing.*;

public class PantallaPrincipal extends javax.swing.JFrame {

    public PantallaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        panel_center = new org.edisoncor.gui.panel.PanelShadow();
        img_logo = new org.edisoncor.gui.panel.PanelImage();
        panel_top = new org.edisoncor.gui.panel.Panel();
        lbl_head = new org.edisoncor.gui.label.LabelMetric();
        btn_close = new javax.swing.JButton();
        btn_min = new javax.swing.JButton();
        btn_ingresarAlum = new org.edisoncor.gui.button.ButtonAction();
        btn_ingresarAdm = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelImage3.setForeground(new java.awt.Color(255, 102, 102));
        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Backgound.png"))); // NOI18N

        panel_center.setBackground(new java.awt.Color(51, 51, 51));

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
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(img_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        panel_centerLayout.setVerticalGroup(
            panel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img_logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lbl_head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_head.setText("BID");
        lbl_head.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        btn_close.setBackground(new java.awt.Color(153, 0, 0));
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

        javax.swing.GroupLayout panel_topLayout = new javax.swing.GroupLayout(panel_top);
        panel_top.setLayout(panel_topLayout);
        panel_topLayout.setHorizontalGroup(
            panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_topLayout.createSequentialGroup()
                .addComponent(lbl_head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_min)
                .addGap(0, 0, 0)
                .addComponent(btn_close))
        );
        panel_topLayout.setVerticalGroup(
            panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_head, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_min, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btn_ingresarAlum.setBackground(new java.awt.Color(153, 0, 0));
        btn_ingresarAlum.setText("ALUMNO");
        btn_ingresarAlum.setDistanciaDeSombra(0);
        btn_ingresarAlum.setFocusPainted(false);
        btn_ingresarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarAlumActionPerformed(evt);
            }
        });

        btn_ingresarAdm.setBackground(new java.awt.Color(153, 0, 0));
        btn_ingresarAdm.setText("ADMINISTRADOR");
        btn_ingresarAdm.setDistanciaDeSombra(0);
        btn_ingresarAdm.setFocusPainted(false);
        btn_ingresarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarAdmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_center, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ingresarAlum, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(btn_ingresarAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panel_top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage3Layout.createSequentialGroup()
                .addComponent(panel_top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 82, Short.MAX_VALUE)
                .addComponent(panel_center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ingresarAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_ingresarAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 194, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btn_ingresarAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarAlumActionPerformed
       PantAlum.setVisible(true);
       PantAlum.placeHolder();
       PantAlum.inicicarFocus();
       this.dispose();
    }//GEN-LAST:event_btn_ingresarAlumActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_btn_minActionPerformed

    private void btn_ingresarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarAdmActionPerformed
       PantAdminIngre.setVisible(true); 
       PantAdminIngre.placeHolder();
       this.dispose();   
    }//GEN-LAST:event_btn_ingresarAdmActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private org.edisoncor.gui.button.ButtonAction btn_ingresarAdm;
    private org.edisoncor.gui.button.ButtonAction btn_ingresarAlum;
    private javax.swing.JButton btn_min;
    private org.edisoncor.gui.panel.PanelImage img_logo;
    private org.edisoncor.gui.label.LabelMetric lbl_head;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelShadow panel_center;
    private org.edisoncor.gui.panel.Panel panel_top;
    // End of variables declaration//GEN-END:variables

    public static PantallaPrincipal PantallaPrin = new PantallaPrincipal();
    public static PantallaAlumnoIngreso PantAlum = new PantallaAlumnoIngreso();
    public static PantallaAdministradorIngreso PantAdminIngre = new PantallaAdministradorIngreso();

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        @Override
        public void run() {
            PantallaPrin.setVisible(true);
        }
    }
    
}
