/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * pg3.java
 *
 * Created on 21 Nov, 2016, 4:09:18 PM
 */

package quiz;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author dell
 */
public class pg3 extends javax.swing.JFrame {

    /** Creates new form pg3 */
    public pg3() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("What is the perimeter of square?");

        jLabel2.setText("QUE 3");

        jRadioButton1.setText("4 X side");

        jRadioButton2.setText("side X side");

        jRadioButton3.setText("2 x (l+ b)");

        jRadioButton4.setText("l x b");

        jButton1.setText("Save & Submitt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton2))
                .addGap(183, 183, 183))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(100, 100, 100)
                .addComponent(jButton1)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
JFrame o = new result();
o.setVisible(true);
this.setVisible(false);
String s4= this.getTitle();
o.setTitle(s4);

if(jRadioButton1.isSelected()==true)
{
    try {
        Class.forName("java.sql.DriverManager");
        Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","aman");
        Statement s= con.createStatement();
        String s1="Insert into "+s4+" values('"+3+"','"+"yes"+"','"+"no"+"','"+4+"')";
        s.execute(s1);
   }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(rootPane, e.getMessage());
    }
}
else {
    try {
        Class.forName("java.sql.DriverManager");
        Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","aman");
        Statement s= con.createStatement();
        String s1="Insert into "+s4+" values ('"+3+"','"+"no"+"','"+"yes"+"','"+0+"') ";
        s.execute(s1);
   }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(rootPane, e.getMessage());
    }
}

}//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pg3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables

}
