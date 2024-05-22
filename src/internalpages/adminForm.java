/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalpages;

import book_tracker_system.DASHBOARD;
import static com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker.check;
import config.Aconnector;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author lbixt
 */
public class adminForm extends javax.swing.JFrame {

    /**
     * Creates new form adminForm
     */
    public adminForm() {
        initComponents();
         browse.setVisible(false);
    }
    public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;
    
    
    
    public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: ");
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }
    
        public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
     

      
      
      public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
      public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/images", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
      
      
       public void close(){
          this.dispose();
        DASHBOARD dash =new DASHBOARD();
        dash.setVisible(true);
         adminPage ap =new adminPage();
             dash.maindesktop.add(ap).setVisible(true);
    }
       
    Color navcolor =new Color(204,204,204);
    Color headcolor = new Color(204,204,204);
    Color bodycolor = new Color(255,255,255);
    
    int validateRegister(){
        int result;
        if(b_fname.getText().isEmpty()||b_lname.getText().isEmpty()||b_date.getText().isEmpty()||b_num.getText().isEmpty()||pwd.getText().isEmpty()||image.getIcon()== null){
            result = 0;
        }else{
            result = 1;
        }
        return result;   
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
        add = new javax.swing.JPanel();
        st_label = new javax.swing.JLabel();
        b_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        b_fname = new javax.swing.JTextField();
        b_date = new javax.swing.JTextField();
        b_lname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pwd = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        b_num = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        browse = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        image1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LIBRARIAN FORM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        close.setBackground(new java.awt.Color(102, 255, 255));
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        close.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("X");
        close.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 10, -1));

        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 30, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 60));

        add.setBackground(new java.awt.Color(140, 104, 141));
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        st_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        st_label.setText("Label");
        add.add(st_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, 20));

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 210, 40));

        b_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        b_id.setEnabled(false);
        jPanel1.add(b_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 150, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("LAST NAME:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("ADMIN ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("FIRST NAME:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        b_fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        b_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b_fnameKeyTyped(evt);
            }
        });
        jPanel1.add(b_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 150, 40));

        b_date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        b_date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b_dateKeyTyped(evt);
            }
        });
        jPanel1.add(b_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 150, 40));

        b_lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        b_lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b_lnameKeyTyped(evt);
            }
        });
        jPanel1.add(b_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 150, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("(mm-dd-yyyy)");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Ex.(2-1-2001)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        pwd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 150, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("BIRTHDATE:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 90, -1));

        b_num.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        b_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_numActionPerformed(evt);
            }
        });
        b_num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b_numKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b_numKeyTyped(evt);
            }
        });
        jPanel1.add(b_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 150, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("CONTACT NO.:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 110, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("PASSWORD:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 110, -1));

        browse.setBackground(new java.awt.Color(153, 153, 255));
        browse.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        browse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        browse.setText("BROWSE");
        browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                browseMouseClicked(evt);
            }
        });
        jPanel1.add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 210, 60));

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(null);

        image.setBackground(new java.awt.Color(153, 153, 255));
        image.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(image);
        image.setBounds(10, 10, 190, 160);

        image1.setBackground(new java.awt.Color(153, 153, 255));
        image1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(image1);
        image1.setBounds(10, 10, 190, 160);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 210, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
     close();

    }//GEN-LAST:event_closeMouseClicked

    private void b_fnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_fnameKeyTyped
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(!(Character.isAlphabetic(c) || (c == KeyEvent.VK_DELETE) || c== KeyEvent.VK_DELETE)){

            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_b_fnameKeyTyped

    private void b_lnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_lnameKeyTyped
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(!(Character.isAlphabetic(c) || (c == KeyEvent.VK_DELETE) || c== KeyEvent.VK_DELETE)){

            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_b_lnameKeyTyped

    private void b_dateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_dateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_b_dateKeyTyped

    private void b_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_numActionPerformed

    private void b_numKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_numKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_b_numKeyPressed

    private void b_numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_numKeyTyped
        // TODO add your handling code here:

        char c =evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_DELETE) || c== KeyEvent.VK_DELETE)){

            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_b_numKeyTyped
 public String action;
    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        if(action.equals("Add")){
           Aconnector dbc = new Aconnector();
           int check = validateRegister();
           if(check == 1){
           
            int result=0;
            try{

                String sql = "INSERT INTO tbl_admin (firstname, lastname, birthdate, contact, password, image) VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = dbc.connect.prepareStatement(sql);

            pst.setString(1, b_fname.getText());
            pst.setString(2, b_lname.getText());
            pst.setString(3, b_date.getText());        
            pst.setString(4, b_num.getText());
            pst.setString(5, pwd.getText());
            pst.setString(6, destination);
            pst.execute();
                result = 1;
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(Exception e){
                System.out.println("Insert Image Error");
            }

            if(result == 1){
                JOptionPane.showMessageDialog(null, "Successfully Save!");
                close();
                
            }else{
                System.out.println("Saving Data Failed!");
            }
            }else{
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }  
        }else if(action.equals("Update")){
             Aconnector dbc = new Aconnector();
             
            
            try{
               String sql = "UPDATE tbl_admin SET firstname = ?, lastname = ?, birthdate = ?, contact = ?, password = ?, image = ? WHERE admin_id = '"+b_id.getText()+"'"; 

            PreparedStatement pst = dbc.connect.prepareStatement(sql); 

            pst.setString(1, b_fname.getText());
            pst.setString(2, b_lname.getText()); 
            pst.setString(3, b_date.getText()); 
            pst.setString(4,b_num.getText());
            pst.setString(5, pwd.getText());
            pst.setString(6, destination);


                if (destination.isEmpty()) {
                    System.out.println("Destination is Empty!");
                    File existingFile = new File(oldpath);
                    if(existingFile.exists()){
                        existingFile.delete();
                    }
                }else{
                    imageUpdater(oldpath, path);
                    System.out.println("Destination is not Empty!");
                }

                pst.execute();
                close();

                JOptionPane.showMessageDialog(null, "Successfully Updated!");
            }catch(SQLException e){
                System.out.println("Database Connection Error!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No action selected!");
            close();
        }
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(bodycolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(navcolor);
    }//GEN-LAST:event_addMouseExited

    private void browseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseMouseClicked
        browse.setVisible(false);
        image.setIcon(null);
        destination = "";
        path="";
    }//GEN-LAST:event_browseMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
    JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                
                
                
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/images/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            System.out.println(""+destination);
                            browse.setVisible(true);
                            browse.setText("REMOVE");
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }
    }//GEN-LAST:event_jPanel3MouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
     
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        // TODO add your handling code here:
     
    }//GEN-LAST:event_closeMouseExited
 
    
    public void reset(){
        b_id.setText("");
         b_fname.setText("");
          b_lname.setText("");
          b_date.setText("");
          b_num.setText("");
          pwd.setText("");
 
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
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    public javax.swing.JTextField b_date;
    public javax.swing.JTextField b_fname;
    public javax.swing.JTextField b_id;
    public javax.swing.JTextField b_lname;
    public javax.swing.JTextField b_num;
    public javax.swing.JLabel browse;
    private javax.swing.JPanel close;
    public javax.swing.JLabel image;
    public javax.swing.JLabel image1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPasswordField pwd;
    public javax.swing.JLabel st_label;
    // End of variables declaration//GEN-END:variables
}
