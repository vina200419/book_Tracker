/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalpages;

import book_tracker_system.DASHBOARD;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lbixt
 */
public class PrintForm1 extends javax.swing.JFrame {

    /**
     * Creates new form PrintForm
     */
    public PrintForm1() {
        initComponents();
    }
     public void close(){
          this.dispose();
        DASHBOARD dash =new DASHBOARD();
        dash.setVisible(true);
         studentPage ap =new studentPage();
             dash.maindesktop.add(ap).setVisible(true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        b_id = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        b_fname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        b_lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        b_time = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        b_date = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        b_address = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("STUDENT PRINTING ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        close.setBackground(new java.awt.Color(102, 255, 255));
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        close.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("X");
        close.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 10, -1));

        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 30, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("REFERENCE ID NO.:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 150, 20));

        jButton1.setText("ADD RECORD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, -1, 60));

        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 100, 60));

        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 90, 60));

        b_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        b_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_idActionPerformed(evt);
            }
        });
        b_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b_idKeyTyped(evt);
            }
        });
        jPanel1.add(b_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 100, 30));

        textarea.setColumns(20);
        textarea.setRows(5);
        textarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane3.setViewportView(textarea);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 370, 400));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("FIRST NAME:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, 20));

        b_fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        b_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b_fnameKeyTyped(evt);
            }
        });
        jPanel1.add(b_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 140, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("LAST NAME:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, -1));

        b_lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        b_lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b_lnameKeyTyped(evt);
            }
        });
        jPanel1.add(b_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 140, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("GENDER:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        b_time.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        b_time.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b_timeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b_timeKeyTyped(evt);
            }
        });
        jPanel1.add(b_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 140, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("(mm-dd-yyyy)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Ex.(2-1-2001)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("DATE OF BIRTH:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 280, 150, 20));

        b_date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        b_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_dateActionPerformed(evt);
            }
        });
        b_date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b_dateKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b_dateKeyTyped(evt);
            }
        });
        jPanel1.add(b_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 140, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("PLACE OF BIRTH:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 130, 20));

        b_address.setColumns(20);
        b_address.setRows(5);
        b_address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        b_address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b_addressKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(b_address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 140, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        close();
     
    }//GEN-LAST:event_closeMouseClicked

    private void b_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_idActionPerformed

    private void b_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_idKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_b_idKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        b_id.setText("");
        b_fname.setText("");
        b_lname.setText("");
          b_time.setText("");
         b_date.setText("");
        
         b_address.setText("");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            textarea.print();
        } catch (PrinterException ex) {
            Logger.getLogger(PrintForm1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        textarea.append("\t\t STUDENT RECORD: \n\n"+
                                
                 "Reference ID No:\t\t"+b_id.getText()+ 
                
                "\n=================================================\n"+
                
                "First Name:\t\t\t"+b_fname.getText()+"\n\n"+
                "Last Name:\t\t\t"+b_lname.getText()+"\n\n"+
                "Date of Birth:\t\t\t"+b_time.getText()+"\n\n"+
                "Gender:\t\t\t"+b_date.getText()+"\n\n"+
                
                
                "Place of Birth:\t\t\t"+b_address.getText()+"\n"+
                
                 "============================================"
                
        );
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b_fnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_fnameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_b_fnameKeyTyped

    private void b_lnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_lnameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_b_lnameKeyTyped

    private void b_timeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_timeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_timeKeyPressed

    private void b_timeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_timeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_b_timeKeyTyped

    private void b_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_dateActionPerformed

    private void b_dateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_dateKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_dateKeyPressed

    private void b_dateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_dateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_b_dateKeyTyped

    private void b_addressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_addressKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_b_addressKeyTyped

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
            java.util.logging.Logger.getLogger(PrintForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintForm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea b_address;
    public javax.swing.JTextField b_date;
    public javax.swing.JTextField b_fname;
    public javax.swing.JTextField b_id;
    public javax.swing.JTextField b_lname;
    public javax.swing.JTextField b_time;
    private javax.swing.JPanel close;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea textarea;
    // End of variables declaration//GEN-END:variables
}
