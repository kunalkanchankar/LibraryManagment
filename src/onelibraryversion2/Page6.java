/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onelibraryversion2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class Page6 extends javax.swing.JFrame {

    /**
     * Creates new form Page6
     */
    public Page6() {
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

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(940, 30, 20, 30);

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Students Name", "Students Enrollment no.", "Student Branch", "Book Name ", "Book Author", "Book ID", "Rent date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 1060, 460);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Page6_6.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1092, 670);

        setSize(new java.awt.Dimension(1092, 670));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
           dispose();
       
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jTable1.setModel(new DefaultTableModel(null, new String[]{"Students Name", "Students Enrollment no.", "Student Branch", "Book Name", "Book Author", "Book ID", "Rent date"}));
       show_user1();// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
jTable1.setModel(new DefaultTableModel(null, new String[]{"Students Name", "Students Enrollment no.", "Student Branch", "Book Name", "Book Author", "Book ID", "Rent date"}));
       show_user1();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Page6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page6().setVisible(true);
            }
        });
    }
    
    
    
    private void show_user1() {
        try {
            int i = 0;
            ArrayList<User1> list1 = userList1();
            DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
            Object[] row1 = new Object[8];
            for (i = 0; i < list1.size(); i++) {
                row1[0] = list1.get(i).gets_name();
                row1[1] = list1.get(i).gets_id();
                row1[2] = list1.get(i).gets_branch();
                row1[3] = list1.get(i).getbookname();
                row1[4] = list1.get(i).getbookauthor();
                row1[5] = list1.get(i).getbookid();
                row1[6] = list1.get(i).getbookrent();

                model1.addRow(row1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public java.util.ArrayList<User1> userList1() {
        java.util.ArrayList<User1> usersList1 = new java.util.ArrayList<>();
        try {
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root", "kunal");
            Statement st1 = con1.createStatement();
            ResultSet re1 = st1.executeQuery("select * from Addborrower");
            User1 user;
            while (re1.next()) {

                user = new User1(re1.getString("student_name"), re1.getString("student_roll"), re1.getString("student_branch"), re1.getString("bookid"), re1.getString("bookname"), re1.getString("bookauthorname"), re1.getString("entrydate"), re1.getString("renttime"));
                usersList1.add(user);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return usersList1;
    }

    private static class User1 {

        String s_name = " ", s_id = " ", s_branch = " ", b_id = " ", b_name = " ", b_author = " ", b_entry = " ", b_today = " ";

        private User1(String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6) {          s_name = string;
            s_id = string0;
            s_branch = string1;
            b_id = string2;
            b_name = string3;
            b_author = string4;
//            b_entry = string5;
            b_today = string6;
        }

        private Object getbookid() {
            return b_id;
        }

        private Object getbookname() {
            return b_name;
        }

        private Object getbookauthor() {
            return b_author;
        }

        private Object gets_name() {
            return s_name;
        }

        private Object gets_id() {
            return s_id;
        }

        private Object gets_branch() {
            return s_branch;
        }

        private Object getbookrent() {
            return b_today;
        }

    }

    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
