package frame;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import tubes.ClickAnimationLabel;
import tubes.Koneksi;

/**
 * 
 * 
 */
public class profile extends javax.swing.JFrame {
    Font f = new Font("Helvetica Rounded", Font.BOLD, 15);
     private int userID; 
    /**
     * Creates new form Profile
     */
   public profile(int userID) {
    initComponents();
    this.userID = userID;
    populateFieldsFromDatabase(userID);
    logout = new ClickAnimationLabel(new javax.swing.ImageIcon(getClass().getResource("/asset/Group 7.png")));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, 160, -1));

        // Replace the standard JLabel with ClickAnimationLabel for the savedata label
        savedata = new ClickAnimationLabel(new javax.swing.ImageIcon(getClass().getResource("/asset/Group 15.png")));
        savedata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savedata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savedataMouseClicked(evt);
            }
        });
        getContentPane().add(savedata, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, -1, -1));
}


    private void populateFieldsFromDatabase(int userID) {
        try {
            Connection conn = Koneksi.getKoneksi();
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM account WHERE id = ?");
            pstmt.setInt(1, userID);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String usernameValue = rs.getString("username");
                String passwordValue = rs.getString("password");
                String idValue = rs.getString("id");
                
                username.setText(usernameValue);
                password.setText(passwordValue);
                id.setText(idValue);
            }

            rs.close();
            pstmt.close();
            } catch (SQLException ex) {
            ex.printStackTrace();
            }
    
    }

        
    
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        savedata = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        aboutbtn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setEditable(false);
        id.setFont(f);
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setCaretColor(new java.awt.Color(255, 255, 255));
        id.setOpaque(false);
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 440, 30));

        password.setEditable(false);
        password.setFont(f);
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setCaretColor(new java.awt.Color(255, 255, 255));
        password.setOpaque(false);
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 440, 30));

        username.setEditable(false);
        username.setFont(f);
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setCaretColor(new java.awt.Color(255, 255, 255));
        username.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        username.setOpaque(false);
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 440, 30));

        savedata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Group 15.png"))); // NOI18N
        savedata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savedata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savedataMouseClicked(evt);
            }
        });
        getContentPane().add(savedata, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, -1, -1));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Group 16.png"))); // NOI18N
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 160, -1));

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Group 7.png"))); // NOI18N
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, 160, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Rectangle 11.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 810, 370));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/PROFILE.png"))); // NOI18N
        jLabel18.setAlignmentY(0.0F);
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/titikdua.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 50, 20));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/titikdua.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 50, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/titikdua.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 50, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Password.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Identification.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, -1, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Username.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Rectangle 13.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 700, 70));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Rectangle 13.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 700, 70));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Rectangle 13.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 700, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/HOME.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/CONTACT.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, -1, -1));

        aboutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/ABOUT.png"))); // NOI18N
        aboutbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutbtnMouseClicked(evt);
            }
        });
        getContentPane().add(aboutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, -1, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Journey!.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Rectangle 4.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 110));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/met.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1080, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.dispose();
        homepage hp=new homepage(userID);
        hp.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void aboutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutbtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
        about ab = new about(userID);
        ab.setVisible(true);
    }//GEN-LAST:event_aboutbtnMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        JOptionPane.showMessageDialog(null, "Successfully Sign Out");
        signin si=new signin();
        si.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_logoutMouseClicked

    private void savedataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savedataMouseClicked
        String newUsername = username.getText().trim();
        String newPassword = password.getText().trim();

        if (newUsername.length() < 6 || newPassword.length() < 8) {
          JOptionPane.showMessageDialog(null, "New Username must have at least 6 characters and New Password must have at least 8 characters");
        } else {
            try {
                Connection conn = Koneksi.getKoneksi();
                PreparedStatement pstmt = conn.prepareStatement("UPDATE account SET username = ?, password = ? WHERE id = ?");
                pstmt.setString(1, newUsername);
                pstmt.setString(2, newPassword);
                pstmt.setInt(3, userID); 
                int rowsUpdated = pstmt.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Data updated suc*cessfully.");
                } else {
                    System.out.println("Failed to update data.");
                }

                pstmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }   
        
            JOptionPane.showMessageDialog(null, "Successfully Changing data, Please Sign In again!");
            signin si=new signin();
            si.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_savedataMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        int confirmDialog = JOptionPane.showConfirmDialog(this, "Are you sure you want to edit your information?", "Confirm Edit", JOptionPane.YES_NO_OPTION);
        if (confirmDialog == JOptionPane.YES_OPTION) {
            username.setEditable(true);
            password.setEditable(true);
            username.setFocusable(true);
        }
    }//GEN-LAST:event_editMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
        contact ct=new contact(userID);
        ct.setVisible(true);
    
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutbtn;
    private javax.swing.JLabel edit;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField password;
    private javax.swing.JLabel savedata;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
