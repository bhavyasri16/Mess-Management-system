
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.YearMonth;
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
public class update_bill extends javax.swing.JFrame {

    /**
     * Creates new form update_bill
     */
    public update_bill() {
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

        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jButton1.setMnemonic('g');
        jButton1.setText("Generate Bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setMnemonic('B');
        jMenu1.setText("Back");
        jMenu1.setActionCommand("");
        jMenu1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenu1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu1ItemStateChanged(evt);
            }
        });
        jMenu1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jMenu1StateChanged(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('L');
        jMenu2.setText("Logout");
        jMenu2.setActionCommand("");
        jMenu2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenu2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu2ItemStateChanged(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int[] roll= new int[100];
        int[] textra= new int[100];
        int bill=0;
        //int[] fine=new int[100];
        //int[] lb=new int[100];
        int reg=0,rows;
	LocalDate localDate = LocalDate.now();
        int month=localDate.getMonthValue();
        if(month==1)
            month=12;
        else
            month--;
        int year=localDate.getYear();
        year=(month==12)?year--:year;
        YearMonth yearMonthObject = YearMonth.of(year, month);
        int d = yearMonthObject.lengthOfMonth();
//2016/11/16
        try
    {
  
        Class.forName("java.sql.Driver");
        java.sql.Connection con;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","bhavyasri");
        Statement stmt; 
                stmt=(Statement)con.createStatement();
        ResultSet rs;
        rs=stmt.executeQuery( "select roll_no from student_info ;");
        rs.beforeFirst();
        int i=0;
        while(rs.next())
        {
            roll[i]=rs.getInt("roll_no");
            i++;
        }
        rows=i;
        rs=stmt.executeQuery("select cost from menu_reg where month="+month+";");
        rs.beforeFirst();
        while(rs.next())
        {
            reg=rs.getInt("cost");
        }
        for(int j=0;j<rows;j++)
        {
            /*rs=stmt.executeQuery("select fine,last_balance from more where roll_no="+roll[j]+";");
            rs.beforeFirst();
            while(rs.next())
            {
                fine[j]=rs.getInt("fine");
                lb[j]=rs.getInt("last_balance");
            }*/
            rs=stmt.executeQuery("select no_of_items,cost from extra_charges "
                    + "where roll_no="+roll[j]+" and (date_e between '"+year+"-"+month+"-01' and '"+year+"-"
                    +month+"-"+d+"');");
            rs.beforeFirst();
            while(rs.next())
            {
                textra[j]+=(rs.getInt("cost")*rs.getInt("no_of_items"));
            }
        }      
        for(int j=0;j<rows;j++)
        {
            bill=reg+textra[j];
            stmt.executeUpdate("insert into bill values("+roll[j]+","+month+","+year+","+reg+","
                    +textra[j]+","+bill+");");
        }
        rs.close();
        JOptionPane.showMessageDialog(rootPane, "Record maintained!", "Success!", JOptionPane.INFORMATION_MESSAGE);
        con.close();
        stmt.close();
        
    }
   catch(Exception e)
    {   
        JOptionPane.showMessageDialog(this,e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu1ItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ItemStateChanged

    private void jMenu2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu2ItemStateChanged
        // TODO add your handling code here:
           login lg=new login();
        lg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu2ItemStateChanged

    private void jMenu1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jMenu1StateChanged
        // TODO add your handling code here:
         admin ad=new admin();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu1StateChanged

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
            java.util.logging.Logger.getLogger(update_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
