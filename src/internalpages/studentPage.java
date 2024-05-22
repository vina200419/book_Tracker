/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalpages;

import config.DBConnector;
import java.awt.Color;
import java.awt.print.PrinterException;
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
public class studentPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form newbornPage
     */
    public studentPage() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi =(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    public void searchTable(){
       DefaultTableModel model =  (DefaultTableModel)nb_table.getModel();
       TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
       nb_table.setRowSorter(tr);
       tr.setRowFilter(RowFilter.regexFilter(search.getText().trim()));
    }
       Color navcolor =new Color(204,255,255);
    Color headcolor = new Color(102,255,255);
    Color bodycolor = new Color(255,255,255);
      public void displayData(){
       
        try{
       
            DBConnector dbc = new DBConnector();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_students");
            nb_table.setModel(DbUtils.resultSetToTableModel(rs));
       
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
        jLabel1 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        delet = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        display = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nb_table = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        majorcombo1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("STUDENT DETAILS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

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
        add.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 20));

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 50, 40));

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
        edit.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 20));

        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 50, 40));

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
        delet.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 20));

        jPanel1.add(delet, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 50, 40));

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

        jPanel1.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 70, 40));

        nb_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(nb_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 460, 290));

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
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 160, 50));

        majorcombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12-20-2001", "12-2-2009", "1-9-2001", "2-20-2008", "2-20-2006", "3-9-2004" }));
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
        jPanel1.add(majorcombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 130, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("(BIRTHDATE)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jButton1.setText(" PRINT RECORDS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 150, 40));

        jButton2.setText("PRINT TABLE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 130, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/222.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int rowIndex = nb_table.getSelectedRow();
        if (rowIndex<0){

            JOptionPane.showMessageDialog(null, "Plese select an item");

        }
        else{
            TableModel model = nb_table.getModel();
            PrintForm1 up = new PrintForm1();
            up.b_id.setText("" + model.getValueAt(rowIndex, 0));
            up.b_fname.setText("" + model.getValueAt(rowIndex, 1));
            up.b_lname.setText("" + model.getValueAt(rowIndex, 2));
            up.b_time.setText("" + model.getValueAt(rowIndex, 3));
            up.b_date.setText("" + model.getValueAt(rowIndex, 4));
            up.b_address.setText("" + model.getValueAt(rowIndex, 5));

            JFrame mainJFrame = (JFrame)SwingUtilities.getWindowAncestor(this);
            mainJFrame.dispose();
            up.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void majorcombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_majorcombo1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) nb_table.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        nb_table.setRowSorter(tr);

        String selectedMajor = majorcombo1.getSelectedItem().toString().trim();
        tr.setRowFilter(RowFilter.regexFilter(selectedMajor));
    }//GEN-LAST:event_majorcombo1ActionPerformed

    private void majorcombo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_majorcombo1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_majorcombo1MouseClicked

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        // TODO add your handling code here:
        searchTable();
    }//GEN-LAST:event_searchKeyPressed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void displayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseExited
        // TODO add your handling code here:
        display.setBackground(navcolor);
    }//GEN-LAST:event_displayMouseExited

    private void displayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseEntered
        // TODO add your handling code here:
        display.setBackground(bodycolor);
    }//GEN-LAST:event_displayMouseEntered

    private void displayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) nb_table.getModel();
        TableRowSorter<DefaultTableModel> tr = (TableRowSorter<DefaultTableModel>) nb_table.getRowSorter();

        if (tr != null && tr.getRowFilter() != null) {
            tr.setRowFilter(null); // Remove the existing row filter
        }

        model.fireTableDataChanged();
        displayData();

    }//GEN-LAST:event_displayMouseClicked

    private void deletMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletMouseExited
        // TODO add your handling code here:
        delet.setBackground(navcolor);
    }//GEN-LAST:event_deletMouseExited

    private void deletMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletMouseEntered
        // TODO add your handling code here:
        delet.setBackground(bodycolor);
    }//GEN-LAST:event_deletMouseEntered

    private void deletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletMouseClicked
        // TODO add your handling code here:
        int rowIndex = nb_table.getSelectedRow();
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select a data first");
        }else{
            TableModel model = nb_table.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
            int a=JOptionPane.showConfirmDialog(null,"Are you sure?"+id);
            if(a==JOptionPane.YES_OPTION){
                DBConnector dbc = new DBConnector();
                int B_ID = Integer.parseInt(id);
                dbc.deleteData(B_ID,"tbl_students");
                displayData();
            }
        }
    }//GEN-LAST:event_deletMouseClicked

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        // TODO add your handling code here:
        edit.setBackground(navcolor);
    }//GEN-LAST:event_editMouseExited

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        // TODO add your handling code here:
        edit.setBackground(bodycolor);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        // TODO add your handling code here:
        int rowIndex =nb_table.getSelectedRow();
        if(rowIndex<0){
            JOptionPane.showMessageDialog(null,"Please select an item!");
        }else{
            TableModel model=nb_table.getModel();
            studentFormForm bff=new studentFormForm();
            bff.b_id.setText(""+model.getValueAt(rowIndex,0));
            bff.b_fname.setText(""+model.getValueAt(rowIndex,1));
            bff.b_lname.setText(""+model.getValueAt(rowIndex,2));
            bff.b_address.setText(model.getValueAt(rowIndex,3).toString());

            bff.b_gender.setText(""+model.getValueAt(rowIndex,4));
            bff.b_date.setText(""+model.getValueAt(rowIndex,5));
            bff.setVisible(true);
            bff.action = "Update";
            bff.SAVE.setText("UPDATE");
            JFrame mainFrame =(JFrame) SwingUtilities.getWindowAncestor(this);
            mainFrame.dispose();
        }

    }//GEN-LAST:event_editMouseClicked

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        // TODO add your handling code here:
        add.setBackground(navcolor);
    }//GEN-LAST:event_addMouseExited

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        // TODO add your handling code here:
        add.setBackground(bodycolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        JFrame mainFrame =(JFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
        studentFormForm bf = new studentFormForm();
        bf.setVisible(true);
        this.dispose();
        bf.action = "Add";
        bf.SAVE.setText("SAVE");
    }//GEN-LAST:event_addMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MessageFormat header =new MessageFormat("Records");
        MessageFormat footer =new MessageFormat("LIBRARY BOOK TRACKER SYSTEM");
        try{
            nb_table.print(JTable.PrintMode.FIT_WIDTH, header,footer);

        }
        catch(PrinterException e){
            JOptionPane.showMessageDialog(null,"Cannot be print"+e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
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
    public javax.swing.JTable nb_table;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}