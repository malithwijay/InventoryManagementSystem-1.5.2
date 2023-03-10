/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author malith
 */
public class ViewCreditNote extends javax.swing.JFrame {

    /**
     * Creates new form ViewCreditNote
     */
    public ViewCreditNote() {
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

        btntxtViewCreditNoteInvoiceNoSearch = new javax.swing.JButton();
        txtViewCreditNoteInvoiceNoSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnViewInvoice = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewSalesInvoice = new javax.swing.JTable();
        btnViewCreditNoteCancel = new javax.swing.JButton();
        btntxtViewCreditNoteInvoiceNoSearch1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btntxtViewCreditNoteInvoiceNoSearch.setBackground(new java.awt.Color(51, 153, 255));
        btntxtViewCreditNoteInvoiceNoSearch.setForeground(new java.awt.Color(255, 255, 255));
        btntxtViewCreditNoteInvoiceNoSearch.setText("Search");
        btntxtViewCreditNoteInvoiceNoSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntxtViewCreditNoteInvoiceNoSearchActionPerformed(evt);
            }
        });

        txtViewCreditNoteInvoiceNoSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtViewCreditNoteInvoiceNoSearchKeyReleased(evt);
            }
        });

        jLabel1.setText("     Enter invoice number");

        btnViewInvoice.setBackground(new java.awt.Color(0, 204, 204));
        btnViewInvoice.setForeground(new java.awt.Color(255, 255, 255));
        btnViewInvoice.setText("View Invoice");
        btnViewInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewInvoiceActionPerformed(evt);
            }
        });

        tblViewSalesInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No", "Customer Name", "Purchased Date", "Credit Period", "Amount"
            }
        ));
        tblViewSalesInvoice.setGridColor(new java.awt.Color(255, 255, 255));
        tblViewSalesInvoice.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tblViewSalesInvoice.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblViewSalesInvoice);

        btnViewCreditNoteCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnViewCreditNoteCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnViewCreditNoteCancel.setText("Cancel");
        btnViewCreditNoteCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCreditNoteCancelActionPerformed(evt);
            }
        });

        btntxtViewCreditNoteInvoiceNoSearch1.setBackground(new java.awt.Color(51, 153, 255));
        btntxtViewCreditNoteInvoiceNoSearch1.setForeground(new java.awt.Color(255, 255, 255));
        btntxtViewCreditNoteInvoiceNoSearch1.setText("All");
        btntxtViewCreditNoteInvoiceNoSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntxtViewCreditNoteInvoiceNoSearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewCreditNoteCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtViewCreditNoteInvoiceNoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btntxtViewCreditNoteInvoiceNoSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btntxtViewCreditNoteInvoiceNoSearch1)
                                .addGap(51, 51, 51)
                                .addComponent(btnViewInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtViewCreditNoteInvoiceNoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntxtViewCreditNoteInvoiceNoSearch)
                    .addComponent(btnViewInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntxtViewCreditNoteInvoiceNoSearch1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewCreditNoteCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btntxtViewCreditNoteInvoiceNoSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntxtViewCreditNoteInvoiceNoSearchActionPerformed
        // TODO add your handling code here:
        Pattern name = Pattern.compile("^[a-zA-Z ]*$");
        Matcher mname = name.matcher(txtViewCreditNoteInvoiceNoSearch.getText());
        
        if(txtViewCreditNoteInvoiceNoSearch.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter Search String to Search","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(mname.matches()==true)
        {
            JOptionPane.showMessageDialog(this, "Search String cannot have Letters","Warning",JOptionPane.WARNING_MESSAGE);
        }
        {
            DefaultTableModel tmodel = (DefaultTableModel)tblViewSalesInvoice.getModel();
            tmodel.setRowCount(0);
            Database db = new Database();
            ResultSet rs = db.selectData("SELECT InvoiceNo,Credit_Period,NetAmount,tb_invoice.Date FROM tb_credit,tb_payment,tb_invoice WHERE InvoiceNO in (SELECT InvNO FROM tb_payment WHERE PID in (SELECT PNO from tb_credit)) AND InvoiceNO LIKE "+txtViewCreditNoteInvoiceNoSearch.getText()+" GROUP BY InvoiceNo");
            try {
                if(rs!=null)
                    {
                while(rs.next())
                {
                    
                        String invoiceNo = String.valueOf(rs.getInt("InvoiceNo"));
                        String creditPeriod = String.valueOf(rs.getInt("Credit_Period"));
                        String netAmount = String.valueOf(rs.getDouble("NetAmount"));
                        String date = String.valueOf(rs.getDate("Date"));

                        ResultSet rs1 = db.selectData("SELECT DName from tb_dealer WHERE DID in (select DID from tb_dealerorder WHERE InvNO="+invoiceNo+")");
                        if(rs1!=null)
                            {
                        while(rs1.next())
                        {
                            
                                String cusname = rs1.getString("DName");

                                String rowData[] = {invoiceNo,cusname,date,creditPeriod,netAmount};
                                tmodel.addRow(rowData);
                            }                            
                        }
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage()+" Data Cannot be loaded right now try again", "No Data", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btntxtViewCreditNoteInvoiceNoSearchActionPerformed

    private void txtViewCreditNoteInvoiceNoSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtViewCreditNoteInvoiceNoSearchKeyReleased
        // TODO add your handling code here:
        if(txtViewCreditNoteInvoiceNoSearch.getText().isEmpty()){
            btntxtViewCreditNoteInvoiceNoSearch.setEnabled(false);
        }else{
            btntxtViewCreditNoteInvoiceNoSearch.setEnabled(true);
        }

    }//GEN-LAST:event_txtViewCreditNoteInvoiceNoSearchKeyReleased

    private void btnViewInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewInvoiceActionPerformed
        new ViewInvoice().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewInvoiceActionPerformed

    private void btnViewCreditNoteCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCreditNoteCancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnViewCreditNoteCancelActionPerformed

    private void btntxtViewCreditNoteInvoiceNoSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntxtViewCreditNoteInvoiceNoSearch1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tmodel = (DefaultTableModel)tblViewSalesInvoice.getModel();
        tmodel.setRowCount(0);
        Database db = new Database();
        ResultSet rs = db.selectData("SELECT InvoiceNo,Credit_Period,NetAmount,tb_invoice.Date as Date FROM tb_credit,tb_payment,tb_invoice WHERE InvoiceNO in (SELECT InvNO FROM tb_payment WHERE PID in (SELECT PNO from tb_credit)) GROUP BY InvoiceNo");
        try {
            if(rs!=null)
                {
            while(rs.next())
            {
                
                    String invoiceNo = String.valueOf(rs.getInt("InvoiceNo"));
                    String creditPeriod = String.valueOf(rs.getInt("Credit_Period"));
                    String netAmount = String.valueOf(rs.getDouble("NetAmount"));
                    String date = String.valueOf(rs.getDate("Date"));
                    
                    ResultSet rs1 = db.selectData("SELECT DName from tb_dealer WHERE DID in (select DID from tb_dealerorder WHERE InvNO="+invoiceNo+")");
                    while(rs1.next())
                    {
                        String cusname = rs1.getString("DName");
                        
                        String rowData[] = {invoiceNo,cusname,date,creditPeriod,netAmount};
                        tmodel.addRow(rowData);
                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage()+" Data Cannot be loaded right now try again", "No Data", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btntxtViewCreditNoteInvoiceNoSearch1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCreditNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCreditNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCreditNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCreditNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCreditNote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewCreditNoteCancel;
    private javax.swing.JButton btnViewInvoice;
    private javax.swing.JButton btntxtViewCreditNoteInvoiceNoSearch;
    private javax.swing.JButton btntxtViewCreditNoteInvoiceNoSearch1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViewSalesInvoice;
    private javax.swing.JTextField txtViewCreditNoteInvoiceNoSearch;
    // End of variables declaration//GEN-END:variables
}
