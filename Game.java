package apppackage;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnav Phukan
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    public Game() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtGameId = new javax.swing.JTextField();
        txtStadium = new javax.swing.JTextField();
        txtAwayScore = new javax.swing.JTextField();
        txtHomeScore = new javax.swing.JTextField();
        txtHomeTeam = new javax.swing.JTextField();
        txtAwayTeam = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 255));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(880, 587));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Game Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(540, 20, 230, 40);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText("Game Id");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(420, 100, 120, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setText("Stadium");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(420, 160, 120, 30);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setText("Away Score");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(420, 210, 160, 30);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setText("Home Score");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(420, 270, 160, 30);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setText("Home Team");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(420, 330, 160, 20);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setText("Away Team");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(420, 390, 160, 30);

        txtGameId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGameIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtGameId);
        txtGameId.setBounds(590, 100, 250, 30);
        jPanel1.add(txtStadium);
        txtStadium.setBounds(590, 160, 250, 30);

        txtAwayScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAwayScoreActionPerformed(evt);
            }
        });
        jPanel1.add(txtAwayScore);
        txtAwayScore.setBounds(590, 210, 250, 30);

        txtHomeScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHomeScoreActionPerformed(evt);
            }
        });
        jPanel1.add(txtHomeScore);
        txtHomeScore.setBounds(590, 270, 250, 30);
        jPanel1.add(txtHomeTeam);
        txtHomeTeam.setBounds(590, 330, 250, 30);
        jPanel1.add(txtAwayTeam);
        txtAwayTeam.setBounds(590, 382, 250, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(540, 470, 79, 31);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Retrieve");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(70, 140, 130, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(70, 220, 130, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Back Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(70, 300, 130, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Manu\\Downloads\\soccer-goal (1).jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 880, 590);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 880, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAwayScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAwayScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAwayScoreActionPerformed

    private void txtHomeScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHomeScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHomeScoreActionPerformed

    private void txtGameIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGameIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGameIdActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         String gid=txtGameId.getText();                     //delete
       
       
        PreparedStatement pstmt=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/sports","root","");
            pstmt=conn.prepareStatement("delete from game where gameid=?");
            pstmt.setString(1,gid);
            pstmt.executeUpdate();
             JOptionPane.showMessageDialog(null,"Deleted");
           
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String gid=txtGameId.getText();           //insert
     String stdm= txtStadium.getText();
//String startDate=txtDate.getText();
                
        String hteam=txtHomeTeam.getText();
        String ateam=txtAwayTeam.getText();
        int num1,num2;
        String hscore=txtHomeScore.getText();
        num1=Integer.parseInt(hscore);
        String ascore=txtAwayScore.getText();
        num2=Integer.parseInt(ascore);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/Sports","root","");
            Statement st=conn.createStatement();
            String query="INSERT INTO game(gameid,stadium,hometeam,awayteam,homescore,awayscore) values (?,?,?,?,?,?)";
            
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1,gid);
            preparedStatement.setString(2,stdm);
//            preparedStatement.setString(3,"+sqlStartDate");
//            preparedStatement.setString(4,"10:10:10");
            preparedStatement.setString(3,hteam);
            preparedStatement.setString(4,ateam);
            preparedStatement.setInt(5,num1);
            preparedStatement.setInt(6,num2);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null,"Insert Successfull");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());

        }
        txtGameId.setText("");
        txtStadium.setText("");
//        txtDate.setText("");
//        txtTime.setText("");
        txtHomeTeam.setText("");
        txtAwayTeam.setText("");
        txtHomeScore.setText("");
        txtAwayScore.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String gid=txtGameId.getText();    //retrieve
        
       
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/Sports","root","");
          PreparedStatement  ps=conn.prepareStatement("select * from game where gameid=?");
            ps.setString(1,gid);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                txtStadium.setText(rs.getString("stadium"));
//                txtDate.setText(rs.getString("date2"));
//                txtTime.setText(rs.getString("time1"));
                txtHomeTeam.setText(rs.getString("hometeam"));
                txtAwayTeam.setText(rs.getString("awayteam"));
                txtHomeScore.setText(rs.getString("homescore"));
                txtAwayScore.setText(rs.getString("awayscore"));
                
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        
        }
        
        
       
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           Home Info=new Home();       //back home
           Info.setVisible(true);
           this.dispose();
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAwayScore;
    private javax.swing.JTextField txtAwayTeam;
    private javax.swing.JTextField txtGameId;
    private javax.swing.JTextField txtHomeScore;
    private javax.swing.JTextField txtHomeTeam;
    private javax.swing.JTextField txtStadium;
    // End of variables declaration//GEN-END:variables
}
