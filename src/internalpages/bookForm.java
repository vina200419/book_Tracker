/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalpages;

import book_tracker_system.DASHBOARD;
import config.Apconnector;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author lbixt
 */
public class bookForm extends javax.swing.JFrame {

    /**
     * Creates new form appointmentForm
     */
    public bookForm() {
        initComponents();
    }
      Color navcolor =new Color(102,102,102);
    Color headcolor = new Color(204,204,204);
    Color bodycolor = new Color(255,255,255);
 public void close(){
          this.dispose();
        DASHBOARD dash =new DASHBOARD();
        dash.setVisible(true);
         bookPage ap =new bookPage();
             dash.maindesktop.add(ap).setVisible(true);
    }
  int validateRegister(){
        int result;
        if(b_name.getText().isEmpty()||b_num.getText().isEmpty()||b_neym.getText().isEmpty()){
            result = 0;
        }else{
            result = 1;
        }
        return result;   
        }
        
  public void reset(){
        b_id.setText("");
         b_name.setText("");
          b_num.setText("");
          b_neym.setText("");
         
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
        jLabel2 = new javax.swing.JLabel();
        b_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        b_num = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        b_neym = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        b_name = new javax.swing.JTextField();
        save = new javax.swing.JPanel();
        SAVE = new javax.swing.JLabel();
        clear = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("BORROW BOOK FORM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 40));

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

        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 30, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("BOOK ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 20));

        b_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        b_id.setEnabled(false);
        b_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b_idKeyTyped(evt);
            }
        });
        jPanel1.add(b_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 150, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("BOOK NUMBER:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        b_num.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        b_num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b_numKeyTyped(evt);
            }
        });
        jPanel1.add(b_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 150, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("BOOK NAME:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 110, -1));

        b_neym.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        b_neym.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b_neymKeyTyped(evt);
            }
        });
        jPanel1.add(b_neym, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 150, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("STUDENT NAME:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));

        b_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        b_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b_nameKeyTyped(evt);
            }
        });
        jPanel1.add(b_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 150, 40));

        save.setBackground(new java.awt.Color(102, 255, 255));
        save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveMouseExited(evt);
            }
        });
        save.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SAVE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SAVE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SAVE.setText("SAVE");
        save.add(SAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 30));

        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 80, 50));

        clear.setBackground(new java.awt.Color(102, 255, 255));
        clear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        clear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CLEAR");
        clear.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 30));

        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 80, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_closeMouseClicked

    private void b_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_idKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_b_idKeyTyped

    private void b_numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_numKeyTyped
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_b_numKeyTyped

    private void b_neymKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_neymKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_b_neymKeyTyped

    private void b_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_nameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_b_nameKeyTyped
public String action;
    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        // TODO add your handling code here:
      
        
        
        if(action.equals("Add")){
            Apconnector dbc = new Apconnector();
             int check = validateRegister();
            if(check == 1){
            int result =  dbc.insertData("INSERT INTO tbl_appointment (student_name, book_number, book_name) "
                +"VALUES ('"+b_name.getText()+"','"+b_num.getText()+"','"+b_neym.getText()+ "')");
            if(result==1){
                JOptionPane.showMessageDialog(null,"Successfully Save!!!");
                close();
            }
            }else{
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }  
        }else if(action.equals("Update")){
            Apconnector dbc = new Apconnector();
            dbc.updateData("UPDATE tbl_appointment SET student_name= '"+b_name.getText()+"',book_number='"+b_num.getText()+"', book_name='"+b_neym.getText()+
               "'"
                +"WHERE book_id ='"+b_id.getText()+"'");

            close();
        }else{
            JOptionPane.showMessageDialog(null,"No Action Selected!");
            close();
        }

    }//GEN-LAST:event_saveMouseClicked

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        // TODO add your handling code here:
        save.setBackground(bodycolor);
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        // TODO add your handling code here:
        save.setBackground(navcolor);
    }//GEN-LAST:event_saveMouseExited

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // TODO add your handling code here:
        reset();

    }//GEN-LAST:event_clearMouseClicked

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        // TODO add your handling code here:
        clear.setBackground(bodycolor);
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        // TODO add your handling code here:
        clear.setBackground(navcolor);
    }//GEN-LAST:event_clearMouseExited

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
            java.util.logging.Logger.getLogger(bookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel SAVE;
    public javax.swing.JTextField b_id;
    public javax.swing.JTextField b_name;
    public javax.swing.JTextField b_neym;
    public javax.swing.JTextField b_num;
    public javax.swing.JPanel clear;
    private javax.swing.JPanel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel save;
    // End of variables declaration//GEN-END:variables
}
