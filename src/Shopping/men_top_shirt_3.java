/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * men_top_shirt_3.java
 *
 * Created on Nov 15, 2016, 11:47:26 AM
 */

package Shopping;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Applications
 */
public class men_top_shirt_3 extends javax.swing.JFrame {

    /** Creates new form men_top_shirt_3 */
    public men_top_shirt_3() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton6.setBackground(new java.awt.Color(255, 102, 102));
        jButton6.setFont(new java.awt.Font("Andalus", 3, 15));
        jButton6.setForeground(new java.awt.Color(0, 102, 255));
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(20, 20, 100, 40);

        jLabel1.setFont(new java.awt.Font("Calisto MT", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Shirts / T-Shirts");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 307, 56);

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setFont(new java.awt.Font("Andalus", 3, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 255));
        jButton5.setText("Next");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(540, 20, 120, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 80, 880, 10);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/(di)Sermon-R shirt.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 110, 250, 340);

        jRadioButton1.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Small");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(290, 120, 60, 30);

        jRadioButton2.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Medium");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(290, 190, 70, 30);

        jRadioButton3.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Large");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(290, 260, 60, 30);

        jRadioButton4.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("XL");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(290, 330, 50, 30);

        jRadioButton5.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("XXL");
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(290, 400, 50, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/(th)oliver checked shirt.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 100, 220, 330);

        jRadioButton6.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("Small");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton6);
        jRadioButton6.setBounds(630, 110, 60, 30);

        jRadioButton7.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setText("Medium");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton7);
        jRadioButton7.setBounds(630, 180, 70, 30);

        jRadioButton8.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setText("Large");
        getContentPane().add(jRadioButton8);
        jRadioButton8.setBounds(630, 250, 60, 30);

        jRadioButton10.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup2.add(jRadioButton10);
        jRadioButton10.setText("XXL");
        getContentPane().add(jRadioButton10);
        jRadioButton10.setBounds(630, 390, 60, 30);

        jRadioButton9.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup2.add(jRadioButton9);
        jRadioButton9.setText("XL");
        getContentPane().add(jRadioButton9);
        jRadioButton9.setBounds(630, 320, 50, 30);

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Sermon-R shirt");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 470, 220, 30);

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 0));
        jLabel6.setText("Price :     Rs.");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 510, 120, 30);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Bookman Old Style", 3, 14));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 510, 100, 30);

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Andalus", 3, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 0));
        jButton1.setText("ADD TO CART");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 550, 180, 40);

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 0));
        jLabel7.setText("Price :     Rs.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(390, 500, 120, 30);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Bookman Old Style", 3, 14)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(510, 500, 100, 30);

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Oliver Checked shirt");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 460, 310, 30);

        jButton3.setBackground(new java.awt.Color(0, 204, 255));
        jButton3.setFont(new java.awt.Font("Andalus", 3, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 0));
        jButton3.setText("ADD TO CART");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 550, 170, 40);

        jLabel8.setBackground(new java.awt.Color(0, 204, 255));
        jLabel8.setForeground(new java.awt.Color(51, 51, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/floraltexture-97034.jpeg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, -10, 740, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
String s1=this.getTitle();
        JFrame o= new men_top_shirt_2();
            o.setVisible(true);
            o.setTitle(s1);
            this.dispose();       // TODO add your handling code here:
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
String s1=this.getTitle();
        JFrame o= new men_top_shirt_4();
            o.setVisible(true);
            o.setTitle(s1);
            this.dispose();        // TODO add your handling code here:
}//GEN-LAST:event_jButton5ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
if(jRadioButton1.isSelected()== true)
       {
           jTextField1.setText("2999 /-");
       }
       else if(jRadioButton2.isSelected()== true)
       {
           jTextField1.setText("3999 /-");
       }
       else if(jRadioButton3.isSelected()== true)
       {
           jTextField1.setText("4599 /-");
       }
       else if(jRadioButton4.isSelected()== true)
       {
           jTextField1.setText("5999 /-");
       }
        else if(jRadioButton5.isSelected()== true)
       {
           jTextField1.setText("6599 /-");
       }
        String s3=jLabel4.getText();
        String s2= this.getTitle();
        String s4=jTextField1.getText();
                try {

        Class.forName("java.sql.DriverManager");
        Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ada","root","a");
        Statement s= con.createStatement();
        String s1="insert into top_shirt values('"+s2+"','"+s3+"','"+s4+"' ) ";
        s.execute(s1);
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(rootPane, e.getMessage());
}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(jRadioButton6.isSelected()== true)
       {
           jTextField2.setText("2999 /-");
       }
       else if(jRadioButton7.isSelected()== true)
       {
           jTextField2.setText("3999 /-");
       }
       else if(jRadioButton8.isSelected()== true)
       {
           jTextField2.setText("4599 /-");
       }
       else if(jRadioButton9.isSelected()== true)
       {
           jTextField2.setText("5999 /-");
       }
        else if(jRadioButton10.isSelected()== true)
       {
           jTextField2.setText("6599 /-");
       }
        String s3=jLabel5.getText();
        String s2= this.getTitle();
        String s4=jTextField2.getText();
                try {

        Class.forName("java.sql.DriverManager");
        Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ada","root","a");
        Statement s= con.createStatement();
        String s1="insert into top_shirt values('"+s2+"','"+s3+"','"+s4+"' ) ";
        s.execute(s1);
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(rootPane, e.getMessage());
}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new men_top_shirt_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
