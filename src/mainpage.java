/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 import java.util.Random;
import static javafx.beans.binding.Bindings.length;
import javax.swing.JOptionPane;
public class mainpage extends javax.swing.JFrame {

    /**
     * Creates new form mainpage
     */
    public mainpage() {
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

        tf1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);
        getContentPane().add(tf1);
        tf1.setBounds(520, 230, 306, 36);

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setText("PASSWORD");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(510, 200, 170, 40);

        jButton1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(530, 450, 300, 59);

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel3.setText("USER NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(510, 110, 170, 20);
        getContentPane().add(tf2);
        tf2.setBounds(520, 130, 306, 36);

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GMAIL", "INSTAGRAM", "SNAPCHAT", "LINKDEN ", "FACEBOOK", "TELEGRAM", "SPOTIFY", "UBER", "YAHOO", "HOTMALE", "OUTLOOK", "AMAZON", "FLIPKART", "DIGILOCKER", "PAYTM", "GPAY", "PHONEPAY", "NETFLIX", "DISNEY+", " " }));
        getContentPane().add(cb1);
        cb1.setBounds(520, 330, 310, 36);

        jLabel4.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel4.setText("MEDIA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(510, 310, 140, 20);

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 10, 130, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        jLabel5.setText("PASSWORDS ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 230, 240, 50);

        jLabel6.setFont(new java.awt.Font("Calibri", 3, 48)); // NOI18N
        jLabel6.setText("SAVE YOUR");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 140, 250, 70);

        jLabel7.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        jLabel7.setText("ACCOUNTS ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 190, 180, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   try{      String u=tf2.getText();
   
   
         String h="#";
        String text=tf1.getText();
        String t=(String)  cb1.getSelectedItem();
        int key=6;
     String i="";
  
       char [] chars=text.toCharArray();
		
		for(char c: chars){
		    c+=key;
		    i+=c;
		    System.out.print(c);
		}
		
		// oo.setText(""+i);
      Class.forName("java.sql.DriverManager");
Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/ayush","root","admin");
Statement  s = c.createStatement();

String q="insert into mainpass values('"+login_page.u+"','"+u+"',+'"+i+"','"+t+"','"+null+"');";
s.executeUpdate(q);
JOptionPane.showMessageDialog(null,"DETAILS SAVED");           
                 
   }
   catch(Exception e)
           
           { JOptionPane.showMessageDialog(null, e.getMessage());}
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   dispose();
      new home_page().setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
