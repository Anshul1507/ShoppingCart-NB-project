/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * men_accessories_3.java
 *
 * Created on Nov 15, 2016, 10:16:01 PM
 */

package Shopping;
import java.sql.*;
import javax.swing.*;
import javax.swing.JFrame;

/**
 *
 * @author Applications
 */
public class men_accessories_3 extends javax.swing.JFrame {

    /** Creates new form men_accessories_3 */
    public men_accessories_3() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calisto MT", 2, 48));
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Accessories");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 0, 220, 80);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton7.setFont(new java.awt.Font("Bradley Hand ITC", 3, 15));
        jButton7.setText("ADD TO CART");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(370, 590, 180, 27);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/(di)ZR016.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 10, 190, 210);

        jButton1.setFont(new java.awt.Font("Bradley Hand ITC", 3, 15));
        jButton1.setText("ADD TO CART");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 290, 210, 27);

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 3, 18));
        jLabel7.setForeground(new java.awt.Color(204, 51, 255));
        jLabel7.setText("Price :     Rs.");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 250, 120, 30);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Bookman Old Style", 3, 14));
        jTextField1.setText("1499 /-");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(150, 250, 100, 30);

        jButton3.setFont(new java.awt.Font("Bradley Hand ITC", 3, 15));
        jButton3.setText("ADD TO CART");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(390, 290, 190, 27);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/(pu)heritage grip bag $60.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 0, 280, 210);

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 3, 18));
        jLabel8.setForeground(new java.awt.Color(204, 51, 255));
        jLabel8.setText("Price :     Rs.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(340, 250, 120, 30);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Bookman Old Style", 3, 14));
        jTextField2.setText("6599 /-");
        jPanel1.add(jTextField2);
        jTextField2.setBounds(470, 250, 100, 30);

        jLabel9.setFont(new java.awt.Font("Century Schoolbook", 3, 18));
        jLabel9.setForeground(new java.awt.Color(204, 51, 255));
        jLabel9.setText("Price :     Rs.");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 540, 120, 30);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Bookman Old Style", 3, 14));
        jTextField3.setText("299 /-");
        jPanel1.add(jTextField3);
        jTextField3.setBounds(160, 550, 100, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/(th)Boston leather belt.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(320, 290, 260, 210);

        jLabel10.setFont(new java.awt.Font("Century Schoolbook", 3, 18));
        jLabel10.setForeground(new java.awt.Color(204, 51, 255));
        jLabel10.setText("Price :     Rs.");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(320, 540, 120, 30);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Bookman Old Style", 3, 14));
        jTextField4.setText("999 /-");
        jPanel1.add(jTextField4);
        jTextField4.setBounds(440, 540, 100, 30);

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jLabel13.setForeground(new java.awt.Color(204, 102, 255));
        jLabel13.setText("Leather Belt");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(370, 500, 90, 40);

        jLabel14.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jLabel14.setForeground(new java.awt.Color(204, 102, 255));
        jLabel14.setText("PUMA");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(420, 220, 90, 40);

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jLabel15.setForeground(new java.awt.Color(204, 102, 255));
        jLabel15.setText("DIESEL");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(60, 220, 90, 40);

        jLabel16.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jLabel16.setForeground(new java.awt.Color(204, 102, 255));
        jLabel16.setText("Goggles");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(80, 500, 90, 40);

        jButton5.setFont(new java.awt.Font("Bradley Hand ITC", 3, 15));
        jButton5.setText("ADD TO CART");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(60, 590, 190, 27);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/(th) TH 1091-s sunglasses.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 330, 220, 160);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 90, 610, 630);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(-190, 70, 810, 10);

        jButton9.setBackground(new java.awt.Color(255, 204, 204));
        jButton9.setFont(new java.awt.Font("Andalus", 3, 24));
        jButton9.setForeground(new java.awt.Color(0, 153, 153));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/back.jpg"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(20, 10, 100, 50);

        jButton10.setBackground(new java.awt.Color(255, 204, 204));
        jButton10.setFont(new java.awt.Font("Andalus", 3, 24));
        jButton10.setForeground(new java.awt.Color(0, 153, 153));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/next.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(480, 10, 100, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/poYBAFT38QyAaOgGAAK69CcLxxE791.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 630, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String s3=jLabel15.getText();
        String s2= this.getTitle();
        String s4=jTextField1.getText();
                try {

        Class.forName("java.sql.DriverManager");
        Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ada","root","a");
        Statement s= con.createStatement();
        String s1="insert into accessories values('"+s2+"','"+s3+"','"+s4+"' ) ";
        s.execute(s1);
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(rootPane, e.getMessage());
}           // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
String s1=this.getTitle();
        JFrame o= new men_accessories_2();
            o.setVisible(true);
            o.setTitle(s1);
            this.dispose();        // TODO add your handling code here:
}//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String s1=this.getTitle();
        JFrame o= new men_accessories_4();
        o.setVisible(true);
        o.setTitle(s1);
        this.dispose();         // TODO add your handling code here:
}//GEN-LAST:event_jButton10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String s3=jLabel14.getText();
        String s2= this.getTitle();
        String s4=jTextField2.getText();
                try {

        Class.forName("java.sql.DriverManager");
        Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ada","root","a");
        Statement s= con.createStatement();
        String s1="insert into accessories values('"+s2+"','"+s3+"','"+s4+"' ) ";
        s.execute(s1);
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(rootPane, e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
String s3=jLabel16.getText();
        String s2= this.getTitle();
        String s4=jTextField3.getText();
                try {

        Class.forName("java.sql.DriverManager");
        Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ada","root","a");
        Statement s= con.createStatement();
        String s1="insert into accessories values('"+s2+"','"+s3+"','"+s4+"' ) ";
        s.execute(s1);
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(rootPane, e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
String s3=jLabel13.getText();
        String s2= this.getTitle();
        String s4=jTextField4.getText();
                try {

        Class.forName("java.sql.DriverManager");
        Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ada","root","a");
        Statement s= con.createStatement();
        String s1="insert into accessories values('"+s2+"','"+s3+"','"+s4+"' ) ";
        s.execute(s1);
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(rootPane, e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new men_accessories_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
