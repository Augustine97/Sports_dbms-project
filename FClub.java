/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppackage;

import static apppackage.abc.t2;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arnav Phukan
 */
public class FClub extends javax.swing.JFrame {

    /**
     * Creates new form FClub
     */
    public FClub() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtf1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtf2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtf3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(660, 370));
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Football Club");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(200, 10, 270, 30);

        jLabel3.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Club Id");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 70, 100, 30);

        txtf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtf1);
        txtf1.setBounds(210, 70, 230, 30);

        jLabel4.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("League Home");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 120, 160, 30);

        txtf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf2ActionPerformed(evt);
            }
        });
        jPanel2.add(txtf2);
        txtf2.setBounds(210, 130, 230, 30);

        jLabel5.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Jersey Colour");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 190, 150, 20);

        txtf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf3ActionPerformed(evt);
            }
        });
        jPanel2.add(txtf3);
        txtf3.setBounds(210, 190, 230, 30);

        jButton1.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(20, 280, 63, 29);

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton2.setText("Insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(150, 250, 63, 25);

        jButton3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton3.setText("Get Info");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(520, 280, 75, 25);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Manu\\Downloads\\w23.jpg")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 370);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 670, 370);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          String cid=txtf1.getText(); //insert
       String ln=txtf2.getText();
        String jc=txtf3.getText();
       

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/sports","root","");
           // JOptionPane.showMessageDialog(null,"connected");

            Statement st=conn.createStatement();
            String query="insert into footballclub(clubid,leaguename,jerseycolour) values ('"+cid+"','"+ln+"','"+jc+"') ";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Insert Successfull");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        txtf1.setText("");
        txtf2.setText("");
        txtf3.setText("");
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf3ActionPerformed

    private void txtf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf2ActionPerformed

    private void txtf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Home Info=new Home(); //back
         Info.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         String cid=txtf1.getText();  //get info
        
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/sports","root","");
            pstmt=conn.prepareStatement("select * from footballclub where clubid=?");
            pstmt.setString(1,cid);
            rs=pstmt.executeQuery();
            while(rs.next()){
                
                txtf2.setText(rs.getString("leaguename"));
                txtf3.setText(rs.getString("jerseycolour"));
                
                
                
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FClub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtf1;
    private javax.swing.JTextField txtf2;
    private javax.swing.JTextField txtf3;
    // End of variables declaration//GEN-END:variables
}
