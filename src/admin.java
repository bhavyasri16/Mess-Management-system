
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhavya's
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        label3 = new java.awt.Label();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        logout = new javax.swing.JButton();
        r6 = new javax.swing.JRadioButton();
        r7 = new javax.swing.JRadioButton();
        r8 = new javax.swing.JRadioButton();
        r9 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.red);

        label3.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        label3.setText("Choose any task:");

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        r1.setText("Mess Chart");
        r1.setToolTipText("");
        r1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                r1StateChanged(evt);
            }
        });
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        r2.setText("Extra Diet Chart");
        r2.setToolTipText("");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r3);
        r3.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        r3.setText("Update Extra Diet Charges");
        r3.setToolTipText("");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r4);
        r4.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        r4.setText("Update Guest Charges");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r5);
        r5.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        r5.setText("Bill");
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        buttonGroup1.add(r6);
        r6.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        r6.setText("Add New Admin");
        r6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r7);
        r7.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        r7.setText("Update Personal Info");
        r7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                r7ItemStateChanged(evt);
            }
        });
        r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r8);
        r8.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        r8.setText("Add New Student Record");
        r8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r9);
        r9.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        r9.setText("Update records");
        r9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jRadioButton1.setText("Review Complaints");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        l1.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        l1.setText("Welcome");

        l2.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        l2.setText("User !!");
        l2.setToolTipText("l");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r2)
                            .addComponent(r1)
                            .addComponent(r3)
                            .addComponent(r4)
                            .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(r6)
                                    .addGap(143, 143, 143))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(r9)
                                        .addComponent(jRadioButton1)
                                        .addComponent(r7))
                                    .addGap(40, 40, 40)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 33, Short.MAX_VALUE)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r1)
                        .addComponent(r6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2)
                    .addComponent(r7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3)
                    .addComponent(r8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r4)
                    .addComponent(r9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(r5))
                .addGap(35, 35, 35)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
        
            extra_diet_chart edc=new extra_diet_chart();
          edc.setVisible(true);
          edc.setEnabled(true);
          this.setVisible(false);
        
    }//GEN-LAST:event_r2ActionPerformed
public static int allow=0;
    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        // TODO add your handling code here:
        allow=1;
        add_charges ac=new add_charges();
          ac.setVisible(true);
          this.setVisible(false);
       
    }//GEN-LAST:event_r4ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
       
          add_charges ac=new add_charges();
          ac.setVisible(true);
          this.setVisible(false);
        
    }//GEN-LAST:event_r3ActionPerformed

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
        // TODO add your handling code here:
        bill_category bc=new bill_category();
           bc.setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_r5ActionPerformed

    private void r8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8ActionPerformed
        // TODO add your handling code here:
         new_student ns=new new_student();
            ns.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_r8ActionPerformed
    String pass;
    private void r7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7ActionPerformed
        // TODO add your handling code here:
        update_personal_info upi=new update_personal_info();
           upi.setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_r7ActionPerformed

    private void r7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_r7ItemStateChanged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_r7ItemStateChanged

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Intro ab=new Intro();
        ab.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
         mess_chart mc=new mess_chart();
          mc.setVisible(true);
          mc.setEnabled(true);
          this.setVisible(false);
          
    }//GEN-LAST:event_r1ActionPerformed

    private void r6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6ActionPerformed
        // TODO add your handling code here:
        new_admin na=new new_admin();
           na.setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_r6ActionPerformed

    private void r1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_r1StateChanged
        // TODO add your handling code here:
          
    }//GEN-LAST:event_r1StateChanged

    private void r9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9ActionPerformed
        // TODO add your handling code here:
        update_bill ub= new update_bill();
        ub.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_r9ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        complaint cc=new complaint();
        cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel l1;
    public javax.swing.JLabel l2;
    private java.awt.Label label3;
    private javax.swing.JButton logout;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JRadioButton r7;
    private javax.swing.JRadioButton r8;
    private javax.swing.JRadioButton r9;
    // End of variables declaration//GEN-END:variables
}