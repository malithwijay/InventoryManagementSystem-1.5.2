/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import model.Invoice;

/**
 *
 * @author malith
 */
public class ViewInvoice extends javax.swing.JFrame {

    /**
     * Creates new form ViewSales
     */
    public ViewInvoice() {
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

        jLabel162 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtViewSalesInvoiceNoSearch = new javax.swing.JTextField();
        btnViewSalesInvoiceNoSearch = new javax.swing.JButton();
        btnViewSalesInvoiceNoClear = new javax.swing.JButton();
        txtViewSalesInvoiceDate = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtViewSalesInvoiceNo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtViewSalesBillTo = new javax.swing.JLabel();
        txtViewSalesDealerID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewSalesInvoice = new javax.swing.JTable();
        PanelInvoicePayment = new javax.swing.JPanel();
        txtViewSalesClickOnItemToReturn = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtViewSalesInvoiceAmount = new javax.swing.JLabel();
        txtViewSalesInvoiceDiscount = new javax.swing.JLabel();
        txtViewSalesInvoiceNetAmount = new javax.swing.JLabel();
        btnViewSalesCancel = new javax.swing.JButton();
        btnViewInvoice = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel162.setBackground(new java.awt.Color(0, 102, 102));
        jLabel162.setForeground(new java.awt.Color(255, 255, 255));
        jLabel162.setText("     View Invoice");
        jLabel162.setOpaque(true);

        jLabel1.setText("     Enter invoice number");

        txtViewSalesInvoiceNoSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtViewSalesInvoiceNoSearchKeyReleased(evt);
            }
        });

        btnViewSalesInvoiceNoSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnViewSalesInvoiceNoSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnViewSalesInvoiceNoSearch.setText("Search");
        btnViewSalesInvoiceNoSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSalesInvoiceNoSearchActionPerformed(evt);
            }
        });

        btnViewSalesInvoiceNoClear.setBackground(new java.awt.Color(255, 0, 0));
        btnViewSalesInvoiceNoClear.setForeground(new java.awt.Color(255, 255, 255));
        btnViewSalesInvoiceNoClear.setText("Clear");
        btnViewSalesInvoiceNoClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSalesInvoiceNoClearActionPerformed(evt);
            }
        });

        jLabel4.setText("       Date");

        txtViewSalesInvoiceNo.setText(" -------------------------------------");

        jLabel2.setText("     Invoice No");

        jLabel5.setText("     Bill To ,");

        jLabel6.setText("( Dealer ID )");

        txtViewSalesBillTo.setText("-----------------------");

        txtViewSalesDealerID.setText("  ------------------------------------");

        tblViewSalesInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "INO", "Item Name", "Quantity", "Discount", "Amount"
            }
        ));
        tblViewSalesInvoice.setGridColor(new java.awt.Color(255, 255, 255));
        tblViewSalesInvoice.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tblViewSalesInvoice.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblViewSalesInvoice);

        txtViewSalesClickOnItemToReturn.setForeground(new java.awt.Color(0, 102, 102));
        txtViewSalesClickOnItemToReturn.setText("Click On Item To Return");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Amount");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Discount");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("Net Amount");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(":");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText(":");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText(":");

        txtViewSalesInvoiceAmount.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtViewSalesInvoiceAmount.setText("--------------------------------");

        txtViewSalesInvoiceDiscount.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtViewSalesInvoiceDiscount.setText("--------------------------------");

        txtViewSalesInvoiceNetAmount.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtViewSalesInvoiceNetAmount.setForeground(new java.awt.Color(204, 0, 0));
        txtViewSalesInvoiceNetAmount.setText("--------------------------------");

        javax.swing.GroupLayout PanelInvoicePaymentLayout = new javax.swing.GroupLayout(PanelInvoicePayment);
        PanelInvoicePayment.setLayout(PanelInvoicePaymentLayout);
        PanelInvoicePaymentLayout.setHorizontalGroup(
            PanelInvoicePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInvoicePaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtViewSalesClickOnItemToReturn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInvoicePaymentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelInvoicePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInvoicePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelInvoicePaymentLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtViewSalesInvoiceAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelInvoicePaymentLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtViewSalesInvoiceNetAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelInvoicePaymentLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtViewSalesInvoiceDiscount)))
                .addGap(103, 103, 103))
        );
        PanelInvoicePaymentLayout.setVerticalGroup(
            PanelInvoicePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInvoicePaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtViewSalesClickOnItemToReturn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInvoicePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(txtViewSalesInvoiceAmount))
                .addGap(18, 18, 18)
                .addGroup(PanelInvoicePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(txtViewSalesInvoiceDiscount))
                .addGap(18, 18, 18)
                .addGroup(PanelInvoicePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(txtViewSalesInvoiceNetAmount))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnViewSalesCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnViewSalesCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnViewSalesCancel.setText("Cancel");
        btnViewSalesCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSalesCancelActionPerformed(evt);
            }
        });

        btnViewInvoice.setBackground(new java.awt.Color(0, 204, 204));
        btnViewInvoice.setForeground(new java.awt.Color(255, 255, 255));
        btnViewInvoice.setText("View Credit Note");
        btnViewInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewInvoiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelInvoicePayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtViewSalesInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtViewSalesInvoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtViewSalesInvoiceNoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewSalesInvoiceNoSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnViewSalesInvoiceNoClear))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtViewSalesDealerID, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txtViewSalesBillTo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnViewSalesCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnViewInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtViewSalesInvoiceNoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewSalesInvoiceNoSearch)
                    .addComponent(btnViewSalesInvoiceNoClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtViewSalesInvoiceNo)
                    .addComponent(jLabel4)
                    .addComponent(txtViewSalesInvoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtViewSalesDealerID))
                .addGap(16, 16, 16)
                .addComponent(txtViewSalesBillTo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelInvoicePayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewSalesCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewSalesInvoiceNoSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSalesInvoiceNoSearchActionPerformed
        // TODO add your handling code here:
        Database dbs = new Database();
        int ie = dbs.credential_check("select * from tb_invoice where InvoiceNO = "+txtViewSalesInvoiceNoSearch.getText()+"");
        if(!(ie==1)){
            JOptionPane.showMessageDialog(this, "Invoice number not found! Try again!","Not Found!",JOptionPane.WARNING_MESSAGE);
        }
        
        DefaultTableModel tmodel = (DefaultTableModel)tblViewSalesInvoice.getModel();
        tmodel.setRowCount(0);
        Invoice i = new Invoice();
        ResultSet rs = i.viewInvoice(txtViewSalesInvoiceNoSearch.getText());
        if(rs==null)
        {
            JOptionPane.showMessageDialog(this, "No Invoice found Try using Different Keywords","No results",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try {
                while(rs.next())
                {
                    String invNo = String.valueOf(rs.getInt("InvoiceNO"));
                    String date = String.valueOf(rs.getDate("Date"));
                    txtViewSalesInvoiceNo.setText(invNo);
                    txtViewSalesInvoiceDate.setText(date);
                    
                    String billnet = String.valueOf(rs.getDouble("NetAmount"));
                    String billDiscount = String.valueOf(rs.getDouble("Discount"));
                    String billAmount = String.valueOf(rs.getDouble("Amount"));
                    txtViewSalesInvoiceAmount.setText(billAmount);
                    txtViewSalesInvoiceDiscount.setText(billDiscount);
                    txtViewSalesInvoiceNetAmount.setText(billnet);
                    
                    String ino = String.valueOf(rs.getInt("Ino"));
                    String iName = rs.getString("IName");
                    String qty = String.valueOf(rs.getInt("QtyPurchased"));
                    String price = String.valueOf(rs.getDouble("IAmount"));
                    String dis = String.valueOf(rs.getDouble("DiscountRate"));
                    String tot = String.valueOf(rs.getDouble("TotAmount"));
                    String tbData[] = {ino,iName,qty,price,dis,tot};
                    
                    tmodel.addRow(tbData);
                    
                    String type = rs.getString("Type");
                    if(type.equals("Customer"))
                    {
                        jLabel6.setText("Customer");
                        String cusNIC = rs.getString("cusNIC");
                        txtViewSalesDealerID.setText(cusNIC);
                        Customer c = new Customer();
                        ResultSet rs1 = c.viewCustomer("Offline", cusNIC, "CusNIC");
                        while(rs1.next())
                        {
                            String cusName = rs1.getString("CusName");
                            txtViewSalesBillTo.setText(cusName);
                        }
                    }
                    if(type.equals("Dealer"))
                    {
                        jLabel6.setText("Dealer");
                        Database db = new Database();
                        ResultSet rs1 = db.selectData("SELECT * FROM tb_dealerorder,tb_dealer WHERE tb_dealerorder.DID=tb_dealer.DID AND InvNO ="+invNo+" ");
                        while(rs1.next())
                        {
                            String dealerName = rs1.getString("DName");
                            String dealerID = rs1.getString("DID");
                            txtViewSalesDealerID.setText(dealerID);
                            txtViewSalesBillTo.setText(dealerName);
                        }
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage()+"Cannot load invoice details reopen the menu and try again","No results",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnViewSalesInvoiceNoSearchActionPerformed

    private void btnViewSalesInvoiceNoClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSalesInvoiceNoClearActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        dispose();
        new ViewInvoice().setVisible(true);
    }//GEN-LAST:event_btnViewSalesInvoiceNoClearActionPerformed

    private void btnViewSalesCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSalesCancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnViewSalesCancelActionPerformed

    private void txtViewSalesInvoiceNoSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtViewSalesInvoiceNoSearchKeyReleased
        // TODO add your handling code here:
        if(txtViewSalesInvoiceNoSearch.getText().isEmpty()){
            btnViewSalesInvoiceNoSearch.setEnabled(false);
        }else{
            btnViewSalesInvoiceNoSearch.setEnabled(true);
        }
        
    }//GEN-LAST:event_txtViewSalesInvoiceNoSearchKeyReleased

    private void btnViewInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewInvoiceActionPerformed
        new ViewCreditNote().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewInvoiceActionPerformed

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
            java.util.logging.Logger.getLogger(ViewInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelInvoicePayment;
    private javax.swing.JButton btnViewCreditNote;
    private javax.swing.JButton btnViewCreditNote1;
    private javax.swing.JButton btnViewCreditNote2;
    private javax.swing.JButton btnViewInvoice;
    private javax.swing.JButton btnViewSalesCancel;
    private javax.swing.JButton btnViewSalesInvoiceNoClear;
    private javax.swing.JButton btnViewSalesInvoiceNoSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViewSalesInvoice;
    private javax.swing.JLabel txtViewSalesBillTo;
    private javax.swing.JLabel txtViewSalesClickOnItemToReturn;
    private javax.swing.JLabel txtViewSalesDealerID;
    private javax.swing.JLabel txtViewSalesInvoiceAmount;
    private javax.swing.JFormattedTextField txtViewSalesInvoiceDate;
    private javax.swing.JLabel txtViewSalesInvoiceDiscount;
    private javax.swing.JLabel txtViewSalesInvoiceNetAmount;
    private javax.swing.JLabel txtViewSalesInvoiceNo;
    private javax.swing.JTextField txtViewSalesInvoiceNoSearch;
    // End of variables declaration//GEN-END:variables
}
