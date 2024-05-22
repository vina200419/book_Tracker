/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalpages;

import config.Aconnector;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author lbixt
 */
public class adminPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form adminPage
     */
    public adminPage() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
  Color navcolor =new Color(204,255,255);
    Color headcolor = new Color(102,255,255);
    Color bodycolor = new Color(255,255,255);
    public void searchTable(){
       DefaultTableModel model =  (DefaultTableModel)admin_table.getModel();
       TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
       admin_table.setRowSorter(tr);
       tr.setRowFilter(RowFilter.regexFilter(search.getText().trim()));
    }
     public void displayData(){
       
        try{
       
            Aconnector dbc = new Aconnector();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_admin");
            admin_table.setModel(DbUtils.resultSetToTableModel(rs));
             DefaultTableModel model = (DefaultTableModel) admin_table.getModel();
            
            
       rs.close();
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex);
       
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        admin_table = new javax.swing.JTable();
        add = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        delet = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        display = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        majorcombo1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        admin_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(admin_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 470, 310));

        add.setBackground(new java.awt.Color(204, 255, 255));
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD");
        add.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, 20));

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 40));

        edit.setBackground(new java.awt.Color(204, 255, 255));
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EDIT");
        edit.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, 20));

        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 60, 40));

        delet.setBackground(new java.awt.Color(204, 255, 255));
        delet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        delet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletMouseExited(evt);
            }
        });
        delet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DELETE");
        delet.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, 20));

        jPanel1.add(delet, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 60, 40));

        display.setBackground(new java.awt.Color(204, 255, 255));
        display.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                displayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                displayMouseExited(evt);
            }
        });
        display.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("REFRESH");
        display.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, 20));

        jPanel1.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 70, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("LIBRARIAN DETAILS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        search.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 180, 50));

        majorcombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12-20-2001", "12-2-2009", "1-9-2001", "3-20-2008", "2-20-2006", "3-9-2004" }));
        majorcombo1.setToolTipText("");
        majorcombo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                majorcombo1MouseClicked(evt);
            }
        });
        majorcombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                majorcombo1ActionPerformed(evt);
            }
        });
        jPanel1.add(majorcombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 150, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("(BIRTHDATE)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jButton1.setText(" PRINT RECORDS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 150, 40));

        jButton2.setText("PRINT TABLE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 110, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-admin-50.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
JFrame mainFrame =(JFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
        adminForm bf = new adminForm();
        bf.setVisible(true);     
        bf.action = "Add";  
        bf.st_label.setText("SAVE");
 bf.browse.setVisible(false);
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        // TODO add your handling code here:
        add.setBackground(bodycolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        // TODO add your handling code here:
        add.setBackground(navcolor);
    }//GEN-LAST:event_addMouseExited

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
       
        /*  int rowIndex = admin_table.getSelectedRow();
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please Select an Item!");
        }else{
            TableModel model = admin_table.getModel();
            
            adminForm stf = new adminForm();
            stf.b_id.setText(""+model.getValueAt(rowIndex, 0));
            String sid = model.getValueAt(rowIndex, 0).toString();
            try{
            Aconnector dbc = new Aconnector();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_admin WHERE admin_id = '"+sid+"' ");
            if(rs.next()){
            stf.b_fname.setText(rs.getString("firstname"));
            stf.b_lname.setText(rs.getString("lastname"));
            stf.b_date.setText(rs.getString("birthdate"));
            stf.b_num.setText(rs.getString("contact"));
            stf.pwd.setText(rs.getString("password"));
            stf.imageBytes = rs.getBytes("image");
            
            stf.person_image = rs.getBytes("image");
            stf.image_display.setIcon(stf.ResizeImage(null, rs.getBytes("image")));
               
            stf.setVisible(true);
            stf.action = "Update";
           
            JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            mainFrame.dispose();
            }else{
                System.out.println("No Data Found");
            }
            }catch(SQLException w){
                System.out.println(""+w);
            }
        }
       */
        
        /*int rowIndex = admin_table.getSelectedRow();
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please Select an Item!");
        }else{
            TableModel model = admin_table.getModel();
            adminForm stf = new adminForm();
            
            try{
                Aconnector dbc = new Aconnector();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_admin WHERE admin_id ="+model.getValueAt(rowIndex, 0));
                
            
                if(rs.next()){
                     stf.b_id.setText(""+rs.getString("admin_id"));
            stf.b_fname.setText(rs.getString("firstname"));
            stf.b_lname.setText(rs.getString("lastname"));
            stf.b_date.setText(rs.getString("birthdate"));
            stf.b_num.setText(rs.getString("contact"));
            stf.pwd.setText(rs.getString("password"));
           
                stf.image.setIcon(stf.ResizeImage(rs.getString("image"), null, stf.image));
                stf.oldpath = rs.getString("image");
                stf.path = rs.getString("image");
                stf.destination = rs.getString("image");
                System.out.println(""+stf.destination);
                
                stf.setVisible(true);
                stf.action = "Update";
                stf.st_label.setText("UPDATE");
                stf.browse.setText("REMOVE");
                JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                mainFrame.dispose();
                
                if(rs.getString("image").isEmpty()){
                    stf.image.setVisible(false);
                }else{
                    stf.image.setVisible(true);
                }

            }

           
            }catch(SQLException e){
                System.out.println("Database Error Connection!");
            
            }
            
       
}
*/
        
           int rowIndex = admin_table.getSelectedRow();
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please Select an Item!");
        }else{
            TableModel model = admin_table.getModel();
            adminForm stf = new adminForm();
            
            try{
                Aconnector dbc = new Aconnector();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_admin WHERE admin_id ="+model.getValueAt(rowIndex, 0));
                
            if(rs.next()){
                stf.b_id.setText(""+rs.getString("admin_id"));
                stf.b_fname.setText(""+rs.getString("firstname"));
                stf.b_lname.setText(""+rs.getString("lastname"));                         
                stf.b_date.setText(rs.getString("birthdate"));
                stf.b_num.setText(rs.getString("contact"));
                stf.pwd.setText(rs.getString("password"));
                
                stf.image.setIcon(stf.ResizeImage(rs.getString("image"), null, stf.image));
                stf.oldpath = rs.getString("image");
                stf.path = rs.getString("image");
                stf.destination = rs.getString("image");
                System.out.println(""+stf.destination); 
                stf.setVisible(true);
                stf.action = "Update";
                stf.st_label.setText("UPDATE");
                stf.browse.setText("REMOVE");
                JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                mainFrame.dispose();
                
                if(rs.getString("image").isEmpty()){
                    stf.browse.setVisible(false);
                }else{
                    stf.browse.setVisible(true);
                }
            }         
            }catch(SQLException e){
                System.out.println("Database Error Connection!");          
            }      
       }
                   
    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        // TODO add your handling code here:
        edit.setBackground(bodycolor);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        // TODO add your handling code here:
        edit.setBackground(navcolor);
    }//GEN-LAST:event_editMouseExited

    private void deletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletMouseClicked
        // TODO add your handling code here:
      
        /*int rowIndex = admin_table.getSelectedRow();
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select a data first");
        }else{
            TableModel model = admin_table.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
            int a=JOptionPane.showConfirmDialog(null,"Are you sure?"+id);
            if(a==JOptionPane.YES_OPTION){
                Aconnector dbc = new Aconnector();
                int B_ID = Integer.parseInt(id);
                dbc.deleteData(B_ID,"tbl_admin");
                displayData();
            }
        }
*/
        
             int rowIndex = admin_table.getSelectedRow();
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select data first from the table!");
        }else{
            TableModel model = admin_table.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
            int a = JOptionPane.showConfirmDialog(null, "Are you sure to delete ID: "+id);
            if(a == JOptionPane.YES_OPTION){
                Aconnector dbc = new Aconnector();
                int s_id = Integer.parseInt(id);
                
                
                try{
               ResultSet rs = dbc.getData("SELECT * FROM tbl_admin WHERE admin_id ="+id);
                
                    if(rs.next()){
                       adminForm stf = new adminForm();
                       String oldpath = rs.getString("image");
                       File existingFile = new File(oldpath);
                        if (existingFile.exists()) {
                            existingFile.delete();
                        }
           

                   }
                }catch(SQLException e){
                    System.out.println("Error !");
                }
                
                dbc.deleteData(s_id, "tbl_admin", "admin_id");
                displayData();
            }
        }
    }//GEN-LAST:event_deletMouseClicked

    private void deletMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletMouseEntered
        // TODO add your handling code here:
        delet.setBackground(bodycolor);
    }//GEN-LAST:event_deletMouseEntered

    private void deletMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletMouseExited
        // TODO add your handling code here:
        delet.setBackground(navcolor);
    }//GEN-LAST:event_deletMouseExited

    private void displayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseClicked
        // TODO add your handling code here:
            DefaultTableModel model = (DefaultTableModel) admin_table.getModel();
    TableRowSorter<DefaultTableModel> tr = (TableRowSorter<DefaultTableModel>) admin_table.getRowSorter();

    if (tr != null && tr.getRowFilter() != null) {
        tr.setRowFilter(null); // Remove the existing row filter
    }
    
    model.fireTableDataChanged(); 
        displayData();
    }//GEN-LAST:event_displayMouseClicked

    private void displayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseEntered
        // TODO add your handling code here:
        display.setBackground(bodycolor);
    }//GEN-LAST:event_displayMouseEntered

    private void displayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseExited
        // TODO add your handling code here:
        display.setBackground(navcolor);
    }//GEN-LAST:event_displayMouseExited

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        // TODO add your handling code here:
        searchTable();
    }//GEN-LAST:event_searchKeyPressed

    private void majorcombo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_majorcombo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_majorcombo1MouseClicked

    private void majorcombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_majorcombo1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) admin_table.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        admin_table.setRowSorter(tr);

        String selectedMajor = majorcombo1.getSelectedItem().toString().trim();
        tr.setRowFilter(RowFilter.regexFilter(selectedMajor));
    }//GEN-LAST:event_majorcombo1ActionPerformed

    private void admin_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_admin_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int rowIndex = admin_table.getSelectedRow();
        if (rowIndex<0){

            JOptionPane.showMessageDialog(null, "Plese select an item");

        }
        else{
            TableModel model = admin_table.getModel();
            PrintForm4 up = new PrintForm4();
            up.b_id.setText("" + model.getValueAt(rowIndex, 0));
            up.b_fname.setText("" + model.getValueAt(rowIndex, 1));
            up.b_lname.setText("" + model.getValueAt(rowIndex, 2));
            up.b_time.setText("" + model.getValueAt(rowIndex, 3));
            up.b_num.setText("" + model.getValueAt(rowIndex, 4));
          
            JFrame mainJFrame = (JFrame)SwingUtilities.getWindowAncestor(this);
            mainJFrame.dispose();
            up.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_searchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MessageFormat header =new MessageFormat("Records");
        MessageFormat footer =new MessageFormat("BIRTH CENTER CLINIC");
        try{
            admin_table.print(JTable.PrintMode.FIT_WIDTH, header,footer);

        }
        catch(PrinterException e){
            JOptionPane.showMessageDialog(null,"Cannot be print"+e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    public static javax.swing.JTable admin_table;
    private javax.swing.JPanel delet;
    private javax.swing.JPanel display;
    private javax.swing.JPanel edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox<String> majorcombo1;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
